package red.felnull.epochtechnologies.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;

public class ShaftTileEntityRenderer extends TileEntityRenderer<ShaftTileEntity> {
    private final ModelRenderer TEST;
    public static Material material = new Material(AtlasTexture.LOCATION_BLOCKS_TEXTURE,
            new ResourceLocation(EpochTechnologies.MODID, "block/black_metal"));

    public ShaftTileEntityRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
        TEST = new ModelRenderer(64, 64, 0, 0);
        TEST.func_228301_a_(-1.0f, -1.0f, 0.0F, 2.0f, 2.0f, 16.0F, 0.0F);
        TEST.setRotationPoint(8, 8, 0);
    }

    @Override
    public void func_225616_a_(ShaftTileEntity tile, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buff, int light, int overlay) {
        IVertexBuilder ivertexbuilder = material.func_229311_a_(buff, RenderType::func_228634_a_);
        matrix.func_227860_a_();
        TEST.rotateAngleZ = tile.rotation;
        TEST.func_228308_a_(matrix, ivertexbuilder, light, overlay);
        matrix.func_227865_b_();
    }

}
