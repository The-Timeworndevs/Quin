package net.timeworndevs.quin.common;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.timeworndevs.quin.init.QuinRegistry;

public class CommonItemRegistry {

    public static Item RESIN;
    public static Item RESIN_CHISEL;
    public static Item SAP_BOTTLE;
    public static Item SYRUP_BOTTLE;
    public static BlockItem RESIN_BLOCK;
    public static BlockItem TREE_TAP;

    public static BlockItem OAK_PICKET_FENCE;

    public static BlockItem DRIFTWOOD_LOG;
    public static BlockItem DRIFTWOOD;
    public static BlockItem DRIFTWOOD_PLANKS;
    public static BlockItem DRIFTWOOD_STAIRS;
    public static BlockItem DRIFTWOOD_SLAB;
    public static BlockItem DRIFTWOOD_FENCE;
    public static BlockItem DRIFTWOOD_FENCE_GATE;
    public static BlockItem DRIFTWOOD_DOOR;
    public static BlockItem DRIFTWOOD_TRAPDOOR;
    public static BlockItem DRIFTWOOD_PRESSURE_PLATE;
    public static BlockItem DRIFTWOOD_BUTTON;

    public static BlockItem ROPE;

    public static BlockItem TINTED_CRYSTAL;
    public static BlockItem BLAST_CRYSTAL;
    public static BlockItem WHITE_CRYSTAL;
    public static BlockItem LIGHT_GRAY_CRYSTAL;
    public static BlockItem GRAY_CRYSTAL;
    public static BlockItem BLACK_CRYSTAL;
    public static BlockItem BROWN_CRYSTAL;
    public static BlockItem RED_CRYSTAL;
    public static BlockItem ORANGE_CRYSTAL;
    public static BlockItem YELLOW_CRYSTAL;
    public static BlockItem LIME_CRYSTAL;
    public static BlockItem GREEN_CRYSTAL;
    public static BlockItem CYAN_CRYSTAL;
    public static BlockItem LIGHT_BLUE_CRYSTAL;
    public static BlockItem BLUE_CRYSTAL;
    public static BlockItem PURPLE_CRYSTAL;
    public static BlockItem MAGENTA_CRYSTAL;
    public static BlockItem PINK_CRYSTAL;

    public static BlockItem BLAST_CRYSTAL_PANE;
    public static BlockItem WHITE_CRYSTAL_PANE;
    public static BlockItem LIGHT_GRAY_CRYSTAL_PANE;
    public static BlockItem GRAY_CRYSTAL_PANE;
    public static BlockItem BLACK_CRYSTAL_PANE;
    public static BlockItem BROWN_CRYSTAL_PANE;
    public static BlockItem RED_CRYSTAL_PANE;
    public static BlockItem ORANGE_CRYSTAL_PANE;
    public static BlockItem YELLOW_CRYSTAL_PANE;
    public static BlockItem LIME_CRYSTAL_PANE;
    public static BlockItem GREEN_CRYSTAL_PANE;
    public static BlockItem CYAN_CRYSTAL_PANE;
    public static BlockItem LIGHT_BLUE_CRYSTAL_PANE;
    public static BlockItem BLUE_CRYSTAL_PANE;
    public static BlockItem PURPLE_CRYSTAL_PANE;
    public static BlockItem MAGENTA_CRYSTAL_PANE;
    public static BlockItem PINK_CRYSTAL_PANE;

    public static BlockItem BLAST_GLASS;
    public static BlockItem BLAST_GLASS_PANE;

    public static BlockItem IRON_BUTTON;
    public static BlockItem GOLD_BUTTON;

    public static BlockItem OXIDIZED_COPPER_BUTTON;
    public static BlockItem WEATHERED_COPPER_BUTTON;
    public static BlockItem EXPOSED_COPPER_BUTTON;
    public static BlockItem COPPER_BUTTON;

    public static BlockItem OXIDIZED_COPPER_PANEL;
    public static BlockItem WEATHERED_COPPER_PANEL;
    public static BlockItem EXPOSED_COPPER_PANEL;
    public static BlockItem COPPER_PANEL;
    public static BlockItem WAXED_OXIDIZED_COPPER_PANEL;
    public static BlockItem WAXED_WEATHERED_COPPER_PANEL;
    public static BlockItem WAXED_EXPOSED_COPPER_PANEL;
    public static BlockItem WAXED_COPPER_PANEL;

