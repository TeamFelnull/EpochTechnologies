package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.Tags;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.api.registries.ETRegistries;
import red.felnull.epochtechnologies.block.ETBlocks;

import java.util.Arrays;
import java.util.List;

public class ETOreVeins {
    public static final List<Block> STONES = Arrays.asList(Blocks.STONE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRANITE);
    public static final List<Block> NETHERRACK = Arrays.asList(Blocks.NETHERRACK);
    //バニラ
    public static final OreVeins IRON = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.IRON_ORE)), STONES, 0.006f, 30, 5, 54, 0.60f, true);
    public static final OreVeins GOLD = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.GOLD_ORE)), STONES, 0.002f, 15, 5, 29, 0.70f, true);
    public static final OreVeins COAL = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.COAL_ORE)), STONES, 0.007f, 30, 5, 54, 0.30f, true);
    public static final OreVeins RED_STONE = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.REDSTONE_ORE)), STONES, 0.003f, 5, 12, 16, 0.75f, true);
    public static final OreVeins LAPIS = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.LAPIS_ORE)), STONES, 0.002f, 20, 14, 16, 0.75f, true);
    public static final OreVeins DIAMOND = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.DIAMOND_ORE)), STONES, 0.001f, 10, 5, 12, 0.90f, false);
    public static final OreVeins EMERALD = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.EMERALD_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.EXTREME_HILLS));
    public static final OreVeins NETHER_QUARTZ = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, Blocks.NETHER_QUARTZ_ORE)), NETHERRACK, 1f, 15, 0, 129, 0.50f, false, new CategoryOreVeinBiomeFilter(Biome.Category.NETHER));
    //追加鉱石
    public static final OreVeins COPPER = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.COPPER_ORE)), STONES, 0.005f, 30, 5, 54, 0.70f, true);
    public static final OreVeins TIN = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.TIN_ORE)), STONES, 0.003f, 30, 5, 54, 0.80f, true);
    public static final OreVeins LEAD = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.LEAD_ORE)), STONES, 0.005f, 30, 5, 54, 0.70f, true);
    public static final OreVeins NICKEL = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.NICKEL_ORE)), STONES, 0.003f, 30, 5, 54, 0.80f, true);
    public static final OreVeins SILVER = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.SILVER_ORE)), STONES, 0.002f, 15, 5, 29, 0.70f, true);
    public static final OreVeins AMBER = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.AMBER_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.DESERT, Biome.Category.FOREST));
    public static final OreVeins RUBY = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.RUBY_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.EXTREME_HILLS));
    public static final OreVeins ALEXANDRITE = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.ALEXANDRITE_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.EXTREME_HILLS));
    public static final OreVeins SAPPHIRE = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.SAPPHIRE_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.ICY));
    public static final OreVeins AQUAMARINE = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.AQUAMARINE_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.OCEAN));
    public static final OreVeins AMETHYST = new OreVeins(Arrays.asList(new SimpleOreVeinBlockProportion(1, ETBlocks.AMETHYST_ORE)), STONES, 0.001f, 10, 5, 29, 0.90f, false, new CategoryOreVeinBiomeFilter(Biome.Category.SAVANNA, Biome.Category.BEACH));

    //特殊
    public static final OreVeins MINERS_DREAM = new OreVeins(Arrays.asList(new TagOreVeinBlockProportion(32, Tags.Blocks.ORES), new TagOreVeinBlockProportion(1, Tags.Blocks.STORAGE_BLOCKS)), STONES, 0.000001f, 32, 0, 64, 0.75f, true);

    public static void registerVein() {
        registryVein("iron", IRON);
        registryVein("gold", GOLD);
        registryVein("coal", COAL);
        registryVein("red_stone", RED_STONE);
        registryVein("lapis", LAPIS);
        registryVein("diamond", DIAMOND);
        registryVein("emerald", EMERALD);
        registryVein("nether_quartz", NETHER_QUARTZ);

        registryVein("copper", COPPER);
        registryVein("tin", TIN);
        registryVein("lead", LEAD);
        registryVein("nickel", NICKEL);
        registryVein("silver", SILVER);
        registryVein("amber", AMBER);
        registryVein("ruby", RUBY);
        registryVein("alexandrite", ALEXANDRITE);
        registryVein("sapphire", SAPPHIRE);
        registryVein("aquamarine", AQUAMARINE);
        registryVein("amethyst", AMETHYST);

        registryVein("miners_dream", MINERS_DREAM);

    }

    private static void registryVein(String name, OreVeins vein) {
        ETRegistries.registrierOreVein(new ResourceLocation(EpochTechnologies.MODID, name), vein);
    }
}
