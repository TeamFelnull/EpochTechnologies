package red.felnull.epochtechnologies.block.voxelshape;

import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import red.felnull.otyacraftengine.util.VoxelShapeHelper;

public class PepperCropPropVoxelShape {
    private static final VoxelShape UNDER_0_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.75, 0, 6.75, 9.25, 0.5, 9.25);
    private static final VoxelShape UNDER_0_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0.5, 7, 9, 16, 9);
    private static final VoxelShape UNDER_0_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0, 4, 12, 8, 12);
    public static final VoxelShape UNDER_0_AXIS_AABB = VoxelShapes.or(UNDER_0_PART1, UNDER_0_PART2, UNDER_0_PART3);

    private static final VoxelShape UNDER_1_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.75, 0, 6.75, 9.25, 0.5, 9.25);
    private static final VoxelShape UNDER_1_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0.5, 7, 9, 16, 9);
    private static final VoxelShape UNDER_1_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0, 4, 12, 16.25, 12);
    public static final VoxelShape UNDER_1_AXIS_AABB = VoxelShapes.or(UNDER_1_PART1, UNDER_1_PART2, UNDER_1_PART3);

    private static final VoxelShape UNDER_2_3_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.75, 0, 6.75, 9.25, 0.5, 9.25);
    private static final VoxelShape UNDER_2_3_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0.5, 7, 9, 16, 9);
    private static final VoxelShape UNDER_2_3_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0, 4, 12, 16.25, 12);
    private static final VoxelShape UNDER_2_3_PART4 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 3.7, 2.6, 10.8, 6.1, 3.8);
    private static final VoxelShape UNDER_2_3_PART5 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 9.5, 2.6, 10.8, 11.9, 3.8);
    private static final VoxelShape UNDER_2_3_PART6 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 9.5, 12.2, 10.8, 11.9, 13.4);
    private static final VoxelShape UNDER_2_3_PART7 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 2.5, 12.2, 10.8, 4.9, 13.4);
    private static final VoxelShape UNDER_2_3_PART8 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 4.5, 12.2, 6.8, 6.9, 13.4);
    private static final VoxelShape UNDER_2_3_PART9 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 11.5, 12.2, 6.8, 13.9, 13.4);
    private static final VoxelShape UNDER_2_3_PART10 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 9.5, 5.6, 13.4, 11.9, 6.8);
    private static final VoxelShape UNDER_2_3_PART11 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 11, 5.6, 3.8, 13.4, 6.8);
    private static final VoxelShape UNDER_2_3_PART12 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 10.7, 8.8, 3.8, 13.1, 10);
    private static final VoxelShape UNDER_2_3_PART13 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 2.6, 5.3, 3.8, 5, 6.5);
    private static final VoxelShape UNDER_2_3_PART14 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 2.6, 8.8, 3.8, 5, 10);
    private static final VoxelShape UNDER_2_3_PART15 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 3.5, 5.6, 13.4, 5.9, 6.8);
    private static final VoxelShape UNDER_2_3_PART16 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 1.9, 9, 13.4, 4.3, 10.2);
    private static final VoxelShape UNDER_2_3_PART17 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 11.1, 9, 13.4, 13.5, 10.2);
    private static final VoxelShape UNDER_2_3_PART18 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 2.2, 2.6, 6.8, 4.6, 3.8);
    private static final VoxelShape UNDER_2_3_PART19 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 11.4, 2.6, 6.8, 13.8, 3.8);
    private static final VoxelShape UNDER_2_3_PART20 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 6.1, 3.575, 10.3, 6.3, 4);
    private static final VoxelShape UNDER_2_3_PART21 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 11.9, 3.575, 10.3, 12.1, 4);
    private static final VoxelShape UNDER_2_3_PART22 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 11.9, 11.975, 10.3, 12.1, 12.4);
    private static final VoxelShape UNDER_2_3_PART23 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 4.9, 11.975, 10.3, 5.1, 12.4);
    private static final VoxelShape UNDER_2_3_PART24 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 6.9, 11.975, 6.3, 7.1, 12.4);
    private static final VoxelShape UNDER_2_3_PART25 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 13.9, 11.975, 6.3, 14.1, 12.4);
    private static final VoxelShape UNDER_2_3_PART26 = VoxelShapeHelper.makeCuboidShaoe0(12, 11.9, 6.075, 12.425, 12.1, 6.275);
    private static final VoxelShape UNDER_2_3_PART27 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 13.4, 6.075, 4.025, 13.6, 6.275);
    private static final VoxelShape UNDER_2_3_PART28 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 13.1, 9.275, 4.025, 13.3, 9.475);
    private static final VoxelShape UNDER_2_3_PART29 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 5, 5.775, 4.025, 5.2, 5.975);
    private static final VoxelShape UNDER_2_3_PART30 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 5, 9.275, 4.025, 5.2, 9.475);
    private static final VoxelShape UNDER_2_3_PART31 = VoxelShapeHelper.makeCuboidShaoe0(12, 5.9, 6.075, 12.425, 6.1, 6.275);
    private static final VoxelShape UNDER_2_3_PART32 = VoxelShapeHelper.makeCuboidShaoe0(12, 4.3, 9.475, 12.425, 4.5, 9.675);
    private static final VoxelShape UNDER_2_3_PART33 = VoxelShapeHelper.makeCuboidShaoe0(12, 13.5, 9.475, 12.425, 13.7, 9.675);
    private static final VoxelShape UNDER_2_3_PART34 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 4.6, 3.575, 6.3, 4.8, 4);
    private static final VoxelShape UNDER_2_3_PART35 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 13.8, 3.575, 6.3, 14, 4);
    public static final VoxelShape UNDER_2_3_AXIS_AABB = VoxelShapes.or(UNDER_2_3_PART1, UNDER_2_3_PART2, UNDER_2_3_PART3, UNDER_2_3_PART4, UNDER_2_3_PART5, UNDER_2_3_PART6, UNDER_2_3_PART7, UNDER_2_3_PART8, UNDER_2_3_PART9, UNDER_2_3_PART10, UNDER_2_3_PART11, UNDER_2_3_PART12, UNDER_2_3_PART13, UNDER_2_3_PART14, UNDER_2_3_PART15, UNDER_2_3_PART16, UNDER_2_3_PART17, UNDER_2_3_PART18, UNDER_2_3_PART19, UNDER_2_3_PART20, UNDER_2_3_PART21, UNDER_2_3_PART22, UNDER_2_3_PART23, UNDER_2_3_PART24, UNDER_2_3_PART25, UNDER_2_3_PART26, UNDER_2_3_PART27, UNDER_2_3_PART28, UNDER_2_3_PART29, UNDER_2_3_PART30, UNDER_2_3_PART31, UNDER_2_3_PART32, UNDER_2_3_PART33, UNDER_2_3_PART34, UNDER_2_3_PART35);

    private static final VoxelShape MIDDLE_0_PART1 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 16, 9);
    private static final VoxelShape MIDDLE_0_PART2 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 8, 12);
    public static final VoxelShape MIDDLE_0_AXIS_AABB = VoxelShapes.or(MIDDLE_0_PART1, MIDDLE_0_PART2);

    private static final VoxelShape MIDDLE_1_PART1 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 16, 9);
    private static final VoxelShape MIDDLE_1_PART2 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 16.25, 12);
    public static final VoxelShape MIDDLE_1_AXIS_AABB = VoxelShapes.or(MIDDLE_1_PART1, MIDDLE_1_PART2);

    private static final VoxelShape MIDDLE_2_3_PART1 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 16, 9);
    private static final VoxelShape MIDDLE_2_3_PART2 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 16.25, 12);
    private static final VoxelShape MIDDLE_2_3_PART3 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 12.8, 3.575, 6.3, 13, 4);
    private static final VoxelShape MIDDLE_2_3_PART4 = VoxelShapeHelper.makeCuboidShaoe0(7.8, 9.2, 3.575, 8, 9.4, 4);
    private static final VoxelShape MIDDLE_2_3_PART5 = VoxelShapeHelper.makeCuboidShaoe0(12, 12.8, 9.475, 12.425, 13, 9.675);
    private static final VoxelShape MIDDLE_2_3_PART6 = VoxelShapeHelper.makeCuboidShaoe0(12, 6.1, 6.075, 12.425, 6.3, 6.275);
    private static final VoxelShape MIDDLE_2_3_PART7 = VoxelShapeHelper.makeCuboidShaoe0(12, 3.7, 9.475, 12.425, 3.9, 9.675);
    private static final VoxelShape MIDDLE_2_3_PART8 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 4.6, 9.275, 4.025, 4.8, 9.475);
    private static final VoxelShape MIDDLE_2_3_PART9 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 7.2, 5.775, 4.025, 7.4, 5.975);
    private static final VoxelShape MIDDLE_2_3_PART10 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 14.1, 9.275, 4.025, 14.3, 9.475);
    private static final VoxelShape MIDDLE_2_3_PART11 = VoxelShapeHelper.makeCuboidShaoe0(12, 14.4, 6.075, 12.425, 14.6, 6.275);
    private static final VoxelShape MIDDLE_2_3_PART12 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 14.4, 6.075, 4.025, 14.6, 6.275);
    private static final VoxelShape MIDDLE_2_3_PART13 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 14.9, 11.975, 6.3, 15.1, 12.4);
    private static final VoxelShape MIDDLE_2_3_PART14 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 7.9, 11.975, 6.3, 8.1, 12.4);
    private static final VoxelShape MIDDLE_2_3_PART15 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 5.9, 11.975, 10.3, 6.1, 12.4);
    private static final VoxelShape MIDDLE_2_3_PART16 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 12.9, 11.975, 10.3, 13.1, 12.4);
    private static final VoxelShape MIDDLE_2_3_PART17 = VoxelShapeHelper.makeCuboidShaoe0(9.3, 13.8, 3.575, 9.5, 14, 4);
    private static final VoxelShape MIDDLE_2_3_PART18 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 10.4, 2.6, 6.8, 12.8, 3.8);
    private static final VoxelShape MIDDLE_2_3_PART19 = VoxelShapeHelper.makeCuboidShaoe0(9.1, 4.4, 3.575, 9.3, 4.6, 4);
    private static final VoxelShape MIDDLE_2_3_PART20 = VoxelShapeHelper.makeCuboidShaoe0(7.3, 6.8, 2.6, 8.5, 9.2, 3.8);
    private static final VoxelShape MIDDLE_2_3_PART21 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 10.4, 9, 13.4, 12.8, 10.2);
    private static final VoxelShape MIDDLE_2_3_PART22 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 1.3, 9, 13.4, 3.7, 10.2);
    private static final VoxelShape MIDDLE_2_3_PART23 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 3.7, 5.6, 13.4, 6.1, 6.8);
    private static final VoxelShape MIDDLE_2_3_PART24 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 2.2, 8.8, 3.8, 4.6, 10);
    private static final VoxelShape MIDDLE_2_3_PART25 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 12, 5.6, 3.8, 14.4, 6.8);
    private static final VoxelShape MIDDLE_2_3_PART26 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 11.7, 8.8, 3.8, 14.1, 10);
    private static final VoxelShape MIDDLE_2_3_PART27 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 4.8, 5.3, 3.8, 7.2, 6.5);
    private static final VoxelShape MIDDLE_2_3_PART28 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 12, 5.6, 13.4, 14.4, 6.8);
    private static final VoxelShape MIDDLE_2_3_PART29 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 5.5, 12.2, 6.8, 7.9, 13.4);
    private static final VoxelShape MIDDLE_2_3_PART30 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 3.5, 12.2, 10.8, 5.9, 13.4);
    private static final VoxelShape MIDDLE_2_3_PART31 = VoxelShapeHelper.makeCuboidShaoe0(8.8, 11.4, 2.6, 10, 13.8, 3.8);
    private static final VoxelShape MIDDLE_2_3_PART32 = VoxelShapeHelper.makeCuboidShaoe0(8.6, 2, 2.6, 9.8, 4.4, 3.8);
    private static final VoxelShape MIDDLE_2_3_PART33 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 10.5, 12.2, 10.8, 12.9, 13.4);
    private static final VoxelShape MIDDLE_2_3_PART34 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 12.5, 12.2, 6.8, 14.9, 13.4);
    public static final VoxelShape MIDDLE_2_3_AXIS_AABB = VoxelShapes.or(MIDDLE_2_3_PART1, MIDDLE_2_3_PART2, MIDDLE_2_3_PART3, MIDDLE_2_3_PART4, MIDDLE_2_3_PART5, MIDDLE_2_3_PART6, MIDDLE_2_3_PART7, MIDDLE_2_3_PART8, MIDDLE_2_3_PART9, MIDDLE_2_3_PART10, MIDDLE_2_3_PART11, MIDDLE_2_3_PART12, MIDDLE_2_3_PART13, MIDDLE_2_3_PART14, MIDDLE_2_3_PART15, MIDDLE_2_3_PART16, MIDDLE_2_3_PART17, MIDDLE_2_3_PART18, MIDDLE_2_3_PART19, MIDDLE_2_3_PART20, MIDDLE_2_3_PART21, MIDDLE_2_3_PART22, MIDDLE_2_3_PART23, MIDDLE_2_3_PART24, MIDDLE_2_3_PART25, MIDDLE_2_3_PART26, MIDDLE_2_3_PART27, MIDDLE_2_3_PART28, MIDDLE_2_3_PART29, MIDDLE_2_3_PART30, MIDDLE_2_3_PART31, MIDDLE_2_3_PART32, MIDDLE_2_3_PART33, MIDDLE_2_3_PART34);

    private static final VoxelShape UP_0_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.875, 15.5, 6.875, 9.125, 16, 9.125);
    private static final VoxelShape UP_0_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 15.5, 9);
    private static final VoxelShape UP_0_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 8, 12);
    public static final VoxelShape UP_0_AXIS_AABB = VoxelShapes.or(UP_0_PART1, UP_0_PART2, UP_0_PART3);

    private static final VoxelShape UP_1_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.875, 15.5, 6.875, 9.125, 16, 9.125);
    private static final VoxelShape UP_1_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 15.5, 9);
    private static final VoxelShape UP_1_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 16.25, 12);
    public static final VoxelShape UP_1_AXIS_AABB = VoxelShapes.or(UP_1_PART1, UP_1_PART2, UP_1_PART3);

    private static final VoxelShape UP_2_3_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.875, 15.5, 6.875, 9.125, 16, 9.125);
    private static final VoxelShape UP_2_3_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 15.5, 9);
    private static final VoxelShape UP_2_3_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 16.25, 12);
    private static final VoxelShape UP_2_3_PART4 = VoxelShapeHelper.makeCuboidShaoe0(10, 9, 3.575, 10.2, 9.2, 4);
    private static final VoxelShape UP_2_3_PART5 = VoxelShapeHelper.makeCuboidShaoe0(5.3, 10.5, 3.575, 5.5, 10.7, 4);
    private static final VoxelShape UP_2_3_PART6 = VoxelShapeHelper.makeCuboidShaoe0(12, 12.8, 9.475, 12.425, 13, 9.675);
    private static final VoxelShape UP_2_3_PART7 = VoxelShapeHelper.makeCuboidShaoe0(12, 7.5, 6.075, 12.425, 7.7, 6.275);
    private static final VoxelShape UP_2_3_PART8 = VoxelShapeHelper.makeCuboidShaoe0(12, 3.7, 9.475, 12.425, 3.9, 9.675);
    private static final VoxelShape UP_2_3_PART9 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 4.6, 9.275, 4.025, 4.8, 9.475);
    private static final VoxelShape UP_2_3_PART10 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 7.2, 5.775, 4.025, 7.4, 5.975);
    private static final VoxelShape UP_2_3_PART11 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 11.6, 9.275, 4.025, 11.8, 9.475);
    private static final VoxelShape UP_2_3_PART12 = VoxelShapeHelper.makeCuboidShaoe0(12, 14.4, 6.075, 12.425, 14.6, 6.275);
    private static final VoxelShape UP_2_3_PART13 = VoxelShapeHelper.makeCuboidShaoe0(3.6, 14.4, 6.075, 4.025, 14.6, 6.275);
    private static final VoxelShape UP_2_3_PART14 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 11.8, 11.975, 6.3, 12, 12.4);
    private static final VoxelShape UP_2_3_PART15 = VoxelShapeHelper.makeCuboidShaoe0(6.1, 5.3, 11.975, 6.3, 5.5, 12.4);
    private static final VoxelShape UP_2_3_PART16 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 8.8, 11.975, 10.3, 9, 12.4);
    private static final VoxelShape UP_2_3_PART17 = VoxelShapeHelper.makeCuboidShaoe0(10.1, 13.4, 11.975, 10.3, 13.6, 12.4);
    private static final VoxelShape UP_2_3_PART18 = VoxelShapeHelper.makeCuboidShaoe0(8.1, 13.8, 3.575, 8.3, 14, 4);
    private static final VoxelShape UP_2_3_PART19 = VoxelShapeHelper.makeCuboidShaoe0(9.5, 6.6, 2.6, 10.7, 9, 3.8);
    private static final VoxelShape UP_2_3_PART20 = VoxelShapeHelper.makeCuboidShaoe0(5.8, 4.4, 3.575, 6, 4.6, 4);
    private static final VoxelShape UP_2_3_PART21 = VoxelShapeHelper.makeCuboidShaoe0(4.8, 8.1, 2.6, 6, 10.5, 3.8);
    private static final VoxelShape UP_2_3_PART22 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 10.4, 9, 13.4, 12.8, 10.2);
    private static final VoxelShape UP_2_3_PART23 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 1.3, 9, 13.4, 3.7, 10.2);
    private static final VoxelShape UP_2_3_PART24 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 5.1, 5.6, 13.4, 7.5, 6.8);
    private static final VoxelShape UP_2_3_PART25 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 2.2, 8.8, 3.8, 4.6, 10);
    private static final VoxelShape UP_2_3_PART26 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 12, 5.6, 3.8, 14.4, 6.8);
    private static final VoxelShape UP_2_3_PART27 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 9.2, 8.8, 3.8, 11.6, 10);
    private static final VoxelShape UP_2_3_PART28 = VoxelShapeHelper.makeCuboidShaoe0(2.6, 4.8, 5.3, 3.8, 7.2, 6.5);
    private static final VoxelShape UP_2_3_PART29 = VoxelShapeHelper.makeCuboidShaoe0(12.2, 12, 5.6, 13.4, 14.4, 6.8);
    private static final VoxelShape UP_2_3_PART30 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 2.9, 12.2, 6.8, 5.3, 13.4);
    private static final VoxelShape UP_2_3_PART31 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 6.4, 12.2, 10.8, 8.8, 13.4);
    private static final VoxelShape UP_2_3_PART32 = VoxelShapeHelper.makeCuboidShaoe0(7.6, 11.4, 2.6, 8.8, 13.8, 3.8);
    private static final VoxelShape UP_2_3_PART33 = VoxelShapeHelper.makeCuboidShaoe0(5.3, 2, 2.6, 6.5, 4.4, 3.8);
    private static final VoxelShape UP_2_3_PART34 = VoxelShapeHelper.makeCuboidShaoe0(9.6, 11, 12.2, 10.8, 13.4, 13.4);
    private static final VoxelShape UP_2_3_PART35 = VoxelShapeHelper.makeCuboidShaoe0(5.6, 9.4, 12.2, 6.8, 11.8, 13.4);
    public static final VoxelShape UP_2_3_AXIS_AABB = VoxelShapes.or(UP_2_3_PART1, UP_2_3_PART2, UP_2_3_PART3, UP_2_3_PART4, UP_2_3_PART5, UP_2_3_PART6, UP_2_3_PART7, UP_2_3_PART8, UP_2_3_PART9, UP_2_3_PART10, UP_2_3_PART11, UP_2_3_PART12, UP_2_3_PART13, UP_2_3_PART14, UP_2_3_PART15, UP_2_3_PART16, UP_2_3_PART17, UP_2_3_PART18, UP_2_3_PART19, UP_2_3_PART20, UP_2_3_PART21, UP_2_3_PART22, UP_2_3_PART23, UP_2_3_PART24, UP_2_3_PART25, UP_2_3_PART26, UP_2_3_PART27, UP_2_3_PART28, UP_2_3_PART29, UP_2_3_PART30, UP_2_3_PART31, UP_2_3_PART32, UP_2_3_PART33, UP_2_3_PART34, UP_2_3_PART35);


}
/*
public class Main {

	public static String filePath;

	public static void main(String[] args) {
		filePath = "C:\\dev\\minecraft\\EpochTechnologies\\src\\main\\resources\\assets\\epochtechnologies\\models\\block\\prop_crop\\prop_up.json";

		Map<String, Integer> hougakus = new HashMap<String, Integer>();

		//	String ast = "_WALL";

		hougakus.put("UP", 0);

		//	hougakus.put("WEST" + ast, 0);
		//	hougakus.put("EAST" + ast, 180);
		//	hougakus.put("SOUTH" + ast, 90);
		//	hougakus.put("NORTH" + ast, 270);

		for (Entry<String, Integer> en : hougakus.entrySet()) {

			outCdString(en.getKey(), en.getValue());
			System.out.println("");
		}

	}

	public static void outCdString(String hst, int hin) {
		List<String> sts = new ArrayList<String>();
		txtReader(sts, Paths.get(filePath));

		String from = "";
		String to = "";

		String vp = "private static final VoxelShape " + hst + "_PART%s =  VoxelShapeHelper.makeCuboidShaoe" + hin
				+ "(%s);";
		int cont = 0;
		for (String st : sts) {

			if (st.contains("from") && st.contains("[")) {
				from = st.split(":")[1].substring(2).substring(0, st.split(":")[1].substring(2).length() - 2);
			} else if (st.contains("to") && st.contains("[")) {
				to = st.split(":")[1].substring(2).substring(0, st.split(":")[1].substring(2).length() - 2);
				cont++;
				System.out.println(String.format(vp, cont, from + ", " + to));
			}
		}

		String lastest = "public static final VoxelShape " + hst + "_AXIS_AABB = VoxelShapes.or(%s);";
		String is = hst + "_PART%s";
		String ia = "";
		for (int i = 1; i < cont + 1; i++) {
			if (i != cont)
				ia += String.format(is, i) + ",";
			else
				ia += String.format(is, i);
		}
		System.out.println(String.format(lastest, ia));
	}

	public static void txtReader(List<String> list, Path path) {
		list.clear();
		try {
			FileReader re = new FileReader(path.toString());
			BufferedReader bre = new BufferedReader(re);
			String st;
			while ((st = bre.readLine()) != null) {
				try {
					list.add(st);
				} catch (Exception e) {

				}
			}

		} catch (IOException e) {

		}

	}
}
 */
