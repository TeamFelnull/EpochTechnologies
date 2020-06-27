package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.item.ETItemGroup;

public class ETBlocks {
    public static final Block TEST_BLOCK = newBlock("test_block", Material.ROCK, SoundType.WOOD, 1.0f, 2.0f);

    //鉱石
    public static final Block COPPER_ORE = newOreBlock("copper_ore", 1, 3.0f, 3.0f);
    public static final Block TIN_ORE = newOreBlock("tin_ore", 1, 3.0f, 3.0f);
    public static final Block LEAD_ORE = newOreBlock("lead_ore", 1, 3.0f, 3.0f);
    public static final Block NICKEL_ORE = newOreBlock("nickel_ore", 1, 3.0f, 3.0f);
    public static final Block SILVER_ORE = newOreBlock("silver_ore", 1, 3.0f, 3.0f);
    public static final Block RUBY_ORE = newOreBlock("ruby_ore", 1, 3.0f, 3.0f);
    public static final Block SAPPHIRE_ORE = newOreBlock("sapphire_ore", 1, 3.0f, 3.0f);
    public static final Block COPPER_BLOCK = newOreBlock("copper_block", 1, 3.0f, 3.0f);
    public static final Block TIN_BLOCK = newOreBlock("tin_block", 1, 3.0f, 3.0f);
    public static final Block LEAD_BLOCK = newOreBlock("lead_block", 1, 3.0f, 3.0f);
    public static final Block NICKEL_BLOCK = newOreBlock("nickel_block", 1, 3.0f, 3.0f);
    public static final Block SILVER_BLOCK = newOreBlock("silver_block", 1, 3.0f, 3.0f);
    public static final Block RUBY_BLOCK = newOreBlock("ruby_block", 1, 3.0f, 3.0f);
    public static final Block SAPPHIRE_BLOCK = newOreBlock("sapphire_block", 1, 3.0f, 3.0f);
    public static final Block AMETHYST_BLOCK = newOreBlock("amethyst_block", 1, 3.0f, 3.0f);
    public static final Block AMBER_BLOCK = newOreBlock("amber_block", 1, 3.0f, 3.0f);
    public static final Block PEARL_BLOCK = newOreBlock("pearl_block", 1, 3.0f, 3.0f);
    public static final Block AQUAMARINE_BLOCK = newOreBlock("aquamarine_block", 1, 3.0f, 3.0f);
    public static final Block ALEXANDRITE_BLOCK = newOreBlock("alexandrite_block", 1, 3.0f, 3.0f);

