package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.item.ETItemGroup;

public class ETBlocks {
    public static Block TEST_BLOCK = newBlock("test_block", Material.ROCK, SoundType.WOOD, 1.0f, 2.0f);

    public static void registerBlock(IForgeRegistry<Block> r) {
        registryBlock(r, TEST_BLOCK);
    }

    public static void registerItem(IForgeRegistry<Item> r) {
        registryBlockItem(r, TEST_BLOCK);
    }

    private static Block newBlock(String name, Material materialIn, SoundType sound, float hardness, float resistance) {
        return new Block(Block.Properties.create(materialIn).sound(sound).hardnessAndResistance(hardness, resistance))
                .setRegistryName(EpochTechnologies.MODID, name);
    }

    private static void registryBlock(IForgeRegistry<Block> r, Block b) {
        r.register(b);
    }

    private static void registryBlockItem(IForgeRegistry<Item> r, Block b) {
        r.register(new BlockItem(b, new Item.Properties().group(ETItemGroup.MOD_TAB))
                .setRegistryName(b.getRegistryName()));
    }
}
