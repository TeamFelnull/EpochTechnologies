package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.world.biome.Biome;

import java.util.Arrays;

public class CategoryOreVeinBiomeFilter extends SimpleOreVeinBiomeFilter {
    Biome.Category[] category;

    public CategoryOreVeinBiomeFilter(Biome.Category... cate) {
        this.category = cate;
    }

    @Override
    protected boolean match(Biome biome) {
        return Arrays.asList(category).contains(biome);
    }

}
