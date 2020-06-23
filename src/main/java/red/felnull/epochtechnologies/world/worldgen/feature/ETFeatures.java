package red.felnull.epochtechnologies.world.worldgen.feature;

import net.minecraft.item.Item;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.IceSpikeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETFeatures {
    public static final Feature<NoFeatureConfig> ORE_VEIN = new OreVeinFeature(NoFeatureConfig::deserialize);

    public static void registerFeature(IForgeRegistry<Feature<?>> r) {
        r.register(ORE_VEIN.setRegistryName(EpochTechnologies.MODID, "ore_vein"));
    }

    public static void init() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_VEIN.func_225566_b_(IFeatureConfig.NO_FEATURE_CONFIG).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(1, 0, 0, 1))));
        }
    }
}
