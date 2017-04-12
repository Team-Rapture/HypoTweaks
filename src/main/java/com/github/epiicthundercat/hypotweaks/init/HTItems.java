package com.github.epiicthundercat.hypotweaks.init;




import java.util.ArrayList;
import java.util.List;

import com.github.epiicthundercat.hypotweaks.item.HTItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class HTItems {

	
	
	
	public static List<Item> items = new ArrayList();
	
	public static Item platinum_ore_piece = new HTItem("platinum_ore_piece");
	public static Item nickel_ore_piece = new HTItem("nickel_ore_piece");
	public static Item aluminum_ore_piece = new HTItem("aluminum_ore_piece");
	public static Item iridium_ore_piece = new HTItem("iridium_ore_piece");
	public static Item platinum_ore_chunk = new HTItem("platinum_ore_chunk");
	public static Item nickel_ore_chunk = new HTItem("nickel_ore_chunk");
	public static Item aluminum_ore_chunk = new HTItem("aluminum_ore_chunk");
	public static Item iridium_ore_chunk = new HTItem("iridium_ore_chunk");
	
	
	
	
	
	
	
	
	
	
	
	private static List<Item> getItems() {
		return items;
	}
	
	public static void register(FMLPreInitializationEvent preEvent) {
		for (Item item : getItems()) {
			GameRegistry.register(item);
		}
	}

	public static void registerRender(FMLInitializationEvent event) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : getItems()) {
			renderItem.getItemModelMesher().register(item, 0,
					new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}
}
