package com.ianRJ.ianMCmod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGoTctS extends Block {

	private IIcon main;
	private IIcon left;
	private IIcon right;
	private IIcon mirror;
	
	public BlockGoTctS(Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
		this.main = iconRegister.registerIcon("irjm:starkCTtop");
		this.mirror = iconRegister.registerIcon("irjm:starkCTbottom");
		this.left = iconRegister.registerIcon("irjm:starkCTside");
		this.right = iconRegister.registerIcon("irjm:starkCTside");
		
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i, int j)
    {
    		if (i == 2)
            {
                    return this.right;
            }
            if (i == 3)
            {
            		return this.left;
            }
            if (i == 4)
            {
                    return this.left;
            }
            if (i == 5)
            {
                    return this.right;
            }
            if (i == 0)
            {
            		return this.mirror;
            }
            else
            {
                    return this.main;
            }
    }

}
