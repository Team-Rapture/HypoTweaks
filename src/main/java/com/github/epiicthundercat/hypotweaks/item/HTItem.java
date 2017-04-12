package com.github.epiicthundercat.hypotweaks.item;

import com.github.epiicthundercat.hypotweaks.creativetab.HTCreativeTab;
import com.github.epiicthundercat.hypotweaks.init.HTItems;

import net.minecraft.item.Item;

public class HTItem extends Item{
	
	
	public HTItem(String name) {
		
		setRegistryName(name.toLowerCase());
		setUnlocalizedName(name.toLowerCase());
		setCreativeTab(HTCreativeTab.HTTabs);
		addToItems(this);
	}

	private void addToItems(Item item) {

		HTItems.items.add(item);

	}

}