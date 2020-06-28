package red.felnull.epochtechnologies.proxy;

import net.minecraft.client.Minecraft;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.world.worldgen.OreGeneration;
import red.felnull.epochtechnologies.world.worldgen.feature.ETFeatures;
import red.felnull.epochtechnologies.world.worldgen.feature.orevein.ETOreVeins;
import red.felnull.otyacraftengine.registries.OERegistries;

public class CommonProxy {

    public void preInit() {
        OERegistries.registrierModColor(EpochTechnologies.MODID, Integer.parseInt("008b8b", 16));
        ETOreVeins.registerVein();
      //  OreGeneration.init();
       // ETFeatures.init();
    }

    public void init() {
    }

    public void posInit() {

    }

    public Minecraft getMinecraft() {
        return null;
    }
}
