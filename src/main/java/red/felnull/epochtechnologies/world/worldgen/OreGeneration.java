package red.felnull.epochtechnologies.world.worldgen;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import red.felnull.epochtechnologies.block.ETBlocks;

public class OreGeneration {
    public static void init() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            addStonInOre(ETBlocks.COPPER_ORE, biome, 9, 20, 0, 64);
            addStonInOre(ETBlocks.TIN_ORE, biome, 9, 15, 0, 64);
            addStonInOre(ETBlocks.LEAD_ORE, biome, 7, 10, 0, 32);
            addStonInOre(ETBlocks.NICKEL_ORE, biome, 7, 9, 0, 32);
            addStonInOre(ETBlocks.SILVER_BLOCK, biome, 8, 2, 0, 32);

            if (biome.getCategory() == Biome.Category.FOREST || biome.getCategory() == Biome.Category.DESERT) {
                addStonInOre(ETBlocks.AMBER_ORE, biome, 8, 1, 0, 16);
            }
            if (biome.getCategory() == Biome.Category.EXTREME_HILLS) {
                addStonInOre(ETBlocks.RUBY_ORE, biome, 3, 3, 4, 32);
                addStonInOre(ETBlocks.ALEXANDRITE_ORE, biome, 3, 3, 4, 32);
            }
            if (biome.getCategory() == Biome.Category.ICY) {
                addStonInOre(ETBlocks.SAPPHIRE_ORE, biome, 3, 3, 4, 32);
            }
            if (biome.getCategory() == Biome.Category.OCEAN) {
                addStonInOre(ETBlocks.AQUAMARINE_ORE, biome, 3, 3, 4, 32);
            }
            if (biome.getCategory() == Biome.Category.SAVANNA || biome.getCategory() == Biome.Category.BEACH) {
                addStonInOre(ETBlocks.AMETHYST_ORE, biome, 3, 3, 4, 32);
            }
        }
    }

    //ブロック、バイオーム、サイズ、チャンク当たりの数、最低高度、最高高度
    public static void addStonInOre(Block block, Biome biome, int size, int chinkCont, int minhghi, int maxhghi) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block.getDefaultState(), size)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(chinkCont, minhghi, 0, maxhghi))));
    }
}
