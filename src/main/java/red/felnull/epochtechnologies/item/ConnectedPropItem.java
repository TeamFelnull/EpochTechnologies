package red.felnull.epochtechnologies.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import red.felnull.epochtechnologies.block.ETBlockTags;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.block.PropBlock;
import red.felnull.epochtechnologies.block.propertie.PropPlace;

public class ConnectedPropItem extends Item {
    public ConnectedPropItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ItemStack stack = context.getItem();
        World worldIn = context.getWorld();
        BlockState bstate = worldIn.getBlockState(context.getPos());
        BlockPos pos = context.getPos();

        boolean flag = worldIn.getBlockState(context.getPos().up()).isAir() && worldIn.getBlockState(context.getPos().up().up()).isAir() && worldIn.getBlockState(context.getPos().up().up().up()).isAir();

        if (flag && ETBlockTags.PROP_PLANTABLE_ON.func_230235_a_(bstate.getBlock()) && context.getFace() == Direction.UP) {
            context.getWorld().setBlockState(context.getPos().up(), ETBlocks.PROP.getDefaultState().with(PropBlock.PLACE, PropPlace.UNDER));
            context.getWorld().setBlockState(context.getPos().up().up(), ETBlocks.PROP.getDefaultState().with(PropBlock.PLACE, PropPlace.MIDDLE));
            context.getWorld().setBlockState(context.getPos().up().up().up(), ETBlocks.PROP.getDefaultState().with(PropBlock.PLACE, PropPlace.UP));
            SoundType soundtype = ETBlocks.PROP.getDefaultState().getSoundType(worldIn, pos, context.getPlayer());
            worldIn.playSound(context.getPlayer(), pos, this.getPlaceSound(ETBlocks.PROP.getDefaultState(), worldIn, pos, context.getPlayer()), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
            if (context.getPlayer() == null || !context.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            return ActionResultType.SUCCESS;
        }

        return ActionResultType.PASS;
    }


    protected SoundEvent getPlaceSound(BlockState state, World world, BlockPos pos, PlayerEntity entity) {
        return state.getSoundType(world, pos, entity).getPlaceSound();
    }
}
