package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.registries.ETRegistries;

import java.util.Arrays;
import java.util.List;

public class ETOreVeins {
    public static final List<Block> STONES = Arrays.asList(Blocks.STONE);

    public static final OreVeins COPPER = new OreVeins(Arrays.asList(new OreVeinBlockProportion(ETBlocks.COPPER_ORE, 1), new OreVeinBlockProportion(Blocks.GLASS, 1)), STONES, 0.005f, 30, 1, 60, 0.81f);
    public static final OreVeins TIN = new OreVeins(Arrays.asList(new OreVeinBlockProportion(ETBlocks.TIN_ORE, 1), new OreVeinBlockProportion(Blocks.GLASS, 1)), STONES, 0.005f, 30, 1, 60, 0.81f);
    public static final OreVeins IRON = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.IRON_ORE, 1), new OreVeinBlockProportion(Blocks.GLASS, 1)), STONES, 0.003f, 30, 1, 60, 0.81f);
    public static final OreVeins GOLD = new OreVeins(Arrays.asList(new OreVeinBlockProportion(Blocks.GOLD_ORE, 1), new OreVeinBlockProportion(Blocks.GLASS, 1)), STONES, 0.001f, 15, 1, 16, 0.5f);

    public static void registerVein() {
        registryVein("copper", COPPER);
        registryVein("tin", TIN);
        registryVein("iron", IRON);
        registryVein("gold", GOLD);
    }

    private static void registryVein(String name, OreVeins vein) {
        ETRegistries.registrierOreVein(new ResourceLocation(EpochTechnologies.MODID, name), vein);
    }
}
