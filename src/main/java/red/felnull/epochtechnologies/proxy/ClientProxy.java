package red.felnull.epochtechnologies.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import red.felnull.epochtechnologies.client.handler.ModelRegistryHandler;
import red.felnull.epochtechnologies.client.renderer.tileentity.ETTileEntityRenderers;
import red.felnull.otyacraftengine.client.handler.RenderHandler;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
        MinecraftForge.EVENT_BUS.register(ModelRegistryHandler.class);
    }

    public static void clientInit() {
        ETTileEntityRenderers.registerTileEntityRenderer();
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