    public static BlockItem OXIDIZED_COPPER_PANEL_STAIRS;
    public static BlockItem WEATHERED_COPPER_PANEL_STAIRS;
    public static BlockItem EXPOSED_COPPER_PANEL_STAIRS;
    public static BlockItem COPPER_PANEL_STAIRS;
    public static BlockItem WAXED_OXIDIZED_COPPER_PANEL_STAIRS;
    public static BlockItem WAXED_WEATHERED_COPPER_PANEL_STAIRS;
    public static BlockItem WAXED_EXPOSED_COPPER_PANEL_STAIRS;
    public static BlockItem WAXED_COPPER_PANEL_STAIRS;

    public static BlockItem OXIDIZED_COPPER_PANEL_SLAB;
    public static BlockItem WEATHERED_COPPER_PANEL_SLAB;
    public static BlockItem EXPOSED_COPPER_PANEL_SLAB;
    public static BlockItem COPPER_PANEL_SLAB;
    public static BlockItem WAXED_OXIDIZED_COPPER_PANEL_SLAB;
    public static BlockItem WAXED_WEATHERED_COPPER_PANEL_SLAB;
    public static BlockItem WAXED_EXPOSED_COPPER_PANEL_SLAB;
    public static BlockItem WAXED_COPPER_PANEL_SLAB;

    public static BlockItem CRACKED_RED_NETHER_BRICKS;
    public static BlockItem CHISELED_RED_NETHER_BRICKS;
    public static BlockItem RED_NETHER_BRICK_FENCE;


    public static BlockItem CRACKED_TEAL_NETHER_BRICKS;
    public static BlockItem CHISELED_TEAL_NETHER_BRICKS;
    public static BlockItem TEAL_NETHER_BRICK_FENCE;
    public static BlockItem TEAL_NETHER_BRICKS;
    public static BlockItem TEAL_NETHER_BRICK_STAIRS;
    public static BlockItem TEAL_NETHER_BRICK_SLAB;
    public static BlockItem TEAL_NETHER_BRICK_WALL;

    public static BlockItem CRACKED_BROWN_NETHER_BRICKS;
    public static BlockItem CHISELED_BROWN_NETHER_BRICKS;
    public static BlockItem BROWN_NETHER_BRICK_FENCE;
    public static BlockItem BROWN_NETHER_BRICKS;
    public static BlockItem BROWN_NETHER_BRICK_STAIRS;
    public static BlockItem BROWN_NETHER_BRICK_SLAB;
    public static BlockItem BROWN_NETHER_BRICK_WALL;

    //public static SignItem DRIFTWOOD_SIGN;
    //public static HangingSignItem DRIFTWOOD_HANGING_SIGN;


