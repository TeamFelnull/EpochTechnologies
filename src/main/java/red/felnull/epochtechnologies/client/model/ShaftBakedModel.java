package red.felnull.epochtechnologies.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.data.IModelData;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class ShaftBakedModel implements IBakedModel {
    private IBakedModel tmodel;
    public ItemCameraTransforms.TransformType cameraTransformType;

    public ShaftBakedModel(IBakedModel motomodel) {
        this.tmodel = motomodel;
    }

    @Override
    public boolean isAmbientOcclusion() {

        return tmodel.isAmbientOcclusion();
    }

    @Override
    public boolean isGui3d() {

        return tmodel.isGui3d();
    }

    @Override
    public boolean func_230044_c_() {

        return tmodel.func_230044_c_();
    }

    @Override
    public boolean isBuiltInRenderer() {

        return true;
    }

    @Override
    public TextureAtlasSprite getParticleTexture() {

        return tmodel.getParticleTexture();
    }

    @Override
    public ItemOverrideList getOverrides() {

        return tmodel.getOverrides();
    }

    @Override
    public List<BakedQuad> getQuads(BlockState state, Direction side, Random rand) {

        return tmodel.getQuads(state, side, rand);
    }

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, @Nonnull Random rand,
                                    @Nonnull IModelData extraData) {

        return tmodel.getQuads(state, side, rand, extraData);
    }

    @Override
    public IBakedModel handlePerspective(ItemCameraTransforms.TransformType cameraTransformType, MatrixStack mat) {
        this.cameraTransformType = cameraTransformType;
        return net.minecraftforge.client.ForgeHooksClient.handlePerspective(getBakedModel(), cameraTransformType, mat);
    }

    public ResourceLocation getLocation() {
        return new ResourceLocation(EpochTechnologies.MODID, "item/" + ETBlocks.SHAFT.getRegistryName().getPath());
    }
}
