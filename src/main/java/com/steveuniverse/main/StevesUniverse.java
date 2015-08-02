package com.steveuniverse.main;

import com.steveuniverse.blocks.ModBlocks;
import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.entities.ModEntities;
import com.steveuniverse.entities.lapislazuli_entity;
import com.steveuniverse.entities.opal_entity;
import com.steveuniverse.entities.pearl_entity;
import com.steveuniverse.entities.pearlspear_entity;
import com.steveuniverse.entities.peridot_entity;
import com.steveuniverse.entities.peridotlaser_entity;
import com.steveuniverse.entities.rose_entity;
import com.steveuniverse.entities.ruby_entity;
import com.steveuniverse.entities.sapphire_entity;
import com.steveuniverse.entities.sonicscreech_entity;
import com.steveuniverse.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = StevesUniverse.MODID, name = "Steve's Universe", version = StevesUniverse.VERSION)

public class StevesUniverse {
	@Instance("steveuniverse")
	public static StevesUniverse instance;
	
	public static final String MODID = "steveuniverse";
	public static final String VERSION = "1.0";
	
	@SidedProxy(clientSide = "com.steveuniverse.client.ClientProxy", serverSide = "com.steveuniverse.main.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("[SteveUniverse]Here we go again... PreInit stated I guess...");
		ModCreativeTabs.initTabs();
		ModItems.MainRegistry();
		ModEntities.registerEntity();
		ModBlocks.mainRegistry();
		proxy.registerRenderers();
		
	}
	@EventHandler
	public static void load(FMLInitializationEvent event) {
	EntityRegistry.registerModEntity(peridotlaser_entity.class, "PeridotLaser", 1, instance , 64, 10, true);	
	EntityRegistry.registerModEntity(pearlspear_entity.class, "PearlS", 2, instance , 64, 10, true);	
	EntityRegistry.registerModEntity(sonicscreech_entity.class, "SonicScreech", 3, instance , 64, 10, true);	
	EntityRegistry.registerModEntity(pearl_entity.class, "Pearl", 5, instance , 64, 10, true);
	EntityRegistry.registerModEntity(peridot_entity.class, "Peridot", 6, instance , 64, 10, true);
	EntityRegistry.registerModEntity(rose_entity.class, "RoseQuartz", 7, instance , 64, 10, true);
	EntityRegistry.registerModEntity(lapislazuli_entity.class, "LapisLazuli", 8, instance , 64, 10, true);
	EntityRegistry.registerModEntity(ruby_entity.class, "Ruby", 9, instance , 64, 10, true);
	EntityRegistry.registerModEntity(sapphire_entity.class, "Sapphire", 10, instance , 64, 10, true);
	EntityRegistry.registerModEntity(opal_entity.class, "Opal", 11, instance , 64, 10, true);
}
@EventHandler
	public static void PostLoad(FMLPostInitializationEvent Post) {
			
}

}