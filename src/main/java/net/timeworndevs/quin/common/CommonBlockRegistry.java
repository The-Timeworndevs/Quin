package net.timeworndevs.quin.common;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.timeworndevs.quin.block.PicketFenceBlock;
import net.timeworndevs.quin.block.TreeTapBlock;
import net.timeworndevs.quin.init.QuinRegistry;

public class CommonBlockRegistry {

    public static Block RESIN_BLOCK;
    public static TreeTapBlock TREE_TAP;

    public static Block OAK_PICKET_FENCE;
    public static Block SPRUCE_PICKET_FENCE;

    //driftwood, again...
    public static Block DRIFTWOOD_LOG;
    public static Block DRIFTWOOD;
    public static Block DRIFTWOOD_PLANKS;
    public static Block DRIFTWOOD_STAIRS;
    public static Block DRIFTWOOD_SLAB;
    public static Block DRIFTWOOD_FENCE;
    public static Block DRIFTWOOD_FENCE_GATE;
    //public static Block DRIFTWOOD_PICKET_FENCE;
    public static Block DRIFTWOOD_DOOR;
    public static Block DRIFTWOOD_TRAPDOOR;
    public static Block DRIFTWOOD_PRESSURE_PLATE;
    public static Block DRIFTWOOD_BUTTON;

    public static Block ROPE;

    public static Block TINTED_CRYSTAL;
    public static Block BLAST_CRYSTAL;
    public static Block WHITE_CRYSTAL;
    public static Block LIGHT_GRAY_CRYSTAL;
    public static Block GRAY_CRYSTAL;
    public static Block BLACK_CRYSTAL;
    public static Block BROWN_CRYSTAL;
    public static Block RED_CRYSTAL;
    public static Block ORANGE_CRYSTAL;
    public static Block YELLOW_CRYSTAL;
    public static Block LIME_CRYSTAL;
    public static Block GREEN_CRYSTAL;
    public static Block CYAN_CRYSTAL;
    public static Block LIGHT_BLUE_CRYSTAL;
    public static Block BLUE_CRYSTAL;
    public static Block PURPLE_CRYSTAL;
    public static Block MAGENTA_CRYSTAL;
    public static Block PINK_CRYSTAL;

    public static Block BLAST_CRYSTAL_PANE;
    public static Block WHITE_CRYSTAL_PANE;
    public static Block LIGHT_GRAY_CRYSTAL_PANE;
    public static Block GRAY_CRYSTAL_PANE;
    public static Block BLACK_CRYSTAL_PANE;
    public static Block BROWN_CRYSTAL_PANE;
    public static Block RED_CRYSTAL_PANE;
    public static Block ORANGE_CRYSTAL_PANE;
    public static Block YELLOW_CRYSTAL_PANE;
    public static Block LIME_CRYSTAL_PANE;
    public static Block GREEN_CRYSTAL_PANE;
    public static Block CYAN_CRYSTAL_PANE;
    public static Block LIGHT_BLUE_CRYSTAL_PANE;
    public static Block BLUE_CRYSTAL_PANE;
    public static Block PURPLE_CRYSTAL_PANE;
    public static Block MAGENTA_CRYSTAL_PANE;
    public static Block PINK_CRYSTAL_PANE;

    public static Block BLAST_GLASS;
    public static Block BLAST_GLASS_PANE;

    public static Block IRON_BUTTON;
    public static Block GOLD_BUTTON;

    public static Block OXIDIZED_COPPER_BUTTON;
    public static Block WEATHERED_COPPER_BUTTON;
    public static Block EXPOSED_COPPER_BUTTON;
    public static Block COPPER_BUTTON;

    public static Block OXIDIZED_COPPER_PANEL;
    public static Block WEATHERED_COPPER_PANEL;
    public static Block EXPOSED_COPPER_PANEL;
    public static Block COPPER_PANEL;

    public static Block WAXED_OXIDIZED_COPPER_PANEL;
    public static Block WAXED_WEATHERED_COPPER_PANEL;
    public static Block WAXED_EXPOSED_COPPER_PANEL;
    public static Block WAXED_COPPER_PANEL;

