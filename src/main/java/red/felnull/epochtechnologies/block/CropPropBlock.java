package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;
import red.felnull.epochtechnologies.block.propertie.PropPlace;

import java.util.Random;

public class CropPropBlock extends PropBlock implements IGrowable {

    public CropPropBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {

        if (facing == Direction.DOWN) {
            if (facingState.getBlock() instanceof PropBlock) {
                if (facingState.get(PLACE) == PropPlace.UNDER) {
                    boolean noCrop = facingState.getBlock() != this && facingState.get(AGE) != 1;
                    return noCrop ? ETBlocks.PROP.getDefaultState().with(PLACE, PropPlace.MIDDLE) : stateIn.with(PLACE, PropPlace.MIDDLE);
                } else if (facingState.get(PLACE) == PropPlace.MIDDLE) {
                    boolean noCrop = facingState.getBlock() != this && facingState.get(AGE) != 1;
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
                grow(state, worldIn, pos);
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


    public void grow(BlockState state, ServerWorld worldIn, BlockPos pos) {

        if (state.get(AGE) != 1) {
            worldIn.setBlockState(pos, state.with(AGE, 1));
        } else if (worldIn.getBlockState(pos.up()).getBlock() == ETBlocks.PROP) {
            worldIn.setBlockState(pos.up(), this.getDefaultState().with(PropBlock.PLACE, worldIn.getBlockState(pos.up()).get(PropBlock.PLACE)));
        }

    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, BlockState upState) {
        return state.get(AGE) != 1 || upState.getBlock() == ETBlocks.PROP;
    }

    public boolean canGrow(ServerWorld worldIn, BlockPos pos, BlockState state, BlockState upState, boolean natural) {

        if (natural) {
            return (worldIn.getLightSubtracted(pos, 0) >= 8 || worldIn.canSeeSky(pos)) && state.get(AGE) != 1 || upState.getBlock() == ETBlocks.PROP;
        }

        return state.get(AGE) != 1 || upState.getBlock() == ETBlocks.PROP;
    }

    @Override
    public boolean canGrow(IBlockReader iBlockReader, BlockPos blockPos, BlockState blockState, boolean b) {
        return canGrow(iBlockReader, blockPos, blockState, iBlockReader.getBlockState(blockPos.up()));
    }

    @Override
    public boolean canUseBonemeal(World world, Random random, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void grow(ServerWorld serverWorld, Random random, BlockPos blockPos, BlockState blockState) {
        grow(blockState, serverWorld, blockPos);
    }
}
