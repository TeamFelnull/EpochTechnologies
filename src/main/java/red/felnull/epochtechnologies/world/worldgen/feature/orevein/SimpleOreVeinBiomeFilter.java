package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.world.biome.Biome;

import java.util.Arrays;

public class SimpleOreVeinBiomeFilter {
    private Biome[] biomes;
    private boolean blackList;

    public SimpleOreVeinBiomeFilter() {
        blackList = false;
    }

    public SimpleOreVeinBiomeFilter(Biome... biomes) {
        biomes = biomes;
        blackList = false;
    }

    public SimpleOreVeinBiomeFilter setBlackListMode() {
        blackList = true;
        return this;
    }

    protected boolean match(Biome biome) {
        return Arrays.asList(biomes).contains(biome);
    }

    public boolean canGenerate(Biome biome) {

        if (blackList) {
            if (biomes == null)
                return false;

            return !match(biome);
        } else {
            if (biomes == null)
                return true;

            return match(biome);
        }
    }
}
