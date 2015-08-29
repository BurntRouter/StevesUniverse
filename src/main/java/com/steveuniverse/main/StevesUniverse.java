package com.steveuniverse.main;

import com.steveuniverse.blocks.ModBlocks;
import com.steveuniverse.client.ClientProxy;
import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.entities.ModEntities;
import com.steveuniverse.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = StevesUniverse.MODID, name = "Steve's Universe", version = StevesUniverse.VERSION)

public class StevesUniverse {
	@Instance("steveuniverse")
	public static StevesUniverse instance;
	
	public static final String MODID = "steveuniverse";
	public static final String VERSION = "1.0.2";
	
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
	public static void PostLoad(FMLPostInitializationEvent Post) {
			
}

}