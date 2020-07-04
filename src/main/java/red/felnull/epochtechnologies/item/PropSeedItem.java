package red.felnull.epochtechnologies.item;

import net.minecraft.block.Block;
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
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.block.PropBlock;
import red.felnull.epochtechnologies.block.propertie.PropPlace;

public class PropSeedItem extends Item {
    private Block block;

    public PropSeedItem(Properties properties, Block block) {
        super(properties);
        this.block = block;
    }


    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ItemStack stack = context.getItem();
        World worldIn = context.getWorld();
        BlockState bstate = worldIn.getBlockState(context.getPos());
        BlockPos pos = context.getPos();
        if (bstate.getBlock() != ETBlocks.PROP && context.getFace() == Direction.UP) {
            bstate = worldIn.getBlockState(context.getPos().up());
            pos = pos.up();
        }

        if (bstate.getBlock() == ETBlocks.PROP && bstate.get(PropBlock.PLACE) == PropPlace.UNDER) {
            worldIn.setBlockState(pos, block.getDefaultState().with(PropBlock.PLACE, bstate.get(PropBlock.PLACE)));

            SoundType soundtype = block.getDefaultState().getSoundType(worldIn, pos, context.getPlayer());
            worldIn.playSound(context.getPlayer(), pos, this.getPlaceSound(block.getDefaultState(), worldIn, pos, context.getPlayer()), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
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
