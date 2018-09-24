package com.ianRJ.ianMCmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGoTStone extends Block{
	private IIcon main;
	private IIcon left;
	private IIcon right;
	private IIcon mirror;

	public BlockGoTStone(Material material) {
		super(material);
		//this.setBlockUnbreakable();
		this.setResistance(15.0F); 
		this.setHardness(1.5F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.2F);
		this.setLightOpacity(16);
		this.setStepSound(this.soundTypeStone);
		
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.main = iconRegister.registerIcon("irjm:blank");
		this.mirror = iconRegister.registerIcon("irjm:blank");
		this.left = iconRegister.registerIcon("irjm:starkCTside");
		this.right = iconRegister.registerIcon("irjm:starkCTside");
		
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i, int j)
    {
    		if (i == 2)
            {
                    return this.mirror;
            }

            else
            {
                    return this.main;
            }
    }

}
