package com.steveuniverse.renderers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.steveuniverse.entities.lapislazuli_entity;
import com.steveuniverse.main.StevesUniverse;

public class lapislazuli_render extends RenderLiving{

	public lapislazuli_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	}


	public static final ResourceLocation textureLocation = new ResourceLocation("steveuniverse:textures/entity/lapislazuli.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}
