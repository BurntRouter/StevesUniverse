package com.router.stevesuniverse;

import org.apache.logging.log4j.Logger;

import com.router.stevesuniverse.items.SUItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = StevesUniverse.MODID, name = StevesUniverse.NAME, acceptedMinecraftVersions = "[1.12.2]", useMetadata = true, version = StevesUniverse.VERSION)
public class StevesUniverse {
	
	@SidedProxy(clientSide = "com.Router.stevesuniverse.ClientProxy", serverSide = "com.router.stevesuniverse.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "stevesuniverse";
	public static final String NAME = "Steve's Universe";
	public static final String VERSION = "1.1";
	
	public static final SUTab creativeTab = new SUTab();
	
	@Mod.Instance(MODID)
	public static StevesUniverse instance;
	public static Logger logger;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			SUItems.registerItems(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItemModels(ModelRegistryEvent event) {
			SUItems.registerItemModels();
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			
		}
	}
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		System.out.println("[StevesUniverse] I'm attempting to get in.");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		System.out.println("[StevesUniverse] I'm almost in.");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		System.out.println("[StevesUniverse] I'm in.");
	}
}
