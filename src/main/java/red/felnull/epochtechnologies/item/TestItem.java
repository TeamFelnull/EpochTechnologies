package red.felnull.epochtechnologies.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import red.felnull.otyacraftengine.util.GorokuUtil;

public class TestItem extends Item {
    public TestItem(Properties properties) {
        super(properties);

    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        if (!worldIn.isRemote) {
            playerIn.sendMessage(new StringTextComponent(GorokuUtil.getYattaze()));
        }
        return ActionResult.func_226248_a_(itemstack);
    }
}
