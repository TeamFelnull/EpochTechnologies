package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.Tags;
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
    private boolean ejecta;
    private List<Biome> whitelistBiome;
    private List<Biome> blacklistBiome;

    public OreVeins(List<OreVeinBlockProportion> ores, List<Block> genblocks, float probability, int size, int minhigh, int maxhigh, float density, boolean ejecta) {
        this(ores, genblocks, probability, size, minhigh, maxhigh, density, ejecta, null, null);
    }

    public OreVeins(List<OreVeinBlockProportion> ores, List<Block> genblocks, float probability, int size, int minhigh, int maxhigh, float density, boolean ejecta, List<Biome> whitelistBiome, List<Biome> blacklistBiome) {
        this.oreBlocks = ores;
        this.generateBlocks = genblocks;
        this.probability = probability;
        this.size = size;
        this.minhigh = minhigh;
        this.maxhigh = maxhigh;
        this.density = density;
        this.ejecta = ejecta;
        this.whitelistBiome = whitelistBiome;
        this.blacklistBiome = blacklistBiome;
    }

    public boolean isBiomeGen(Biome biome) {


        if (whitelistBiome == null && blacklistBiome == null)
            return true;

        if (whitelistBiome == null && blacklistBiome != null) {
            return !blacklistBiome.contains(biome);
        }

        if (whitelistBiome != null && blacklistBiome == null) {
            return whitelistBiome.contains(biome);
        }

        return whitelistBiome.contains(biome) && !blacklistBiome.contains(biome);

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

    public boolean generateEjecta(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos uppos, NoFeatureConfig config) {


        Biome biome =  worldIn.func_226691_t_(uppos);
        int vehgj = getChunkToHeight(worldIn.getChunk(uppos), worldIn.getSeed(), biome);

        BlockPos pos = new BlockPos(uppos.getX(), vehgj - getSize() / 2, uppos.getZ());


        int i = rand.nextInt(4) + 7;
        int j = i / 4 + rand.nextInt(2);

        pos = pos.up(uppos.getY() - pos.getY());


        for (int k = 0; k < i; ++k) {
            float f = (1.0F - (float) k / (float) i) * (float) j;
            int l = MathHelper.ceil(f);

            for (int i1 = -l; i1 <= l; ++i1) {
                float f1 = (float) MathHelper.abs(i1) - 0.25F;

                for (int j1 = -l; j1 <= l; ++j1) {
                    float f2 = (float) MathHelper.abs(j1) - 0.25F;
                    if ((i1 == 0 && j1 == 0 || !(f1 * f1 + f2 * f2 > f * f)) && (i1 != -l && i1 != l && j1 != -l && j1 != l || !(rand.nextFloat() > 0.75F))) {
                        BlockState blockstate = worldIn.getBlockState(pos.add(i1, k, j1));
                        Block block = blockstate.getBlock();
                        if (isOvarideBlock(block) || !blockstate.getFluidState().isEmpty() || blockstate.isAir(worldIn, pos.add(i1, k, j1)) || getGenerateBlocks().contains(block)) {
                            boolean densflag = rand.nextFloat() <= getDensity();
                            if (densflag) {
                                this.setBlockState(worldIn, pos.add(i1, k, j1), OreVeinBlockProportion.getRaffleBlock(getOreBlocks()).getDefaultState());
                            } else {
                                if (isOvarideBlock(block) || !blockstate.getFluidState().isEmpty() || blockstate.isAir(worldIn, pos.add(i1, k, j1))) {
                                    this.setBlockState(worldIn, pos.add(i1, k, j1), getGenerateBlocks().get(0).getDefaultState());
                                }
                            }
                        }

                        if (k != 0 && l > 1) {
                            blockstate = worldIn.getBlockState(pos.add(i1, -k, j1));
                            block = blockstate.getBlock();
                            if (isOvarideBlock(block) || !blockstate.getFluidState().isEmpty() || blockstate.isAir(worldIn, pos.add(i1, -k, j1)) || getGenerateBlocks().contains(block)) {
                                boolean densflag = rand.nextFloat() <= getDensity();
                                if (densflag) {
                                    this.setBlockState(worldIn, pos.add(i1, -k, j1), OreVeinBlockProportion.getRaffleBlock(getOreBlocks()).getDefaultState());
                                } else {
                                    if (isOvarideBlock(block) || !blockstate.getFluidState().isEmpty() || blockstate.isAir(worldIn, pos.add(i1, -k, j1))) {
                                        this.setBlockState(worldIn, pos.add(i1, -k, j1), getGenerateBlocks().get(0).getDefaultState());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int k1 = j - 1;
        if (k1 < 0) {
            k1 = 0;
        } else if (k1 > 1) {
            k1 = 1;
        }

        for (int l1 = -k1; l1 <= k1; ++l1) {
            for (int i2 = -k1; i2 <= k1; ++i2) {
                BlockPos blockpos = pos.add(l1, -1, i2);
                int j2 = 50;
                if (Math.abs(l1) == 1 && Math.abs(i2) == 1) {
                    j2 = rand.nextInt(5);
                }

                while (blockpos.getY() > 100) {
                    BlockState blockstate1 = worldIn.getBlockState(blockpos);
                    Block block1 = blockstate1.getBlock();

                    if (isOvarideBlock(block1) || !blockstate1.getFluidState().isEmpty() || blockstate1.isAir(worldIn, blockpos) || getGenerateBlocks().contains(block1)) {
                        this.setBlockState(worldIn, blockpos, OreVeinBlockProportion.getRaffleBlock(getOreBlocks()).getDefaultState());
                        boolean densflag = rand.nextFloat() <= getDensity();
                        if (densflag) {
                            this.setBlockState(worldIn, blockpos, OreVeinBlockProportion.getRaffleBlock(getOreBlocks()).getDefaultState());
                        } else {
                            if (isOvarideBlock(block1) || !blockstate1.getFluidState().isEmpty() || blockstate1.isAir(worldIn, blockpos)) {
                                this.setBlockState(worldIn, blockpos, getGenerateBlocks().get(0).getDefaultState());
                            }
                        }
                    }

                    blockpos = blockpos.down();
                    --j2;
                    if (j2 <= 0) {
                        blockpos = blockpos.down(rand.nextInt(5) + 1);
                        j2 = rand.nextInt(5);
                    }
                }
            }
        }

        return true;
    }

    protected static boolean isOvarideBlock(Block block) {

        boolean flag1 = Tags.Blocks.DIRT.contains(block);
        boolean flag2 = Tags.Blocks.SAND.contains(block);
        boolean flag3 = Tags.Blocks.SANDSTONE.contains(block);
        boolean flag4 = Tags.Blocks.GRAVEL.contains(block);

        return flag1 || flag2 || flag3 || flag4;
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

        if (!isBiomeGen(biome))
            return false;


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

    public boolean isEjecta() {
        return ejecta;
    }
}
