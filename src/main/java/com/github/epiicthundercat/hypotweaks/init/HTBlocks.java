package com.github.epiicthundercat.hypotweaks.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HTBlocks {
	public static List<Block> blocks = new ArrayList<Block>();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static List<Block> blockList() {
		return blocks;
	}

	public static void register(FMLPreInitializationEvent preEvent) {
		for (Block block : blockList()) {
			ItemBlock iBlock = new ItemBlock(block);
			if (block.getRegistryName().toString().endsWith("_crop")) {
				iBlock.setMaxStackSize(1);
			}
			GameRegistry.register(block);
			GameRegistry.register(iBlock, block.getRegistryName());
		}
	}

	public static void registerRender(FMLInitializationEvent event) {
		for (Block block : blockList()) {
			new Item();
			Item item = Item.getItemFromBlock(block);
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			renderItem.getItemModelMesher().register(item, 0,
					new ModelResourceLocation(block.getRegistryName().toString(), ("inventory")));
		}
	}

	public static int getIdFromBlock(Block block) {
		int id = Block.getIdFromBlock(block);
		return id;
	}
}
