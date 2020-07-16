package red.felnull.epochtechnologies.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
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

    @Override
    public ActionResultType onBlockActivated(BlockState p_225533_1_, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (!worldIn.isRemote) {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (!(tileentity instanceof SteamBoilerTileEntity))
                return ActionResultType.PASS;

            NetworkHooks.openGui((ServerPlayerEntity) playerIn, (INamedContainerProvider) tileentity, pos);
        }
        return ActionResultType.SUCCESS;
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
