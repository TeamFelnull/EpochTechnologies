package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

public class SteamEngineTileEntity extends TileEntity implements ITickableTileEntity, IClientSyncbleTileEntity {

    private float rotationAngle;

    public SteamEngineTileEntity() {
        super(ETTileEntityTypes.STEAM_ENGINE);
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT tag) {
        super.func_230337_a_(state, tag);
        this.rotationAngle = tag.getFloat("RotationAngle");

    }

    public float getRotationAngle() {
        return rotationAngle;
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        super.write(tag);
        tag.putFloat("RotationAngle", this.rotationAngle);
        return tag;
    }

    @Override
    public void tick() {

        if (!this.world.isRemote) {
            rotationAngle += 75;

            while (rotationAngle > 360) {
                rotationAngle -= 360;
            }

        }

        this.syncble(this);
    }
}
