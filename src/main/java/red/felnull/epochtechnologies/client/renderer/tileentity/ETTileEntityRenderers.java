package red.felnull.epochtechnologies.client.renderer.tileentity;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import red.felnull.epochtechnologies.tileentity.ETTileEntityTypes;

public class ETTileEntityRenderers {
    public static void registerTileEntityRenderer() {
        ClientRegistry.bindTileEntityRenderer(ETTileEntityTypes.SHAFT, ShaftTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(ETTileEntityTypes.STEAM_ENGINE, SteamEngineTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(ETTileEntityTypes.STEAM_BOILER, SteamBoilerTileEntityRenderer::new);
    }
}
