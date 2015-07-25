package com.azugames.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPearl extends ModelBase
{
  //fields
    ModelRenderer hair_top;
    ModelRenderer hair_1;
    ModelRenderer hair_2;
    ModelRenderer hair_3;
    ModelRenderer hair_4;
    ModelRenderer hair_5;
    ModelRenderer hair_6;
    ModelRenderer hair_7;
    ModelRenderer hair_8;
    ModelRenderer hair_9;
    ModelRenderer head;
    ModelRenderer pearl_gem;
    ModelRenderer nose_1;
    ModelRenderer nose_2;
    ModelRenderer neck;
    ModelRenderer body;
    ModelRenderer chest;
    ModelRenderer left_upper_arm;
    ModelRenderer left_lower_arm;
    ModelRenderer left_hand;
    ModelRenderer right_upper_arm;
    ModelRenderer right_lower_arm;
    ModelRenderer right_hand;
    ModelRenderer hips;
    ModelRenderer left_upper_leg;
    ModelRenderer left_lower_leg;
    ModelRenderer left_foot;
    ModelRenderer right_upper_leg;
    ModelRenderer right_lower_leg;
    ModelRenderer right_foot;
  
  public ModelPearl()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      hair_top = new ModelRenderer(this, 10, 3);
      hair_top.addBox(0F, 0F, 0F, 10, 1, 12);
      hair_top.setRotationPoint(-3F, -31.5F, -4F);
      hair_top.setTextureSize(64, 128);
      hair_top.mirror = true;
      setRotation(hair_top, 0F, 0F, 0F);
      hair_1 = new ModelRenderer(this, 23, 5);
      hair_1.addBox(-2F, 0F, 0F, 2, 9, 5);
      hair_1.setRotationPoint(7F, -30.2F, 5F);
      hair_1.setTextureSize(64, 128);
      hair_1.mirror = true;
      setRotation(hair_1, 0F, -0.4363323F, 0F);
      hair_2 = new ModelRenderer(this, 16, 5);
      hair_2.addBox(0F, -5F, 0F, 6, 5, 8);
      hair_2.setRotationPoint(-1F, -20F, 8F);
      hair_2.setTextureSize(64, 128);
      hair_2.mirror = true;
      setRotation(hair_2, 0.6806784F, 0F, 0F);
      hair_3 = new ModelRenderer(this, 1, 19);
      hair_3.addBox(0F, 0F, 0F, 1, 3, 3);
      hair_3.setRotationPoint(-3F, -31F, -4F);
      hair_3.setTextureSize(64, 128);
      hair_3.mirror = true;
      setRotation(hair_3, 0F, 0F, 0F);
      hair_4 = new ModelRenderer(this, 49, 19);
      hair_4.addBox(0F, 0F, 0F, 1, 3, 3);
      hair_4.setRotationPoint(6F, -31F, -4F);
      hair_4.setTextureSize(64, 128);
      hair_4.mirror = true;
      setRotation(hair_4, 0F, 0F, 0F);
      hair_5 = new ModelRenderer(this, 49, 32);
      hair_5.addBox(0F, 0F, 0F, 1, 3, 3);
      hair_5.setRotationPoint(6F, -23F, -4F);
      hair_5.setTextureSize(64, 128);
      hair_5.mirror = true;
      setRotation(hair_5, 0F, 0F, 0F);
      hair_6 = new ModelRenderer(this, 1, 33);
      hair_6.addBox(0F, 0F, 0F, 1, 3, 3);
      hair_6.setRotationPoint(-3F, -23F, -4F);
      hair_6.setTextureSize(64, 128);
      hair_6.mirror = true;
      setRotation(hair_6, 0F, 0F, 0F);
      hair_7 = new ModelRenderer(this, 16, 5);
      hair_7.addBox(0F, 0F, 0F, 6, 5, 8);
      hair_7.setRotationPoint(-1F, -31.5F, 8F);
      hair_7.setTextureSize(64, 128);
      hair_7.mirror = true;
      setRotation(hair_7, -0.6806784F, 0F, 0F);
      hair_8 = new ModelRenderer(this, 10, 3);
      hair_8.addBox(0F, 0F, 0F, 10, 11, 9);
      hair_8.setRotationPoint(-3F, -31F, -1F);
      hair_8.setTextureSize(64, 128);
      hair_8.mirror = true;
      setRotation(hair_8, 0F, 0F, 0F);
      hair_9 = new ModelRenderer(this, 23, 5);
      hair_9.addBox(0F, 0F, 0F, 2, 9, 5);
      hair_9.setRotationPoint(-3F, -30.2F, 5F);
      hair_9.setTextureSize(64, 128);
      hair_9.mirror = true;
      setRotation(hair_9, 0F, 0.4363323F, 0F);
      head = new ModelRenderer(this, 17, 41);
      head.addBox(0F, 0F, 0F, 8, 11, 3);
      head.setRotationPoint(-2F, -31F, -4F);
      head.setTextureSize(64, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      pearl_gem = new ModelRenderer(this, 40, 41);
      pearl_gem.addBox(0F, 0F, 0F, 2, 3, 1);
      pearl_gem.setRotationPoint(0.9333333F, -31F, -5F);
      pearl_gem.setTextureSize(64, 128);
      pearl_gem.mirror = true;
      setRotation(pearl_gem, 0F, 0F, 0F);
      nose_1 = new ModelRenderer(this, 24, 58);
      nose_1.addBox(-0.5F, 0F, 0F, 1, 1, 4);
      nose_1.setRotationPoint(1.5F, -24.5F, -7F);
      nose_1.setTextureSize(64, 128);
      nose_1.mirror = true;
      setRotation(nose_1, -0.2443461F, 0F, 0F);
      nose_2 = new ModelRenderer(this, 24, 58);
      nose_2.addBox(-0.5F, 0F, 0F, 1, 1, 4);
      nose_2.setRotationPoint(1.5F, -24.5F, -7F);
      nose_2.setTextureSize(64, 128);
      nose_2.mirror = true;
      setRotation(nose_2, 0.0174533F, 0F, 0F);
      neck = new ModelRenderer(this, 25, 56);
      neck.addBox(0F, 0F, 0F, 2, 5, 2);
      neck.setRotationPoint(1F, -20F, -1F);
      neck.setTextureSize(64, 128);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      body = new ModelRenderer(this, 19, 64);
      body.addBox(-3F, 0F, -2F, 6, 9, 4);
      body.setRotationPoint(2F, -15F, 0F);
      body.setTextureSize(64, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      chest = new ModelRenderer(this, 40, 64);
      chest.addBox(-2F, 0F, 0F, 4, 7, 1);
      chest.setRotationPoint(2F, -14F, -3F);
      chest.setTextureSize(64, 128);
      chest.mirror = true;
      setRotation(chest, 0F, 0F, 0F);
      left_upper_arm = new ModelRenderer(this, 7, 81);
      left_upper_arm.addBox(0F, 0F, 0F, 1, 8, 1);
      left_upper_arm.setRotationPoint(-1.5F, -15.1F, -1F);
      left_upper_arm.setTextureSize(64, 128);
      left_upper_arm.mirror = true;
      setRotation(left_upper_arm, 0F, 0.0371786F, 0.1858931F);
      left_lower_arm = new ModelRenderer(this, 7, 91);
      left_lower_arm.addBox(0F, 0F, 0F, 1, 7, 1);
      left_lower_arm.setRotationPoint(-2.9F, -7.5F, -1F);
      left_lower_arm.setTextureSize(64, 128);
      left_lower_arm.mirror = true;
      setRotation(left_lower_arm, 0F, 0F, 0.4833219F);
      left_hand = new ModelRenderer(this, 2, 100);
      left_hand.addBox(-5F, 0F, -1F, 5, 1, 2);
      left_hand.setRotationPoint(-5.2F, -1.4F, -0.5F);
      left_hand.setTextureSize(64, 128);
      left_hand.mirror = true;
      setRotation(left_hand, 0F, 0F, 0.0242694F);
      right_upper_arm = new ModelRenderer(this, 50, 82);
      right_upper_arm.addBox(0F, 0F, 0F, 1, 8, 1);
      right_upper_arm.setRotationPoint(4.5F, -14.9F, -1F);
      right_upper_arm.setTextureSize(64, 128);
      right_upper_arm.mirror = true;
      setRotation(right_upper_arm, 0F, 0F, -0.1858931F);
      right_lower_arm = new ModelRenderer(this, 50, 92);
      right_lower_arm.addBox(0F, 0F, 0F, 1, 7, 1);
      right_lower_arm.setRotationPoint(6F, -7F, -1F);
      right_lower_arm.setTextureSize(64, 128);
      right_lower_arm.mirror = true;
      setRotation(right_lower_arm, 0F, 0F, -0.5948578F);
      right_hand = new ModelRenderer(this, 46, 101);
      right_hand.addBox(0F, 0F, -1F, 5, 1, 2);
      right_hand.setRotationPoint(9.8F, -1.4F, -0.5F);
      right_hand.setTextureSize(64, 128);
      right_hand.mirror = true;
      setRotation(right_hand, 0F, 0F, -0.3846954F);
      hips = new ModelRenderer(this, 19, 78);
      hips.addBox(-3F, 0F, -2F, 6, 7, 4);
      hips.setRotationPoint(2F, -6F, 0F);
      hips.setTextureSize(64, 128);
      hips.mirror = true;
      setRotation(hips, 0F, 0F, 0F);
      left_upper_leg = new ModelRenderer(this, 18, 90);
      left_upper_leg.addBox(0F, 0F, 0F, 2, 10, 2);
      left_upper_leg.setRotationPoint(-1F, 1F, -2F);
      left_upper_leg.setTextureSize(64, 128);
      left_upper_leg.mirror = true;
      setRotation(left_upper_leg, 0F, 0F, 0F);
      left_lower_leg = new ModelRenderer(this, 18, 103);
      left_lower_leg.addBox(0F, 0F, 0F, 2, 12, 2);
      left_lower_leg.setRotationPoint(-1F, 11F, -2F);
      left_lower_leg.setTextureSize(64, 128);
      left_lower_leg.mirror = true;
      setRotation(left_lower_leg, 0F, 0F, 0F);
      left_foot = new ModelRenderer(this, 10, 118);
      left_foot.addBox(0F, 0F, 0F, 3, 1, 8);
      left_foot.setRotationPoint(-1.5F, 23F, -8F);
      left_foot.setTextureSize(64, 128);
      left_foot.mirror = true;
      setRotation(left_foot, 0F, 0F, 0F);
      right_upper_leg = new ModelRenderer(this, 34, 90);
      right_upper_leg.addBox(-1F, 0F, -1F, 2, 10, 2);
      right_upper_leg.setRotationPoint(4F, 0F, -1F);
      right_upper_leg.setTextureSize(64, 128);
      right_upper_leg.mirror = true;
      setRotation(right_upper_leg, -0.3892394F, -0.837758F, 0F);
      right_lower_leg = new ModelRenderer(this, 34, 103);
      right_lower_leg.addBox(-1F, 0F, -1F, 2, 12, 2);
      right_lower_leg.setRotationPoint(6.8F, 9.2F, -3.5F);
      right_lower_leg.setTextureSize(64, 128);
      right_lower_leg.mirror = true;
      setRotation(right_lower_leg, -0.3984308F, -0.8203047F, 0.0174533F);
      right_foot = new ModelRenderer(this, 33, 118);
      right_foot.addBox(-1.5F, 0F, -6F, 3, 1, 8);
      right_foot.setRotationPoint(10.6F, 20.5F, -7F);
      right_foot.setTextureSize(64, 128);
      right_foot.mirror = true;
      setRotation(right_foot, 0.4491383F, -0.9143873F, 0.0349066F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    hair_top.render(f5);
    hair_1.render(f5);
    hair_2.render(f5);
    hair_3.render(f5);
    hair_4.render(f5);
    hair_5.render(f5);
    hair_6.render(f5);
    hair_7.render(f5);
    hair_8.render(f5);
    hair_9.render(f5);
    head.render(f5);
    pearl_gem.render(f5);
    nose_1.render(f5);
    nose_2.render(f5);
    neck.render(f5);
    body.render(f5);
    chest.render(f5);
    left_upper_arm.render(f5);
    left_lower_arm.render(f5);
    left_hand.render(f5);
    right_upper_arm.render(f5);
    right_lower_arm.render(f5);
    right_hand.render(f5);
    hips.render(f5);
    left_upper_leg.render(f5);
    left_lower_leg.render(f5);
    left_foot.render(f5);
    right_upper_leg.render(f5);
    right_lower_leg.render(f5);
    right_foot.render(f5);
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

  {
	
}
}
