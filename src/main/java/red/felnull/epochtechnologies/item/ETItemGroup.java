package red.felnull.epochtechnologies.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETItemGroup {
    public static final ItemGroup MOD_TAB = new ItemGroup(EpochTechnologies.MODID) {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ETItems.PEPPER_CORNS);
        }
    };
}