    public static void register(){
        RESIN = QuinRegistry.register("resin", new Item(new Item.Properties()));
        RESIN_BLOCK = QuinRegistry.register("resin_block", new BlockItem(CommonBlockRegistry.RESIN_BLOCK, new Item.Properties()));
        TREE_TAP = QuinRegistry.register("tree_tap", new BlockItem(CommonBlockRegistry.TREE_TAP, new Item.Properties()));
        SAP_BOTTLE = QuinRegistry.register("sap_bottle", new Item(new Item.Properties()));
        SYRUP_BOTTLE = QuinRegistry.register("syrup_bottle", new HoneyBottleItem(new Item.Properties().food(Foods.HONEY_BOTTLE).craftRemainder(Items.GLASS_BOTTLE)));
        RESIN_CHISEL = QuinRegistry.register("resin_chisel", new Item(new FabricItemSettings().maxDamage(238)));

        OAK_PICKET_FENCE = QuinRegistry.register("oak_picket_fence", new BlockItem(CommonBlockRegistry.OAK_PICKET_FENCE, new Item.Properties()));

        DRIFTWOOD_LOG = QuinRegistry.register("driftwood_log", new BlockItem(CommonBlockRegistry.DRIFTWOOD_LOG, new Item.Properties()));
        DRIFTWOOD = QuinRegistry.register("driftwood", new BlockItem(CommonBlockRegistry.DRIFTWOOD, new Item.Properties()));
        DRIFTWOOD_PLANKS = QuinRegistry.register("driftwood_planks", new BlockItem(CommonBlockRegistry.DRIFTWOOD_PLANKS, new Item.Properties()));
        DRIFTWOOD_STAIRS = QuinRegistry.register("driftwood_stairs", new BlockItem(CommonBlockRegistry.DRIFTWOOD_STAIRS, new Item.Properties()));
        DRIFTWOOD_SLAB = QuinRegistry.register("driftwood_slab", new BlockItem(CommonBlockRegistry.DRIFTWOOD_SLAB, new Item.Properties()));
        DRIFTWOOD_FENCE = QuinRegistry.register("driftwood_fence", new BlockItem(CommonBlockRegistry.DRIFTWOOD_FENCE, new Item.Properties()));
        DRIFTWOOD_FENCE_GATE = QuinRegistry.register("driftwood_fence_gate", new BlockItem(CommonBlockRegistry.DRIFTWOOD_FENCE_GATE, new Item.Properties()));
        //picket fence
        DRIFTWOOD_DOOR = QuinRegistry.register("driftwood_door", new BlockItem(CommonBlockRegistry.DRIFTWOOD_DOOR, new Item.Properties()));
        DRIFTWOOD_TRAPDOOR = QuinRegistry.register("driftwood_trapdoor", new BlockItem(CommonBlockRegistry.DRIFTWOOD_TRAPDOOR, new Item.Properties()));
        DRIFTWOOD_PRESSURE_PLATE = QuinRegistry.register("driftwood_pressure_plate", new BlockItem(CommonBlockRegistry.DRIFTWOOD_PRESSURE_PLATE, new Item.Properties()));
        DRIFTWOOD_BUTTON = QuinRegistry.register("driftwood_button", new BlockItem(CommonBlockRegistry.DRIFTWOOD_BUTTON, new Item.Properties()));

        //DRIFTWOOD_SIGN = QuinRegistry.register("driftwood_sign", new SignItem(new Item.Properties().maxCount(16),CommonBlockRegistry.DRIFTWOOD_SIGN, CommonBlockRegistry.DRIFTWOOD_WALL_SIGN));
        //DRIFTWOOD_HANGING_SIGN = QuinRegistry.register("driftwood_hanging_sign", new HangingSignItem(CommonBlockRegistry.DRIFTWOOD_HANGING_SIGN, CommonBlockRegistry.DRIFTWOOD_WALL_HANGING_SIGN, new Item.Properties().maxCount(16)));

        ROPE = QuinRegistry.register("rope", new BlockItem(CommonBlockRegistry.ROPE, new Item.Properties()));

        TINTED_CRYSTAL = QuinRegistry.register("tinted_crystal", new BlockItem(CommonBlockRegistry.TINTED_CRYSTAL, new Item.Properties()));
        BLAST_CRYSTAL = QuinRegistry.register("blast_crystal", new BlockItem(CommonBlockRegistry.BLAST_CRYSTAL, new Item.Properties()));
        WHITE_CRYSTAL = QuinRegistry.register("white_crystal", new BlockItem(CommonBlockRegistry.WHITE_CRYSTAL, new Item.Properties()));
        LIGHT_GRAY_CRYSTAL = QuinRegistry.register("light_gray_crystal", new BlockItem(CommonBlockRegistry.LIGHT_GRAY_CRYSTAL, new Item.Properties()));
        GRAY_CRYSTAL = QuinRegistry.register("gray_crystal", new BlockItem(CommonBlockRegistry.GRAY_CRYSTAL, new Item.Properties()));
        BLACK_CRYSTAL = QuinRegistry.register("black_crystal", new BlockItem(CommonBlockRegistry.BLACK_CRYSTAL, new Item.Properties()));
        BROWN_CRYSTAL = QuinRegistry.register("brown_crystal", new BlockItem(CommonBlockRegistry.BROWN_CRYSTAL, new Item.Properties()));
        RED_CRYSTAL = QuinRegistry.register("red_crystal", new BlockItem(CommonBlockRegistry.RED_CRYSTAL, new Item.Properties()));
        ORANGE_CRYSTAL = QuinRegistry.register("orange_crystal", new BlockItem(CommonBlockRegistry.ORANGE_CRYSTAL, new Item.Properties()));
        YELLOW_CRYSTAL = QuinRegistry.register("yellow_crystal", new BlockItem(CommonBlockRegistry.YELLOW_CRYSTAL, new Item.Properties()));
        LIME_CRYSTAL = QuinRegistry.register("lime_crystal", new BlockItem(CommonBlockRegistry.LIME_CRYSTAL, new Item.Properties()));
        GREEN_CRYSTAL = QuinRegistry.register("green_crystal", new BlockItem(CommonBlockRegistry.GREEN_CRYSTAL, new Item.Properties()));
        CYAN_CRYSTAL = QuinRegistry.register("cyan_crystal", new BlockItem(CommonBlockRegistry.CYAN_CRYSTAL, new Item.Properties()));
        LIGHT_BLUE_CRYSTAL = QuinRegistry.register("light_blue_crystal", new BlockItem(CommonBlockRegistry.LIGHT_BLUE_CRYSTAL, new Item.Properties()));
        BLUE_CRYSTAL = QuinRegistry.register("blue_crystal", new BlockItem(CommonBlockRegistry.BLUE_CRYSTAL, new Item.Properties()));
        PURPLE_CRYSTAL = QuinRegistry.register("purple_crystal", new BlockItem(CommonBlockRegistry.PURPLE_CRYSTAL, new Item.Properties()));
        MAGENTA_CRYSTAL = QuinRegistry.register("magenta_crystal", new BlockItem(CommonBlockRegistry.MAGENTA_CRYSTAL, new Item.Properties()));
        PINK_CRYSTAL = QuinRegistry.register("pink_crystal", new BlockItem(CommonBlockRegistry.PINK_CRYSTAL, new Item.Properties()));

        BLAST_CRYSTAL_PANE = QuinRegistry.register("blast_crystal_pane", new BlockItem(CommonBlockRegistry.BLAST_CRYSTAL_PANE, new Item.Properties()));
        WHITE_CRYSTAL_PANE = QuinRegistry.register("white_crystal_pane", new BlockItem(CommonBlockRegistry.WHITE_CRYSTAL_PANE, new Item.Properties()));
        LIGHT_GRAY_CRYSTAL_PANE = QuinRegistry.register("light_gray_crystal_pane", new BlockItem(CommonBlockRegistry.LIGHT_GRAY_CRYSTAL_PANE, new Item.Properties()));
        GRAY_CRYSTAL_PANE = QuinRegistry.register("gray_crystal_pane", new BlockItem(CommonBlockRegistry.GRAY_CRYSTAL_PANE, new Item.Properties()));
        BLACK_CRYSTAL_PANE = QuinRegistry.register("black_crystal_pane", new BlockItem(CommonBlockRegistry.BLACK_CRYSTAL_PANE, new Item.Properties()));
        BROWN_CRYSTAL_PANE = QuinRegistry.register("brown_crystal_pane", new BlockItem(CommonBlockRegistry.BROWN_CRYSTAL_PANE, new Item.Properties()));
        RED_CRYSTAL_PANE = QuinRegistry.register("red_crystal_pane", new BlockItem(CommonBlockRegistry.RED_CRYSTAL_PANE, new Item.Properties()));
        ORANGE_CRYSTAL_PANE = QuinRegistry.register("orange_crystal_pane", new BlockItem(CommonBlockRegistry.ORANGE_CRYSTAL_PANE, new Item.Properties()));
        YELLOW_CRYSTAL_PANE = QuinRegistry.register("yellow_crystal_pane", new BlockItem(CommonBlockRegistry.YELLOW_CRYSTAL_PANE, new Item.Properties()));
        LIME_CRYSTAL_PANE = QuinRegistry.register("lime_crystal_pane", new BlockItem(CommonBlockRegistry.LIME_CRYSTAL_PANE, new Item.Properties()));
        GREEN_CRYSTAL_PANE = QuinRegistry.register("green_crystal_pane", new BlockItem(CommonBlockRegistry.GREEN_CRYSTAL_PANE, new Item.Properties()));
        CYAN_CRYSTAL_PANE = QuinRegistry.register("cyan_crystal_pane", new BlockItem(CommonBlockRegistry.CYAN_CRYSTAL_PANE, new Item.Properties()));
        LIGHT_BLUE_CRYSTAL_PANE = QuinRegistry.register("light_blue_crystal_pane", new BlockItem(CommonBlockRegistry.LIGHT_BLUE_CRYSTAL_PANE, new Item.Properties()));
        BLUE_CRYSTAL_PANE = QuinRegistry.register("blue_crystal_pane", new BlockItem(CommonBlockRegistry.BLUE_CRYSTAL_PANE, new Item.Properties()));
        PURPLE_CRYSTAL_PANE = QuinRegistry.register("purple_crystal_pane", new BlockItem(CommonBlockRegistry.PURPLE_CRYSTAL_PANE, new Item.Properties()));
        MAGENTA_CRYSTAL_PANE = QuinRegistry.register("magenta_crystal_pane", new BlockItem(CommonBlockRegistry.MAGENTA_CRYSTAL_PANE, new Item.Properties()));
        PINK_CRYSTAL_PANE = QuinRegistry.register("pink_crystal_pane", new BlockItem(CommonBlockRegistry.PINK_CRYSTAL_PANE, new Item.Properties()));

        BLAST_GLASS = QuinRegistry.register("blast_glass", new BlockItem(CommonBlockRegistry.BLAST_GLASS, new Item.Properties()));
        BLAST_GLASS_PANE = QuinRegistry.register("blast_glass_pane", new BlockItem(CommonBlockRegistry.BLAST_GLASS_PANE, new Item.Properties()));

        IRON_BUTTON = QuinRegistry.register("iron_button", new BlockItem(CommonBlockRegistry.IRON_BUTTON, new Item.Properties()));
        GOLD_BUTTON = QuinRegistry.register("gold_button", new BlockItem(CommonBlockRegistry.GOLD_BUTTON, new Item.Properties()));

        OXIDIZED_COPPER_BUTTON = QuinRegistry.register("oxidized_copper_button", new BlockItem(CommonBlockRegistry.OXIDIZED_COPPER_BUTTON, new Item.Properties()));
        WEATHERED_COPPER_BUTTON = QuinRegistry.register("weathered_copper_button", new BlockItem(CommonBlockRegistry.WEATHERED_COPPER_BUTTON, new Item.Properties()));
        EXPOSED_COPPER_BUTTON = QuinRegistry.register("exposed_copper_button", new BlockItem(CommonBlockRegistry.EXPOSED_COPPER_BUTTON, new Item.Properties()));
        COPPER_BUTTON = QuinRegistry.register("copper_button", new BlockItem(CommonBlockRegistry.COPPER_BUTTON, new Item.Properties()));

        OXIDIZED_COPPER_PANEL = QuinRegistry.register("oxidized_copper_panel", new BlockItem(CommonBlockRegistry.OXIDIZED_COPPER_PANEL, new Item.Properties()));
        WEATHERED_COPPER_PANEL = QuinRegistry.register("weathered_copper_panel", new BlockItem(CommonBlockRegistry.WEATHERED_COPPER_PANEL, new Item.Properties()));
        EXPOSED_COPPER_PANEL = QuinRegistry.register("exposed_copper_panel", new BlockItem(CommonBlockRegistry.EXPOSED_COPPER_PANEL, new Item.Properties()));
        COPPER_PANEL = QuinRegistry.register("copper_panel", new BlockItem(CommonBlockRegistry.COPPER_PANEL, new Item.Properties()));
        WAXED_OXIDIZED_COPPER_PANEL = QuinRegistry.register("waxed_oxidized_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_OXIDIZED_COPPER_PANEL, new Item.Properties()));
        WAXED_WEATHERED_COPPER_PANEL = QuinRegistry.register("waxed_weathered_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_WEATHERED_COPPER_PANEL, new Item.Properties()));
        WAXED_EXPOSED_COPPER_PANEL = QuinRegistry.register("waxed_exposed_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_EXPOSED_COPPER_PANEL, new Item.Properties()));
        WAXED_COPPER_PANEL = QuinRegistry.register("waxed_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_COPPER_PANEL, new Item.Properties()));

        OXIDIZED_COPPER_PANEL_STAIRS = QuinRegistry.register("oxidized_copper_panel_stairs", new BlockItem(CommonBlockRegistry.OXIDIZED_COPPER_PANEL_STAIRS, new Item.Properties()));
        WEATHERED_COPPER_PANEL_STAIRS = QuinRegistry.register("weathered_copper_panel_stairs", new BlockItem(CommonBlockRegistry.WEATHERED_COPPER_PANEL_STAIRS, new Item.Properties()));
        EXPOSED_COPPER_PANEL_STAIRS = QuinRegistry.register("exposed_copper_panel_stairs", new BlockItem(CommonBlockRegistry.EXPOSED_COPPER_PANEL_STAIRS, new Item.Properties()));
        COPPER_PANEL_STAIRS = QuinRegistry.register("copper_panel_stairs", new BlockItem(CommonBlockRegistry.COPPER_PANEL_STAIRS, new Item.Properties()));
        WAXED_OXIDIZED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_oxidized_copper_panel_stairs", new BlockItem(CommonBlockRegistry.WAXED_OXIDIZED_COPPER_PANEL_STAIRS, new Item.Properties()));
        WAXED_WEATHERED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_weathered_copper_panel_stairs", new BlockItem(CommonBlockRegistry.WAXED_WEATHERED_COPPER_PANEL_STAIRS, new Item.Properties()));
        WAXED_EXPOSED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_exposed_copper_panel_stairs", new BlockItem(CommonBlockRegistry.WAXED_EXPOSED_COPPER_PANEL_STAIRS, new Item.Properties()));
        WAXED_COPPER_PANEL_STAIRS = QuinRegistry.register("waxed_copper_panel_stairs", new BlockItem(CommonBlockRegistry.WAXED_COPPER_PANEL_STAIRS, new Item.Properties()));

        OXIDIZED_COPPER_PANEL_SLAB = QuinRegistry.register("oxidized_copper_panel_slab", new BlockItem(CommonBlockRegistry.OXIDIZED_COPPER_PANEL_SLAB, new Item.Properties()));
        WEATHERED_COPPER_PANEL_SLAB = QuinRegistry.register("weathered_copper_panel_slab", new BlockItem(CommonBlockRegistry.WEATHERED_COPPER_PANEL_SLAB, new Item.Properties()));
        EXPOSED_COPPER_PANEL_SLAB = QuinRegistry.register("exposed_copper_panel_slab", new BlockItem(CommonBlockRegistry.EXPOSED_COPPER_PANEL_SLAB, new Item.Properties()));
        COPPER_PANEL_SLAB = QuinRegistry.register("copper_panel_slab", new BlockItem(CommonBlockRegistry.COPPER_PANEL_SLAB, new Item.Properties()));
        WAXED_OXIDIZED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_oxidized_copper_panel_slab", new BlockItem(CommonBlockRegistry.WAXED_OXIDIZED_COPPER_PANEL_SLAB, new Item.Properties()));
        WAXED_WEATHERED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_weathered_copper_panel_slab", new BlockItem(CommonBlockRegistry.WAXED_WEATHERED_COPPER_PANEL_SLAB, new Item.Properties()));
        WAXED_EXPOSED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_exposed_copper_panel_slab", new BlockItem(CommonBlockRegistry.WAXED_EXPOSED_COPPER_PANEL_SLAB, new Item.Properties()));
        WAXED_COPPER_PANEL_SLAB = QuinRegistry.register("waxed_copper_panel_slab", new BlockItem(CommonBlockRegistry.WAXED_COPPER_PANEL_SLAB, new Item.Properties()));

        CRACKED_RED_NETHER_BRICKS = QuinRegistry.register("cracked_red_nether_bricks", new BlockItem(CommonBlockRegistry.CRACKED_RED_NETHER_BRICKS, new Item.Properties()));
        CHISELED_RED_NETHER_BRICKS = QuinRegistry.register("chiseled_red_nether_bricks", new BlockItem(CommonBlockRegistry.CHISELED_RED_NETHER_BRICKS, new Item.Properties()));
        RED_NETHER_BRICK_FENCE = QuinRegistry.register("red_nether_brick_fence", new BlockItem(CommonBlockRegistry.RED_NETHER_BRICK_FENCE, new Item.Properties()));

        CRACKED_TEAL_NETHER_BRICKS = QuinRegistry.register("cracked_teal_nether_bricks", new BlockItem(CommonBlockRegistry.CRACKED_TEAL_NETHER_BRICKS, new Item.Properties()));
        CHISELED_TEAL_NETHER_BRICKS = QuinRegistry.register("chiseled_teal_nether_bricks", new BlockItem(CommonBlockRegistry.CHISELED_TEAL_NETHER_BRICKS, new Item.Properties()));
        TEAL_NETHER_BRICKS = QuinRegistry.register("teal_nether_bricks", new BlockItem(CommonBlockRegistry.TEAL_NETHER_BRICKS, new Item.Properties()));
        TEAL_NETHER_BRICK_STAIRS = QuinRegistry.register("teal_nether_brick_stairs", new BlockItem(CommonBlockRegistry.TEAL_NETHER_BRICK_STAIRS, new Item.Properties()));
        TEAL_NETHER_BRICK_SLAB = QuinRegistry.register("teal_nether_brick_slab", new BlockItem(CommonBlockRegistry.TEAL_NETHER_BRICK_SLAB, new Item.Properties()));
        TEAL_NETHER_BRICK_WALL = QuinRegistry.register("teal_nether_brick_wall", new BlockItem(CommonBlockRegistry.TEAL_NETHER_BRICK_WALL, new Item.Properties()));
        TEAL_NETHER_BRICK_FENCE = QuinRegistry.register("teal_nether_brick_fence", new BlockItem(CommonBlockRegistry.TEAL_NETHER_BRICK_FENCE, new Item.Properties()));

        CRACKED_BROWN_NETHER_BRICKS = QuinRegistry.register("cracked_brown_nether_bricks", new BlockItem(CommonBlockRegistry.CRACKED_BROWN_NETHER_BRICKS, new Item.Properties()));
        CHISELED_BROWN_NETHER_BRICKS = QuinRegistry.register("chiseled_brown_nether_bricks", new BlockItem(CommonBlockRegistry.CHISELED_BROWN_NETHER_BRICKS, new Item.Properties()));
        BROWN_NETHER_BRICKS = QuinRegistry.register("brown_nether_bricks", new BlockItem(CommonBlockRegistry.BROWN_NETHER_BRICKS, new Item.Properties()));
        BROWN_NETHER_BRICK_STAIRS = QuinRegistry.register("brown_nether_brick_stairs", new BlockItem(CommonBlockRegistry.BROWN_NETHER_BRICK_STAIRS, new Item.Properties()));
        BROWN_NETHER_BRICK_SLAB = QuinRegistry.register("brown_nether_brick_slab", new BlockItem(CommonBlockRegistry.BROWN_NETHER_BRICK_SLAB, new Item.Properties()));
        BROWN_NETHER_BRICK_WALL = QuinRegistry.register("brown_nether_brick_wall", new BlockItem(CommonBlockRegistry.BROWN_NETHER_BRICK_WALL, new Item.Properties()));
        BROWN_NETHER_BRICK_FENCE = QuinRegistry.register("brown_nether_brick_fence", new BlockItem(CommonBlockRegistry.BROWN_NETHER_BRICK_FENCE, new Item.Properties()));

        itemGroupAdditions();
        addFurnaceFuels();
    }

    public static void itemGroupAdditions(){

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.accept(RESIN_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> {content.addAfter(Items.EXPERIENCE_BOTTLE, RESIN);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> {content.addAfter(RESIN, SAP_BOTTLE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(content -> {content.addAfter(Items.HONEY_BOTTLE, SYRUP_BOTTLE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> {content.addAfter(Items.BEEHIVE, TREE_TAP);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> {content.accept(RESIN_CHISEL);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.OAK_FENCE_GATE, OAK_PICKET_FENCE);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WARPED_BUTTON, DRIFTWOOD_LOG);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_LOG, DRIFTWOOD);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD, DRIFTWOOD_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_PLANKS, DRIFTWOOD_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_STAIRS, DRIFTWOOD_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_SLAB, DRIFTWOOD_FENCE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_FENCE, DRIFTWOOD_FENCE_GATE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_FENCE_GATE, DRIFTWOOD_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_DOOR, DRIFTWOOD_TRAPDOOR);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_TRAPDOOR, DRIFTWOOD_PRESSURE_PLATE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_PRESSURE_PLATE, DRIFTWOOD_BUTTON);});
        //ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL).register(content -> {content.addAfter(Items.WARPED_HANGING_SIGN, DRIFTWOOD_SIGN);});
        //ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL).register(content -> {content.addAfter(DRIFTWOOD_SIGN, DRIFTWOOD_HANGING_SIGN);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.CHAIN, ROPE);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(TINTED_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BLAST_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(WHITE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(LIGHT_GRAY_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(GRAY_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BLACK_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BROWN_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(RED_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(ORANGE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(YELLOW_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(LIME_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(GREEN_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(CYAN_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(LIGHT_BLUE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BLUE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(PURPLE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(MAGENTA_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(PINK_CRYSTAL);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BLAST_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(WHITE_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(LIGHT_GRAY_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(GRAY_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BLACK_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BROWN_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(RED_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(ORANGE_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(YELLOW_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(LIME_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(GREEN_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(CYAN_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(LIGHT_BLUE_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(BLUE_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(PURPLE_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(MAGENTA_CRYSTAL_PANE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.accept(PINK_CRYSTAL_PANE);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.addAfter(Items.TINTED_GLASS, BLAST_GLASS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> {content.addAfter(Items.GLASS_PANE, BLAST_GLASS_PANE);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.IRON_BLOCK, IRON_BUTTON);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.GOLD_BLOCK, GOLD_BUTTON);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_COPPER_BUTTON);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WEATHERED_CUT_COPPER_SLAB, WEATHERED_COPPER_BUTTON);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.EXPOSED_CUT_COPPER_SLAB, EXPOSED_COPPER_BUTTON);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.CUT_COPPER_SLAB, COPPER_BUTTON);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.OXIDIZED_COPPER, OXIDIZED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WEATHERED_COPPER, WEATHERED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.EXPOSED_COPPER, EXPOSED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.COPPER_BLOCK, COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_OXIDIZED_COPPER, WAXED_OXIDIZED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_WEATHERED_COPPER, WAXED_WEATHERED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_EXPOSED_COPPER, WAXED_EXPOSED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_COPPER_BLOCK, WAXED_COPPER_PANEL);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(OXIDIZED_COPPER_PANEL, OXIDIZED_COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WEATHERED_COPPER_PANEL, WEATHERED_COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(EXPOSED_COPPER_PANEL, EXPOSED_COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(COPPER_PANEL, COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_OXIDIZED_COPPER_PANEL, WAXED_OXIDIZED_COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_WEATHERED_COPPER_PANEL, WAXED_WEATHERED_COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_EXPOSED_COPPER_PANEL, WAXED_EXPOSED_COPPER_PANEL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_COPPER_PANEL, WAXED_COPPER_PANEL_STAIRS);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(OXIDIZED_COPPER_PANEL_STAIRS, OXIDIZED_COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WEATHERED_COPPER_PANEL_STAIRS, WEATHERED_COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(EXPOSED_COPPER_PANEL_STAIRS, EXPOSED_COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(COPPER_PANEL_STAIRS, COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_OXIDIZED_COPPER_PANEL_STAIRS, WAXED_OXIDIZED_COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_WEATHERED_COPPER_PANEL_STAIRS, WAXED_WEATHERED_COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_EXPOSED_COPPER_PANEL_STAIRS, WAXED_EXPOSED_COPPER_PANEL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(WAXED_COPPER_PANEL_STAIRS, WAXED_COPPER_PANEL_SLAB);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.RED_NETHER_BRICKS, CRACKED_RED_NETHER_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.RED_NETHER_BRICK_WALL, RED_NETHER_BRICK_FENCE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(RED_NETHER_BRICK_FENCE, CHISELED_RED_NETHER_BRICKS);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(CHISELED_RED_NETHER_BRICKS, TEAL_NETHER_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(TEAL_NETHER_BRICKS, CRACKED_TEAL_NETHER_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(CRACKED_TEAL_NETHER_BRICKS, TEAL_NETHER_BRICK_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(TEAL_NETHER_BRICK_STAIRS, TEAL_NETHER_BRICK_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(TEAL_NETHER_BRICK_SLAB, TEAL_NETHER_BRICK_WALL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(TEAL_NETHER_BRICK_WALL, TEAL_NETHER_BRICK_FENCE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(TEAL_NETHER_BRICK_FENCE, CHISELED_TEAL_NETHER_BRICKS);});

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(CHISELED_TEAL_NETHER_BRICKS, BROWN_NETHER_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(BROWN_NETHER_BRICKS, CRACKED_BROWN_NETHER_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(CRACKED_BROWN_NETHER_BRICKS, BROWN_NETHER_BRICK_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(BROWN_NETHER_BRICK_STAIRS, BROWN_NETHER_BRICK_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(BROWN_NETHER_BRICK_SLAB, BROWN_NETHER_BRICK_WALL);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(BROWN_NETHER_BRICK_WALL, BROWN_NETHER_BRICK_FENCE);});
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {content.addAfter(BROWN_NETHER_BRICK_FENCE, CHISELED_BROWN_NETHER_BRICKS);});
    }

    public static void addFurnaceFuels() {
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

        fuelRegistry.add(RESIN, 800);
        fuelRegistry.add(RESIN_BLOCK, 7200);
    }
}
