package red.felnull.epochtechnologies.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.item.ETItemGroup;
import red.felnull.epochtechnologies.item.ETItems;
import red.felnull.epochtechnologies.tileentity.ETTileEntityTypes;
import red.felnull.epochtechnologies.world.worldgen.feature.ETFeatures;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> e) {
        ETItems.registerItem(e.getRegistry());
        ETBlocks.registerItem(e.getRegistry());
    }

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> e) {
        ETBlocks.registerBlock(e.getRegistry());
    }

    @SubscribeEvent
    public static void onFeatureRegistry(final RegistryEvent.Register<Feature<?>> e) {
        ETFeatures.registerFeature(e.getRegistry());
    }

    @SubscribeEvent
    public static void onTileEntityTypeRegistry(final RegistryEvent.Register<TileEntityType<?>> e) {
        ETTileEntityTypes.registerTileEntityType(e.getRegistry());
    }
}
