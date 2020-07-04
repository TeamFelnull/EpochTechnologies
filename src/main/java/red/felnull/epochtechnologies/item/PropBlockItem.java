package red.felnull.epochtechnologies.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.world.World;

public class PropBlockItem extends BlockItem {
    public PropBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    protected boolean placeBlock(BlockItemUseContext context, BlockState state) {

        if (context.getPlayer().isCrouching()) {
            World worldIn = context.getWorld();
            boolean flag = worldIn.getBlockState(context.getPos().up()).isAir() && worldIn.getBlockState(context.getPos().up().up()).isAir();

            if (flag) {
                boolean p1 = context.getWorld().setBlockState(context.getPos(), state, 11);
                boolean p2 = context.getWorld().setBlockState(context.getPos().up(), state, 11);
                boolean p3 = context.getWorld().setBlockState(context.getPos().up().up(), state, 11);

                return p1 || p2 || p3;
            }

            return flag;
        }

        return super.placeBlock(context, state);
    }

}
