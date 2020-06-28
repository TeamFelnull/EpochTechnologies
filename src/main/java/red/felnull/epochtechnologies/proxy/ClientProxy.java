package red.felnull.epochtechnologies.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import red.felnull.epochtechnologies.client.handler.ModelRegistryHandler;
import red.felnull.epochtechnologies.client.renderer.tileentity.ETTileEntityRenderers;

public class ClientProxy extends CommonProxy {
    public static void clientInit() {
        ETTileEntityRenderers.registerTileEntityRenderer();
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
