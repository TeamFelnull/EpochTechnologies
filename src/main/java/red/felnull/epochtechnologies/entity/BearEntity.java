package red.felnull.epochtechnologies.entity;


import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class BearEntity extends PolarBearEntity {

    public BearEntity(EntityType<? extends BearEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, SalmonEntity.class, 10, true, true, (Predicate) null));
    }

    @Override
    public AgeableEntity createChild(AgeableEntity p_90011_1_) {
        return (AgeableEntity) ETEntityTypes.BEAR.create(this.world);
    }
}
