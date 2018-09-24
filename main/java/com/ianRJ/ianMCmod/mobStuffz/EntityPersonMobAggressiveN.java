package com.ianRJ.ianMCmod.mobStuffz;
//stark soldiers
import com.ianRJ.ianMCmod.IanMod;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityPersonMobAggressiveN extends EntityTameable{

	public EntityPersonMobAggressiveN(World par1world) {
		super(par1world);
		this.setSize(0.9F, 1.8F);
		this.tasks.addTask(0,new EntityAIWander(this, 0.4D));
		this.tasks.addTask(1,new EntityAIPanic (this, 0.6D));
		this.tasks.addTask(2, new EntityAISwimming(this));
		this.tasks.addTask(3, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(4, new EntityAITempt(this, .6D, IanMod.itemNorthernSteel, true));
		this.tasks.addTask(5, new EntityAIFollowOwner(this, .6D, 2.0F, 8.0F));
		
		
	} 
	public boolean isAIEnabled(){
		return true;
	}
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		// TODO Auto-generated method stub
		return null;
	}

}
