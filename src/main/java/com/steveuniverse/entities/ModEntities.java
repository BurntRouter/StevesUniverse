package com.steveuniverse.entities;

import net.minecraft.entity.EntityList;

import com.steveuniverse.main.StevesUniverse;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static void registerEntity(){
//EntityRegistry.registerGlobalEntityID(rose_entity.class, "RoseQuartz", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(amethyst_entity.class, "Amethyst", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(garnet_entity.class, "Garnet", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(lapislazuli_entity.class, "LapisLazuli", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(malachite_entity.class, "Malachite", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(opal_entity.class, "Opal", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(pearl_entity.class, "Pearl", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(peridot_entity.class, "Peridot", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(ruby_entity.class, "Ruby", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(sapphire_entity.class, "Sapphire", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(sardonyx_entity.class, "Sardonyx", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
EntityRegistry.registerGlobalEntityID(steven_entity.class, "Steven", EntityRegistry.findGlobalUniqueEntityId(), 0x008521, 0x00FF0800);
	}
}