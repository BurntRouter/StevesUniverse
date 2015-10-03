package com.steveuniverse.main;

import com.steveuniverse.blocks.ModBlocks;
import com.steveuniverse.client.ClientProxy;
import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.entities.*;
import com.steveuniverse.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = StevesUniverse.MODID, name = "Steve's Universe", version = StevesUniverse.VERSION)

public class StevesUniverse {
	@Instance("steveuniverse")
	public static StevesUniverse instance;
	
	public static final String MODID = "steveuniverse";
	public static final String VERSION = "1.2";
	
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
	public void Init(FMLInitializationEvent event){
		EntityRegistry.registerModEntity(pearlspear_entity.class, "pearlspear_entity", 101, MODID, 64, 10, true);
		EntityRegistry.registerModEntity(pearllaser_entity.class, "pearllaser_entity", 102, MODID, 64, 10, true);
		EntityRegistry.registerModEntity(amethystwhip_entity.class, "amethystwhip_entity", 103, MODID, 64, 10, true);

	}
	
@EventHandler
	public static void PostLoad(FMLPostInitializationEvent Post) {
			
}

}