package red.felnull.epochtechnologies.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.block.ETBlocks;

public class ETItemGroup {


    public static final ItemGroup FOODAGRICULTURE = new ItemGroup(EpochTechnologies.MODID+"."+"foodagriculture") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ETItems.PEPPER_CORNS);
        }
    };
    public static final ItemGroup MACHINE = new ItemGroup(EpochTechnologies.MODID+"."+"machine") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ETBlocks.STEAM_ENGINE);
        }
    };
    public static final ItemGroup OREMINERALS = new ItemGroup(EpochTechnologies.MODID+"."+"oreminerals") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ETItems.COPPER_INGOT);
        }
    };
}
