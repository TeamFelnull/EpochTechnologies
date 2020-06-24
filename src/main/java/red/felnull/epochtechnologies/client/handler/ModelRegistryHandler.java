package red.felnull.epochtechnologies.client.handler;

import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.client.model.ShaftBakedModel;

import java.util.Map;
import java.util.function.Function;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistryHandler {
    @SubscribeEvent
    public static void onModelBaked(ModelBakeEvent e) {
        Map<ResourceLocation, IBakedModel> map = e.getModelRegistry();
        bakaItemModel(map, Item.getItemFromBlock(ETBlocks.SHAFT), md -> (new ShaftBakedModel(md)));
    }

    public static void onModelRegistry(ModelRegistryEvent e) {
        ModelLoader.addSpecialModel(new ShaftBakedModel(null).getLocation());
    }

    private static <T extends IBakedModel> void bakaItemModel(Map<ResourceLocation, IBakedModel> map, Item item, Function<IBakedModel, T> factory) {
        map.put(new ModelResourceLocation(item.getRegistryName(), "inventory"),
                factory.apply(map.get(new ModelResourceLocation(item.getRegistryName(), "inventory"))));
    }
}
