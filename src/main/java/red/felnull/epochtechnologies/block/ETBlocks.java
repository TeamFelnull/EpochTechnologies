package red.felnull.epochtechnologies.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.item.ETItemGroup;
import red.felnull.epochtechnologies.item.SteamEngineBlockItem;

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
    public static final Block AMETHYST_ORE = newOreBlock("amethyst_ore", 1, 3.0f, 3.0f);
    public static final Block AMBER_ORE = newOreBlock("amber_ore", 1, 3.0f, 3.0f);
    public static final Block AQUAMARINE_ORE = newOreBlock("aquamarine_ore", 1, 3.0f, 3.0f);
    public static final Block ALEXANDRITE_ORE = newOreBlock("alexandrite_ore", 1, 3.0f, 3.0f);

    //鉱石ブロック
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

    //植物、穀物の作物ブロック
    public static final Block PROP = new PropBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "prop");
    public static final Block PEPPER_PROP = new CropPropBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5f, 2.5f).notSolid().tickRandomly()).setRegistryName(EpochTechnologies.MODID, "pepper_prop");

    //蒸気機関、動力関係
    public static final Block SHAFT = new ShaftBlock(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.SCAFFOLDING).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "shaft");
    public static final Block STEAM_ENGINE = new SteamEngineBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "steam_engine");

    public static void registerBlock(IForgeRegistry<Block> r) {
        registryBlock(r, TEST_BLOCK);

        registryBlock(r, COPPER_ORE);
        registryBlock(r, TIN_ORE);
        registryBlock(r, LEAD_ORE);
        registryBlock(r, NICKEL_ORE);
        registryBlock(r, SILVER_ORE);
        registryBlock(r, RUBY_ORE);
        registryBlock(r, SAPPHIRE_ORE);
        registryBlock(r, AMETHYST_ORE);
        registryBlock(r, AMBER_ORE);
        registryBlock(r, AQUAMARINE_ORE);
        registryBlock(r, ALEXANDRITE_ORE);

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

        registryBlock(r, PROP);
        registryBlock(r, PEPPER_PROP);

        registryBlock(r, SHAFT);
        registryBlock(r, STEAM_ENGINE);
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
        registryBlockItem(r, AMETHYST_ORE);
        registryBlockItem(r, AMBER_ORE);
        registryBlockItem(r, AQUAMARINE_ORE);
        registryBlockItem(r, ALEXANDRITE_ORE);

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

        registryBlockItem(r, PROP);
        registryBlockItem(r, PEPPER_PROP);

        registryBlockItem(r, SHAFT);
        r.register(new SteamEngineBlockItem(STEAM_ENGINE, new Item.Properties().group(ETItemGroup.MOD_TAB)).setRegistryName(EpochTechnologies.MODID, "steam_engine"));

    }


    private static Block newOreBlock(String name, int hlevel, float hardness, float resistance) {
        return new ETOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(hardness, resistance).harvestLevel(hlevel))
                .setRegistryName(EpochTechnologies.MODID, name);
    }

    private static Block newBlock(String name, Material materialIn, SoundType sound, float hardness, float resistance) {
        return new Block(AbstractBlock.Properties.create(materialIn).sound(sound).hardnessAndResistance(hardness, resistance))
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
