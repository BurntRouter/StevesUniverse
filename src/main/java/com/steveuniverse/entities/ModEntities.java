package com.steveuniverse.entities;

import net.minecraft.entity.EntityList;

import com.azugames.Main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntity(){
		CreateEntity(pearlspear_entity.class, "PearlS", 0x008521, 0x00FF0800);
		CreateEntity(peridot_entity.class, "PeridotLaser", 0x008521, 0x00FF0800);
		CreateEntity(sonicscreech_entity.class, "SonicSreech", 0x008521, 0x00FF0800);
		CreateEntity(rubykick_entity.class, "RubyKick", 0x008521, 0x00FF0800);
		CreateEntity(pearl_entity.class, "Pearl", 0x008521, 0x00FF0800);
		CreateEntity(peridot_entity.class, "Peridot", 0x008521, 0x00FF0800);
		CreateEntity(rose_entity.class, "RoseQuartz", 0x008521, 0x00FF0800);
		CreateEntity(lapislazuli_entity.class, "LapisLazuli", 0x008521, 0x00FF0800);
		CreateEntity(ruby_entity.class, "Ruby", 0x008521, 0x00FF0800);
		CreateEntity(sapphire_entity.class, "Sapphire", 0x008521, 0x00FF0800);
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