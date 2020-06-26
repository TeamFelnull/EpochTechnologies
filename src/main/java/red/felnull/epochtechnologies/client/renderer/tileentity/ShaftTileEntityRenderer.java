package red.felnull.epochtechnologies.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.item.ETItems;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;

public class ShaftTileEntityRenderer extends TileEntityRenderer<ShaftTileEntity> {

    public ShaftTileEntityRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);

    }

    @Override
    public void func_225616_a_(ShaftTileEntity tile, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buff, int light, int overlay) {
        ItemStack shaft = new ItemStack(ETBlocks.SHAFT);
        matrix.func_227860_a_();
        matrixTranslatef(matrix, 0.5f, 0.5f, 0.5f);
        matrixRotateDegreefZ(matrix, tile.rotation);
        matrixScalf(matrix, 2, 2, 2);

        Minecraft.getInstance().getItemRenderer().func_229110_a_(shaft,
                ItemCameraTransforms.TransformType.FIXED, light, overlay, matrix, buff);
        matrix.func_227865_b_();
    }

    public static void matrixRotateDegreefX(MatrixStack ms, float x) {
        ms.func_227863_a_(new Vector3f(1, 0, 0).func_229187_a_(x));
    }

    public static void matrixRotateDegreefY(MatrixStack ms, float y) {
        ms.func_227863_a_(new Vector3f(0, 1, 0).func_229187_a_(y));
    }

    public static void matrixRotateDegreefZ(MatrixStack ms, float z) {
        ms.func_227863_a_(new Vector3f(0, 0, 1).func_229187_a_(z));
    }

    public static void matrixScalf(MatrixStack ms, float x, float y, float z) {
        ms.func_227862_a_(x, y, z);
    }

    public static void matrixTranslatef(MatrixStack ms, float x, float y, float z) {
        ms.func_227861_a_(x, y, z);
    }

}
