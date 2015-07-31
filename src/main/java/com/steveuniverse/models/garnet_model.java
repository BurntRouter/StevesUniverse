package com.steveuniverse.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class garnet_model extends ModelBase
{
  //fields
    ModelRenderer hair_top;
    ModelRenderer hair_back;
    ModelRenderer hair_side_left;
    ModelRenderer hair_side_right;
    ModelRenderer head;
    ModelRenderer neck;
    ModelRenderer left_arm_top;
    ModelRenderer left_arm_middle;
    ModelRenderer left_arm_end;
    ModelRenderer left_hand;
    ModelRenderer right_arm_top;
    ModelRenderer right_arm_middle;
    ModelRenderer right_arm_end;
    ModelRenderer right_hand;
    ModelRenderer body;
    ModelRenderer waist;
    ModelRenderer hips;
    ModelRenderer left_leg_top;
    ModelRenderer left_leg_bottom;
    ModelRenderer left_foot_1;
    ModelRenderer left_foot_2;
    ModelRenderer right_leg_top;
    ModelRenderer right_leg_bottom;
    ModelRenderer right_foot_1;
    ModelRenderer right_foot_2;
  
  public garnet_model()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      hair_top = new ModelRenderer(this, 1, 0);
      hair_top.addBox(-11.8F, -19F, -5F, 23, 10, 13);
      hair_top.setRotationPoint(0.8F, -40F, 0F);
      hair_top.setTextureSize(128, 128);
      hair_top.mirror = true;
      setRotation(hair_top, 0F, 0F, 0F);
      hair_back = new ModelRenderer(this, 0, 0);
      hair_back.addBox(-11.8F, -19F, 8F, 23, 22, 8);
      hair_back.setRotationPoint(0.8F, -40F, 0F);
      hair_back.setTextureSize(128, 128);
      hair_back.mirror = true;
      setRotation(hair_back, 0F, 0F, 0F);
      hair_side_left = new ModelRenderer(this, 0, 0);
      hair_side_left.addBox(-11.8F, -9F, -1F, 7, 12, 9);
      hair_side_left.setRotationPoint(0.8F, -40F, 0F);
      hair_side_left.setTextureSize(128, 128);
      hair_side_left.mirror = true;
      setRotation(hair_side_left, 0F, 0F, 0F);
      hair_side_right = new ModelRenderer(this, 0, 0);
      hair_side_right.addBox(4.2F, -9F, -1F, 7, 12, 9);
      hair_side_right.setRotationPoint(0.8F, -40F, 0F);
      hair_side_right.setTextureSize(128, 128);
      hair_side_right.mirror = true;
      setRotation(hair_side_right, 0F, 0F, 0F);
      head = new ModelRenderer(this, 95, 6);
      head.addBox(-4.8F, -9F, -3.5F, 9, 9, 7);
      head.setRotationPoint(0.8F, -40F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      neck = new ModelRenderer(this, 107, 22);
      neck.addBox(-1F, 0F, -1F, 2, 3, 2);
      neck.setRotationPoint(0.8F, -40F, 0F);
      neck.setTextureSize(128, 128);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      left_arm_top = new ModelRenderer(this, 0, 32);
      left_arm_top.addBox(-1F, -4F, -5F, 9, 9, 9);
      left_arm_top.setRotationPoint(-15F, -33F, 4F);
      left_arm_top.setTextureSize(128, 128);
      left_arm_top.mirror = true;
      setRotation(left_arm_top, 0F, 0F, 0F);
      left_arm_middle = new ModelRenderer(this, 0, 57);
      left_arm_middle.addBox(0F, -0.1F, 0F, 3, 7, 3);
      left_arm_middle.setRotationPoint(-13F, -29F, 2F);
      left_arm_middle.setTextureSize(128, 128);
      left_arm_middle.mirror = true;
      setRotation(left_arm_middle, 0F, 0F, 0.3717861F);
      left_arm_end = new ModelRenderer(this, 0, 67);
      left_arm_end.addBox(0F, 6.9F, 0F, 3, 11, 3);
      left_arm_end.setRotationPoint(-13F, -29F, 2F);
      left_arm_end.setTextureSize(128, 128);
      left_arm_end.mirror = true;
      setRotation(left_arm_end, 0F, 0F, 0.3717861F);
      left_hand = new ModelRenderer(this, 0, 81);
      left_hand.addBox(-1.6F, 17.9F, 0F, 5, 8, 3);
      left_hand.setRotationPoint(-13F, -29F, 2F);
      left_hand.setTextureSize(128, 128);
      left_hand.mirror = true;
      setRotation(left_hand, 0F, 0F, 0.3717861F);
      right_arm_top = new ModelRenderer(this, 37, 32);
      right_arm_top.addBox(0F, -4F, -5F, 9, 9, 9);
      right_arm_top.setRotationPoint(8F, -33F, 4F);
      right_arm_top.setTextureSize(128, 128);
      right_arm_top.mirror = true;
      setRotation(right_arm_top, 0F, 0F, 0F);
      right_arm_middle = new ModelRenderer(this, 0, 93);
      right_arm_middle.addBox(2F, 5.8F, -2F, 3, 7, 3);
      right_arm_middle.setRotationPoint(8F, -33F, 4F);
      right_arm_middle.setTextureSize(128, 128);
      right_arm_middle.mirror = true;
      setRotation(right_arm_middle, 0F, 0F, -0.2974289F);
      right_arm_end = new ModelRenderer(this, 0, 103);
      right_arm_end.addBox(2F, 12.8F, -2F, 3, 11, 3);
      right_arm_end.setRotationPoint(8F, -33F, 4F);
      right_arm_end.setTextureSize(128, 128);
      right_arm_end.mirror = true;
      setRotation(right_arm_end, 0F, 0F, -0.2974289F);
      right_hand = new ModelRenderer(this, 0, 117);
      right_hand.addBox(1.6F, 23.8F, -2F, 5, 8, 3);
      right_hand.setRotationPoint(8F, -33F, 4F);
      right_hand.setTextureSize(128, 128);
      right_hand.mirror = true;
      setRotation(right_hand, 0F, 0F, -0.2974289F);
      body = new ModelRenderer(this, 74, 27);
      body.addBox(-8F, 0F, -3F, 15, 10, 12);
      body.setRotationPoint(1F, -37F, 0F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      waist = new ModelRenderer(this, 95, 49);
      waist.addBox(-4F, 10F, -1F, 7, 5, 6);
      waist.setRotationPoint(1F, -37F, 0F);
      waist.setTextureSize(128, 128);
      waist.mirror = true;
      setRotation(waist, 0F, 0F, 0F);
      hips = new ModelRenderer(this, 60, 60);
      hips.addBox(-10F, 0F, -5F, 21, 10, 13);
      hips.setRotationPoint(0F, -22F, 2F);
      hips.setTextureSize(128, 128);
      hips.mirror = true;
      setRotation(hips, 0F, 0F, 0F);
      left_leg_top = new ModelRenderer(this, 52, 83);
      left_leg_top.addBox(-4F, 10F, -5F, 10, 15, 9);
      left_leg_top.setRotationPoint(-6F, -22F, 2F);
      left_leg_top.setTextureSize(128, 128);
      left_leg_top.mirror = true;
      setRotation(left_leg_top, 0F, 0F, 0F);
      left_leg_bottom = new ModelRenderer(this, 26, 81);
      left_leg_bottom.addBox(-2F, 25F, -3F, 6, 18, 5);
      left_leg_bottom.setRotationPoint(-6F, -22F, 2F);
      left_leg_bottom.setTextureSize(128, 128);
      left_leg_bottom.mirror = true;
      setRotation(left_leg_bottom, 0F, 0F, 0F);
      left_foot_1 = new ModelRenderer(this, 94, 107);
      left_foot_1.addBox(-2F, 43F, -8F, 6, 3, 10);
      left_foot_1.setRotationPoint(-6F, -22F, 2F);
      left_foot_1.setTextureSize(128, 128);
      left_foot_1.mirror = true;
      setRotation(left_foot_1, 0F, 0F, 0F);
      left_foot_2 = new ModelRenderer(this, 105, 120);
      left_foot_2.addBox(-1F, 44F, -12F, 4, 2, 4);
      left_foot_2.setRotationPoint(-6F, -22F, 2F);
      left_foot_2.setTextureSize(128, 128);
      left_foot_2.mirror = true;
      setRotation(left_foot_2, 0F, 0F, 0F);
      right_leg_top = new ModelRenderer(this, 90, 83);
      right_leg_top.addBox(-6F, 10F, -5F, 10, 15, 9);
      right_leg_top.setRotationPoint(7F, -22F, 2F);
      right_leg_top.setTextureSize(128, 128);
      right_leg_top.mirror = true;
      setRotation(right_leg_top, 0F, 0F, 0F);
      right_leg_bottom = new ModelRenderer(this, 26, 105);
      right_leg_bottom.addBox(-4F, 25F, -3F, 6, 18, 5);
      right_leg_bottom.setRotationPoint(7F, -22F, 2F);
      right_leg_bottom.setTextureSize(128, 128);
      right_leg_bottom.mirror = true;
      setRotation(right_leg_bottom, 0F, 0F, 0F);
      right_foot_1 = new ModelRenderer(this, 59, 107);
      right_foot_1.addBox(-4F, 43F, -8F, 6, 3, 10);
      right_foot_1.setRotationPoint(7F, -22F, 2F);
      right_foot_1.setTextureSize(128, 128);
      right_foot_1.mirror = true;
      setRotation(right_foot_1, 0F, 0F, 0F);
      right_foot_2 = new ModelRenderer(this, 67, 120);
      right_foot_2.addBox(-3F, 44F, -12F, 4, 2, 4);
      right_foot_2.setRotationPoint(7F, -22F, 2F);
      right_foot_2.setTextureSize(128, 128);
      right_foot_2.mirror = true;
      setRotation(right_foot_2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    hair_top.render(f5);
    hair_back.render(f5);
    hair_side_left.render(f5);
    hair_side_right.render(f5);
    head.render(f5);
    neck.render(f5);
    left_arm_top.render(f5);
    left_arm_middle.render(f5);
    left_arm_end.render(f5);
    left_hand.render(f5);
    right_arm_top.render(f5);
    right_arm_middle.render(f5);
    right_arm_end.render(f5);
    right_hand.render(f5);
    body.render(f5);
    waist.render(f5);
    hips.render(f5);
    left_leg_top.render(f5);
    left_leg_bottom.render(f5);
    left_foot_1.render(f5);
    left_foot_2.render(f5);
    right_leg_top.render(f5);
    right_leg_bottom.render(f5);
    right_foot_1.render(f5);
    right_foot_2.render(f5);
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
