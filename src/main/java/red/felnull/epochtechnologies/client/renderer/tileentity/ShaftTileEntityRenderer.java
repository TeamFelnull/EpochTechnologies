package red.felnull.epochtechnologies.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import red.felnull.epochtechnologies.block.ETBlocks;
import red.felnull.epochtechnologies.block.ShaftBlock;
import red.felnull.epochtechnologies.tileentity.ShaftTileEntity;
import red.felnull.otyacraftengine.client.util.RenderHelper;

public class ShaftTileEntityRenderer extends TileEntityRenderer<ShaftTileEntity> {

    public ShaftTileEntityRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);

    }

    @Override
    public void render(ShaftTileEntity tile, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buff, int light, int overlay) {
        ItemStack shaft = new ItemStack(ETBlocks.SHAFT);
        BlockState state = tile.getBlockState();
        Direction.Axis axis = state.get(ShaftBlock.AXIS);

        RenderHelper.matrixPush(matrix);
        RenderHelper.matrixTranslatef(matrix, 0.5f, 0.5f, 0.5f);

        if (axis == Direction.Axis.Y) {
            RenderHelper.matrixRotateDegreefX(matrix, 90);
        } else if (axis == Direction.Axis.X) {
            RenderHelper.matrixRotateDegreefY(matrix, 90);
        }

        RenderHelper.matrixRotateDegreefZ(matrix, tile.getRotationAngle());
        RenderHelper.matrixScalf(matrix, 2);
        Minecraft.getInstance().getItemRenderer().renderItem(shaft, ItemCameraTransforms.TransformType.FIXED, light, overlay, matrix, buff);
        RenderHelper.matrixPop(matrix);
    }
}
