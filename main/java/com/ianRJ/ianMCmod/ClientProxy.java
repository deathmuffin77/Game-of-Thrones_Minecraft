package com.ianRJ.ianMCmod;


import com.ianRJ.ianMCmod.mobStuffz.EntityPersonMobAggressiveL;
import com.ianRJ.ianMCmod.mobStuffz.EntityPersonMobAggressiveN;
import com.ianRJ.ianMCmod.mobStuffz.EntityPersonMobL;
import com.ianRJ.ianMCmod.mobStuffz.EntityPersonMobN;
import com.ianRJ.ianMCmod.mobStuffz.PersonMob;
import com.ianRJ.ianMCmod.mobStuffz.RenderPerson;
import com.ianRJ.ianMCmod.mobStuffz.RenderPerson1;
import com.ianRJ.ianMCmod.mobStuffz.RenderPerson2;
import com.ianRJ.ianMCmod.mobStuffz.RenderPerson3;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;



public class ClientProxy extends ServerProxy{

	

	public void registerRenderThings(){

		

		RenderingRegistry.registerEntityRenderingHandler(EntityPersonMobN.class, new RenderPerson(new PersonMob(), 0));
		//north man
		RenderingRegistry.registerEntityRenderingHandler(EntityPersonMobAggressiveN.class, new RenderPerson1(new PersonMob(), 0));
		//stark soldier
		RenderingRegistry.registerEntityRenderingHandler(EntityPersonMobAggressiveL.class, new RenderPerson2(new PersonMob(), 0));
		//lannister soldier
		RenderingRegistry.registerEntityRenderingHandler(EntityPersonMobL.class, new RenderPerson3(new PersonMob(), 0));
		/*south man
		RenderingRegistry.registerEntityRenderingHandler(EntityPersonMob.class, new RenderPerson3(new PersonMob(), 0));
		//south woman ^
		RenderingRegistry.registerEntityRenderingHandler(EntityPersonMob.class, new RenderPerson3(new PersonMob(), 0));
		//north woman
		
		//RenderingRegistry.registerEntityRenderingHandler(EnitityDireWolfMob.class, new RenderDireWolf(new DireWold(), 0));
		*/

	

	}



}