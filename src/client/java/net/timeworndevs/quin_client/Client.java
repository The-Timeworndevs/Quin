package net.timeworndevs.quin_client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.timeworndevs.quin.common.CommonBlockRegistry;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		initializeTextures();
		addRendering();
	}

	private static void initializeTextures() {
		//SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, CommonBlockRegistry.DRIFTWOOD_SIGN.getTexture()));
		//SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, CommonBlockRegistry.DRIFTWOOD_HANGING_SIGN.getTexture()));
	}


	public static void addRendering() {
		RenderType cutOut = RenderType.cutout();
		RenderType translucent = RenderType.translucent();

		BlockRenderLayerMap.INSTANCE.putBlocks(translucent, CommonBlockRegistry.WHITE_CRYSTAL, CommonBlockRegistry.LIGHT_GRAY_CRYSTAL, CommonBlockRegistry.GRAY_CRYSTAL, CommonBlockRegistry.BLACK_CRYSTAL, CommonBlockRegistry.BROWN_CRYSTAL, CommonBlockRegistry.RED_CRYSTAL, CommonBlockRegistry.ORANGE_CRYSTAL, CommonBlockRegistry.YELLOW_CRYSTAL, CommonBlockRegistry.LIME_CRYSTAL, CommonBlockRegistry.GREEN_CRYSTAL, CommonBlockRegistry.CYAN_CRYSTAL, CommonBlockRegistry.LIGHT_BLUE_CRYSTAL, CommonBlockRegistry.BLUE_CRYSTAL, CommonBlockRegistry.PURPLE_CRYSTAL, CommonBlockRegistry.MAGENTA_CRYSTAL, CommonBlockRegistry.PINK_CRYSTAL, CommonBlockRegistry.TINTED_CRYSTAL);
		BlockRenderLayerMap.INSTANCE.putBlocks(translucent, CommonBlockRegistry.WHITE_CRYSTAL_PANE, CommonBlockRegistry.LIGHT_GRAY_CRYSTAL_PANE, CommonBlockRegistry.GRAY_CRYSTAL_PANE, CommonBlockRegistry.BLACK_CRYSTAL_PANE, CommonBlockRegistry.BROWN_CRYSTAL_PANE, CommonBlockRegistry.RED_CRYSTAL_PANE, CommonBlockRegistry.ORANGE_CRYSTAL_PANE, CommonBlockRegistry.YELLOW_CRYSTAL_PANE, CommonBlockRegistry.LIME_CRYSTAL_PANE, CommonBlockRegistry.GREEN_CRYSTAL_PANE, CommonBlockRegistry.CYAN_CRYSTAL_PANE, CommonBlockRegistry.LIGHT_BLUE_CRYSTAL_PANE, CommonBlockRegistry.BLUE_CRYSTAL_PANE, CommonBlockRegistry.PURPLE_CRYSTAL_PANE, CommonBlockRegistry.MAGENTA_CRYSTAL_PANE, CommonBlockRegistry.PINK_CRYSTAL_PANE);

		BlockRenderLayerMap.INSTANCE.putBlocks(translucent, CommonBlockRegistry.BLAST_GLASS, CommonBlockRegistry.BLAST_GLASS_PANE, CommonBlockRegistry.BLAST_CRYSTAL, CommonBlockRegistry.BLAST_CRYSTAL_PANE);

		BlockRenderLayerMap.INSTANCE.putBlocks(cutOut, CommonBlockRegistry.OAK_PICKET_FENCE);
	}
}