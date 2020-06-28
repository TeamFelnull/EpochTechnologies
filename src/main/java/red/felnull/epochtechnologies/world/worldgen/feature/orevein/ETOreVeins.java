package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biomes;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.registries.ETRegistries;

import java.util.Arrays;
import java.util.List;

public class ETOreVeins {
    public static final List<Block> STONES = Arrays.asList(Blocks.STONE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRANITE);
    public static final List<Block> NETHERRACK = Arrays.asList(Blocks.NETHERRACK);

    public static final OreVeins COPPER = new OreVeins(Arrays.asList(new OreVeinBlockProportion(ETBlocks.COPPER_ORE, 1)), STONES, 0.005f, 30, 5, 54, 0.70f, true);
    public static final OreVeins TIN = new OreVeins(Arrays.asList(new OreVeinBlockProportion(ETBlocks.TIN_ORE, 1)), STONES, 0.003f, 30, 5, 54, 0.80f, true);
    public static final OreVeins IRON = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.IRON_ORE, 1)), STONES, 0.006f, 30, 5, 54, 0.60f, true);
    public static final OreVeins GOLD = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.GOLD_ORE, 1)), STONES, 0.002f, 15, 5, 29, 0.70f, true);
    public static final OreVeins COAL = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.COAL_ORE, 1)), STONES, 0.007f, 30, 5, 54, 0.30f, true);
    public static final OreVeins RED_STONE = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.REDSTONE_ORE, 1)), STONES, 0.003f, 5, 12, 16, 0.75f, true);
    public static final OreVeins LAPIS = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.LAPIS_ORE, 1)), STONES, 0.002f, 20, 14, 16, 0.75f, true);
    public static final OreVeins DIAMOND = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.DIAMOND_ORE, 1)), STONES, 0.001f, 10, 5, 12, 0.90f, false);
    public static final OreVeins EMERALD = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.EMERALD_ORE, 1)), STONES, 0.001f, 10, 5, 29, 0.90f, false, Arrays.asList(Biomes.MOUNTAINS), null);
    public static final OreVeins NETHER_QUARTZ = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.NETHER_QUARTZ_ORE, 1)), NETHERRACK, 1f, 15, 0, 129, 0.50f, false, Arrays.asList(Biomes.NETHER), null);

    public static void registerVein() {
        registryVein("copper", COPPER);
        registryVein("tin", TIN);
        registryVein("iron", IRON);
        registryVein("gold", GOLD);
        registryVein("coal", COAL);
        registryVein("red_stone", RED_STONE);
        registryVein("lapis", LAPIS);
        registryVein("diamond", DIAMOND);
        registryVein("emerald", EMERALD);
        registryVein("nether_quartz", NETHER_QUARTZ);

    }

    private static void registryVein(String name, OreVeins vein) {
        ETRegistries.registrierOreVein(new ResourceLocation(EpochTechnologies.MODID, name), vein);
    }
}
