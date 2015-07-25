package com.azugames.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.azugames.lib.RefStrings;

public class RenderSapphire extends RenderLiving{
	protected ResourceLocation Sapphire;
	public RenderSapphire(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
		setEntityTexture();
		
	}
	@Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        preRenderCallbackSapphire((EntitySapphire) entity, f);
    }
  
    protected void preRenderCallbackSapphire(EntitySapphire entity, float f)
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
	        Sapphire = new ResourceLocation(RefStrings.MODID + ":textures/entity/Sapphire.png");
	    }
	@Override
	protected ResourceLocation getEntityTexture(Entity parEntity) {
		// TODO Auto-generated method stub
		return Sapphire;
	}

}