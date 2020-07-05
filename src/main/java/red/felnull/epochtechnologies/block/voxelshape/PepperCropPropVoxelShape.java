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


    private static final VoxelShape MIDDLE_0_PART1 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 16, 9);
    private static final VoxelShape MIDDLE_0_PART2 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 8, 12);
    public static final VoxelShape MIDDLE_0_AXIS_AABB = VoxelShapes.or(MIDDLE_0_PART1, MIDDLE_0_PART2);

    private static final VoxelShape MIDDLE_1_PART1 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 16, 9);
    private static final VoxelShape MIDDLE_1_PART2 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 16.25, 12);
    public static final VoxelShape MIDDLE_1_AXIS_AABB = VoxelShapes.or(MIDDLE_1_PART1, MIDDLE_1_PART2);

    private static final VoxelShape UP_0_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.875, 15.5, 6.875, 9.125, 16, 9.125);
    private static final VoxelShape UP_0_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 15.5, 9);
    private static final VoxelShape UP_0_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 8, 12);
    public static final VoxelShape UP_0_AXIS_AABB = VoxelShapes.or(UP_0_PART1, UP_0_PART2, UP_0_PART3);

    private static final VoxelShape UP_1_PART1 = VoxelShapeHelper.makeCuboidShaoe0(6.875, 15.5, 6.875, 9.125, 16, 9.125);
    private static final VoxelShape UP_1_PART2 = VoxelShapeHelper.makeCuboidShaoe0(7, 0, 7, 9, 15.5, 9);
    private static final VoxelShape UP_1_PART3 = VoxelShapeHelper.makeCuboidShaoe0(4, 0.25, 4, 12, 16.25, 12);
    public static final VoxelShape UP_1_AXIS_AABB = VoxelShapes.or(UP_1_PART1, UP_1_PART2, UP_1_PART3);


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
