package com.steveuniverse.renderers;

import org.lwjgl.opengl.GL11;

import com.steveuniverse.entities.garnet_entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class garnet_render extends RenderLiving{

	public garnet_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	
	}

	 @Override
	    protected void preRenderCallback(EntityLivingBase entity, float f)
	    {
	        preRenderCallbackGarnet((garnet_entity) entity, f);
	    }
	  
	    protected void preRenderCallbackGarnet(garnet_entity entity, float f)
	    {
	    	GL11.glScalef(5F, 5F, 5F); 
	    }
	
	
	

	public static final ResourceLocation textureLocation = new ResourceLocation("steveuniverse:textures/entity/Garnet_3.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}
