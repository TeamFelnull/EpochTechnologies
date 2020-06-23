package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import red.felnull.otyacraftengine.block.IColorbleBlock;

import javax.annotation.Nullable;

public class ColorOreBlock extends Block implements IColorbleBlock {
    public ColorOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getColoer(BlockState blockState, @Nullable ILightReader iLightReader, @Nullable BlockPos blockPos, int i) {
        return Integer.parseInt("008b8b", 16);
    }
}
