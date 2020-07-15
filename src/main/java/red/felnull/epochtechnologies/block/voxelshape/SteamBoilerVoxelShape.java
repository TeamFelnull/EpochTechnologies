package red.felnull.epochtechnologies.block.voxelshape;

import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import red.felnull.otyacraftengine.util.VoxelShapeHelper;

public class SteamBoilerVoxelShape {
    private static final VoxelShape NORTH_PART1 = VoxelShapeHelper.makeCuboidShaoe0(0, 0, 0, 16, 5, 16);
    private static final VoxelShape NORTH_PART2 = VoxelShapeHelper.makeCuboidShaoe0(2, 5, 2, 14, 21, 14);
    private static final VoxelShape NORTH_PART3 = VoxelShapeHelper.makeCuboidShaoe0(9.75, 21, 9.75, 13.75, 29, 13.75);
    private static final VoxelShape NORTH_PART4 = VoxelShapeHelper.makeCuboidShaoe0(6.5, 21, 6.5, 9.5, 32, 9.5);
    private static final VoxelShape NORTH_PART5 = VoxelShapeHelper.makeCuboidShaoe0(6.5, 6.5, 14, 9.5, 9.5, 16);
    public static final VoxelShape NORTH_AXIS_AABB = VoxelShapes.or(NORTH_PART1, NORTH_PART2, NORTH_PART3, NORTH_PART4, NORTH_PART5);

    private static final VoxelShape WEST_PART1 = VoxelShapeHelper.makeCuboidShaoe90(0, 0, 0, 16, 5, 16);
    private static final VoxelShape WEST_PART2 = VoxelShapeHelper.makeCuboidShaoe90(2, 5, 2, 14, 21, 14);
    private static final VoxelShape WEST_PART3 = VoxelShapeHelper.makeCuboidShaoe90(9.75, 21, 9.75, 13.75, 29, 13.75);
    private static final VoxelShape WEST_PART4 = VoxelShapeHelper.makeCuboidShaoe90(6.5, 21, 6.5, 9.5, 32, 9.5);
    private static final VoxelShape WEST_PART5 = VoxelShapeHelper.makeCuboidShaoe90(6.5, 6.5, 14, 9.5, 9.5, 16);
    public static final VoxelShape WEST_AXIS_AABB = VoxelShapes.or(WEST_PART1, WEST_PART2, WEST_PART3, WEST_PART4, WEST_PART5);

    private static final VoxelShape SOUTH_PART1 = VoxelShapeHelper.makeCuboidShaoe180(0, 0, 0, 16, 5, 16);
    private static final VoxelShape SOUTH_PART2 = VoxelShapeHelper.makeCuboidShaoe180(2, 5, 2, 14, 21, 14);
    private static final VoxelShape SOUTH_PART3 = VoxelShapeHelper.makeCuboidShaoe180(9.75, 21, 9.75, 13.75, 29, 13.75);
    private static final VoxelShape SOUTH_PART4 = VoxelShapeHelper.makeCuboidShaoe180(6.5, 21, 6.5, 9.5, 32, 9.5);
    private static final VoxelShape SOUTH_PART5 = VoxelShapeHelper.makeCuboidShaoe180(6.5, 6.5, 14, 9.5, 9.5, 16);
    public static final VoxelShape SOUTH_AXIS_AABB = VoxelShapes.or(SOUTH_PART1, SOUTH_PART2, SOUTH_PART3, SOUTH_PART4, SOUTH_PART5);

    private static final VoxelShape EAST_PART1 = VoxelShapeHelper.makeCuboidShaoe270(0, 0, 0, 16, 5, 16);
    private static final VoxelShape EAST_PART2 = VoxelShapeHelper.makeCuboidShaoe270(2, 5, 2, 14, 21, 14);
    private static final VoxelShape EAST_PART3 = VoxelShapeHelper.makeCuboidShaoe270(9.75, 21, 9.75, 13.75, 29, 13.75);
    private static final VoxelShape EAST_PART4 = VoxelShapeHelper.makeCuboidShaoe270(6.5, 21, 6.5, 9.5, 32, 9.5);
    private static final VoxelShape EAST_PART5 = VoxelShapeHelper.makeCuboidShaoe270(6.5, 6.5, 14, 9.5, 9.5, 16);
    public static final VoxelShape EAST_AXIS_AABB = VoxelShapes.or(EAST_PART1, EAST_PART2, EAST_PART3, EAST_PART4, EAST_PART5);


}
