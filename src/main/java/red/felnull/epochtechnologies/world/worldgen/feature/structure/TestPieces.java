package red.felnull.epochtechnologies.world.worldgen.feature.structure;

import net.minecraft.block.Blocks;
import net.minecraft.loot.LootTables;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class TestPieces {
    private static final ResourceLocation TEST_TOP = new ResourceLocation("igloo/top");

    public static void generateStarted(TemplateManager manager, BlockPos pos, Rotation rotation, List<StructurePiece> pieces, Random random) {
        pieces.add(new TestPieces.Piece(manager, TEST_TOP, pos, rotation, random));
    }

    public static class Piece extends TemplateStructurePiece {

        private final ResourceLocation location;
        private final Rotation rotation;

        public Piece(TemplateManager manager, ResourceLocation location, BlockPos pos, Rotation rotation, Random random) {
            super(ETStructures.TEST_PIECETYPE, 0);
            this.location = location;
            this.rotation = rotation;
            this.templatePosition=pos;
            temlerter(manager);
        }

        public Piece(TemplateManager manager, CompoundNBT tag) {
            super(ETStructures.TEST_PIECETYPE, tag);
            this.location = new ResourceLocation(tag.getString("Template"));
            this.rotation = Rotation.valueOf(tag.getString("Rot"));
            temlerter(manager);
        }

        @Override
        protected void readAdditional(CompoundNBT tag) {
            super.readAdditional(tag);
            tag.putString("Template", this.location.toString());
            tag.putString("Rot", this.rotation.name());
        }


        private void temlerter(TemplateManager manager) {
            Template template = manager.getTemplateDefaulted(this.location);
            PlacementSettings settings = (new PlacementSettings()).setRotation(this.rotation).setMirror(Mirror.NONE).addProcessor(BlockIgnoreStructureProcessor.AIR_AND_STRUCTURE_BLOCK);
            this.setup(template, this.templatePosition, settings);
        }

        @Override
        public boolean func_230383_a_(ISeedReader seedReader, StructureManager manager, ChunkGenerator generator, Random random, MutableBoundingBox boundingBox, ChunkPos chunkPos, BlockPos pos) {
            boundingBox.expandTo(this.template.getMutableBoundingBox(this.placeSettings, this.templatePosition));
            return super.func_230383_a_(seedReader, manager, generator, random, boundingBox, chunkPos, pos);
        }

        @Override
        protected void handleDataMarker(String st, BlockPos blockPos, IWorld iWorld, Random random, MutableBoundingBox mutableBoundingBox) {
            if ("chest".equals(st)) {
                iWorld.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                TileEntity che = iWorld.getTileEntity(blockPos.down());
                if (che instanceof ChestTileEntity) {
                    ((ChestTileEntity) che).setLootTable(LootTables.CHESTS_IGLOO_CHEST, random.nextLong());
                }
            }
        }
    }
}
