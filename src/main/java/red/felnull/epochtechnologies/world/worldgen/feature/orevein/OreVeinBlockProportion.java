package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;

import java.util.List;
import java.util.Random;

public class OreVeinBlockProportion {
    private Block ore;
    private int proportion;

    public OreVeinBlockProportion(Block ore, int proportion) {
        this.ore = ore;
        this.proportion = proportion;
    }

    public Block getOreBlock() {
        return ore;
    }

    public static Block getRaffleBlock(List<OreVeinBlockProportion> ores) {

        if (ores.size() == 1)
            return ores.get(0).getOreBlock();


        int all = 0;
        for (int i = 0; i < ores.size(); i++) {
            all += ores.get(i).getProportion();
        }


        Random r = new Random();
        int raff = r.nextInt(all) + 1;

        int c = 0;
        for (int i = 0; i < ores.size(); i++) {
            c += ores.get(i).getProportion();

            if (c >= raff)
                return ores.get(i).getOreBlock();
        }

        return null;
    }

    public int getProportion() {
        return proportion;
    }
}
