package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import red.felnull.epochtechnologies.block.SteamBoilerBlock;
import red.felnull.epochtechnologies.container.SteamBoilerContainer;
import red.felnull.epochtechnologies.storage.BoilerFluidTank;
import red.felnull.otyacraftengine.tileentity.IClientSyncbleTileEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SteamBoilerTileEntity extends LockableTileEntity implements ITickableTileEntity, IClientSyncbleTileEntity {
    public float doorAngle;

    private int numPlayersUsing;

    protected NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);


    private FluidTank tank1 = new BoilerFluidTank(0, 10000);
    private final LazyOptional<IFluidHandler> tank1c = LazyOptional.of(() -> tank1);

    private FluidTank tank2 = new BoilerFluidTank(1, 10000);
    private final LazyOptional<IFluidHandler> tank2c = LazyOptional.of(() -> tank2);

    public SteamBoilerTileEntity() {
        super(ETTileEntityTypes.STEAM_BOILER);
    }


    @Override
    public void func_230337_a_(BlockState state, CompoundNBT tag) {
        super.func_230337_a_(state, tag);

        this.tank1.readFromNBT(tag.getCompound("Tank1"));
        this.tank2.readFromNBT(tag.getCompound("Tank2"));

        this.doorAngle = tag.getFloat("DoorAngle");
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        super.write(tag);

        tag.put("Tank1", tank1.writeToNBT(new CompoundNBT()));
        tag.put("Tank2", tank2.writeToNBT(new CompoundNBT()));

        tag.putFloat("DoorAngle", this.doorAngle);
        return tag;
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.boiler");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new SteamBoilerContainer(id, player, this, this.getPos());
    }


    private void setOpenProperty(BlockState state, boolean opend) {
        this.world.setBlockState(this.getPos(), state.with(SteamBoilerBlock.OPEN, opend), 3);
    }


    @Override
    public void closeInventory(PlayerEntity player) {
        System.out.println("test");
    }

    @Override
    public void openInventory(PlayerEntity playerIn) {
        System.out.println("test");
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

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull final Capability<T> cap, final @Nullable Direction side) {

        if (side == Direction.UP) {
            if (cap == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
                return CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY.orEmpty(cap, tank2c);
            }
        } else if (side == this.getBlockState().get(HorizontalBlock.HORIZONTAL_FACING).rotateY().rotateY()) {
            if (cap == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
                return CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY.orEmpty(cap, tank1c);
            }
        }

        return super.getCapability(cap, side);
    }

    public NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return this.getItems().stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return this.getItems().get(i);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(this.items, index, count);
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(this.items, index);
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        ItemStack itemstack = this.items.get(index);
        boolean flag = !stack.isEmpty() && stack.isItemEqual(itemstack)
                && ItemStack.areItemStackTagsEqual(stack, itemstack);
        this.items.set(index, stack);
        if (stack.getCount() > this.getInventoryStackLimit()) {
            stack.setCount(this.getInventoryStackLimit());
        }
        if (flag)
            this.markDirty();
    }

    @Override
    public boolean isUsableByPlayer(PlayerEntity pl) {

        if (this.world.getTileEntity(this.pos) != this) {
            return false;
        } else {
            return pl.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D,
                    (double) this.pos.getZ() + 0.5D) <= 64.0D;
        }
    }

    @Override
    public void clear() {
        items.clear();
        tank1.setFluid(FluidStack.EMPTY);
        tank2.setFluid(FluidStack.EMPTY);
    }
}
