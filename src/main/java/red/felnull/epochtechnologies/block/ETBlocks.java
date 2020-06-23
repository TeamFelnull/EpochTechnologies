package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.item.ETItemGroup;

public class ETBlocks {
    public static Block TEST_BLOCK = newBlock("test_block", Material.ROCK, SoundType.WOOD, 1.0f, 2.0f);

    //鉱石
    public static Block COPPER_ORE = newOreBlock("copper_ore", 1, 3.0f, 3.0f);
    public static Block TIN_ORE = newOreBlock("tin_ore", 1, 3.0f, 3.0f);


    public static void registerBlock(IForgeRegistry<Block> r) {
        registryBlock(r, TEST_BLOCK);

        registryBlock(r, COPPER_ORE);
        registryBlock(r, TIN_ORE);
    }

    public static void registerItem(IForgeRegistry<Item> r) {
        registryBlockItem(r, TEST_BLOCK);

        registryBlockItem(r, COPPER_ORE);
        registryBlockItem(r, TIN_ORE);
    }

    private static Block newOreBlock(String name, int hlevel, float hardness, float resistance) {
        return new ColorOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(hardness, resistance).harvestLevel(hlevel))
                .setRegistryName(EpochTechnologies.MODID, name);
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
