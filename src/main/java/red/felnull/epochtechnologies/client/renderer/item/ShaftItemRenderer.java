package red.felnull.epochtechnologies.client.renderer.item;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;

public class ShaftItemRenderer extends ItemStackTileEntityRenderer {
    private static final ShaftTileEntity SHAFT_TILE_ENTITY = new ShaftTileEntity();

    @Override
    public void func_228364_a_(ItemStack stack, MatrixStack matx, IRenderTypeBuffer bff, int light, int ove) {
        TileEntityRendererDispatcher.instance.func_228852_a_(SHAFT_TILE_ENTITY, matx, bff, light, ove);
        System.out.println("test");
    }
}