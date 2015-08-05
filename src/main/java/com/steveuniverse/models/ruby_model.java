package com.steveuniverse.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ruby_model extends ModelBase
{
	  //fields
	    ModelRenderer Head;
	    ModelRenderer Neck;
	    ModelRenderer Torso;
	    ModelRenderer Chest;
	    ModelRenderer HeadBand;
	    ModelRenderer Eye1;
	    ModelRenderer Pupil1;
	    ModelRenderer HairTop;
	    ModelRenderer Hair1;
	    ModelRenderer Hair2;
	    ModelRenderer Hair3;
	    ModelRenderer Hair4;
	    ModelRenderer Eye2;
	    ModelRenderer Pupil2;
	    ModelRenderer Hair5;
	    ModelRenderer Hair6;
	    ModelRenderer HairTop1;
	    ModelRenderer Waist;
	    ModelRenderer Hips;
	    ModelRenderer Arm1;
	    ModelRenderer Leg1;
	    ModelRenderer Arm2;
	    ModelRenderer Leg;
	  
	  public ruby_model()
	  {
	    textureWidth = 256;
	    textureHeight = 256;
	    
	      Head = new ModelRenderer(this, 0, 0);
	      Head.addBox(0F, 0F, 0F, 7, 8, 5);
	      Head.setRotationPoint(-3.5F, -3F, -3F);
	      Head.setTextureSize(256, 256);
	      Head.mirror = true;
	      setRotation(Head, 0F, 0F, 0F);
	      Neck = new ModelRenderer(this, 0, 18);
	      Neck.addBox(0F, 0F, 0F, 2, 2, 2);
	      Neck.setRotationPoint(-1F, 4F, -1F);
	      Neck.setTextureSize(256, 256);
	      Neck.mirror = true;
	      setRotation(Neck, 0F, 0F, 0F);
	      Torso = new ModelRenderer(this, 0, 29);
	      Torso.addBox(0F, 0F, 0F, 7, 6, 4);
	      Torso.setRotationPoint(-3.5F, 6F, -2F);
	      Torso.setTextureSize(256, 256);
	      Torso.mirror = true;
	      setRotation(Torso, 0F, 0F, 0F);
	      Chest = new ModelRenderer(this, 27, 32);
	      Chest.addBox(0F, 0F, 0F, 7, 3, 1);
	      Chest.setRotationPoint(-3.5F, 7F, -2.5F);
	      Chest.setTextureSize(256, 256);
	      Chest.mirror = true;
	      setRotation(Chest, 0F, 0F, 0F);
	      HeadBand = new ModelRenderer(this, 30, 0);
	      HeadBand.addBox(0F, 0F, 0F, 9, 1, 8);
	      HeadBand.setRotationPoint(-4.5F, -1F, -3.5F);
	      HeadBand.setTextureSize(256, 256);
	      HeadBand.mirror = true;
	      setRotation(HeadBand, 0F, 0F, 0F);
	      Eye1 = new ModelRenderer(this, 26, 18);
	      Eye1.addBox(0F, 0F, 0F, 2, 2, 1);
	      Eye1.setRotationPoint(-2.8F, 0.1F, -3.3F);
	      Eye1.setTextureSize(256, 256);
	      Eye1.mirror = true;
	      setRotation(Eye1, 0F, 0F, 0F);
	      Pupil1 = new ModelRenderer(this, 14, 19);
	      Pupil1.addBox(0F, 0F, 0F, 1, 1, 1);
	      Pupil1.setRotationPoint(-2F, 0.6F, -3.55F);
	      Pupil1.setTextureSize(256, 256);
	      Pupil1.mirror = true;
	      setRotation(Pupil1, 0F, 0F, 0F);
	      HairTop = new ModelRenderer(this, 69, 5);
	      HairTop.addBox(0F, 0F, 0F, 9, 3, 8);
	      HairTop.setRotationPoint(-4.5F, -4F, -3.5F);
	      HairTop.setTextureSize(256, 256);
	      HairTop.mirror = true;
	      setRotation(HairTop, 0F, 0F, 0F);
	      Hair1 = new ModelRenderer(this, 78, 0);
	      Hair1.addBox(0F, 0F, 0F, 1, 5, 7);
	      Hair1.setRotationPoint(-4.5F, 0F, -3F);
	      Hair1.setTextureSize(256, 256);
	      Hair1.mirror = true;
	      setRotation(Hair1, 0F, 0F, 0.1047198F);
	      Hair2 = new ModelRenderer(this, 78, 0);
	      Hair2.addBox(0F, 0F, 0F, 1, 5, 7);
	      Hair2.setRotationPoint(-4.5F, 0F, -3.04F);
	      Hair2.setTextureSize(256, 256);
	      Hair2.mirror = true;
	      setRotation(Hair2, 0F, 0F, 0F);
	      Hair3 = new ModelRenderer(this, 78, 0);
	      Hair3.addBox(0F, 0F, 0F, 1, 5, 7);
	      Hair3.setRotationPoint(3.5F, 0F, -3F);
	      Hair3.setTextureSize(256, 256);
	      Hair3.mirror = true;
	      setRotation(Hair3, 0F, 0F, 0F);
	      Hair4 = new ModelRenderer(this, 78, 0);
	      Hair4.addBox(0F, 0F, 0F, 1, 5, 7);
	      Hair4.setRotationPoint(3.5F, 0F, -3F);
	      Hair4.setTextureSize(256, 256);
	      Hair4.mirror = true;
	      setRotation(Hair4, 0F, 0F, -0.1047198F);
	      Eye2 = new ModelRenderer(this, 26, 18);
	      Eye2.addBox(0F, 0F, 0F, 2, 2, 1);
	      Eye2.setRotationPoint(0.8F, 0.1F, -3.3F);
	      Eye2.setTextureSize(256, 256);
	      Eye2.mirror = true;
	      setRotation(Eye2, 0F, 0F, 0F);
	      Pupil2 = new ModelRenderer(this, 14, 19);
	      Pupil2.addBox(0F, 0F, 0F, 1, 1, 1);
	      Pupil2.setRotationPoint(1F, 0.6F, -3.6F);
	      Pupil2.setTextureSize(256, 256);
	      Pupil2.mirror = true;
	      setRotation(Pupil2, 0F, 0F, 0F);
	      Hair5 = new ModelRenderer(this, 74, 0);
	      Hair5.addBox(0F, 0F, 0F, 7, 5, 2);
	      Hair5.setRotationPoint(-3.5F, 0F, 2F);
	      Hair5.setTextureSize(256, 256);
	      Hair5.mirror = true;
	      setRotation(Hair5, 0F, 0F, 0F);
	      Hair6 = new ModelRenderer(this, 74, 0);
	      Hair6.addBox(0F, 0F, 0F, 7, 5, 1);
	      Hair6.setRotationPoint(-3.5F, 0F, 3.5F);
	      Hair6.setTextureSize(256, 256);
	      Hair6.mirror = true;
	      setRotation(Hair6, 0.1047198F, 0F, 0F);
	      HairTop1 = new ModelRenderer(this, 72, 0);
	      HairTop1.addBox(0F, 0F, 0F, 8, 1, 7);
	      HairTop1.setRotationPoint(-4F, -4.5F, -3F);
	      HairTop1.setTextureSize(256, 256);
	      HairTop1.mirror = true;
	      setRotation(HairTop1, 0F, 0F, 0F);
	      Waist = new ModelRenderer(this, 0, 44);
	      Waist.addBox(0F, 0F, 0F, 6, 1, 4);
	      Waist.setRotationPoint(-3F, 12F, -2F);
	      Waist.setTextureSize(256, 256);
	      Waist.mirror = true;
	      setRotation(Waist, 0F, 0F, 0F);
	      Hips = new ModelRenderer(this, 0, 44);
	      Hips.addBox(0F, 0F, 0F, 7, 2, 4);
	      Hips.setRotationPoint(-3.5F, 12.5F, -2F);
	      Hips.setTextureSize(256, 256);
	      Hips.mirror = true;
	      setRotation(Hips, 0F, 0F, 0F);
	      Arm1 = new ModelRenderer(this, 40, 17);
	      Arm1.addBox(0F, 0F, 0F, 3, 10, 3);
	      Arm1.setRotationPoint(-6.5F, 6F, -1.5F);
	      Arm1.setTextureSize(256, 256);
	      Arm1.mirror = true;
	      setRotation(Arm1, 0F, 0F, 0F);
	      Leg1 = new ModelRenderer(this, 49, 35);
	      Leg1.addBox(0F, 0F, 0F, 3, 10, 3);
	      Leg1.setRotationPoint(-3.5F, 14F, -1.5F);
	      Leg1.setTextureSize(256, 256);
	      Leg1.mirror = true;
	      setRotation(Leg1, 0F, 0F, 0F);
	      Arm2 = new ModelRenderer(this, 40, 17);
	      Arm2.addBox(0F, 0F, 0F, 3, 10, 3);
	      Arm2.setRotationPoint(3.5F, 6F, -1.5F);
	      Arm2.setTextureSize(256, 256);
	      Arm2.mirror = true;
	      setRotation(Arm2, 0F, 0F, 0F);
	      Leg = new ModelRenderer(this, 49, 35);
	      Leg.addBox(0F, 0F, 0F, 3, 10, 3);
	      Leg.setRotationPoint(0.5F, 14F, -1.5F);
	      Leg.setTextureSize(256, 256);
	      Leg.mirror = true;
	      setRotation(Leg, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    Head.render(f5);
	    Neck.render(f5);
	    Torso.render(f5);
	    Chest.render(f5);
	    HeadBand.render(f5);
	    Eye1.render(f5);
	    Pupil1.render(f5);
	    HairTop.render(f5);
	    Hair1.render(f5);
	    Hair2.render(f5);
	    Hair3.render(f5);
	    Hair4.render(f5);
	    Eye2.render(f5);
	    Pupil2.render(f5);
	    Hair5.render(f5);
	    Hair6.render(f5);
	    HairTop1.render(f5);
	    Waist.render(f5);
	    Hips.render(f5);
	    Arm1.render(f5);
	    Leg1.render(f5);
	    Arm2.render(f5);
	    Leg.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	  }

	}
