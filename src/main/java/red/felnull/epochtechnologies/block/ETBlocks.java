package red.felnull.epochtechnologies.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
    public static final Block SILVER_ORE = newOreBlock("silver_ore", 2, 3.0f, 3.0f);
    public static final Block RUBY_ORE = newOreBlock("ruby_ore", 2, 3.0f, 3.0f, 3, 7);
    public static final Block SAPPHIRE_ORE = newOreBlock("sapphire_ore", 2, 3.0f, 3.0f, 3, 7);
    public static final Block AMETHYST_ORE = newOreBlock("amethyst_ore", 2, 3.0f, 3.0f, 3, 7);
    public static final Block AMBER_ORE = newOreBlock("amber_ore", 2, 3.0f, 3.0f, 3, 7);
    public static final Block AQUAMARINE_ORE = newOreBlock("aquamarine_ore", 2, 3.0f, 3.0f, 3, 7);
    public static final Block ALEXANDRITE_ORE = newOreBlock("alexandrite_ore", 2, 3.0f, 3.0f, 3, 7);

    //鉱石ブロック
    public static final Block COPPER_BLOCK = newBlock("copper_block", Material.IRON, 3.0f, 3.0f);
    public static final Block TIN_BLOCK = newBlock("tin_block", Material.IRON, 3.0f, 3.0f);
    public static final Block LEAD_BLOCK = newBlock("lead_block", Material.IRON, 3.0f, 3.0f);
    public static final Block NICKEL_BLOCK = newBlock("nickel_block", Material.IRON, 3.0f, 3.0f);
    public static final Block SILVER_BLOCK = newBlock("silver_block", Material.IRON, 3.0f, 3.0f);
    public static final Block RUBY_BLOCK = newBlock("ruby_block", Material.IRON, 3.0f, 3.0f);
    public static final Block SAPPHIRE_BLOCK = newBlock("sapphire_block", Material.IRON, 3.0f, 3.0f);
    public static final Block AMETHYST_BLOCK = newBlock("amethyst_block", Material.IRON, 3.0f, 3.0f);
    public static final Block AMBER_BLOCK = newBlock("amber_block", Material.IRON, 3.0f, 3.0f);
    public static final Block PEARL_BLOCK = newBlock("pearl_block", Material.IRON, 3.0f, 3.0f);
    public static final Block AQUAMARINE_BLOCK = newBlock("aquamarine_block", Material.IRON, 3.0f, 3.0f);
    public static final Block ALEXANDRITE_BLOCK = newBlock("alexandrite_block", Material.IRON, 3.0f, 3.0f);

    //植物、穀物の作物ブロック
    public static final Block PROP = new PropBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.SCAFFOLDING).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "prop");
    public static final Block PEPPER_PROP = new PepperCropPropBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.PLANT).hardnessAndResistance(2.5f, 2.5f).notSolid().tickRandomly()).setRegistryName(EpochTechnologies.MODID, "pepper_prop");

    //蒸気機関、動力関係
    public static final Block SHAFT = new ShaftBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "shaft");
    public static final Block STEAM_ENGINE = new SteamEngineBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "steam_engine");
    public static final Block STEAM_BOILER = new SteamBoilerBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 2.5f).notSolid()).setRegistryName(EpochTechnologies.MODID, "steam_boiler");

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
        registryBlock(r, STEAM_BOILER);
    }

    public static void registerItem(IForgeRegistry<Item> r) {
        registryBlockItem(r, TEST_BLOCK, ETItemGroup.OREMINERALS);

        registryBlockItem(r, COPPER_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, TIN_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, LEAD_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, NICKEL_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, SILVER_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, RUBY_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, SAPPHIRE_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, AMETHYST_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, AMBER_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, AQUAMARINE_ORE, ETItemGroup.OREMINERALS);
        registryBlockItem(r, ALEXANDRITE_ORE, ETItemGroup.OREMINERALS);

        registryBlockItem(r, COPPER_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, TIN_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, LEAD_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, NICKEL_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, SILVER_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, RUBY_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, SAPPHIRE_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, AMETHYST_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, AMBER_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, PEARL_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, AQUAMARINE_BLOCK, ETItemGroup.OREMINERALS);
        registryBlockItem(r, ALEXANDRITE_BLOCK, ETItemGroup.OREMINERALS);

        registryBlockItem(r, PROP, ETItemGroup.FOODAGRICULTURE);

        registryBlockItem(r, SHAFT, ETItemGroup.MACHINE);
        registryBlockItem(r, STEAM_ENGINE, ETItemGroup.MACHINE);
        registryBlockItem(r, STEAM_BOILER, ETItemGroup.MACHINE);
    }


    private static Block newOreBlock(String name, int hlevel, float hardness, float resistance, int minexp, int maxexp) {
        return new ETOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(hardness, resistance).harvestLevel(hlevel), minexp, maxexp).setRegistryName(EpochTechnologies.MODID, name);
    }

    private static Block newOreBlock(String name, int hlevel, float hardness, float resistance) {
        return newOreBlock(name, hlevel, hardness, resistance, 0, 0);
    }

    private static Block newBlock(String name, Material materialIn, float hardness, float resistance) {
        return new Block(AbstractBlock.Properties.create(materialIn).hardnessAndResistance(hardness, resistance))
                .setRegistryName(EpochTechnologies.MODID, name);
    }

    private static Block newBlock(String name, Material materialIn, SoundType sound, float hardness, float resistance) {
        return new Block(AbstractBlock.Properties.create(materialIn).sound(sound).hardnessAndResistance(hardness, resistance))
                .setRegistryName(EpochTechnologies.MODID, name);
    }

    private static void registryBlock(IForgeRegistry<Block> r, Block b) {
        r.register(b);
    }

    private static void registryBlockItem(IForgeRegistry<Item> r, Block b, ItemGroup group) {
        r.register(new BlockItem(b, new Item.Properties().group(group)).setRegistryName(b.getRegistryName()));
    }

    private static void registryItem(IForgeRegistry<Item> r, Item i) {
        r.register(i);
    }
}
