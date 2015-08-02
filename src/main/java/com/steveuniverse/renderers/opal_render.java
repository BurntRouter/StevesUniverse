package com.steveuniverse.renderers;

import org.lwjgl.opengl.GL11;

import com.steveuniverse.entities.garnet_entity;
import com.steveuniverse.entities.opal_entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class opal_render extends RenderLiving{

	public opal_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	
	}

	 @Override
	    protected void preRenderCallback(EntityLivingBase entity, float f)
	    {
	        preRenderCallbackOpal((opal_entity) entity, f);
	    }
	  
	    protected void preRenderCallbackOpal(opal_entity entity, float f)
	    {
	    	GL11.glScalef(2.6F, 2.6F, 2.6F); 
	    }
	
	
	

	public static final ResourceLocation textureLocation = new ResourceLocation("steveuniverse:textures/entity/Opal.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}