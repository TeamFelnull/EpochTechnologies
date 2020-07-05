package red.felnull.epochtechnologies.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import red.felnull.epochtechnologies.block.propertie.PropPlace;
import red.felnull.epochtechnologies.block.voxelshape.PepperCropPropVoxelShape;

public class PepperCropPropBlock extends CropPropBlock {
    public PepperCropPropBlock(AbstractBlock.Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        PropPlace place = state.get(PLACE);
        int age = state.get(CropPropBlock.AGE);
        if (age == 0) {
            if (place == PropPlace.UNDER) {
                return PepperCropPropVoxelShape.UNDER_0_AXIS_AABB;
            } else if (place == PropPlace.MIDDLE) {
                return PepperCropPropVoxelShape.MIDDLE_0_AXIS_AABB;
            } else if (place == PropPlace.UP) {
                return PepperCropPropVoxelShape.UP_0_AXIS_AABB;
            }
        } else if (age == 1 || age == 2 || age == 3) {
            if (place == PropPlace.UNDER) {
                return PepperCropPropVoxelShape.UNDER_1_AXIS_AABB;
            } else if (place == PropPlace.MIDDLE) {
                return PepperCropPropVoxelShape.MIDDLE_1_AXIS_AABB;
            } else if (place == PropPlace.UP) {
                return PepperCropPropVoxelShape.UP_1_AXIS_AABB;
            }
        }

        return super.getShape(state, worldIn, pos, context);
    }
}
