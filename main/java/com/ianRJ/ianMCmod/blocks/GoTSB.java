package com.ianRJ.ianMCmod.blocks;

import com.ianRJ.ianMCmod.IanMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;

public class GoTSB extends ItemSlab{

	public GoTSB(Block block) {
		super(block, IanMod.blockLimestoneBrickSB, IanMod.blockLimestoneBrickSB2, block == IanMod.blockLimestoneBrickSB2);
		this.setUnlocalizedName("limestoneBHalfSlab");
		}
	

}
