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

    //植物
    public static final Item COTTON = newItem("cotton");
    public static final Item TEA_LEAF = newItem("tea_leaf");
    public static final Item papper = newItem("papper");
    public static final Item ding = newItem("ding");
    public static final Item cinammon = newItem("cinammon");
    public static final Item natmeg = newItem("natmeg");
    public static final Item cardamom = newItem("cardamon");
    public static final Item ginger = newItem("ginger");

    //穀物
    public static final Item rice = newItem("rice");
    public static final Item soy = newItem("soy");
    public static final Item wheat = newItem("wheat");
    public static final Item corn = newItem("corn");

    //毛皮
    public static final Item wolfhide = newItem("wolfhide");
    public static final Item sheephide = newItem("sheephide");
    public static final Item pighide = newItem("pighide");
    public static final Item  = newItem("");
    public static final Item  = newItem("");
    public static final Item  = newItem("");



    public static void registerItem(IForgeRegistry<Item> r) {
        registryItem(r, TEST_ITEM);

        registryItem(r, COPPER_INGOT);
        registryItem(r, TIN_INGOT);
        registryItem(r, LEAD_INGOT);
        registryItem(r, NICKEL_INGOT);
        registryItem(r, SILVER_INGOT);

        registryItem(r, RUBY);
        registryItem(r, SAPPHIRE);

        registryItem(r, COTTON);
        registryItem(r, TEA_LEAF);
        registryItem(r, papper);
        registryItem(r, ding);
        registryItem(r, cinnamon);
        registryItem(r, natmeg);
        registryItem(r, cardamon);
        registryItem(r, ginger);
        registryItem(r, Opium);

        registryItem(r,rice );
        registryItem(r,soy );
        registryItem(r,wheat );
        registryItem(r,corn );

        registryItem(r,wolfhide );
        registryItem(r,sheephide );
        registryItem(r, );
        registryItem(r, );
        registryItem(r, );
        registryItem(r, );
        registryItem(r, );
        registryItem(r, );
        registryItem(r, );
        registryItem(r, );



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
