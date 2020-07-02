package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETBlockTags {
    public static final ITag.INamedTag<Block> ORES_COPPER = forgeTag("ores/copper");
    public static final ITag.INamedTag<Block> ORES_TIN = forgeTag("ores/tin");
    public static final ITag.INamedTag<Block> ORES_LEAD = forgeTag("ores/lead");
    public static final ITag.INamedTag<Block> ORES_NICKEL = forgeTag("ores/nickel");
    public static final ITag.INamedTag<Block> ORES_SILVER = forgeTag("ores/silver");
    public static final ITag.INamedTag<Block> ORES_RUBY = forgeTag("ores/ruby");
    public static final ITag.INamedTag<Block> ORES_SAPPHIRE = forgeTag("ores/sapphire");
    public static final ITag.INamedTag<Block> ORES_AMETHYST = forgeTag("ores/amethyst");
    public static final ITag.INamedTag<Block> ORES_AMBER = forgeTag("ores/amber");
    public static final ITag.INamedTag<Block> ORES_ALEXANDRITE = forgeTag("ores/alexandrite");
    public static final ITag.INamedTag<Block> ORES_AQUAMARINE = forgeTag("ores/aquamarine");

    public static final ITag.INamedTag<Block> PROP_PLANTABLE_ON = etTag("prop_plantable_on");

    private static ITag.INamedTag<Block> forgeTag(String name) {
        return BlockTags.makeWrapperTag("forge:" + name);
    }

    private static ITag.INamedTag<Block> etTag(String name) {
        return BlockTags.makeWrapperTag(EpochTechnologies.MODID + ":" + name);
    }

}
