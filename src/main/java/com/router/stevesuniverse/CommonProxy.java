package com.router.stevesuniverse;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	@SubscribeEvent
	public void preInit(FMLPreInitializationEvent e) {
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	public void init(FMLInitializationEvent e) {
	}

	public void postInit(FMLPostInitializationEvent e) {
	}

}