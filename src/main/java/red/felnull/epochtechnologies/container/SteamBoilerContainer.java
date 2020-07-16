package red.felnull.epochtechnologies.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.math.BlockPos;

public class SteamBoilerContainer extends Container {
    public IInventory inventory;
    public BlockPos pos;

    public SteamBoilerContainer(int windowId, PlayerInventory playerInventory, IInventory inventory, BlockPos pos) {
        super(ETContainerTypes.STEAM_BOILER, windowId);
        this.inventory = inventory;
        this.pos = pos;
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return inventory.isUsableByPlayer(playerIn);
    }
}