    public static Block OXIDIZED_COPPER_PANEL_STAIRS;
    public static Block WEATHERED_COPPER_PANEL_STAIRS;
    public static Block EXPOSED_COPPER_PANEL_STAIRS;
    public static Block COPPER_PANEL_STAIRS;
    public static Block WAXED_OXIDIZED_COPPER_PANEL_STAIRS;
    public static Block WAXED_WEATHERED_COPPER_PANEL_STAIRS;
    public static Block WAXED_EXPOSED_COPPER_PANEL_STAIRS;
    public static Block WAXED_COPPER_PANEL_STAIRS;

    public static Block OXIDIZED_COPPER_PANEL_SLAB;
    public static Block WEATHERED_COPPER_PANEL_SLAB;
    public static Block EXPOSED_COPPER_PANEL_SLAB;
    public static Block COPPER_PANEL_SLAB;
    public static Block WAXED_OXIDIZED_COPPER_PANEL_SLAB;
    public static Block WAXED_WEATHERED_COPPER_PANEL_SLAB;
    public static Block WAXED_EXPOSED_COPPER_PANEL_SLAB;
    public static Block WAXED_COPPER_PANEL_SLAB;

    public static Block CRACKED_RED_NETHER_BRICKS;
    public static Block CHISELED_RED_NETHER_BRICKS;
    public static Block RED_NETHER_BRICK_FENCE;

    public static Block CRACKED_TEAL_NETHER_BRICKS;
    public static Block CHISELED_TEAL_NETHER_BRICKS;
    public static Block TEAL_NETHER_BRICK_FENCE;
    public static Block TEAL_NETHER_BRICKS;
    public static Block TEAL_NETHER_BRICK_STAIRS;
    public static Block TEAL_NETHER_BRICK_SLAB;
    public static Block TEAL_NETHER_BRICK_WALL;

    public static Block CRACKED_BROWN_NETHER_BRICKS;
    public static Block CHISELED_BROWN_NETHER_BRICKS;
    public static Block BROWN_NETHER_BRICK_FENCE;
    public static Block BROWN_NETHER_BRICKS;
    public static Block BROWN_NETHER_BRICK_STAIRS;
    public static Block BROWN_NETHER_BRICK_SLAB;
    public static Block BROWN_NETHER_BRICK_WALL;

    //public static TerraformSignBlock DRIFTWOOD_SIGN;
    //public static TerraformWallSignBlock DRIFTWOOD_WALL_SIGN;
    //public static TerraformHangingSignBlock DRIFTWOOD_HANGING_SIGN;
    //public static TerraformWallHangingSignBlock DRIFTWOOD_WALL_HANGING_SIGN;

