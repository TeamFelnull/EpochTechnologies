package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

public class ShaftTileEntity extends TileEntity implements ITickableTileEntity, IClientSyncbleTileEntity {
    public float rotation;

    public ShaftTileEntity() {
        super(ETTileEntityTypes.SHAFT);
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT tag) {
        super.func_230337_a_(state, tag);
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
        }

        this.syncble(this);
    }

}
