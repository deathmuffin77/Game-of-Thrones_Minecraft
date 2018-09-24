package com.ianRJ.ianMCmod.slabs;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlabBase extends BlockSlab { 
    public static void registerSlabs(final BlockSlabBase singleSlab, final BlockSlabBase doubleSlab) {
		singleSlab.singleSlab = singleSlab;
		singleSlab.doubleSlab = doubleSlab;
		doubleSlab.singleSlab = singleSlab;
		doubleSlab.doubleSlab = doubleSlab;
	}

	public BlockSlabBase singleSlab;
	public BlockSlabBase doubleSlab;
	private int subtypes;

    public BlockSlabBase(boolean isDouble, Material material, int subtypes) {
        super(isDouble, material);
        this.subtypes = subtypes;
        // setCreativeTab
        useNeighborBrightness = true;
    }

    @Override
	public Item getItemDropped(final int meta, final Random random, final int fortune) {
		return Item.getItemFromBlock(singleSlab);
	}

	@Override
	protected ItemStack createStackedBlock(final int meta) {
		return new ItemStack(singleSlab, 2, meta & 7);
	}

	@Override
	public String func_150002_b(final int meta) {
		return super.getUnlocalizedName() + "." + meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(final IBlockAccess world, final int x, final int y, final int z, final int side) {
		if (this == doubleSlab) {
			return super.shouldSideBeRendered(world, x, y, z, side);
		}
		if (side != 1 && side != 0 && !super.shouldSideBeRendered(world, x, y, z, side)) {
			return false;
		}

		final int x2 = x + Facing.offsetsXForSide[Facing.oppositeSide[side]];
		final int y2 = y + Facing.offsetsYForSide[Facing.oppositeSide[side]];
		final int z2 = z + Facing.offsetsZForSide[Facing.oppositeSide[side]];
		final boolean flag = (world.getBlockMetadata(x2, y2, z2) & 8) != 0;
		return flag
				? (side == 0 || (side == 1 && super.shouldSideBeRendered(world, x, y, z, side))
						|| (world.getBlock(x, y, z) != singleSlab
								|| (world.getBlockMetadata(x, y, z) & 8) == 0))
				: (side == 1 || (side == 0 && super.shouldSideBeRendered(world, x, y, z, side))
						|| (world.getBlock(x, y, z) != singleSlab
								|| (world.getBlockMetadata(x, y, z) & 8) != 0));
	}


	@SideOnly(Side.CLIENT)
	public void getSubBlocks(final Item item, final CreativeTabs tab, final List list) {
		if (item != Item.getItemFromBlock(doubleSlab)) {
			for (int meta = 0; meta < subtypes; meta++) {
				list.add(new ItemStack(item, 1, meta));
			}
		}
	}

	@Override
	public boolean canCreatureSpawn(final EnumCreatureType type, final IBlockAccess world, final int x, final int y,
			final int z) {
		final int meta = world.getBlockMetadata(x, y, z);
		return (meta & 8) == 8 || isOpaqueCube();
	}

	@Override
	public boolean isBlockSolid(final IBlockAccess world, final int x, final int y, final int z, final int side) {
		return ((world.getBlockMetadata(x, y, z) & 8) == 8 && side == 1) || isOpaqueCube();
	}

	@SideOnly(Side.CLIENT)
	public Item getItem(final World world, final int x, final int y, final int z) {
		return Item.getItemFromBlock(singleSlab);
	}
}