package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import red.felnull.epochtechnologies.block.SteamBoilerBlock;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

public class SteamBoilerTileEntity extends TileEntity implements ITickableTileEntity, IClientSyncbleTileEntity {
    public float doorAngle;

    public SteamBoilerTileEntity() {
        super(ETTileEntityTypes.STEAM_BOILER);
    }


    public SteamBoilerTileEntity getUnder() {

        if (!(world.getTileEntity(getPos().down()) instanceof SteamBoilerTileEntity))
            return null;

        return (SteamBoilerTileEntity) world.getTileEntity(getPos().down());
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT tag) {
        super.func_230337_a_(state, tag);


        this.doorAngle = tag.getFloat("DoorAngle");
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        super.write(tag);


        tag.putFloat("DoorAngle", this.doorAngle);
        return tag;
    }

    @Override
    public void tick() {


        BlockState state = getBlockState();
        if (!world.isRemote) {
            if (state.get(SteamBoilerBlock.OPEN)) {
                if (this.doorAngle < 40) {
                    this.doorAngle += 4;
                }
            } else {
                if (this.doorAngle > 0) {
                    this.doorAngle -= 4;
                }
            }
        }

        this.syncble(this);
    }
}
