package com.steveuniverse.renderers;

import org.lwjgl.opengl.GL11;

import com.steveuniverse.entities.malachite_entity;
import com.steveuniverse.entities.opal_entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class malachite_render extends RenderLiving{

	public malachite_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	
	}

	 @Override
	    protected void preRenderCallback(EntityLivingBase entity, float f)
	    {
	        preRenderCallbackMalachite((malachite_entity) entity, f);
	    }
	  
	    protected void preRenderCallbackMalachite(malachite_entity entity, float f)
	    {
	    	GL11.glScalef(7.0F, 7.0F, 7.0F); 
	    }
	
	
	

	public static final ResourceLocation textureLocation = new ResourceLocation("steveuniverse:textures/entity/malachite.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}