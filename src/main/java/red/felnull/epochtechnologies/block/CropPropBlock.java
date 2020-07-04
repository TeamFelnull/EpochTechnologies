package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.Tags;
import red.felnull.epochtechnologies.block.propertie.PropPlace;
import red.felnull.epochtechnologies.item.ETItems;
import red.felnull.otyacraftengine.util.EntityUtil;

import java.util.Random;

public class CropPropBlock extends PropBlock implements IGrowable {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;

    public CropPropBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(PLACE, PropPlace.UNDER).with(AGE, 0));
    }

    @Override
    public ActionResultType onBlockActivated(BlockState stateIn, World worldIn, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult brtr) {
        ItemStack heldstack = player.getHeldItem(hand);
        if (canHarvest(worldIn, pos, stateIn)) {
            if (!worldIn.isRemote) {
                harvest(stateIn, worldIn, pos, Tags.Items.SHEARS.func_230235_a_(heldstack.getItem()));
            }
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.PASS;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(PLACE, AGE);
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {

        if (facing == Direction.DOWN) {
            if (facingState.getBlock() instanceof PropBlock) {
                if (facingState.get(PLACE) == PropPlace.UNDER) {
                    boolean noCrop = facingState.getBlock() != this;
                    return noCrop ? ETBlocks.PROP.getDefaultState().with(PLACE, PropPlace.MIDDLE) : stateIn.with(PLACE, PropPlace.MIDDLE);
                } else if (facingState.get(PLACE) == PropPlace.MIDDLE) {
                    boolean noCrop = facingState.getBlock() != this;
                    return noCrop ? ETBlocks.PROP.getDefaultState().with(PLACE, PropPlace.UP) : stateIn.with(PLACE, PropPlace.UP);
                }
            }
            return !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (canGrow(worldIn, pos, state, worldIn.getBlockState(pos.up()), true)) {
            float f = getGrowthChance(this, worldIn, pos);
            if (ForgeHooks.onCropsGrowPre(worldIn, pos, state, random.nextInt((int) (25.0F / f) + 1) == 0)) {
                grow(state, worldIn, pos, false);
                ForgeHooks.onCropsGrowPost(worldIn, pos, state);
            }
        }
    }

    public float getGrowthChance(Block blockIn, IBlockReader worldIn, BlockPos pos) {
        float f = 1.0F;
        BlockPos blockpos = pos.down();

        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float f1 = 0.0F;
                BlockState blockstate = worldIn.getBlockState(blockpos.add(i, 0, j));

                f1 = 1.0F;
                if (blockstate.isFertile(worldIn, pos.add(i, 0, j))) {
                    f1 = 3.0F;
                }


                if (i != 0 || j != 0) {
                    f1 /= 4.0F;
                }

                f += f1;
            }
        }

        BlockPos blockpos1 = pos.north();
        BlockPos blockpos2 = pos.south();
        BlockPos blockpos3 = pos.west();
        BlockPos blockpos4 = pos.east();
        boolean flag = blockIn == worldIn.getBlockState(blockpos3).getBlock() || blockIn == worldIn.getBlockState(blockpos4).getBlock();
        boolean flag1 = blockIn == worldIn.getBlockState(blockpos1).getBlock() || blockIn == worldIn.getBlockState(blockpos2).getBlock();
        if (flag && flag1) {
            f /= 2.0F;
        } else {
            boolean flag2 = blockIn == worldIn.getBlockState(blockpos3.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.south()).getBlock() || blockIn == worldIn.getBlockState(blockpos3.south()).getBlock();
            if (flag2) {
                f /= 2.0F;
            }
        }

        return f;
    }

    public void harvest(BlockState state, World worldIn, BlockPos pos, boolean precision) {
        Random r = new Random();
        if (!precision) {
            if (r.nextInt(100) <= 25) {
                worldIn.setBlockState(pos, ETBlocks.PROP.getDefaultState().with(PropBlock.PLACE, state.get(PropBlock.PLACE)));
            } else {
                worldIn.setBlockState(pos, state.with(AGE, 1));
            }
        } else {
            worldIn.setBlockState(pos, state.with(AGE, 1));
        }

        ItemEntity ie = EntityUtil.createItemEntity(new ItemStack(ETItems.PEPPER_CORNS, r.nextInt(16)), worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f);
        worldIn.addEntity(ie);
    }

    public boolean canHarvest(World worldIn, BlockPos pos, BlockState state) {

        return state.get(AGE) == 3;
    }

    public void grow(BlockState state, ServerWorld worldIn, BlockPos pos, boolean fate) {

        if (state.get(AGE) < 3) {
            worldIn.setBlockState(pos, state.with(AGE, state.get(AGE) + 1));
        }
        if (state.get(AGE) != 0 && worldIn.getBlockState(pos.up()).getBlock() == ETBlocks.PROP) {
            worldIn.setBlockState(pos.up(), this.getDefaultState().with(PropBlock.PLACE, worldIn.getBlockState(pos.up()).get(PropBlock.PLACE)));
        } else if (fate && state.get(AGE) != 0 && worldIn.getBlockState(pos.up()).getBlock() == this) {
            grow(worldIn.getBlockState(pos.up()), worldIn, pos.up(), fate);
        }

    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, BlockState upState, BlockState upupState) {

        if (state.get(PropBlock.PLACE) == PropPlace.UP) {
            return state.get(AGE) != 3;
        } else if (state.get(PropBlock.PLACE) == PropPlace.MIDDLE) {
            return state.get(AGE) != 3 || (upState.getBlock() == ETBlocks.PROP || upState.getBlock() == this && upState.get(AGE) != 3);
        } else if (state.get(PropBlock.PLACE) == PropPlace.UNDER) {
            return state.get(AGE) != 3 || (upState.getBlock() == ETBlocks.PROP || upState.getBlock() == this && upState.get(AGE) != 3) || (upupState.getBlock() == ETBlocks.PROP || upupState.getBlock() == this && upupState.get(AGE) != 3);
        }

        return state.get(AGE) != 3;
    }

    public boolean canGrow(ServerWorld worldIn, BlockPos pos, BlockState state, BlockState upState, boolean natural) {

        if (natural) {
            return (worldIn.getLightSubtracted(pos, 0) >= 8 || worldIn.canSeeSky(pos)) && state.get(AGE) != 3 || upState.getBlock() == ETBlocks.PROP;
        }

        return state.get(AGE) != 3 || upState.getBlock() == ETBlocks.PROP;
    }

    @Override
    public boolean canGrow(IBlockReader iBlockReader, BlockPos blockPos, BlockState blockState, boolean b) {
        return canGrow(iBlockReader, blockPos, blockState, iBlockReader.getBlockState(blockPos.up()), iBlockReader.getBlockState(blockPos.up().up()));
    }

    @Override
    public boolean canUseBonemeal(World world, Random random, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void grow(ServerWorld serverWorld, Random random, BlockPos blockPos, BlockState blockState) {
        grow(blockState, serverWorld, blockPos, true);
    }

}
