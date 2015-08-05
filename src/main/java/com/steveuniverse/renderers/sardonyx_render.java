package com.steveuniverse.renderers;

import org.lwjgl.opengl.GL11;

import com.steveuniverse.entities.opal_entity;
import com.steveuniverse.entities.sardonyx_entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class sardonyx_render extends RenderLiving{

	public sardonyx_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	
	}

	 @Override
	    protected void preRenderCallback(EntityLivingBase entity, float f)
	    {
	        preRenderCallbackSardonyx((sardonyx_entity) entity, f);
	    }
	  
	    protected void preRenderCallbackSardonyx(sardonyx_entity entity, float f)
	    {
	    	GL11.glScalef(6.0F, 6.0F, 6.0F); 
	    }
	
	
	

	public static final ResourceLocation textureLocation = new ResourceLocation("steveuniverse:textures/entity/Sardonyx.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}