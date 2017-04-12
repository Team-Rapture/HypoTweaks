package com.github.epiicthundercat.hypotweaks.proxy;

import com.github.epiicthundercat.hypotweaks.init.HTItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);
		//NGConfig.config(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
	//	ModEntities.init();
	
	}

	private void register(FMLPreInitializationEvent preEvent) {
		HTItems.register(preEvent);
		//TMRecipes.register(preEvent);
		
		//NGBlocks.register(preEvent);
	//	MinecraftForge.EVENT_BUS.register(new MobDrops());
		//MinecraftForge.EVENT_BUS.register(new TMEventHandler());
		

	}

	public void registerRenders(FMLInitializationEvent event) {

	}

	public void registerRender(FMLInitializationEvent event) {
	}
	public void registerEntities(FMLPreInitializationEvent preEvent) {
		}
}
