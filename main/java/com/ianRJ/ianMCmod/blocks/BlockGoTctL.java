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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGoTctL extends Block {

	private IIcon main;
	private IIcon left;
	private IIcon right;
	private IIcon mirror;
	
	public BlockGoTctL(Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
		this.main = iconRegister.registerIcon("irjm:lannisterCTtop");
		this.mirror = iconRegister.registerIcon("irjm:lannisterCTbottom");
		this.left = iconRegister.registerIcon("irjm:lannisterCTside");
		this.right = iconRegister.registerIcon("irjm:lannisterCTside");
		
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
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_1_.isRemote)
        {
            return true;
        }
        else
        {
            p_149727_5_.displayGUIWorkbench(p_149727_2_, p_149727_3_, p_149727_4_);
            return true;
        }
    }
}

