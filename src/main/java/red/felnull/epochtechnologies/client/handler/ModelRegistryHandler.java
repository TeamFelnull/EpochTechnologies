package red.felnull.epochtechnologies.client.handler;

import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistryHandler {

    public static IBakedModel test;

    @SubscribeEvent
    public static void onModelBaked(ModelBakeEvent e) {

    }


    public static void onModelRegistry(ModelRegistryEvent e) {

    }


}
