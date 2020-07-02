package red.felnull.epochtechnologies.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;

public class SteamEngineBlockItem extends BlockItem {
    public SteamEngineBlockItem(Block block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    protected boolean placeBlock(BlockItemUseContext p_195941_1_, BlockState p_195941_2_) {
        return p_195941_1_.getWorld().setBlockState(p_195941_1_.getPos(), p_195941_2_, 26);
    }
}
