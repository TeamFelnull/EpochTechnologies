package red.felnull.epochtechnologies.item;

import net.minecraft.item.Food;

public class ETFoods {
    public static final Food CORN = (new Food.Builder()).hunger(1).saturation(0.3F).build();
    public static final Food TEA_LEAF = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food PEPPER_CORNS = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food COTTON = (new Food.Builder()).hunger(3).saturation(1f).build();

}
