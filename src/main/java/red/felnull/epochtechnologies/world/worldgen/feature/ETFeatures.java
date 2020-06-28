package red.felnull.epochtechnologies.world.worldgen.feature;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETFeatures {
    public static final Feature<NoFeatureConfig> ORE_VEIN = new OreVeinFeature(NoFeatureConfig.field_236558_a_);


    public static void registerFeature(IForgeRegistry<Feature<?>> r) {
        r.register(ORE_VEIN.setRegistryName(EpochTechnologies.MODID, "ore_vein"));
    }


    public static void init() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_VEIN.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 1))));
        }
    }
}
