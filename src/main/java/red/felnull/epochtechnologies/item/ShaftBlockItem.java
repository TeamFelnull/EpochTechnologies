package red.felnull.epochtechnologies.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Items;
import red.felnull.epochtechnologies.client.renderer.item.ShaftItemRenderer;

public class ShaftBlockItem extends BlockItem {
    public ShaftBlockItem(Block blockIn, Properties properties) {
        super(blockIn, properties.setISTER(() -> ShaftItemRenderer::new));
    }


}
