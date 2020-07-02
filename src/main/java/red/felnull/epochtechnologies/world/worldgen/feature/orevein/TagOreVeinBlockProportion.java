package red.felnull.epochtechnologies.world.worldgen.feature.orevein;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;

import java.util.ArrayList;
import java.util.List;

public class TagOreVeinBlockProportion extends SimpleOreVeinBlockProportion {
    private ITag.INamedTag<Block>[] tags;

    public TagOreVeinBlockProportion(int proportion, ITag.INamedTag<Block>... tags) {
        super(proportion);
        this.tags = tags;
    }

    @Override
    public List<Block> getOreBlocks() {
        List<Block> blocks = new ArrayList<Block>();
        for (ITag.INamedTag<Block> tag : tags) {
            blocks.addAll(tag.func_230236_b_());
        }
        return blocks;
    }


}
