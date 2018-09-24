package com.ianRJ.ianMCmod.mobStuffz;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
//lannister soldier

public class RenderPerson2 extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("irjm:textures/entity/PersonMobL.png");
	
	public RenderPerson2(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntityPersonMobAggressiveL entity){
		return mobTextures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPersonMobAggressiveL)entity);	
		
	}

}
