package red.felnull.epochtechnologies.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.world.IBlockReader;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

import javax.annotation.Nullable;

public class ShaftBlock extends RotatedPillarBlock {

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
