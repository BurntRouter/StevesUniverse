package com.steveuniverse.renderers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.steveuniverse.entities.lapislazuli_entity;
import com.steveuniverse.main.StevesUniverse;

public class lapislazuli_render extends RenderLiving{
	protected ResourceLocation LapisLazuli;
	public lapislazuli_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
		setEntityTexture();
		
	}
	@Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        preRenderCallbackLapisLazuli((lapislazuli_entity) entity, f);
    }
  
    protected void preRenderCallbackLapisLazuli(lapislazuli_entity entity, float f)
    {
        // some people do some G11 transformations or blends here, like you can do
        // GL11.glScalef(2F, 2F, 2F); to scale up the entity
        // which is used for Slime entities.  I suggest having the entity cast to
        // your custom type to make it easier to access fields from your 
        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor, 
        // entity.scaleFactor); 
    }
	   protected void setEntityTexture()
	    {
	        LapisLazuli = new ResourceLocation(StevesUniverse.MODID + ":textures/entity/LapisLazuli.png");
	    }
	@Override
	protected ResourceLocation getEntityTexture(Entity parEntity) {
		// TODO Auto-generated method stub
		return LapisLazuli;
	}

}
