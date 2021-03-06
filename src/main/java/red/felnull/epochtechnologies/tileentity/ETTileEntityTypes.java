package red.felnull.epochtechnologies.tileentity;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.block.ETBlocks;

import java.util.function.Supplier;

public class ETTileEntityTypes {

    @ObjectHolder(EpochTechnologies.MODID + ":" + "shaft")
    public static TileEntityType<ShaftTileEntity> SHAFT;

    @ObjectHolder(EpochTechnologies.MODID + ":" + "steam_engine")
    public static TileEntityType<SteamEngineTileEntity> STEAM_ENGINE;

    @ObjectHolder(EpochTechnologies.MODID + ":" + "steam_boiler")
    public static TileEntityType<SteamBoilerTileEntity> STEAM_BOILER;

    public static void registerTileEntityType(IForgeRegistry<TileEntityType<?>> r) {
        registryTileEntityType(r, ShaftTileEntity::new, SHAFT, "shaft", ETBlocks.SHAFT);
        registryTileEntityType(r, SteamEngineTileEntity::new, STEAM_ENGINE, "steam_engine", ETBlocks.STEAM_ENGINE);
        registryTileEntityType(r, SteamBoilerTileEntity::new, STEAM_BOILER, "steam_boiler", ETBlocks.STEAM_BOILER);
    }

    private static void registryTileEntityType(IForgeRegistry<TileEntityType<?>> r, Supplier<? extends TileEntity> factoryIn, TileEntityType<?> te, String name, Block... blocks) {
        te = TileEntityType.Builder.create(factoryIn, blocks).build(null).setRegistryName(new ResourceLocation(EpochTechnologies.MODID, name));
        r.register(te);
    }
}
