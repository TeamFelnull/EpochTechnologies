package red.felnull.epochtechnologies.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import red.felnull.epochtechnologies.EpochTechnologies;
import red.felnull.epochtechnologies.tileentity.SteamBoilerTileEntity;
import red.felnull.otyacraftengine.client.util.RenderHelper;

public class SteamBoilerTileEntityRenderer extends TileEntityRenderer<SteamBoilerTileEntity> {

    public SteamBoilerTileEntityRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public void render(SteamBoilerTileEntity tile, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buff, int light, int overlay) {


        IVertexBuilder ivb = buff.getBuffer(RenderType.getSolid());

        IBakedModel door = RenderHelper.getBakedModel(new ResourceLocation(EpochTechnologies.MODID, "block/steam_boiler/door"));

        BlockState state = tile.getBlockState();
        Direction direction = state.get(HorizontalBlock.HORIZONTAL_FACING);
        float pix = 1f / 16f;

        RenderHelper.matrixPush(matrix);
        if (direction == Direction.WEST) {
            RenderHelper.matrixRotateDegreefY(matrix, 180);
            RenderHelper.matrixTranslatef(matrix, -1f, 0f, -1f);
        } else if (direction == Direction.NORTH) {
            RenderHelper.matrixRotateDegreefY(matrix, 90);
            RenderHelper.matrixTranslatef(matrix, -1f, 0f, 0f);
        } else if (direction == Direction.SOUTH) {
            RenderHelper.matrixRotateDegreefY(matrix, 270);
            RenderHelper.matrixTranslatef(matrix, 0f, 0f, -1f);
        }

        RenderHelper.matrixPush(matrix);
        RenderHelper.matrixRotateDegreefY(matrix, -90);
        RenderHelper.matrixTranslatef(matrix, 0f, 0f, -1f);
        RenderHelper.matrixTranslatef(matrix, pix * 4, pix * 0.5f, pix * 0);
        RenderHelper.matrixTranslatef(matrix, pix * 9, 0, pix * 0.5f);
        RenderHelper.matrixRotateDegreefY(matrix, -tile.doorAngle);
        RenderHelper.matrixTranslatef(matrix, pix * -9, 0, pix * -0.5f);
        RenderHelper.renderBlockBakedModel(door, matrix, ivb, overlay, tile);
        RenderHelper.matrixPop(matrix);


        RenderHelper.matrixPop(matrix);
    }
}
