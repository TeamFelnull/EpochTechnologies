package red.felnull.epochtechnologies.registries;

import net.minecraft.util.ResourceLocation;
import red.felnull.epochtechnologies.world.worldgen.feature.orevein.OreVeins;

import java.util.HashMap;
import java.util.Map;

public class ETRegistries {
    public static Map<ResourceLocation, OreVeins> ORE_VEINS = new HashMap<ResourceLocation, OreVeins>();

    public static void registrierOreVein(ResourceLocation location, OreVeins vein) {
        ORE_VEINS.put(location, vein);
    }

}
