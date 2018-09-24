package com.ianRJ.ianMCmod.ArmorTools;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmor4 extends ItemArmor {
//plated lannister
	public ItemArmor4(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(this.armorType == 2)
		{
		return "irjm:textures/models/armor/starkP2.png";
	}
		return "irjm:textures/models/armor/starkP1.png";
	}
}
