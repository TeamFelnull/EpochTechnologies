package red.felnull.epochtechnologies.world.worldgen.feature.structure;

import com.mojang.serialization.Codec;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class TestStructure extends Structure<NoFeatureConfig> {
    public TestStructure(Codec<NoFeatureConfig> p_i231997_1_) {
        super(p_i231997_1_);
    }


    @Override
    public IStartFactory<NoFeatureConfig> getStartFactory() {
        return TestStructure.Start::new;
    }

    public static class Start extends StructureStart<NoFeatureConfig> {

        public Start(Structure<NoFeatureConfig> structure, int p_i225876_2_, int p_i225876_3_, MutableBoundingBox p_i225876_4_, int p_i225876_5_, long p_i225876_6_) {
            super(structure, p_i225876_2_, p_i225876_3_, p_i225876_4_, p_i225876_5_, p_i225876_6_);
        }

        @Override
        public void func_230364_a_(ChunkGenerator generator, TemplateManager manager, int x, int y, Biome p_230364_5_, NoFeatureConfig p_230364_6_) {
            int chukedx = x * 16;
            int chukedy = y * 16;
            BlockPos pos = new BlockPos(chukedx, 64, chukedy);
            Rotation rotation = Rotation.randomRotation(this.rand);
            TestPieces.generateStarted(manager, pos, rotation, this.components, this.rand);
            this.recalculateStructureSize();
        }
    }
}
