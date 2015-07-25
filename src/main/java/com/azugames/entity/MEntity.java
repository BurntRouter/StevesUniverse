package com.azugames.entity;

import net.minecraft.entity.EntityList;

import com.azugames.Main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class MEntity {
	public static void mainRegistry(){
		
	}
	public static void registerEntity(){
		CreateEntity(EntityPearlS.class, "PearlS", 0x008521, 0x00FF0800);
		CreateEntity(EntityPeridotLaser.class, "PeridotLaser", 0x008521, 0x00FF0800);
		CreateEntity(EntitySonicScreech.class, "SonicSreech", 0x008521, 0x00FF0800);
		CreateEntity(EntitySonicScreech.class, "RubyKick", 0x008521, 0x00FF0800);
		CreateEntity(EntityPearl.class, "Pearl", 0x008521, 0x00FF0800);
		CreateEntity(EntityPeridot.class, "Peridot", 0x008521, 0x00FF0800);
		CreateEntity(EntityRoseQuartz.class, "RoseQuartz", 0x008521, 0x00FF0800);
		CreateEntity(EntityLapisLazuli.class, "LapisLazuli", 0x008521, 0x00FF0800);
		CreateEntity(EntityRuby.class, "Ruby", 0x008521, 0x00FF0800);
		CreateEntity(EntitySapphire.class, "Sapphire", 0x008521, 0x00FF0800);
	}
	public static void CreateEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
	
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 80, 1, true);
		createEgg(randomId, solidColor, spotColor);
	}
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}