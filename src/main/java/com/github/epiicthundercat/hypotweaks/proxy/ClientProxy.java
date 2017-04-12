package com.github.epiicthundercat.hypotweaks.proxy;

import com.github.epiicthundercat.hypotweaks.init.HTItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		//ModEntities.initModels();
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		
	}
	
	
	@Override
	public void registerRenders(FMLInitializationEvent event) {
		HTItems.registerRender(event);
		// NGBlocks.registerRender(event);
	}
	
	
}
