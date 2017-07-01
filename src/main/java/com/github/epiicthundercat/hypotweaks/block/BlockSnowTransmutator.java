package com.github.epiicthundercat.hypotweaks.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class BlockSnowTransmutator{// extends HTBlock {
/*
	public BlockSnowTransmutator(String name, Material material) {
		super(name, material);
		// TODO Auto-generated constructor stub
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	       if (worldIn.getLightFor(EnumSkyBlock.BLOCK, pos) > 11 - this.getDefaultState().getLightOpacity())
	        {
	            this.turnIntoWater(worldIn, pos);
	        }
		
	    }

	protected void turnIntoWater(World worldIn, BlockPos pos) {
		if (worldIn.provider.doesWaterVaporize()) {
			worldIn.setBlockToAir(pos);
		} else {
			this.dropBlockAsItem(worldIn, pos, worldIn.getBlockState(pos), 0);
			worldIn.setBlockState(pos, Blocks.WATER.getDefaultState());
			worldIn.notifyBlockOfStateChange(pos, Blocks.WATER);
		}
	}

	private void checkForSurroundingPillar(World world, BlockPos pos, IBlockState state) {
		if (world.isRemote) {
			return;
		}
		IBlockState stateDown = world.getBlockState(pos.down());
		IBlockState stateUp = world.getBlockState(pos.up());
		state = Blocks.FLOWING_WATER.getDefaultState();
		world.setBlockState(pos, state, 3);
	}
	public void observedNeighborChange(IBlockState observerState, World world, BlockPos observerPos, Block changedBlock, BlockPos changedBlockPos){
		
	}
	 @Override
	    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
			state = Blocks.FLOWING_WATER.getDefaultState();
	        checkForSurroundingPillar(world, pos, state);
	    }*/
}
