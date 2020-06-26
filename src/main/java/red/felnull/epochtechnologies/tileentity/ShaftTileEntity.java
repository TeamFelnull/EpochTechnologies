package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

import javax.annotation.Nullable;

public class ShaftTileEntity extends TileEntity implements ITickableTileEntity, IClientSyncbleTileEntity {
    public ShaftTileEntity() {
        super(ETTileEntityTypes.SHAFT);
    }

    public float rotation;

    @Override
    public void read(CompoundNBT tag) {
        super.read(tag);
        this.rotation = tag.getFloat("Rotation");

    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        super.write(tag);
        tag.putFloat("Rotation", this.rotation);
        return tag;
    }

    @Override
    public void tick() {

        if (!this.world.isRemote) {

            rotation += 1f;

            this.syncbleTick(this);
        }
    }

    @Override
    public CompoundNBT sendToClient(CompoundNBT tag) {
        tag.putFloat("Rotation", this.rotation);
        return tag;
    }

    @Override
    public void receiveToClient(CompoundNBT tag) {
        this.rotation = tag.getFloat("Rotation");
    }
}
