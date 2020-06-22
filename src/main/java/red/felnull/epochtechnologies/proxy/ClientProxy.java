package red.felnull.epochtechnologies.proxy;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
    }

    public static void clientInit() {

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
