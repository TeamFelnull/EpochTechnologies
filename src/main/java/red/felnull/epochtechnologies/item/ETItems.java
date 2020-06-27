package red.felnull.epochtechnologies.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETItems {
    public static final Item TEST_ITEM = new TestItem(new Item.Properties().group(ETItemGroup.MOD_TAB))
            .setRegistryName(EpochTechnologies.MODID, "test_item");

    //鉱石
    public static final Item copper_ore = newItem("copper_ore");
    public static final Item tin_ore = newItem("tin_ore");
    public static final Item lead_ore = newItem("lead_ore");
    public static final Item nickel_ore = newItem("nickel_ore");
    public static final Item silver_ore = newItem("silver_ore");
    public static final Item ruby_ore = newItem("ruby_ore");
    public static final Item sapphire_ore = newItem("sapphire_ore");
    public static final Item amethyst_ore = newItem("amethyst_ore");
    public static final Item amber_ore = newItem("amber_ore");
    public static final Item pearl_ore = newItem("pearl_ore");
    public static final Item aquamarine_ore = newItem("aquamarine_ore");
    public static final Item alexandrite_ore = newItem("alexandrite_ore");

    //鉱石ブロック
    public static final Item copper_block = newItem("copper_block");
    public static final Item tin_block = newItem("tin_block");
    public static final Item lead_block = newItem("lead_block");
    public static final Item nickel_block = newItem("nickel_block");
    public static final Item silver_block = newItem("silver_block");
    public static final Item ruby_block = newItem("ruby_block");
    public static final Item sapphire_block = newItem("sapphire_block");
    public static final Item amethyst_block = newItem("amethyst_block");
    public static final Item amber_block = newItem("amber_block");
    public static final Item pearl_block = newItem("pearl_block");
    public static final Item aquamarine_block = newItem("aquamarine_block");
    public static final Item alexandrite_block = newItem("alexandrite_block");

    //インゴット
    public static final Item COPPER_INGOT = newItem("copper_ingot");
    public static final Item TIN_INGOT = newItem("tin_ingot");
    public static final Item LEAD_INGOT = newItem("lead_ingot");
    public static final Item NICKEL_INGOT = newItem("nickel_ingot");
    public static final Item SILVER_INGOT = newItem("silver_ingot");

    //宝石
    public static final Item RUBY = newItem("ruby");
    public static final Item SAPPHIRE = newItem("sapphire");
    public static final Item amethyst = newItem("amethyst");
    public static final Item amber = newItem("amber");
    public static final Item pearl = newItem("pearl");
    public static final Item aquamarine = newItem("aquamarine");
    public static final Item alexandrite = newItem("alexandrite");

    //種
    public static final Item cotton_seeds = newItem("cotton_seeds");
    public static final Item tea_leaf_seeds = newItem("tea_leaf_seeds");
    public static final Item papper_seeds = newItem("papper_seeds");
    public static final Item ding_seeds = newItem("ding_seeds");
    public static final Item cinammon_seeds = newItem("cinammon_seeds");
    public static final Item natmeg_seeds = newItem("natmeg_seeds");
    public static final Item cardamon_seeds = newItem("cardamon_seeds");
    public static final Item ginger_seeds = newItem("ginger_seeds");
    public static final Item opium_seeds = newItem("opium_seeds");
    public static final Item rice_seeds = newItem("rice_seeds");
    public static final Item soy_seeds = newItem("soy_seeds");
    public static final Item wheat_seeds = newItem("wheat_seeds");
    public static final Item corn_seeds = newItem("corn_seeds");

    //植物、穀物ブロック
    public static final Item cotton_block = newItem("cotton_block");
    public static final Item tea_leaf_block = newItem("tea_leaf_block");
    public static final Item papper_block = newItem("papper_block");
    public static final Item ding_block = newItem("ding_block");
    public static final Item cinammon_block = newItem("cinammon_block");
    public static final Item natmeg_block = newItem("natmeg_block");
    public static final Item cardamon_block = newItem("cardamon_block");
    public static final Item ginger_block = newItem("ginger_block");
    public static final Item opium_block = newItem("opium_block");
    public static final Item rice_block = newItem("rice_block");
    public static final Item soy_block = newItem("soy_block");
    public static final Item wheat_block = newItem("wheat_block");
    public static final Item corn_block = newItem("corn_block");

    //植物
    public static final Item COTTON = newItem("cotton");
    public static final Item TEA_LEAF = newItem("tea_leaf");
    public static final Item papper = newItem("papper");
    public static final Item ding = newItem("ding");
    public static final Item cinammon = newItem("cinammon");
    public static final Item natmeg = newItem("natmeg");
    public static final Item cardamom = newItem("cardamon");
    public static final Item ginger = newItem("ginger");
    public static final Item opium = newItem("opium");

    //穀物
    public static final Item rice = newItem("rice");
    public static final Item soy = newItem("soy");
    public static final Item wheat = newItem("wheat");
    public static final Item corn = newItem("corn");

    //毛皮
    public static final Item wolfhide = newItem("wolfhide");
    public static final Item sheephide = newItem("sheephide");
    public static final Item pighide = newItem("pighide");
    public static final Item foxhide = newItem("foxhide");
    public static final Item polar_bearhide = newItem("polar_bearhide");
    public static final Item pandahide = newItem("pandahide");
    public static final Item hoglinhide = newItem("hoglinhide");
    public static final Item dolphinhide = newItem("dolphinhide");
    public static final Item cathide = newItem("cathide");
    public static final Item turtlehide = newItem("turtlehide");
    public static final Item bathide = newItem("bathide");
    public static final Item horsehide = newItem("horsehide");
    public static final Item humanhide = newItem("humanhide");
    public static final Item ravegerhide = newItem("ravegerhide");



    public static void registerItem(IForgeRegistry<Item> r) {
        registryItem(r, TEST_ITEM);

        registryItem(r,copper_ore );
        registryItem(r,tin_ore );
        registryItem(r,lead_ore );
        registryItem(r,nickel_ore );
        registryItem(r,silver_ore );
        registryItem(r,ruby_ore );
        registryItem(r,sapphire_ore );
        registryItem(r,amethyst_ore );
        registryItem(r,amber_ore );
        registryItem(r,pearl_ore );
        registryItem(r,aquamarine_ore );
        registryItem(r,alexandrite_ore );

        registryItem(r,copper_block );
        registryItem(r,tin_block );
        registryItem(r,lead_block );
        registryItem(r,nickel_block );
        registryItem(r,silver_block );
        registryItem(r,ruby_block );
        registryItem(r,sapphire_block );
        registryItem(r,amethyst_block );
        registryItem(r,amber_block );
        registryItem(r,pearl_block );
        registryItem(r,aquamarine_block );
        registryItem(r,alexandrite_block );

        registryItem(r, COPPER_INGOT);
        registryItem(r, TIN_INGOT);
        registryItem(r, LEAD_INGOT);
        registryItem(r, NICKEL_INGOT);
        registryItem(r, SILVER_INGOT);

        registryItem(r, RUBY);
        registryItem(r, SAPPHIRE);
        registryItem(r,amethyst );
        registryItem(r,amber );
        registryItem(r,pearl );
        registryItem(r,aquamarine );
        registryItem(r,alexandrite );

        registryItem(r,cotton_seeds );
        registryItem(r,tea_leaf_seeds );
        registryItem(r,papper_seeds );
        registryItem(r,ding_seeds );
        registryItem(r,cinammon_seeds );
        registryItem(r,natmeg_seeds );
        registryItem(r,cardamon_seeds );
        registryItem(r,ginger_seeds );
        registryItem(r,opium_seeds );
        registryItem(r,rice_seeds );
        registryItem(r,soy_seeds );
        registryItem(r,wheat_seeds );
        registryItem(r,corn_seeds );

        registryItem(r,cotton_block );
        registryItem(r,tea_leaf_block );
        registryItem(r,papper_block );
        registryItem(r,ding_block );
        registryItem(r,cinammon_block );
        registryItem(r,natmeg_block );
        registryItem(r,cardamon_block );
        registryItem(r,ginger_block );
        registryItem(r,opium_block );
        registryItem(r,rice_block );
        registryItem(r,soy_block );
        registryItem(r,wheat_block );
        registryItem(r,corn_block );

        registryItem(r, COTTON);
        registryItem(r, TEA_LEAF);
        registryItem(r, papper);
        registryItem(r, ding);
        registryItem(r, cinammon);
        registryItem(r, natmeg);
        registryItem(r, cardamom);
        registryItem(r, ginger);
        registryItem(r, opium);

        registryItem(r,rice );
        registryItem(r,soy );
        registryItem(r,wheat );
        registryItem(r,corn );

        registryItem(r,wolfhide );
        registryItem(r,sheephide );
        registryItem(r,pighide );
        registryItem(r,foxhide );
        registryItem(r,polar_bearhide );
        registryItem(r,pandahide );
        registryItem(r,hoglinhide );
        registryItem(r,dolphinhide );
        registryItem(r,cathide );
        registryItem(r,turtlehide );
        registryItem(r,bathide );
        registryItem(r,horsehide );
        registryItem(r,humanhide );
        registryItem(r,ravegerhide );



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
