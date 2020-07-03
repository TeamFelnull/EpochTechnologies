package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import red.felnull.epochtechnologies.block.propertie.ETBlockStateProperties;
import red.felnull.epochtechnologies.block.propertie.PropPlace;
import red.felnull.epochtechnologies.block.voxelshape.PropVoxelShape;

public class PropBlock extends Block {

    public static final EnumProperty<PropPlace> PLACE = ETBlockStateProperties.PROP_PLACE;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_1;

    public PropBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(PLACE, PropPlace.UNDER).with(AGE, 0));
    }

    @Override
    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {

        BlockState dwonState = context.getWorld().getBlockState(context.getPos().down());
        if (dwonState.getBlock() instanceof PropBlock) {
            if (dwonState.get(PLACE) == PropPlace.UNDER) {
                return getDefaultState().with(PLACE, PropPlace.MIDDLE);
            } else if (dwonState.get(PLACE) == PropPlace.MIDDLE) {
                return getDefaultState().with(PLACE, PropPlace.UP);
            }
        }
        return getDefaultState();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(PLACE, AGE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        PropPlace place = state.get(PLACE);
        if (place == PropPlace.UNDER) {
            return PropVoxelShape.UNDER_AXIS_AABB;
        } else if (place == PropPlace.MIDDLE) {
            return PropVoxelShape.MIDDLE_AXIS_AABB;
        } else if (place == PropPlace.UP) {
            return PropVoxelShape.UP_AXIS_AABB;
        }
        return super.getShape(state, worldIn, pos, context);
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {

        if (facing == Direction.DOWN) {
            if (facingState.getBlock() instanceof PropBlock) {
                if (facingState.get(PLACE) == PropPlace.UNDER) {
                    return stateIn.with(PLACE, PropPlace.MIDDLE);
                } else if (facingState.get(PLACE) == PropPlace.MIDDLE) {
                    return stateIn.with(PLACE, PropPlace.UP);
                }
            }
            return !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public boolean isValidPosition(BlockState stateIn, IWorldReader worldIn, BlockPos pos) {
        BlockState underState = worldIn.getBlockState(pos.down());

        if (underState.getBlock() instanceof PropBlock && underState.get(PLACE) == PropPlace.UP) {
            return false;
        } else if (underState.getBlock() instanceof PropBlock || ETBlockTags.PROP_PLANTABLE_ON.func_230235_a_(underState.getBlock())) {
            return true;
        }

        return false;
    }
}
