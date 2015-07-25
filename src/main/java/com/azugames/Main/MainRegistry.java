package com.azugames.Main;





import net.minecraft.client.main.Main;
import net.minecraftforge.common.MinecraftForge;

import com.azugames.Item.MItems;
import com.azugames.blocks.MBlocks;
import com.azugames.entity.EntityLapisLazuli;
import com.azugames.entity.EntityPearl;
import com.azugames.entity.EntityPearlS;
import com.azugames.entity.EntityPeridot;
import com.azugames.entity.EntityPeridotLaser;
import com.azugames.entity.EntityRoseQuartz;
import com.azugames.entity.EntityRuby;
import com.azugames.entity.EntityRubyKick;
import com.azugames.entity.EntitySapphire;
import com.azugames.entity.EntitySonicScreech;
import com.azugames.events.EventGemPowers;
import com.azugames.lib.RefStrings;
import com.azugames.world.MWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION )
public class MainRegistry {

	@SidedProxy (clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
//	@Instance
	public static String modInstance = "stevesuniverse";
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		MItems.mainRegistry();
		MBlocks.mainRegistry();
		CraftingManager.mainRegistry();
		MWorld.mainRegistry();
		proxy.registerRenderInfo();
	}
@EventHandler
	public static void load(FMLInitializationEvent event) {
	EntityRegistry.registerModEntity(EntityPeridotLaser.class, "PeridotLaser", 1, modInstance , 64, 10, true);	
	EntityRegistry.registerModEntity(EntityPearlS.class, "PearlS", 2, modInstance , 64, 10, true);	
	EntityRegistry.registerModEntity(EntitySonicScreech.class, "SonicScreech", 3, modInstance , 64, 10, true);	
	EntityRegistry.registerModEntity(EntityRubyKick.class, "RubyKick", 4, modInstance , 64, 10, true);	
	EntityRegistry.registerModEntity(EntityPearl.class, "Pearl", 5, modInstance , 64, 10, true);
	EntityRegistry.registerModEntity(EntityPeridot.class, "Peridot", 6, modInstance , 64, 10, true);
	EntityRegistry.registerModEntity(EntityRoseQuartz.class, "RoseQuartz", 7, modInstance , 64, 10, true);
	EntityRegistry.registerModEntity(EntityLapisLazuli.class, "LapisLazuli", 8, modInstance , 64, 10, true);
	EntityRegistry.registerModEntity(EntityLapisLazuli.class, "Ruby", 9, modInstance , 64, 10, true);
	EntityRegistry.registerModEntity(EntitySapphire.class, "Sapphire", 10, modInstance , 64, 10, true);
	MinecraftForge.EVENT_BUS.register(new EventGemPowers());
}
@EventHandler
	public static void PostLoad(FMLPostInitializationEvent Post) {
			
}

}

