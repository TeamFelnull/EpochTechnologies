package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimpleOreVeinBlockProportion {
    private Block[] ores;
    private int proportion;

    public SimpleOreVeinBlockProportion(int proportion) {
        this.proportion = proportion;
    }

    public SimpleOreVeinBlockProportion(int proportion, Block... ore) {
        this.ores = ore;
        this.proportion = proportion;
    }

    public static Block getRaffleBlock(List<SimpleOreVeinBlockProportion> ores) {

        Random r = new Random();

        if (ores.size() == 1)
            return ores.get(0).getOreBlocks().get(r.nextInt(ores.get(0).getOreBlocks().size()));


        int all = 0;
        for (int i = 0; i < ores.size(); i++) {
            all += ores.get(i).getProportion();
        }

        int raff = r.nextInt(all) + 1;

        int c = 0;
        for (int i = 0; i < ores.size(); i++) {
            c += ores.get(i).getProportion();

            if (c >= raff)
                return ores.get(i).getOreBlocks().get(r.nextInt(ores.get(i).getOreBlocks().size()));
        }

        return null;
    }

    public List<Block> getOreBlocks() {
        return Arrays.asList(ores);
    }

    public int getProportion() {
        return proportion;
    }
}
