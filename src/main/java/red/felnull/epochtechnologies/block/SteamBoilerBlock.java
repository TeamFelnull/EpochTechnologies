package red.felnull.epochtechnologies.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import red.felnull.epochtechnologies.tileentity.SteamBoilerTileEntity;

import javax.annotation.Nullable;

public class SteamBoilerBlock extends HorizontalBlock {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    public SteamBoilerBlock(AbstractBlock.Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return this.getDefaultState().with(HORIZONTAL_FACING, p_196258_1_.getPlacementHorizontalFacing().getOpposite()).with(LIT, false).with(OPEN, false);
    }

    /*
        @Override
        public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
            Direction direction = state.get(HorizontalBlock.HORIZONTAL_FACING);
            switch (direction) {
                case NORTH:
                    return SteamBoilerVoxelShape.NORTH_AXIS_AABB;
                case SOUTH:
                    return SteamBoilerVoxelShape.SOUTH_AXIS_AABB;
                case EAST:
                    return SteamBoilerVoxelShape.EAST_AXIS_AABB;
                case WEST:
                    return SteamBoilerVoxelShape.WEST_AXIS_AABB;
                default:
                    return SteamBoilerVoxelShape.NORTH_AXIS_AABB;
            }

        }
    */
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> blockBlockStateBuilder) {
        blockBlockStateBuilder.add(HORIZONTAL_FACING, LIT, OPEN);

    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new SteamBoilerTileEntity();
    }

    @Override
    public final boolean hasTileEntity(BlockState state) {
        return true;
    }
}
