package red.felnull.epochtechnologies.client.handler;

import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;
import java.util.function.Function;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistryHandler {
    @SubscribeEvent
    public static void onModelBaked(ModelBakeEvent e) {

    }

    public static void onModelRegistry(ModelRegistryEvent e) {

    }

    private static <T extends IBakedModel> void bakaItemModel(Map<ResourceLocation, IBakedModel> map, Item item, Function<IBakedModel, T> factory) {

    }
}
