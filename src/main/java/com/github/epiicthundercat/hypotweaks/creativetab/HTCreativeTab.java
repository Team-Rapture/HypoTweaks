package com.github.epiicthundercat.hypotweaks.creativetab;

import com.github.epiicthundercat.hypotweaks.init.HTItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HTCreativeTab extends CreativeTabs{
	public HTCreativeTab(int index, String label) {
		super(index, label);
	}

	public static final HTCreativeTab HTTabs = new HTCreativeTab(CreativeTabs.getNextID(), "httabs") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return HTItems.platinum_ore_piece;
		}
	};
	
	@Override
	public Item getTabIconItem() {
		return null;
	}
}