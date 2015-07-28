package com.steveuniverse.client;

import com.steveuniverse.entities.lapislazuli_entity;
import com.steveuniverse.entities.pearl_entity;
import com.steveuniverse.entities.pearlspear_entity;
import com.steveuniverse.entities.peridot_entity;
import com.steveuniverse.entities.peridotlaser_entity;
import com.steveuniverse.entities.rose_entity;
import com.steveuniverse.entities.ruby_entity;
import com.steveuniverse.entities.sapphire_entity;
import com.steveuniverse.entities.sonicscreech_entity;
import com.steveuniverse.items.ModItems;
import com.steveuniverse.main.CommonProxy;
import com.steveuniverse.renderers.lapislazuli_render;
import com.steveuniverse.renderers.pearl_render;
import com.steveuniverse.renderers.peridot_render;
import com.steveuniverse.renderers.rose_render;
import com.steveuniverse.renderers.ruby_render;
import com.steveuniverse.renderers.sapphire_render;

import come.steveuniverse.models.lapislazuli_model;
import come.steveuniverse.models.pearl_model;
import come.steveuniverse.models.peridot_model;
import come.steveuniverse.models.rose_model;
import come.steveuniverse.models.ruby_model;
import come.steveuniverse.models.sapphire_model;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class ClientProxy extends CommonProxy {
	
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(pearlspear_entity.class, new RenderSnowball(ModItems.pearl_spear));
		RenderingRegistry.registerEntityRenderingHandler(peridotlaser_entity.class, new RenderSnowball(ModItems.peridot_claw));
		RenderingRegistry.registerEntityRenderingHandler(sonicscreech_entity.class, new RenderSnowball(ModItems.sapphire_screech));
		RenderingRegistry.registerEntityRenderingHandler(pearl_entity.class, new pearl_render(new pearl_model(), 1f));
		EntityRegistry.addSpawn(pearl_entity.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(peridot_entity.class, new peridot_render(new peridot_model(), 1f));
		EntityRegistry.addSpawn(peridot_entity.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(rose_entity.class, new rose_render(new rose_model(), 1f));
		EntityRegistry.addSpawn(rose_entity.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(lapislazuli_entity.class, new lapislazuli_render(new lapislazuli_model(), 1f));
		EntityRegistry.addSpawn(lapislazuli_entity.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);

		RenderingRegistry.registerEntityRenderingHandler(sapphire_entity.class, new sapphire_render(new sapphire_model(), 1f));
		EntityRegistry.addSpawn(sapphire_entity.class, 6, 1, 5, EnumCreatureType.ambient, 
			      BiomeGenBase.plains);
		RenderingRegistry.registerEntityRenderingHandler(ruby_entity.class, new ruby_render(new ruby_model(), 1f));
		EntityRegistry.addSpawn(ruby_entity.class, 6, 1, 5, EnumCreatureType.ambient,
				  BiomeGenBase.plains);
	}

}
