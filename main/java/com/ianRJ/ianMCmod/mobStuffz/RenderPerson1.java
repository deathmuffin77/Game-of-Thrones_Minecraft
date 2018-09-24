package com.ianRJ.ianMCmod.mobStuffz;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
//stark soldier

public class RenderPerson1 extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("irjm:textures/entity/PersonMobS.png");
	
	public RenderPerson1(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	public ResourceLocation getEntityTexture(EntityPersonMobAggressiveN entity){
		return mobTextures;
	}
	public ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPersonMobAggressiveN)entity);	
		
	}

}
