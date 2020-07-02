package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

public class SteamEngineTileEntity extends TileEntity implements ITickableTileEntity, IClientSyncbleTileEntity {

    private float rotationAngle;
    private float speed;

    public SteamEngineTileEntity() {
        super(ETTileEntityTypes.STEAM_ENGINE);
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT tag) {
        super.func_230337_a_(state, tag);
        this.rotationAngle = tag.getFloat("RotationAngle");
        this.speed = tag.getFloat("Speed");

    }

    public float getRotationAngle() {
        return rotationAngle;
    }

    public float getSpeed() {
        return speed;
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        super.write(tag);
        tag.putFloat("RotationAngle", this.rotationAngle);
        tag.putFloat("Speed", this.speed);
        return tag;
    }

    @Override
    public void tick() {

        if (!this.world.isRemote) {

            speed = 80;

            rotationAngle += speed;

            while (rotationAngle > 360) {
                rotationAngle -= 360;
            }

        }

        this.syncble(this);
    }
}
