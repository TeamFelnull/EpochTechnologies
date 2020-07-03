package red.felnull.epochtechnologies.item;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.entity.ETEntityTypes;

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


    //植物
    public static final Item COTTON = newFoodItem("cotton", ETFoods.COTTON);
    public static final Item TEA_LEAF = newFoodItem("tea_leaf", ETFoods.TEA_LEAF);
    public static final Item PEPPER = newItem("pepper");
    public static final Item RICE = newItem("rice");
    public static final Item SOY = newItem("soy");
    public static final Item CORN = newFoodItem("corn", ETFoods.CORN);
    public static final Item PEPPER_CORNS = newFoodItem("pepper_corns", ETFoods.PEPPER_CORNS);

    //種
    public static final Item COTTON_SEEDS = newItem("cotton_seeds");
    public static final Item TEA_LEAF_SEEDS = newItem("tea_leaf_seeds");
    public static final Item CORN_SEEDS = newItem("corn_seeds");

    //毛皮
    public static final Item WOLF_HIDE = newItem("wolf_hide");
    public static final Item FOX_HIDE = newItem("fox_hide");
    public static final Item BEAR_HIDE = newItem("bear_hide");
    public static final Item PIG_HIDE = newItem("pig_hide");
    public static final Item CAT_HIDE = newItem("cat_hide");
    public static final Item HORSE_HIDE = newItem("horse_hide");
    public static final Item HUMAN_HIDE = newItem("human_hide");

    //MOBドロップ
    public static final Item BAT_WING = newItem("bat_wing");
    public static final Item CAT_TAIL = newItem("cat_tail");

    //スポーンエッグ
    public static final Item BEAR_SPAWN_EGG = newSpawnEgg(ETEntityTypes.BEAR, "bear_spawn_egg", 10506797, 9127187);


    //蒸気機関、動力関係
    //  public static final Item FLYWHEEL = newItem("flywheel");


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
        registryItem(r, CORN_SEEDS);

        registryItem(r, COTTON);
        registryItem(r, TEA_LEAF);
        registryItem(r, PEPPER);
        registryItem(r, RICE);
        registryItem(r, SOY);
        registryItem(r, CORN);
        registryItem(r, PEPPER_CORNS);

        registryItem(r, WOLF_HIDE);
        registryItem(r, FOX_HIDE);
        registryItem(r, BEAR_HIDE);
        registryItem(r, PIG_HIDE);
        registryItem(r, CAT_HIDE);
        registryItem(r, HORSE_HIDE);
        registryItem(r, HUMAN_HIDE);

        registryItem(r, BAT_WING);
        registryItem(r, CAT_TAIL);

        registryItem(r, BEAR_SPAWN_EGG);
    }

    private static void registryItem(IForgeRegistry<Item> r, Item i) {
        r.register(i);
    }

    private static Item newFoodItem(String name, Food foos) {
        return new Item(new Item.Properties().group(ETItemGroup.MOD_TAB).food(foos)).setRegistryName(EpochTechnologies.MODID, name);
    }

    private static Item newItem(String name) {
        return newItem(name, 64);
    }

    private static Item newItem(String name, int maxsize) {
        return new Item(new Item.Properties().group(ETItemGroup.MOD_TAB).maxStackSize(maxsize)).setRegistryName(EpochTechnologies.MODID, name);
    }

    private static Item newSpawnEgg(EntityType<?> type, String name, int color1, int color2) {
        return new SpawnEggItem(type, color1, color2, (new Item.Properties()).group(ETItemGroup.MOD_TAB)).setRegistryName(EpochTechnologies.MODID, name);
    }

}
