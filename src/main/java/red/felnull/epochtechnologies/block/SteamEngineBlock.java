package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import red.felnull.epochtechnologies.block.voxelshape.SteamEngineVoxelShape;
import red.felnull.epochtechnologies.tileentity.SteamEngineTileEntity;

import javax.annotation.Nullable;

public class SteamEngineBlock extends HorizontalBlock {

    public SteamEngineBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.get(HorizontalBlock.HORIZONTAL_FACING);
        switch (direction) {
            case NORTH:
                return SteamEngineVoxelShape.NORTH_AXIS_AABB;
            case SOUTH:
                return SteamEngineVoxelShape.SOUTH_AXIS_AABB;
            case EAST:
                return SteamEngineVoxelShape.EAST_AXIS_AABB;
            case WEST:
                return SteamEngineVoxelShape.WEST_AXIS_AABB;
            default:
                return SteamEngineVoxelShape.NORTH_AXIS_AABB;
        }

    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return (BlockState) this.getDefaultState().with(HORIZONTAL_FACING, p_196258_1_.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> blockBlockStateBuilder) {
        blockBlockStateBuilder.add(HORIZONTAL_FACING);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new SteamEngineTileEntity();
    }

    @Override
    public final boolean hasTileEntity(BlockState state) {
        return true;
    }
}
