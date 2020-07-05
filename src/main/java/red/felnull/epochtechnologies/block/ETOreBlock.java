package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class ETOreBlock extends Block {
    private int minexp;
    private int maxexp;

    public ETOreBlock(Properties properties, int minexp, int maxexp) {
        super(properties);
        this.minexp = minexp;
        this.maxexp = maxexp;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {

        if (minexp == 0 && maxexp == 0)
            return 0;

        return silktouch == 0 ? MathHelper.nextInt(RANDOM, minexp, maxexp) : 0;
    }


}
