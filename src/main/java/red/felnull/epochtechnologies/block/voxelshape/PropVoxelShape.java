package red.felnull.epochtechnologies.block.voxelshape;

import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import red.felnull.otyacraftengine.util.VoxelShapeHelper;

public class PropVoxelShape {
    private static final VoxelShape UNDER_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.75, 0, 6.75, 9.25, 0.5, 9.25);
    private static final VoxelShape UNDER_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0.5, 7, 9, 16, 9);
    public static final VoxelShape UNDER_AXIS_AABB = VoxelShapes.or(UNDER_PART1, UNDER_PART2);

    private static final VoxelShape MIDDLE_PART1 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 16, 9);
    public static final VoxelShape MIDDLE_AXIS_AABB = VoxelShapes.or(MIDDLE_PART1);

    private static final VoxelShape UP_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.875, 15.5, 6.875, 9.125, 16, 9.125);
    private static final VoxelShape UP_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 15.5, 9);
    public static final VoxelShape UP_AXIS_AABB = VoxelShapes.or(UP_PART1, UP_PART2);
}
