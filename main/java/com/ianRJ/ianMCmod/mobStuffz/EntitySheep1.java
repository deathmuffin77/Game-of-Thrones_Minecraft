package com.ianRJ.ianMCmod.mobStuffz;



 


import net.minecraft.entity.EntityList; 
import net.minecraft.entity.EnumCreatureType; 
import net.minecraft.world.biome.BiomeGenBase; 
import cpw.mods.fml.common.registry.EntityRegistry; 
import com.ianRJ.ianMCmod.IanMod;

public class EntitySheep1 { 


	 


	public static void mainRegistry(){ 


		registerEntity(); 
		registerEntity1();
		registerEntity2();
		registerEntity3();
		


	} 
	public static void registerEntity(){
		createEntity(EntityPersonMobN.class, "Stark Man", 0xF5D5A2, 0xA39E96); } 
	
	public static void registerEntity1(){
		createEntity(EntityPersonMobAggressiveN.class, "Stark Soldier", 0xA39E96, 0xF5D5A2); } 
	
	public static void registerEntity2(){
		createEntity(EntityPersonMobAggressiveL.class, "Lannister Soldier", 0xFC2121, 0xF5C15F); } 
	
	public static void registerEntity3(){
		createEntity(EntityPersonMobL.class, "Lannister Man", 0xF5C15F, 0xFC2121); } 
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){ 
		int randomId = EntityRegistry.findGlobalUniqueEntityId(); 
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId); 
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, IanMod.modInstance, 64, 1, true); 
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest); 
		createEgg(randomId, solidColor, spotColor); 
	} 


	 


	private static void createEgg(int randomId, int solidColor, int spotColor){ 


		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor)); 


		 


	} 


 


} 