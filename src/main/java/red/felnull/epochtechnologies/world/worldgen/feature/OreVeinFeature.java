package red.felnull.epochtechnologies.world.worldgen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.StructureManager;
import red.felnull.epochtechnologies.world.worldgen.feature.orevein.OreVeins;

import java.util.Random;

public class OreVeinFeature extends Feature<NoFeatureConfig> {
    public OreVeinFeature(Codec<NoFeatureConfig> cfig) {
        super(cfig);
    }

    public boolean func_230362_a_(ISeedReader seed, StructureManager structureManager, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        World worldIn = seed.getWorld();
        Biome biome = worldIn.getBiome(pos);
        OreVeins genvein = OreVeins.getChunkToOreVein(worldIn.getChunk(pos), seed.getSeed(), biome);

        if (genvein == null)
            return false;

        int minhigh = genvein.getMinhigh();
        int y = minhigh + genvein.getChunkToHeight(worldIn.getChunk(pos), seed.getSeed(), biome);
        int x = pos.getX();
        int z = pos.getZ();
        BlockPos genPos = new BlockPos(x, y, z); //生成される原点

        if (!genvein.canGenerate(worldIn, generator, rand, genPos, config))
            return false;


        boolean flagv = genvein.generateVein(seed, structureManager, generator, rand, genPos, config);

        if (!genvein.isEjecta())
            return flagv;

        genPos = new BlockPos(genPos.getX(), worldIn.getChunk(pos).getTopBlockY(Heightmap.Type.OCEAN_FLOOR_WG, 0, 0), genPos.getZ());

        while (worldIn.isAirBlock(genPos) || !worldIn.getFluidState(genPos).isEmpty()) {
            genPos = genPos.down();
            if (genPos.getY() <= 3)
                return flagv;
        }

        boolean flage = genvein.generateEjecta(seed, structureManager, generator, rand, genPos, config);


        return flagv && flage;
    }
}