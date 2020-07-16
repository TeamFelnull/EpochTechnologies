package red.felnull.epochtechnologies.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import red.felnull.epochtechnologies.client.gui.screen.ETScrennContainerFactorys;
import red.felnull.epochtechnologies.client.handler.ModelRegistryHandler;
import red.felnull.epochtechnologies.client.renderer.entity.BearRenderer;
import red.felnull.epochtechnologies.client.renderer.tileentity.ETTileEntityRenderers;
import red.felnull.epochtechnologies.entity.ETEntityTypes;

public class ClientProxy extends CommonProxy {
    public static void clientInit() {
        ETTileEntityRenderers.registerTileEntityRenderer();
        RenderingRegistry.registerEntityRenderingHandler(ETEntityTypes.BEAR, BearRenderer::new);
        ETScrennContainerFactorys.registerFactories();
    }

    @Override
    public void preInit() {
        super.preInit();
        MinecraftForge.EVENT_BUS.register(ModelRegistryHandler.class);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void posInit() {
        super.posInit();
    }

    public Minecraft getMinecraft() {
        return Minecraft.getInstance();
    }

}
