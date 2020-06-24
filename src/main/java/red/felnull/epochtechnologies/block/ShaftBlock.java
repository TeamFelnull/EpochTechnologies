package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

import javax.annotation.Nullable;

public class ShaftBlock extends Block {
    public ShaftBlock(Properties properties) {
        super(properties.func_226896_b_());
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ShaftTileEntity();
    }

    @Override
    public final boolean hasTileEntity(BlockState state) {
        return true;
    }

}
