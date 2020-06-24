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

    public static void registerTileEntityType(IForgeRegistry<TileEntityType<?>> r) {
        registryTileEntityType(r, ShaftTileEntity::new, SHAFT, "shaft", ETBlocks.SHAFT);
    }

    private static void registryTileEntityType(IForgeRegistry<TileEntityType<?>> r, Supplier<? extends TileEntity> factoryIn, TileEntityType<?> te, String name, Block... blocks) {
        te = TileEntityType.Builder.create(factoryIn, blocks).build(null).setRegistryName(new ResourceLocation(EpochTechnologies.MODID, name));
        r.register(te);
    }
}