    //植物、穀物ブロック
    public static final Block COTTON_BLOCK = newBlock("cotton_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block TEA_LEAF_BLOCK = newBlock("tea_leaf_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block PAPPER_BLOCK = newBlock("papper_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block DING_BLOCK = newBlock("ding_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block CINAMMON_BLOCK = newBlock("cinammon_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block NATMEG_BLOCK = newBlock("natmeg_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block CARDAMON_BLOCK = newBlock("cardamon_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block GINGER_BLOCK = newBlock("ginger_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block OPIUM_BLOCK = newBlock("opium_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block RICE_BLOCK = newBlock("rice_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block SOY_BLOCK = newBlock("soy_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block WHEAT_BLOCK = newBlock("wheat_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);
    public static final Block CORN_BLOCK = newBlock("corn_block", Material.PLANTS, SoundType.PLANT, 1.0f, 2.0f);

    //蒸気機関、動力関係
    public static final Block SHAFT = new ShaftBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 2.5f)).setRegistryName(EpochTechnologies.MODID, "shaft");

    public static void registerBlock(IForgeRegistry<Block> r) {
        registryBlock(r, TEST_BLOCK);

        registryBlock(r, COPPER_ORE);
        registryBlock(r, TIN_ORE);
        registryBlock(r, LEAD_ORE);
        registryBlock(r, NICKEL_ORE);
        registryBlock(r, SILVER_ORE);
        registryBlock(r, RUBY_ORE);
        registryBlock(r, SAPPHIRE_ORE);
        registryBlock(r, COPPER_BLOCK);
        registryBlock(r, TIN_BLOCK);
        registryBlock(r, LEAD_BLOCK);
        registryBlock(r, NICKEL_BLOCK);
        registryBlock(r, SILVER_BLOCK);
        registryBlock(r, RUBY_BLOCK);
        registryBlock(r, SAPPHIRE_BLOCK);
        registryBlock(r, AMETHYST_BLOCK);
        registryBlock(r, AMBER_BLOCK);
        registryBlock(r, PEARL_BLOCK);
        registryBlock(r, AQUAMARINE_BLOCK);
        registryBlock(r, ALEXANDRITE_BLOCK);

        registryBlock(r, COTTON_BLOCK);
        registryBlock(r, TEA_LEAF_BLOCK);
        registryBlock(r, PAPPER_BLOCK);
        registryBlock(r, DING_BLOCK);
        registryBlock(r, CINAMMON_BLOCK);
        registryBlock(r, NATMEG_BLOCK);
        registryBlock(r, CARDAMON_BLOCK);
        registryBlock(r, GINGER_BLOCK);
        registryBlock(r, OPIUM_BLOCK);
        registryBlock(r, RICE_BLOCK);
        registryBlock(r, SOY_BLOCK);
        registryBlock(r, WHEAT_BLOCK);
        registryBlock(r, CORN_BLOCK);

        registryBlock(r, SHAFT);

    }

    public static void registerItem(IForgeRegistry<Item> r) {
        registryBlockItem(r, TEST_BLOCK);

        registryBlockItem(r, COPPER_ORE);
        registryBlockItem(r, TIN_ORE);
        registryBlockItem(r, LEAD_ORE);
        registryBlockItem(r, NICKEL_ORE);
        registryBlockItem(r, SILVER_ORE);
        registryBlockItem(r, RUBY_ORE);
        registryBlockItem(r, SAPPHIRE_ORE);
        registryBlockItem(r, COPPER_BLOCK);
        registryBlockItem(r, TIN_BLOCK);
        registryBlockItem(r, LEAD_BLOCK);
        registryBlockItem(r, NICKEL_BLOCK);
        registryBlockItem(r, SILVER_BLOCK);
        registryBlockItem(r, RUBY_BLOCK);
        registryBlockItem(r, SAPPHIRE_BLOCK);
        registryBlockItem(r, AMETHYST_BLOCK);
        registryBlockItem(r, AMBER_BLOCK);
        registryBlockItem(r, PEARL_BLOCK);
        registryBlockItem(r, AQUAMARINE_BLOCK);
        registryBlockItem(r, ALEXANDRITE_BLOCK);

        registryBlockItem(r, COTTON_BLOCK);
        registryBlockItem(r, TEA_LEAF_BLOCK);
        registryBlockItem(r, PAPPER_BLOCK);
        registryBlockItem(r, DING_BLOCK);
        registryBlockItem(r, CINAMMON_BLOCK);
        registryBlockItem(r, NATMEG_BLOCK);
        registryBlockItem(r, CARDAMON_BLOCK);
        registryBlockItem(r, GINGER_BLOCK);
        registryBlockItem(r, OPIUM_BLOCK);
        registryBlockItem(r, RICE_BLOCK);
        registryBlockItem(r, SOY_BLOCK);
        registryBlockItem(r, WHEAT_BLOCK);
        registryBlockItem(r, CORN_BLOCK);


        registryBlockItem(r, SHAFT);

    }

    private static Block newOreBlock(String name, int hlevel, float hardness, float resistance) {
        return new ETOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(hardness, resistance).harvestLevel(hlevel))
                .setRegistryName(EpochTechnologies.MODID, name);
    }

    private static Block newBlock(String name, Material materialIn, SoundType sound, float hardness, float resistance) {
        return new Block(Block.Properties.create(materialIn).sound(sound).hardnessAndResistance(hardness, resistance))
                .setRegistryName(EpochTechnologies.MODID, name);
    }

    private static void registryBlock(IForgeRegistry<Block> r, Block b) {
        r.register(b);
    }

    private static void registryBlockItem(IForgeRegistry<Item> r, Block b) {
        r.register(new BlockItem(b, new Item.Properties().group(ETItemGroup.MOD_TAB))
                .setRegistryName(b.getRegistryName()));
    }

    private static void registryItem(IForgeRegistry<Item> r, Item i) {
        r.register(i);
    }
}
