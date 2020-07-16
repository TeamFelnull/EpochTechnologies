package red.felnull.epochtechnologies.container;

import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETContainerTypes {
    @ObjectHolder(EpochTechnologies.MODID + ":" + "steam_boiler")
    public static ContainerType<SteamBoilerContainer> STEAM_BOILER;

    public static void registerContainerType(IForgeRegistry<ContainerType<?>> r) {
        STEAM_BOILER = (ContainerType<SteamBoilerContainer>) IForgeContainerType.create((windowId, inv, data) -> {
            return new SteamBoilerContainer(windowId, inv, new Inventory(3), data.readBlockPos());
        }).setRegistryName(new ResourceLocation(EpochTechnologies.MODID, "steam_boiler"));
        r.register(STEAM_BOILER);
    }
}
