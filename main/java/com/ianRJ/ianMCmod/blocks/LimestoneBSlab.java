package com.ianRJ.ianMCmod.blocks;

import java.util.List;
import java.util.Random;

import com.ianRJ.ianMCmod.IanMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LimestoneBSlab extends BlockSlab {
	private IIcon topIcon;
	public LimestoneBSlab(boolean boo){
		super(boo, Material.rock);
		this.useNeighborBrightness = true;
		this.setStepSound(Block.soundTypeStone);
		this.setResistance(5.0F);
		this.setHardness(2.5F);
		//this.setCreativeTab(IanMod.tabGoTItems);
		this.setBlockName("LimestoneBHalfSlab");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		if( item != Item.getItemFromBlock(IanMod.blockLimestoneBrickSB)){
			list.add(new ItemStack(item, 1, 0));
		}
	}
	
	@SideOnly(Side.CLIENT)
	private static boolean isBlockSingleSlab(Block block){
		return block == IanMod.blockLimestoneBrickSB;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int a, int b, int c){
		return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : (this == IanMod.blockLimestoneBrickSB2 ? Item.getItemFromBlock(IanMod.blockLimestoneBrickSB2) : Item.getItemFromBlock(IanMod.blockLimestoneBrickSB));                        
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return super.getUnlocalizedName();

	}
	@Override
	public Item getItemDropped (int a, Random rand, int b){
		
		return Item.getItemFromBlock(IanMod.blockLimestoneBrickSB);
	}
	public ItemStack createStackedBlock (int a){
		return new ItemStack(IanMod.blockLimestoneBrickSB, 2, 0);

	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.blockIcon = icon.registerIcon("irjm:");
		this.topIcon = icon.registerIcon("irjm:");
	}
	public IIcon getIcon(int a, int b){
		int c = b & 7;
		
		if (this.field_150004_a && (b & 2) != 0){
			a = 1;
		}
		return a == 1 ? this.topIcon : (b == 0 ? this.topIcon : this.blockIcon);
	}


}

