package red.felnull.epochtechnologies.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import red.felnull.epochtechnologies.tileentity.ETTileEntityTypes;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;

public class ETTileEntityRenderers {
    public static void registerTileEntityRenderer() {
        ClientRegistry.bindTileEntityRenderer(ETTileEntityTypes.SHAFT, ShaftTileEntityRenderer::new);
    }
}
