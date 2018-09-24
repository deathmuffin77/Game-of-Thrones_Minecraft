package com.ianRJ.ianMCmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockGoTOre extends Block {

	protected BlockGoTOre(Material material) {
		super(material);
		//this.setBlockUnbreakable();
		this.setResistance(15.0F); 
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.2F);
		this.setLightOpacity(16);
		this.setStepSound(this.soundTypeStone);
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	/*public Item getItemDropped(int metadata, Random rand, int fortune){
		return IanMod.itemNickle;
		
	}*/
	
	//public int quantityDropped(Random rand){
		//return 1 + rand.nextInt(3);
		
	//}
}

