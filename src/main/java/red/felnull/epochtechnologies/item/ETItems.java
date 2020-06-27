package red.felnull.epochtechnologies.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETItems {
    public static final Item TEST_ITEM = new TestItem(new Item.Properties().group(ETItemGroup.MOD_TAB))
            .setRegistryName(EpochTechnologies.MODID, "test_item");

    //インゴット
    public static final Item COPPER_INGOT = newItem("copper_ingot");
    public static final Item TIN_INGOT = newItem("tin_ingot");
    public static final Item LEAD_INGOT = newItem("lead_ingot");
    public static final Item NICKEL_INGOT = newItem("nickel_ingot");
    public static final Item SILVER_INGOT = newItem("silver_ingot");

    //宝石
    public static final Item RUBY = newItem("ruby");
    public static final Item SAPPHIRE = newItem("sapphire");
    public static final Item AMETHYST = newItem("amethyst");
    public static final Item AMBER = newItem("amber");
    public static final Item PEARL = newItem("pearl");
    public static final Item AQUAMARINE = newItem("aquamarine");
    public static final Item ALEXANDRITE = newItem("alexandrite");

    //種
    public static final Item COTTON_SEEDS = newItem("cotton_seeds");
    public static final Item TEA_LEAF_SEEDS = newItem("tea_leaf_seeds");
    public static final Item PAPPER_SEEDS = newItem("papper_seeds");
    public static final Item DING_SEEDS = newItem("ding_seeds");
    public static final Item CINAMMON_SEEDS = newItem("cinammon_seeds");
    public static final Item NATMEG_SEEDS = newItem("natmeg_seeds");
    public static final Item CARDAMON_SEEDS = newItem("cardamon_seeds");
    public static final Item GINGER_SEEDS = newItem("ginger_seeds");
    public static final Item OPIUM_SEEDS = newItem("opium_seeds");
    public static final Item RICE_SEEDS = newItem("rice_seeds");
    public static final Item SOY_SEEDS = newItem("soy_seeds");
    public static final Item WHEAT_SEEDS = newItem("wheat_seeds");
    public static final Item CORN_SEEDS = newItem("corn_seeds");

    //植物
    public static final Item COTTON = newItem("cotton");
    public static final Item TEA_LEAF = newItem("tea_leaf");
    public static final Item PAPPER = newItem("papper");
    public static final Item DING = newItem("ding");
    public static final Item CINAMMON = newItem("cinammon");
    public static final Item NATMEG = newItem("natmeg");
    public static final Item CARDAMOM = newItem("cardamon");
    public static final Item GINGER = newItem("ginger");
    public static final Item OPIUM = newItem("opium");

    //穀物
    public static final Item RICE = newItem("rice");
    public static final Item SOY = newItem("soy");
    public static final Item WHEAT = newItem("wheat");
    public static final Item CORN = newItem("corn");

    //毛皮
    public static final Item WOLFHIDE = newItem("wolfhide");
    public static final Item SHEEPHIDE = newItem("sheephide");
    public static final Item PIGHIDE = newItem("pighide");
    public static final Item FOXHIDE = newItem("foxhide");
    public static final Item POLAR_BEARHIDE = newItem("polar_bearhide");
    public static final Item PANDAHIDE = newItem("pandahide");
    public static final Item HOGLINHIDE = newItem("hoglinhide");
    public static final Item DOLPHINHIDE = newItem("dolphinhide");
    public static final Item CATHIDE = newItem("cathide");
    public static final Item TURTLEHIDE = newItem("turtlehide");
    public static final Item BATHIDE = newItem("bathide");
    public static final Item HORSEHIDE = newItem("horsehide");
    public static final Item HUMANHIDE = newItem("humanhide");
    public static final Item RAVEGERHIDE = newItem("ravegerhide");


    public static void registerItem(IForgeRegistry<Item> r) {

        registryItem(r, TEST_ITEM);

        registryItem(r, COPPER_INGOT);
        registryItem(r, TIN_INGOT);
        registryItem(r, LEAD_INGOT);
        registryItem(r, NICKEL_INGOT);
        registryItem(r, SILVER_INGOT);

        registryItem(r, RUBY);
        registryItem(r, SAPPHIRE);
        registryItem(r, AMETHYST);
        registryItem(r, AMBER);
        registryItem(r, PEARL);
        registryItem(r, AQUAMARINE);
        registryItem(r, ALEXANDRITE);

        registryItem(r, COTTON_SEEDS);
        registryItem(r, TEA_LEAF_SEEDS);
        registryItem(r, PAPPER_SEEDS);
        registryItem(r, DING_SEEDS);
        registryItem(r, CINAMMON_SEEDS);
        registryItem(r, NATMEG_SEEDS);
        registryItem(r, CARDAMON_SEEDS);
        registryItem(r, GINGER_SEEDS);
        registryItem(r, OPIUM_SEEDS);
        registryItem(r, RICE_SEEDS);
        registryItem(r, SOY_SEEDS);
        registryItem(r, WHEAT_SEEDS);
        registryItem(r, CORN_SEEDS);

        registryItem(r, COTTON);
        registryItem(r, TEA_LEAF);
        registryItem(r, PAPPER);
        registryItem(r, DING);
        registryItem(r, CINAMMON);
        registryItem(r, NATMEG);
        registryItem(r, CARDAMOM);
        registryItem(r, GINGER);
        registryItem(r, OPIUM);

        registryItem(r, RICE);
        registryItem(r, SOY);
        registryItem(r, WHEAT);
        registryItem(r, CORN);

        registryItem(r, WOLFHIDE);
        registryItem(r, SHEEPHIDE);
        registryItem(r, PIGHIDE);
        registryItem(r, FOXHIDE);
        registryItem(r, POLAR_BEARHIDE);
        registryItem(r, PANDAHIDE);
        registryItem(r, HOGLINHIDE);
        registryItem(r, DOLPHINHIDE);
        registryItem(r, CATHIDE);
        registryItem(r, TURTLEHIDE);
        registryItem(r, BATHIDE);
        registryItem(r, HORSEHIDE);
        registryItem(r, HUMANHIDE);
        registryItem(r, RAVEGERHIDE);


    }

    private static void registryItem(IForgeRegistry<Item> r, Item i) {
        r.register(i);
    }

    private static Item newItem(String name) {
        return newItem(name, 64);
    }

    private static Item newItem(String name, int maxsize) {
        return new Item(new Item.Properties().group(ETItemGroup.MOD_TAB).maxStackSize(maxsize))
                .setRegistryName(EpochTechnologies.MODID, name);
    }
}
