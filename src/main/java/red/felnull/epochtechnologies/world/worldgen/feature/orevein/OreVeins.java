package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import red.felnull.epochtechnologies.registries.ETRegistries;
import red.felnull.otyacraftengine.util.IkisugiMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class OreVeins {
    private List<OreVeinBlockProportion> oreBlocks;//生成する鉱石たち
    private List<Block> generateBlocks;//上書きされるブロック
    private float probability;//鉱脈生成確率(チャンクごとに１が最高、０が最低）
    private int size;//サイズ
    private int minhigh;//最低高度
    private int maxhigh;//最高高度
    private float density;//密集度(ブロックごとに１が最高、０が最低）

    public OreVeins(List<OreVeinBlockProportion> ores, List<Block> genblocks, float probability, int size, int minhigh, int maxhigh, float density) {
        this.oreBlocks = ores;
        this.generateBlocks = genblocks;
        this.probability = probability;
        this.size = size;
        this.minhigh = minhigh;
        this.maxhigh = maxhigh;
        this.density = density;
    }


    public boolean generateVein(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        int siez = getSize();
        for (int f = 0; f < siez; f++) {
            for (int f2 = 0; f2 < siez; f2++) {
                for (int f3 = 0; f3 < siez; f3++) {
                    BlockPos generatePos = new BlockPos(pos.getX() - siez / 2 + f, pos.getY() - siez / 2 + f3, pos.getZ() - siez / 2 + f2);
                    boolean densflag = rand.nextFloat() <= getDensity();
                    if (densflag && getGenerateBlocks().contains(worldIn.getBlockState(generatePos).getBlock())) {
                        Block genBlock = OreVeinBlockProportion.getRaffleBlock(getOreBlocks());
                        this.setBlockState(worldIn, generatePos, genBlock.getDefaultState());
                    }
                }
            }
        }
        return true;
    }

    public boolean generateEjecta(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        for (int t = 0; t < 10; t++) {
            this.setBlockState(worldIn, pos.add(0, t, 0), Blocks.STONE.getDefaultState());
        }

        return true;
    }

    protected void setBlockState(IWorldWriter worldIn, BlockPos pos, BlockState state) {
        worldIn.setBlockState(pos, state, 3);
    }

    public List<OreVeinBlockProportion> getOreBlocks() {
        return oreBlocks;
    }

    public List<Block> getGenerateBlocks() {
        return generateBlocks;
    }

    public boolean canGenerate(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {

        return getGenerateBlocks().contains(worldIn.getBlockState(pos).getBlock());
    }


    public float getProbability() {
        return probability;
    }

    public int getSize() {
        return size;
    }


    public int getMinhigh() {
        return minhigh;
    }


    public int getMaxhigh() {
        return maxhigh;
    }


    public float getDensity() {
        return density;
    }

    public ResourceLocation getRegistryName() {
        for (Map.Entry<ResourceLocation, OreVeins> fr : ETRegistries.ORE_VEINS.entrySet()) {
            if (fr.getValue() == this)
                return fr.getKey();
        }
        return null;
    }

    public boolean isGenerateToOreVein(IChunk chunk, long seed, Biome biome) {

        Random r = new Random(radomGenNum(chunk, seed, getRegistryName().toString()));

        boolean flag = r.nextFloat() <= getProbability();

        return flag;
    }

    public int getChunkToHeight(IChunk chunk, long seed, Biome biome) {
        Random r = new Random(radomGenNum(chunk, seed, "vein_height" + this.getRegistryName().toString()));
        return r.nextInt(this.maxhigh - this.minhigh);
    }

    public static OreVeins getChunkToOreVein(IChunk chunk, long seed, Biome biome) {

        List<OreVeins> veins = new ArrayList<OreVeins>();

        for (Map.Entry<ResourceLocation, OreVeins> ro : ETRegistries.ORE_VEINS.entrySet()) {
            if (ro.getValue().isGenerateToOreVein(chunk, seed, biome))
                veins.add(ro.getValue());
        }

        if (veins.size() == 0)
            return null;
        Random r = new Random(radomGenNum(chunk, seed, "vein_gen"));

        return veins.get(r.nextInt(veins.size()));
    }

    private static int radomGenNum(IChunk chunk, long seed, String name) {

        int num1 = new Random(chunk.getPos().x).nextInt(Integer.MAX_VALUE);
        int num2 = new Random(chunk.getPos().z).nextInt(Integer.MAX_VALUE);
        int num3 = new Random((int) seed).nextInt(Integer.MAX_VALUE);
        int num4 = new Random(IkisugiMath.convertStringToInteger(name)).nextInt(Integer.MAX_VALUE);

        return num1 * num2 * num3 * num4;
    }
}
