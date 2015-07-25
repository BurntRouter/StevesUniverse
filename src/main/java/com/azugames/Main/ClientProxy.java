package com.azugames.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderFireball;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.world.biome.BiomeGenBase;

import com.azugames.Item.MItems;
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
import com.azugames.entity.RenderLapisLazuli;
import com.azugames.entity.RenderPearl;
import com.azugames.entity.RenderPeridot;
import com.azugames.entity.RenderRoseQuartz;
import com.azugames.entity.RenderRuby;
import com.azugames.entity.RenderSapphire;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		RenderingRegistry.registerEntityRenderingHandler(EntityPearlS.class, new RenderSnowball(MItems.pearlS));
		RenderingRegistry.registerEntityRenderingHandler(EntityPeridotLaser.class, new RenderSnowball(MItems.peridotC));
		RenderingRegistry.registerEntityRenderingHandler(EntitySonicScreech.class, new RenderSnowball(MItems.sonic));
		RenderingRegistry.registerEntityRenderingHandler(EntityRubyKick.class, new RenderSnowball(MItems.rkick));
		RenderingRegistry.registerEntityRenderingHandler(EntityPearl.class, new RenderPearl(new ModelBiped(), 1f));
		EntityRegistry.addSpawn(EntityPearl.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(EntityPeridot.class, new RenderPeridot(new ModelPeridot(), 1f));
		EntityRegistry.addSpawn(EntityPeridot.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(EntityRoseQuartz.class, new RenderRoseQuartz(new ModelRoseQuartz(), 1f));
		EntityRegistry.addSpawn(EntityRoseQuartz.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(EntityLapisLazuli.class, new RenderLapisLazuli(new ModelLapisLazuli(), 1f));
		EntityRegistry.addSpawn(EntityLapisLazuli.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);

		RenderingRegistry.registerEntityRenderingHandler(EntitySapphire.class, new RenderSapphire(new ModelSapphire(), 1f));
		EntityRegistry.addSpawn(EntitySapphire.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
	}
}


