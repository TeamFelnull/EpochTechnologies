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
import red.felnull.epochtechnologies.tileentity.SteamEngineTileEntity;
import red.felnull.otyacraftengine.client.util.RenderHelper;
import red.felnull.otyacraftengine.util.IkisugiMath;

public class SteamEngineTileEntityRenderer extends TileEntityRenderer<SteamEngineTileEntity> {
    public SteamEngineTileEntityRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
    }

    public static int lastTick;
    public static int current;


    @Override
    public void render(SteamEngineTileEntity tile, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buff, int light, int overlay) {

        IVertexBuilder ivb = buff.getBuffer(RenderType.getSolid());

        IBakedModel flywheel = RenderHelper.getBakedModel(new ResourceLocation(EpochTechnologies.MODID, "block/steam_engine/flywheel"));
        IBakedModel piston_up = RenderHelper.getBakedModel(new ResourceLocation(EpochTechnologies.MODID, "block/steam_engine/piston_up"));
        IBakedModel piston_dwon = RenderHelper.getBakedModel(new ResourceLocation(EpochTechnologies.MODID, "block/steam_engine/piston_dwon"));
        IBakedModel joint = RenderHelper.getBakedModel(new ResourceLocation(EpochTechnologies.MODID, "block/steam_engine/joint"));

        BlockState state = tile.getBlockState();
        Direction direction = state.get(HorizontalBlock.HORIZONTAL_FACING);
        float pix = 1f / 16f;

        float rotationPar = tile.getRotationAngle() / 360f;
        float pistonPar = IkisugiMath.positiveFloat(1f - rotationPar * 2);

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
        RenderHelper.matrixTranslatef(matrix, 0.5f, 0.5f, 0.5f);
        RenderHelper.matrixRotateDegreefX(matrix, tile.getRotationAngle());
        RenderHelper.matrixTranslatef(matrix, -0.5f, -0.5f, -0.5f);
        RenderHelper.matrixTranslatef(matrix, 0, pix * 7.5f, pix * 7.5f);
        RenderHelper.renderBlockBakedModel(joint, matrix, ivb, overlay, tile);
        RenderHelper.matrixPop(matrix);

        RenderHelper.matrixPush(matrix);
        RenderHelper.matrixRotateDegreefY(matrix, -90);
        RenderHelper.matrixTranslatef(matrix, 0f, 0f, -1f);
        RenderHelper.matrixTranslatef(matrix, pix * 6, pix * 1, pix * (9 - 6 * pistonPar));
        RenderHelper.renderBlockBakedModel(piston_dwon, matrix, ivb, overlay, tile);
        RenderHelper.matrixPop(matrix);

        RenderHelper.matrixPush(matrix);
        RenderHelper.matrixRotateDegreefY(matrix, -90);
        RenderHelper.matrixTranslatef(matrix, 0f, 0f, -1f);
        RenderHelper.matrixTranslatef(matrix, pix * 8, pix * 10, pix * (3 + 6 * pistonPar));
        RenderHelper.renderBlockBakedModel(piston_up, matrix, ivb, overlay, tile);
        RenderHelper.matrixPop(matrix);

        RenderHelper.matrixPush(matrix);
        RenderHelper.matrixTranslatef(matrix, 0.5f, 0.5f, 0.5f);
        RenderHelper.matrixRotateDegreefX(matrix, 90);
        RenderHelper.matrixRotateDegreefY(matrix, tile.getRotationAngle());
        RenderHelper.matrixTranslatef(matrix, -0.5f, -0.5f, -0.5f);
        RenderHelper.matrixTranslatef(matrix, 0, pix * 2, 0);
        RenderHelper.renderBlockBakedModel(flywheel, matrix, ivb, overlay, tile);
        RenderHelper.matrixPop(matrix);

        RenderHelper.matrixPop(matrix);


    }


}
