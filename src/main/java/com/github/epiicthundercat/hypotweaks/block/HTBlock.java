package com.github.epiicthundercat.hypotweaks.block;

import com.github.epiicthundercat.hypotweaks.creativetab.HTCreativeTab;
import com.github.epiicthundercat.hypotweaks.init.HTBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HTBlock extends Block {

		public HTBlock(String name, Material material){
			super(material);
			this.setRegistryName(name.toLowerCase());
			this.setUnlocalizedName(name.toLowerCase());
			this.setCreativeTab(HTCreativeTab.HTTabs);
			addToBlocks(this);
		}
		private void addToBlocks(Block block) {
			HTBlocks.blocks.add(block);
		}
}
