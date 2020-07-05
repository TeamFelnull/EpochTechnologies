package red.felnull.epochtechnologies.world.worldgen.feature.structure;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETStructures {
    public static final Structure<NoFeatureConfig> TEST = new TestStructure(NoFeatureConfig.field_236558_a_);

    public static void registerStructure(IForgeRegistry<Structure<?>> r) {
        r.register(TEST.setRegistryName(EpochTechnologies.MODID, "test"));
        Structure.field_236365_a_.put(EpochTechnologies.MODID + ":" + "test", TEST);
    }

    public static IStructurePieceType TEST_PIECETYPE;


    public static void init() {
        TEST_PIECETYPE = Registry.register(Registry.STRUCTURE_PIECE, EpochTechnologies.MODID + ":" + "test", TestPieces.Piece::new);

        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.func_235063_a_(TEST.func_236391_a_(NoFeatureConfig.field_236559_b_));
        }
    }
}
