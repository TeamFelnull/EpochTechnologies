package red.felnull.epochtechnologies.world.worldgen.feature;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import red.felnull.epochtechnologies.world.worldgen.feature.orevein.OreVeins;

import java.util.Random;
import java.util.function.Function;

public class OreVeinFeature extends Feature<NoFeatureConfig> {
    public OreVeinFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }

    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {

        Biome biome = worldIn.func_226691_t_(pos);
        OreVeins genvein = OreVeins.getChunkToOreVein(worldIn.getChunk(pos), worldIn.getSeed(), biome);

        if (genvein == null)
            return false;

        int minhigh = genvein.getMinhigh();
        int y = minhigh + genvein.getChunkToHeight(worldIn.getChunk(pos), worldIn.getSeed(), biome);
        int x = pos.getX();
        int z = pos.getZ();
        BlockPos genPos = new BlockPos(x, y, z); //生成される原点

        if (!genvein.canGenerate(worldIn, generator, rand, genPos, config))
            return false;


        boolean flagv = genvein.generateVein(worldIn, generator, rand, genPos, config);

        if (!genvein.isEjecta())
            return flagv;

        genPos = new BlockPos(genPos.getX(), worldIn.getChunk(pos).getTopBlockY(Heightmap.Type.OCEAN_FLOOR_WG, 0, 0), genPos.getZ());

        while (worldIn.isAirBlock(genPos) || !worldIn.getFluidState(genPos).isEmpty()) {
            genPos = genPos.down();
            if (genPos.getY() <= 3)
                return flagv;
        }

        boolean flage = genvein.generateEjecta(worldIn, generator, rand, genPos, config);


        return flagv && flage;
    }
}