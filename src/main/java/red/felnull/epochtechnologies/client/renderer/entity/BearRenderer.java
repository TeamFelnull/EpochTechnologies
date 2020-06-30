package red.felnull.epochtechnologies.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.PolarBearRenderer;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.util.ResourceLocation;
import red.felnull.epochtechnologies.EpochTechnologies;

public class BearRenderer extends PolarBearRenderer {
    private static final ResourceLocation BEAR_TEXTURE = new ResourceLocation(EpochTechnologies.MODID, "textures/entity/bear/bear.png");

    public BearRenderer(EntityRendererManager p_i47197_1_) {
        super(p_i47197_1_);
    }

    @Override
    public ResourceLocation getEntityTexture(PolarBearEntity p_110775_1_) {
        return BEAR_TEXTURE;
    }

}
