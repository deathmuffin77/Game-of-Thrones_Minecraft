package com.ianRJ.ianMCmod.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.IIcon;

import com.ianRJ.ianMCmod.IanMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLimestoneCobbleSlab extends BlockSlabBase {
	public static class ItemSingle extends ItemSlab {
		public ItemSingle(final Block block) {
			super(block, IanMod.limestoneCobbleSlabSingle, IanMod.limestoneCobbleSlabDouble, false);
		}
	}

	public static class ItemDouble extends ItemSlab {
		public ItemDouble(final Block block) {
			super(block, IanMod.limestoneCobbleSlabSingle, IanMod.limestoneCobbleSlabDouble, true);
		}
	}

    public BlockLimestoneCobbleSlab(boolean isDouble) {
        super(isDouble, Material.rock, 1);
    }

    @SideOnly(Side.CLIENT)
	public IIcon getIcon(final int side, int meta) {
		return IanMod.blockLimestoneCobble.getIcon(side, meta);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(final IIconRegister iconregister) {}
}