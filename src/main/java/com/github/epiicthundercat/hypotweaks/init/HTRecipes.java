package com.github.epiicthundercat.hypotweaks.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class HTRecipes {
	public static void register(FMLPreInitializationEvent preEvent) {
		
		
//Aluminum Ore Chunk
GameRegistry.addShapedRecipe(new ItemStack(HTItems.aluminum_ore_chunk), new Object[] { "EE", "EE", 'E', new ItemStack(HTItems.aluminum_ore_piece)});
//Platinum Ore Chunk
GameRegistry.addShapedRecipe(new ItemStack(HTItems.platinum_ore_chunk), new Object[] { "EE", "EE", 'E', new ItemStack(HTItems.platinum_ore_piece)});
//Nickel Ore Chunk
GameRegistry.addShapedRecipe(new ItemStack(HTItems.nickel_ore_chunk), new Object[] { "EE", "EE", 'E', new ItemStack(HTItems.nickel_ore_piece)});
//Iridium Ore Chunk
GameRegistry.addShapedRecipe(new ItemStack(HTItems.iridium_ore_chunk), new Object[] { "EE", "EE", 'E', new ItemStack(HTItems.iridium_ore_piece)});
//Certus Quartz chunk	
GameRegistry.addShapedRecipe(new ItemStack(HTItems.dirty_certus_quartz_chunk), new Object[] { "EE", "EE", 'E', new ItemStack(HTItems.dirty_certus_quartz_piece)});	
		
		







//OreDictionary.registerOre("ingotAluminum", new ItemStack(HTItems.aluminum_ingot));
//OreDictionary.registerOre("ingotNickel", new ItemStack(HTItems.nickel_ingot));
//OreDictionary.registerOre("ingotIridium", new ItemStack(HTItems.iridium_ingot));
//OreDictionary.registerOre("ingotPlatinum", new ItemStack(HTItems.platinum_ingot));

OreDictionary.registerOre("oreAluminum", new ItemStack(HTItems.aluminum_ore_chunk));
OreDictionary.registerOre("oreNickel", new ItemStack(HTItems.nickel_ore_chunk));
OreDictionary.registerOre("oreIridium", new ItemStack(HTItems.iridium_ore_chunk));
OreDictionary.registerOre("orePlatinum", new ItemStack(HTItems.platinum_ore_chunk));
OreDictionary.registerOre("oreCertusQuartz", new ItemStack(HTItems.dirty_certus_quartz_chunk));
OreDictionary.registerOre("oreChargedCertusQuartz", new ItemStack(HTItems.dirty_charged_certus_quartz_chunk));



	}
}
