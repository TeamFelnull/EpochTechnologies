package red.felnull.epochtechnologies.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.util.math.BlockPos;

public class SteamBoilerContainer extends Container {
    public IInventory inventory;
    public BlockPos pos;

    public SteamBoilerContainer(int windowId, PlayerInventory playerInventory, IInventory inventory, BlockPos pos) {
        super(ETContainerTypes.STEAM_BOILER, windowId);
        this.inventory = inventory;
        inventory.openInventory(playerInventory.player);
        this.pos = pos;
        this.addSlot(new Slot(inventory, 0, 81, 53));
        this.addSlot(new Slot(inventory, 1, 28, 17));
        this.addSlot(new Slot(inventory, 2, 135, 17));


        for (int k = 0; k < 3; ++k) {
            for (int i1 = 0; i1 < 9; ++i1) {
                this.addSlot(new Slot(playerInventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
            }
        }

        for (int l = 0; l < 9; ++l) {
            this.addSlot(new Slot(playerInventory, l, 8 + l * 18, 142));
        }

    }

    @Override
    public void onContainerClosed(PlayerEntity p_75134_1_) {
        super.onContainerClosed(p_75134_1_);
        this.inventory.closeInventory(p_75134_1_);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return inventory.isUsableByPlayer(playerIn);
    }
}
