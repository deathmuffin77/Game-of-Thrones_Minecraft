package com.ianRJ.ianMCmod.mobStuffz;

import com.ianRJ.ianMCmod.IanMod;

import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityPersonMobL extends EntityMob{

	public EntityPersonMobL(World par1world) {
		super(par1world);
		this.setSize(0.9F, 1.8F);
		this.tasks.addTask(0,new EntityAIWander(this, 0.4D));
		this.tasks.addTask(1,new EntityAIPanic (this, 0.6D));
		this.tasks.addTask(2, new EntityAISwimming(this));
		this.tasks.addTask(3, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(4, new EntityAIMoveIndoors(this));
		
		
	} 
	public boolean isAIEnabled(){
		return true;
	}
    public void addRandomArmor()
    {
        this.setCurrentItemOrArmor(0, new ItemStack(IanMod.itemWestlanderSword));
    }
}
