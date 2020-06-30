package red.felnull.epochtechnologies.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.registries.IForgeRegistry;
import red.felnull.epochtechnologies.EpochTechnologies;

public class ETEntityTypes {

    public static final EntityType<BearEntity> BEAR = EntityType.Builder.<BearEntity>create(BearEntity::new, EntityClassification.CREATURE).size(1.4F, 1.4F).func_233606_a_(10).build(EpochTechnologies.MODID + ":bear");

    public static void registerEntity(IForgeRegistry<EntityType<?>> r) {
        GlobalEntityTypeAttributes.put(BEAR, BearEntity.func_234219_eI_().func_233813_a_());
        r.register(BEAR.setRegistryName(EpochTechnologies.MODID, "bear"));
    }
}
