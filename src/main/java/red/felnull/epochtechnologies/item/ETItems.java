package red.felnull.epochtechnologies.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETItems {
    public static final Item TEST_ITEM = newItem("test_item");

    //植物
    public static final Item COTTON = newItem("cotton");

    public static void registerItem(IForgeRegistry<Item> r) {
        registryItem(r, TEST_ITEM);
        registryItem(r, COTTON);

    }

    private static void registryItem(IForgeRegistry<Item> r, Item i) {
        r.register(i);
    }

    private static Item newItem(String name) {
        return newItem(name, 64);
    }

    private static Item newItem(String name, int maxsize) {
        return new Item(new Item.Properties().group(ETItemGroup.MOD_TAB).maxStackSize(maxsize))
                .setRegistryName(EpochTechnologies.MODID, name);
    }
}