    public static void register() {
        RESIN_BLOCK = QuinRegistry.register("resin_block", new Block(FabricBlockSettings.of().mapColor(MapColor.COLOR_BROWN).strength(0).sounds(SoundType.PACKED_MUD)));
        TREE_TAP = QuinRegistry.register("tree_tap", new TreeTapBlock(FabricBlockSettings.of().mapColor(MapColor.WOOD).strength(2,3).sounds(SoundType.WOOD).requiresTool()));

        OAK_PICKET_FENCE = QuinRegistry.register("oak_picket_fence", new PicketFenceBlock(FabricBlockSettings.of().mapColor(MapColor.WOOD).sounds(SoundType.WOOD).strength(2.0F)));
        SPRUCE_PICKET_FENCE = QuinRegistry.register("spruce_picket_fence", new PicketFenceBlock(FabricBlockSettings.of().mapColor(MapColor.WOOD).sounds(SoundType.WOOD).strength(2.0F)));

        DRIFTWOOD_LOG = QuinRegistry.register("driftwood_log", new RotatedPillarBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F)));
        DRIFTWOOD = QuinRegistry.register("driftwood", new RotatedPillarBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F)));
        DRIFTWOOD_PLANKS = QuinRegistry.register("driftwood_planks", new Block(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_STAIRS = QuinRegistry.register("driftwood_stairs", new StairBlock(DRIFTWOOD_PLANKS.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_SLAB = QuinRegistry.register("driftwood_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_FENCE = QuinRegistry.register("driftwood_fence", new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_FENCE_GATE = QuinRegistry.register("driftwood_fence_gate", new FenceGateBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(2.0F, 3.0F), WoodType.CRIMSON));
        DRIFTWOOD_DOOR = QuinRegistry.register("driftwood_door", new DoorBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(3.0F), BlockSetType.CRIMSON));
        DRIFTWOOD_TRAPDOOR = QuinRegistry.register("driftwood_trapdoor", new TrapDoorBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(3.0F), BlockSetType.CRIMSON));
        DRIFTWOOD_PRESSURE_PLATE = QuinRegistry.register("driftwood_pressure_plate", new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).strength(0.5F).pistonBehavior(PushReaction.DESTROY),BlockSetType.CRIMSON));
        DRIFTWOOD_BUTTON = QuinRegistry.register("driftwood_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_WHITE).sounds(SoundType.NETHER_WOOD).pistonBehavior(PushReaction.DESTROY).noCollision(), BlockSetType.CRIMSON, 30, true));

        //final Identifier DRIFTWOOD_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/driftwood_sign");
        //DRIFTWOOD_SIGN = QuinRegistry.register("driftwood_sign", new TerraformSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision()));
        //DRIFTWOOD_WALL_SIGN = QuinRegistry.register("driftwood_Wall_sign", new TerraformWallSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_SIGN)));
        //final Identifier DRIFTWOOD_HANGING_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/hanging/driftwood");
        //final Identifier DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE = Identifier.of(QuinMain.MODID, "textures/gui/hanging_signs/driftwood");
        //DRIFTWOOD_HANGING_SIGN = QuinRegistry.register("driftwood_hanging_sign", new TerraformHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision()));
        //DRIFTWOOD_WALL_HANGING_SIGN = QuinRegistry.register("driftwood_wall_hanging_sign", new TerraformWallHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_HANGING_SIGN)));

        ROPE = QuinRegistry.register("rope", new ChainBlock(FabricBlockSettings.of().mapColor(MapColor.WOOD).sounds(SoundType.WOOL).noCollision()));

        TINTED_CRYSTAL = QuinRegistry.register("tinted_crystal", new TintedGlassBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_GRAY).nonOpaque().strength(0.3F).sounds(SoundType.GLASS)));
        BLAST_CRYSTAL = QuinRegistry.register("blast_crystal", new GlassBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_BLACK).nonOpaque().strength(50,1200).sounds(SoundType.GLASS).requiresTool().pistonBehavior(PushReaction.BLOCK)));
        WHITE_CRYSTAL = QuinRegistry.register("white_crystal", new StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.of().mapColor(MapColor.SNOW).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        LIGHT_GRAY_CRYSTAL = QuinRegistry.register("light_gray_crystal", new StainedGlassBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.of().mapColor(MapColor.COLOR_LIGHT_GRAY).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        GRAY_CRYSTAL = QuinRegistry.register("gray_crystal", new StainedGlassBlock(DyeColor.GRAY, FabricBlockSettings.of().mapColor(MapColor.COLOR_GRAY).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        BLACK_CRYSTAL = QuinRegistry.register("black_crystal", new StainedGlassBlock(DyeColor.BLACK, FabricBlockSettings.of().mapColor(MapColor.COLOR_BLACK).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        BROWN_CRYSTAL = QuinRegistry.register("brown_crystal", new StainedGlassBlock(DyeColor.BROWN, FabricBlockSettings.of().mapColor(MapColor.COLOR_BROWN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        RED_CRYSTAL = QuinRegistry.register("red_crystal", new StainedGlassBlock(DyeColor.RED, FabricBlockSettings.of().mapColor(MapColor.COLOR_RED).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        ORANGE_CRYSTAL = QuinRegistry.register("orange_crystal", new StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        YELLOW_CRYSTAL = QuinRegistry.register("yellow_crystal", new StainedGlassBlock(DyeColor.YELLOW, FabricBlockSettings.of().mapColor(MapColor.COLOR_YELLOW).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        LIME_CRYSTAL = QuinRegistry.register("lime_crystal", new StainedGlassBlock(DyeColor.LIME, FabricBlockSettings.of().mapColor(MapColor.COLOR_LIGHT_GREEN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        GREEN_CRYSTAL = QuinRegistry.register("green_crystal", new StainedGlassBlock(DyeColor.GREEN, FabricBlockSettings.of().mapColor(MapColor.COLOR_GREEN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        CYAN_CRYSTAL = QuinRegistry.register("cyan_crystal", new StainedGlassBlock(DyeColor.CYAN, FabricBlockSettings.of().mapColor(MapColor.COLOR_CYAN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        LIGHT_BLUE_CRYSTAL = QuinRegistry.register("light_blue_crystal", new StainedGlassBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.of().mapColor(MapColor.COLOR_LIGHT_BLUE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        BLUE_CRYSTAL = QuinRegistry.register("blue_crystal", new StainedGlassBlock(DyeColor.BLUE, FabricBlockSettings.of().mapColor(MapColor.COLOR_BLUE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        PURPLE_CRYSTAL = QuinRegistry.register("purple_crystal", new StainedGlassBlock(DyeColor.PURPLE, FabricBlockSettings.of().mapColor(MapColor.COLOR_PURPLE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        MAGENTA_CRYSTAL = QuinRegistry.register("magenta_crystal", new StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.of().mapColor(MapColor.COLOR_MAGENTA).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        PINK_CRYSTAL = QuinRegistry.register("pink_crystal", new StainedGlassBlock(DyeColor.PINK, FabricBlockSettings.of().mapColor(MapColor.COLOR_PINK).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));


        BLAST_CRYSTAL_PANE = QuinRegistry.register("blast_crystal_pane", new IronBarsBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_BLACK).nonOpaque().strength(50,1200).sounds(SoundType.GLASS).requiresTool().pistonBehavior(PushReaction.BLOCK)));
        WHITE_CRYSTAL_PANE = QuinRegistry.register("white_crystal_pane", new StainedGlassPaneBlock(DyeColor.WHITE, FabricBlockSettings.of().mapColor(MapColor.SNOW).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        LIGHT_GRAY_CRYSTAL_PANE = QuinRegistry.register("light_gray_crystal_pane", new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        GRAY_CRYSTAL_PANE = QuinRegistry.register("gray_crystal_pane", new StainedGlassPaneBlock(DyeColor.GRAY, FabricBlockSettings.of().mapColor(MapColor.COLOR_GRAY).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        BLACK_CRYSTAL_PANE = QuinRegistry.register("black_crystal_pane", new StainedGlassPaneBlock(DyeColor.BLACK, FabricBlockSettings.of().mapColor(MapColor.COLOR_BLACK).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        BROWN_CRYSTAL_PANE = QuinRegistry.register("brown_crystal_pane", new StainedGlassPaneBlock(DyeColor.BROWN, FabricBlockSettings.of().mapColor(MapColor.COLOR_BROWN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        RED_CRYSTAL_PANE = QuinRegistry.register("red_crystal_pane", new StainedGlassPaneBlock(DyeColor.RED, FabricBlockSettings.of().mapColor(MapColor.COLOR_RED).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        ORANGE_CRYSTAL_PANE = QuinRegistry.register("orange_crystal_pane", new StainedGlassPaneBlock(DyeColor.ORANGE, FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        YELLOW_CRYSTAL_PANE = QuinRegistry.register("yellow_crystal_pane", new StainedGlassPaneBlock(DyeColor.YELLOW, FabricBlockSettings.of().mapColor(MapColor.COLOR_YELLOW).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        LIME_CRYSTAL_PANE = QuinRegistry.register("lime_crystal_pane", new StainedGlassPaneBlock(DyeColor.LIME, FabricBlockSettings.of().mapColor(MapColor.COLOR_LIGHT_GREEN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        GREEN_CRYSTAL_PANE = QuinRegistry.register("green_crystal_pane", new StainedGlassPaneBlock(DyeColor.GREEN, FabricBlockSettings.of().mapColor(MapColor.COLOR_GREEN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        CYAN_CRYSTAL_PANE = QuinRegistry.register("cyan_crystal_pane", new StainedGlassPaneBlock(DyeColor.CYAN, FabricBlockSettings.of().mapColor(MapColor.COLOR_CYAN).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        LIGHT_BLUE_CRYSTAL_PANE = QuinRegistry.register("light_blue_crystal_pane", new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.of().mapColor(MapColor.COLOR_LIGHT_BLUE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        BLUE_CRYSTAL_PANE = QuinRegistry.register("blue_crystal_pane", new StainedGlassPaneBlock(DyeColor.BLUE, FabricBlockSettings.of().mapColor(MapColor.COLOR_BLUE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        PURPLE_CRYSTAL_PANE = QuinRegistry.register("purple_crystal_pane", new StainedGlassPaneBlock(DyeColor.PURPLE, FabricBlockSettings.of().mapColor(MapColor.COLOR_PURPLE).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        MAGENTA_CRYSTAL_PANE = QuinRegistry.register("magenta_crystal_pane", new StainedGlassPaneBlock(DyeColor.MAGENTA, FabricBlockSettings.of().mapColor(MapColor.COLOR_MAGENTA).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));
        PINK_CRYSTAL_PANE = QuinRegistry.register("pink_crystal_pane", new StainedGlassPaneBlock(DyeColor.PINK, FabricBlockSettings.of().mapColor(MapColor.COLOR_PINK).nonOpaque().strength(0.3F).sounds(SoundType.GLASS).requiresTool()));

        BLAST_GLASS = QuinRegistry.register("blast_glass", new GlassBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_BLACK).nonOpaque().strength(50,1200).sounds(SoundType.GLASS).requiresTool().pistonBehavior(PushReaction.BLOCK)));
        BLAST_GLASS_PANE = QuinRegistry.register("blast_glass_pane", new IronBarsBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_BLACK).nonOpaque().strength(50,1200).sounds(SoundType.GLASS).requiresTool().pistonBehavior(PushReaction.BLOCK)));



        IRON_BUTTON = QuinRegistry.register("iron_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.GOLD).pistonBehavior(PushReaction.DESTROY).sounds(SoundType.METAL).noCollision(), BlockSetType.STONE, 40, false));
        GOLD_BUTTON = QuinRegistry.register("gold_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.SNOW).pistonBehavior(PushReaction.DESTROY).sounds(SoundType.METAL).noCollision(), BlockSetType.STONE, 5, false));

        OXIDIZED_COPPER_BUTTON = QuinRegistry.register("oxidized_copper_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).pistonBehavior(PushReaction.DESTROY).sounds(SoundType.COPPER).noCollision(), BlockSetType.STONE, 10, false));
        WEATHERED_COPPER_BUTTON = QuinRegistry.register("weathered_copper_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).pistonBehavior(PushReaction.DESTROY).sounds(SoundType.COPPER).noCollision(), BlockSetType.STONE, 10, false));
        EXPOSED_COPPER_BUTTON = QuinRegistry.register("exposed_copper_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).pistonBehavior(PushReaction.DESTROY).sounds(SoundType.COPPER).noCollision(), BlockSetType.STONE, 10, false));
        COPPER_BUTTON = QuinRegistry.register("copper_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).pistonBehavior(PushReaction.DESTROY).sounds(SoundType.COPPER).noCollision(), BlockSetType.STONE, 10, false));

        OXIDIZED_COPPER_PANEL = QuinRegistry.register("oxidized_copper_panel", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WEATHERED_COPPER_PANEL = QuinRegistry.register("weathered_copper_panel", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        EXPOSED_COPPER_PANEL = QuinRegistry.register("exposed_copper_panel", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        COPPER_PANEL = QuinRegistry.register("copper_panel", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_OXIDIZED_COPPER_PANEL = QuinRegistry.register("waxed_oxidized_copper_panel", new Block(FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_WEATHERED_COPPER_PANEL = QuinRegistry.register("waxed_weathered_copper_panel", new Block(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_EXPOSED_COPPER_PANEL = QuinRegistry.register("waxed_exposed_copper_panel", new Block(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_COPPER_PANEL = QuinRegistry.register("waxed_copper_panel", new Block(FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));

        OXIDIZED_COPPER_PANEL_STAIRS = QuinRegistry.register("oxidized_copper_panel_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WEATHERED_COPPER_PANEL_STAIRS = QuinRegistry.register("weathered_copper_panel_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        EXPOSED_COPPER_PANEL_STAIRS = QuinRegistry.register("exposed_copper_panel_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        COPPER_PANEL_STAIRS = QuinRegistry.register("copper_panel_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_OXIDIZED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_oxidized_copper_panel_stairs", new StairBlock(WAXED_OXIDIZED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_WEATHERED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_weathered_copper_panel_stairs", new StairBlock(WAXED_WEATHERED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_EXPOSED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_exposed_copper_panel_stairs", new StairBlock(WAXED_EXPOSED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_GRAY).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_copper_panel_stairs", new StairBlock(WAXED_COPPER_PANEL.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));

        OXIDIZED_COPPER_PANEL_SLAB = QuinRegistry.register("oxidized_copper_panel_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WEATHERED_COPPER_PANEL_SLAB = QuinRegistry.register("weathered_copper_panel_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        EXPOSED_COPPER_PANEL_SLAB = QuinRegistry.register("exposed_copper_panel_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        COPPER_PANEL_SLAB = QuinRegistry.register("copper_panel_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_OXIDIZED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_oxidized_copper_panel_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_WEATHERED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_weathered_copper_panel_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_NYLIUM).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_EXPOSED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_exposed_copper_panel_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));
        WAXED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_copper_panel_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sounds(SoundType.COPPER).requiresTool()));

        CRACKED_RED_NETHER_BRICKS = QuinRegistry.register("cracked_red_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.NETHER).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()));
        CHISELED_RED_NETHER_BRICKS = QuinRegistry.register("chiseled_red_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.NETHER).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()));
        RED_NETHER_BRICK_FENCE = QuinRegistry.register("red_nether_brick_fence", new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.NETHER).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));

        CRACKED_TEAL_NETHER_BRICKS = QuinRegistry.register("cracked_teal_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        CHISELED_TEAL_NETHER_BRICKS = QuinRegistry.register("chiseled_teal_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        TEAL_NETHER_BRICKS = QuinRegistry.register("teal_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        TEAL_NETHER_BRICK_STAIRS = QuinRegistry.register("teal_nether_brick_stairs", new StairBlock(TEAL_NETHER_BRICKS.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        TEAL_NETHER_BRICK_SLAB = QuinRegistry.register("teal_nether_brick_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        TEAL_NETHER_BRICK_WALL = QuinRegistry.register("teal_nether_brick_wall", new WallBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        TEAL_NETHER_BRICK_FENCE = QuinRegistry.register("teal_nether_brick_fence", new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.WARPED_STEM).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));

        CRACKED_BROWN_NETHER_BRICKS = QuinRegistry.register("cracked_brown_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        CHISELED_BROWN_NETHER_BRICKS = QuinRegistry.register("chiseled_brown_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        BROWN_NETHER_BRICKS = QuinRegistry.register("brown_nether_bricks", new Block(FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        BROWN_NETHER_BRICK_STAIRS = QuinRegistry.register("brown_nether_brick_stairs", new StairBlock(BROWN_NETHER_BRICKS.defaultBlockState(), FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        BROWN_NETHER_BRICK_SLAB = QuinRegistry.register("brown_nether_brick_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        BROWN_NETHER_BRICK_WALL = QuinRegistry.register("brown_nether_brick_wall", new WallBlock(FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));
        BROWN_NETHER_BRICK_FENCE = QuinRegistry.register("brown_nether_brick_fence", new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.DIRT).strength(2.0F, 6.0F).sounds(SoundType.NETHER_BRICKS).requiresTool()));

        addBurnables();
        registerOxidized();
    }

    public static void addBurnables() {
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();

        flammableRegistry.add(RESIN_BLOCK,10,60);
    }

    public static void registerOxidized() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_PANEL, EXPOSED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_PANEL, WEATHERED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_PANEL, OXIDIZED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_PANEL, WAXED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_PANEL, WAXED_EXPOSED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_PANEL, WAXED_WEATHERED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_PANEL, WAXED_OXIDIZED_COPPER_PANEL);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_PANEL_STAIRS, EXPOSED_COPPER_PANEL_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_PANEL_STAIRS, WEATHERED_COPPER_PANEL_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_PANEL, OXIDIZED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_PANEL_STAIRS, WAXED_COPPER_PANEL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_PANEL_STAIRS, WAXED_EXPOSED_COPPER_PANEL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_PANEL_STAIRS, WAXED_WEATHERED_COPPER_PANEL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_PANEL_STAIRS, WAXED_OXIDIZED_COPPER_PANEL_STAIRS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_PANEL_SLAB, EXPOSED_COPPER_PANEL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_PANEL_SLAB, WEATHERED_COPPER_PANEL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_PANEL, OXIDIZED_COPPER_PANEL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_PANEL_SLAB, WAXED_COPPER_PANEL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_PANEL_SLAB, WAXED_EXPOSED_COPPER_PANEL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_PANEL_SLAB, WAXED_WEATHERED_COPPER_PANEL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_PANEL_SLAB, WAXED_OXIDIZED_COPPER_PANEL_SLAB);
    }
}
