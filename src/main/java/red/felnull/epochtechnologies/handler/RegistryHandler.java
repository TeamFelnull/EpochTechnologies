package red.felnull.epochtechnologies.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.item.ETItemGroup;
import red.felnull.epochtechnologies.item.ETItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> e) {
        ETItems.registerItem(e.getRegistry());
        ETBlocks.registerItem(e.getRegistry());
    }

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> e) {
        ETBlocks.registerBlock(e.getRegistry());
    }
}
