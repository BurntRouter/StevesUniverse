package com.steveuniverse.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class opal_model extends ModelBase
{
    ModelRenderer HeadTop;
    ModelRenderer Eye1;
    ModelRenderer Pupil1;
    ModelRenderer Nose;
    ModelRenderer GemPearl;
    ModelRenderer HairTop;
    ModelRenderer HeadBottom;
    ModelRenderer Neck;
    ModelRenderer HairLeft;
    ModelRenderer Torso;
    ModelRenderer Chest;
    ModelRenderer HairHolderThing;
    ModelRenderer GemAmethyst;
    ModelRenderer Waist;
    ModelRenderer ArmBase1;
    ModelRenderer ArmBase2;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Arm3;
    ModelRenderer Arm4;
    ModelRenderer ThighTop;
    ModelRenderer Hair1;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer Pupil2;
    ModelRenderer Eye2;
    ModelRenderer HairRight;
    ModelRenderer ThighBottom;
    ModelRenderer SymbolCoverFront;
    ModelRenderer SymbolHolderFront;
    ModelRenderer Leg1Top;
    ModelRenderer Leg2Top;
    ModelRenderer Leg1MidT;
    ModelRenderer Leg1MidB;
    ModelRenderer Foot1;
    ModelRenderer Heel1;
    ModelRenderer Toe1;
    ModelRenderer SymbolHolderBack;
    ModelRenderer SymbolCoverBack;
    ModelRenderer Leg2MidT;
    ModelRenderer Leg2MidB;
    ModelRenderer Foot2;
    ModelRenderer Heel2;
    ModelRenderer Toe2;
    ModelRenderer Hair5;
    ModelRenderer Hair6;
    ModelRenderer Hair7;
  
  public opal_model()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      HeadTop = new ModelRenderer(this, 0, 0);
      HeadTop.addBox(0F, 0F, 0F, 6, 7, 4);
      HeadTop.setRotationPoint(-3F, -17F, 0F);
      HeadTop.setTextureSize(256, 256);
      HeadTop.mirror = true;
      setRotation(HeadTop, 0F, 0F, 0F);
      Eye1 = new ModelRenderer(this, 0, 18);
      Eye1.addBox(0F, 0F, 0F, 2, 2, 1);
      Eye1.setRotationPoint(-2.65F, -14.05F, -0.1F);
      Eye1.setTextureSize(256, 256);
      Eye1.mirror = true;
      setRotation(Eye1, 0F, 0F, 0F);
      Pupil1 = new ModelRenderer(this, 130, 52);
      Pupil1.addBox(0F, 0F, 0F, 1, 1, 1);
      Pupil1.setRotationPoint(-1.95F, -13.55F, -0.2F);
      Pupil1.setTextureSize(256, 256);
      Pupil1.mirror = true;
      setRotation(Pupil1, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 5, 6);
      Nose.addBox(0F, 0F, 0F, 1, 1, 2);
      Nose.setRotationPoint(-0.5F, -12.5F, -2F);
      Nose.setTextureSize(256, 256);
      Nose.mirror = true;
      setRotation(Nose, 0.122173F, 0F, 0F);
      GemPearl = new ModelRenderer(this, 10, 18);
      GemPearl.addBox(0F, 0F, 0F, 2, 2, 1);
      GemPearl.setRotationPoint(-1F, -16.4F, -0.2F);
      GemPearl.setTextureSize(256, 256);
      GemPearl.mirror = true;
      setRotation(GemPearl, 0F, 0F, 0F);
      HairTop = new ModelRenderer(this, 55, 0);
      HairTop.addBox(0F, 0F, 0F, 5, 1, 3);
      HairTop.setRotationPoint(-2.5F, -17.55F, -0.1F);
      HairTop.setTextureSize(256, 256);
      HairTop.mirror = true;
      setRotation(HairTop, 0F, 0F, 0F);
      HeadBottom = new ModelRenderer(this, 0, 23);
      HeadBottom.addBox(0F, 0F, 0F, 6, 1, 4);
      HeadBottom.setRotationPoint(-3F, -10.5F, 0F);
      HeadBottom.setTextureSize(256, 256);
      HeadBottom.mirror = true;
      setRotation(HeadBottom, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 4, 5);
      Neck.addBox(0F, 0F, 0F, 1, 2, 1);
      Neck.setRotationPoint(-0.5F, -9.5F, 1.5F);
      Neck.setTextureSize(256, 256);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      HairLeft = new ModelRenderer(this, 56, 0);
      HairLeft.addBox(0F, 0F, 0F, 1, 4, 2);
      HairLeft.setRotationPoint(-4F, -14F, 0F);
      HairLeft.setTextureSize(256, 256);
      HairLeft.mirror = true;
      setRotation(HairLeft, -0.3490659F, 0F, 0F);
      Torso = new ModelRenderer(this, 0, 44);
      Torso.addBox(0F, 0F, 0F, 6, 7, 4);
      Torso.setRotationPoint(-3F, -7.5F, 0F);
      Torso.setTextureSize(256, 256);
      Torso.mirror = true;
      setRotation(Torso, 0F, 0F, 0F);
      Chest = new ModelRenderer(this, 7, 65);
      Chest.addBox(0F, 0F, 0F, 6, 4, 1);
      Chest.setRotationPoint(-3F, -6F, -0.5F);
      Chest.setTextureSize(256, 256);
      Chest.mirror = true;
      setRotation(Chest, 0F, 0F, 0F);
      HairHolderThing = new ModelRenderer(this, 121, 0);
      HairHolderThing.addBox(0F, 0F, 0F, 3, 2, 2);
      HairHolderThing.setRotationPoint(-1.5F, -17.2F, 3.5F);
      HairHolderThing.setTextureSize(256, 256);
      HairHolderThing.mirror = true;
      setRotation(HairHolderThing, 0.1570796F, 0F, 0F);
      GemAmethyst = new ModelRenderer(this, 26, 46);
      GemAmethyst.addBox(0F, 0F, 0F, 2, 2, 1);
      GemAmethyst.setRotationPoint(-1F, -7F, -0.7F);
      GemAmethyst.setTextureSize(256, 256);
      GemAmethyst.mirror = true;
      setRotation(GemAmethyst, 0F, 0F, 0F);
      Waist = new ModelRenderer(this, 6, 71);
      Waist.addBox(0F, 0F, 0F, 5, 2, 3);
      Waist.setRotationPoint(-2.5F, -0.5F, 0.5F);
      Waist.setTextureSize(256, 256);
      Waist.mirror = true;
      setRotation(Waist, 0F, 0F, 0F);
      ArmBase1 = new ModelRenderer(this, 119, 10);
      ArmBase1.addBox(0F, 0F, 0F, 1, 3, 4);
      ArmBase1.setRotationPoint(-4F, -7F, 0F);
      ArmBase1.setTextureSize(256, 256);
      ArmBase1.mirror = true;
      setRotation(ArmBase1, 0F, 0F, 0F);
      ArmBase2 = new ModelRenderer(this, 119, 10);
      ArmBase2.addBox(0F, 0F, 0F, 1, 3, 4);
      ArmBase2.setRotationPoint(3F, -7F, 0F);
      ArmBase2.setTextureSize(256, 256);
      ArmBase2.mirror = true;
      setRotation(ArmBase2, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 119, 10);
      Arm1.addBox(0F, 0F, 0F, 14, 2, 2);
      Arm1.setRotationPoint(-3F, -7F, 3F);
      Arm1.setTextureSize(256, 256);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, -3.141593F, -0.5061455F);
      Arm2 = new ModelRenderer(this, 119, 10);
      Arm2.addBox(0F, 0F, 0F, 14, 2, 2);
      Arm2.setRotationPoint(3F, -7F, 1F);
      Arm2.setTextureSize(256, 256);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0.5061455F);
      Arm3 = new ModelRenderer(this, 119, 10);
      Arm3.addBox(0F, 0F, 0F, 14, 2, 2);
      Arm3.setRotationPoint(-3F, -6F, 3F);
      Arm3.setTextureSize(256, 256);
      Arm3.mirror = true;
      setRotation(Arm3, 0F, -3.141593F, -0.9773844F);
      Arm4 = new ModelRenderer(this, 119, 10);
      Arm4.addBox(0F, 0F, 0F, 14, 2, 2);
      Arm4.setRotationPoint(3F, -6F, 1F);
      Arm4.setTextureSize(256, 256);
      Arm4.mirror = true;
      setRotation(Arm4, 0F, 0F, 0.9773844F);
      ThighTop = new ModelRenderer(this, 59, 58);
      ThighTop.addBox(0F, 0F, 0F, 6, 1, 4);
      ThighTop.setRotationPoint(-3F, 1.5F, 0F);
      ThighTop.setTextureSize(256, 256);
      ThighTop.mirror = true;
      setRotation(ThighTop, 0F, 0F, 0F);
      Hair1 = new ModelRenderer(this, 57, 13);
      Hair1.addBox(0F, 0F, 0F, 6, 1, 2);
      Hair1.setRotationPoint(-3F, -16F, 4F);
      Hair1.setTextureSize(256, 256);
      Hair1.mirror = true;
      setRotation(Hair1, 0F, 0F, 0F);
      Hair2 = new ModelRenderer(this, 54, 24);
      Hair2.addBox(0F, 0F, 0F, 7, 2, 2);
      Hair2.setRotationPoint(-3.5F, -15F, 4.5F);
      Hair2.setTextureSize(256, 256);
      Hair2.mirror = true;
      setRotation(Hair2, 0F, 0F, 0F);
      Hair3 = new ModelRenderer(this, 54, 25);
      Hair3.addBox(0F, 0F, 0F, 8, 4, 2);
      Hair3.setRotationPoint(-4F, -13F, 5F);
      Hair3.setTextureSize(256, 256);
      Hair3.mirror = true;
      setRotation(Hair3, 0F, 0F, 0F);
      Hair4 = new ModelRenderer(this, 55, 13);
      Hair4.addBox(0F, 0F, 0F, 9, 11, 2);
      Hair4.setRotationPoint(-4.5F, -9F, 5.5F);
      Hair4.setTextureSize(256, 256);
      Hair4.mirror = true;
      setRotation(Hair4, 0F, 0F, 0F);
      Pupil2 = new ModelRenderer(this, 130, 52);
      Pupil2.addBox(0F, 0F, 0F, 1, 1, 1);
      Pupil2.setRotationPoint(1F, -13.5F, -0.2F);
      Pupil2.setTextureSize(256, 256);
      Pupil2.mirror = true;
      setRotation(Pupil2, 0F, 0F, 0F);
      Eye2 = new ModelRenderer(this, 0, 18);
      Eye2.addBox(0F, 0F, 0F, 2, 2, 1);
      Eye2.setRotationPoint(0.7F, -14F, -0.1F);
      Eye2.setTextureSize(256, 256);
      Eye2.mirror = true;
      setRotation(Eye2, 0F, 0F, 0F);
      HairRight = new ModelRenderer(this, 56, 0);
      HairRight.addBox(0F, 0F, 0F, 1, 4, 2);
      HairRight.setRotationPoint(3F, -14F, 0F);
      HairRight.setTextureSize(256, 256);
      HairRight.mirror = true;
      setRotation(HairRight, -0.3490659F, 0F, 0F);
      ThighBottom = new ModelRenderer(this, 59, 58);
      ThighBottom.addBox(0F, 0F, 0F, 7, 4, 4);
      ThighBottom.setRotationPoint(-3.5F, 2.5F, 0F);
      ThighBottom.setTextureSize(256, 256);
      ThighBottom.mirror = true;
      setRotation(ThighBottom, 0F, 0F, 0F);
      SymbolCoverFront = new ModelRenderer(this, 121, 84);
      SymbolCoverFront.addBox(0F, 0F, 0F, 5, 16, 0);
      SymbolCoverFront.setRotationPoint(-2.5F, 1.5F, -0.5F);
      SymbolCoverFront.setTextureSize(256, 256);
      SymbolCoverFront.mirror = true;
      setRotation(SymbolCoverFront, -0.1396263F, 0F, 0F);
      SymbolHolderFront = new ModelRenderer(this, 160, 62);
      SymbolHolderFront.addBox(0F, 0F, 0F, 5, 1, 1);
      SymbolHolderFront.setRotationPoint(-2.5F, 1.3F, -0.5F);
      SymbolHolderFront.setTextureSize(256, 256);
      SymbolHolderFront.mirror = true;
      setRotation(SymbolHolderFront, 0F, 0F, 0F);
      Leg1Top = new ModelRenderer(this, 66, 53);
      Leg1Top.addBox(0F, 0F, 0F, 3, 6, 4);
      Leg1Top.setRotationPoint(-4F, 5.5F, 0F);
      Leg1Top.setTextureSize(256, 256);
      Leg1Top.mirror = true;
      setRotation(Leg1Top, 0F, 0F, 0F);
      Leg2Top = new ModelRenderer(this, 66, 53);
      Leg2Top.addBox(0F, 0F, 0F, 3, 6, 4);
      Leg2Top.setRotationPoint(1F, 5.5F, 0F);
      Leg2Top.setTextureSize(256, 256);
      Leg2Top.mirror = true;
      setRotation(Leg2Top, 0F, 0F, 0F);
      Leg1MidT = new ModelRenderer(this, 68, 60);
      Leg1MidT.addBox(0F, 0F, 0F, 2, 1, 2);
      Leg1MidT.setRotationPoint(-3.5F, 11.5F, 0F);
      Leg1MidT.setTextureSize(256, 256);
      Leg1MidT.mirror = true;
      setRotation(Leg1MidT, 0F, 0F, 0F);
      Leg1MidB = new ModelRenderer(this, 0, 92);
      Leg1MidB.addBox(0F, 0F, 0F, 2, 6, 3);
      Leg1MidB.setRotationPoint(-3.5F, 12.5F, 0F);
      Leg1MidB.setTextureSize(256, 256);
      Leg1MidB.mirror = true;
      setRotation(Leg1MidB, 0F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 56, 96);
      Foot1.addBox(0F, 0F, 0F, 2, 4, 2);
      Foot1.setRotationPoint(-3.5F, 18.5F, 0F);
      Foot1.setTextureSize(256, 256);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Heel1 = new ModelRenderer(this, 56, 96);
      Heel1.addBox(0F, 0F, 0F, 2, 1, 2);
      Heel1.setRotationPoint(-3.5F, 18.5F, 0.5F);
      Heel1.setTextureSize(256, 256);
      Heel1.mirror = true;
      setRotation(Heel1, 0F, 0F, 0F);
      Toe1 = new ModelRenderer(this, 62, 99);
      Toe1.addBox(0F, 0F, 0F, 1, 2, 1);
      Toe1.setRotationPoint(-3F, 22F, 0F);
      Toe1.setTextureSize(256, 256);
      Toe1.mirror = true;
      setRotation(Toe1, 0F, 0F, 0F);
      SymbolHolderBack = new ModelRenderer(this, 160, 62);
      SymbolHolderBack.addBox(0F, 0F, 0F, 5, 1, 1);
      SymbolHolderBack.setRotationPoint(-2.5F, 1.3F, 3.5F);
      SymbolHolderBack.setTextureSize(256, 256);
      SymbolHolderBack.mirror = true;
      setRotation(SymbolHolderBack, 0F, 0F, 0F);
      SymbolCoverBack = new ModelRenderer(this, 121, 84);
      SymbolCoverBack.addBox(0F, 0F, 0F, 5, 16, 0);
      SymbolCoverBack.setRotationPoint(2.5F, 1.5F, 4.5F);
      SymbolCoverBack.setTextureSize(256, 256);
      SymbolCoverBack.mirror = true;
      setRotation(SymbolCoverBack, -0.1396263F, 3.141593F, 0F);
      Leg2MidT = new ModelRenderer(this, 68, 60);
      Leg2MidT.addBox(0F, 0F, 0F, 2, 1, 2);
      Leg2MidT.setRotationPoint(1.5F, 11.5F, 0F);
      Leg2MidT.setTextureSize(256, 256);
      Leg2MidT.mirror = true;
      setRotation(Leg2MidT, 0F, 0F, 0F);
      Leg2MidB = new ModelRenderer(this, 0, 92);
      Leg2MidB.addBox(0F, 0F, 0F, 2, 6, 3);
      Leg2MidB.setRotationPoint(1.5F, 12.5F, 0F);
      Leg2MidB.setTextureSize(256, 256);
      Leg2MidB.mirror = true;
      setRotation(Leg2MidB, 0F, 0F, 0F);
      Foot2 = new ModelRenderer(this, 56, 96);
      Foot2.addBox(0F, 0F, 0F, 2, 4, 2);
      Foot2.setRotationPoint(1.5F, 18.5F, 0F);
      Foot2.setTextureSize(256, 256);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Heel2 = new ModelRenderer(this, 56, 96);
      Heel2.addBox(0F, 0F, 0F, 2, 1, 2);
      Heel2.setRotationPoint(1.5F, 18.5F, 0.5F);
      Heel2.setTextureSize(256, 256);
      Heel2.mirror = true;
      setRotation(Heel2, 0F, 0F, 0F);
      Toe2 = new ModelRenderer(this, 62, 99);
      Toe2.addBox(0F, 0F, 0F, 1, 2, 1);
      Toe2.setRotationPoint(2F, 22F, 0F);
      Toe2.setTextureSize(256, 256);
      Toe2.mirror = true;
      setRotation(Toe2, 0F, 0F, 0F);
      Hair5 = new ModelRenderer(this, 52, 24);
      Hair5.addBox(0F, 0F, 0F, 10, 5, 2);
      Hair5.setRotationPoint(-5F, 2F, 6F);
      Hair5.setTextureSize(256, 256);
      Hair5.mirror = true;
      setRotation(Hair5, 0F, 0F, 0F);
      Hair6 = new ModelRenderer(this, 60, 13);
      Hair6.addBox(0F, 0F, 0F, 9, 4, 2);
      Hair6.setRotationPoint(-4.5F, 7F, 6.5F);
      Hair6.setTextureSize(256, 256);
      Hair6.mirror = true;
      setRotation(Hair6, 0F, 0F, 0F);
      Hair7 = new ModelRenderer(this, 50, 26);
      Hair7.addBox(0F, 0F, 0F, 8, 1, 2);
      Hair7.setRotationPoint(-4F, 11F, 6.5F);
      Hair7.setTextureSize(256, 256);
      Hair7.mirror = true;
      setRotation(Hair7, 0F, 0F, 0F);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    HeadTop.render(f5);
    Eye1.render(f5);
    Pupil1.render(f5);
    Nose.render(f5);
    GemPearl.render(f5);
    HairTop.render(f5);
    HeadBottom.render(f5);
    Neck.render(f5);
    HairLeft.render(f5);
    Torso.render(f5);
    Chest.render(f5);
    HairHolderThing.render(f5);
    GemAmethyst.render(f5);
    Waist.render(f5);
    ArmBase2.render(f5);
    Arm2.render(f5);
    Arm4.render(f5);
    ArmBase1.render(f5);
    Arm1.render(f5);
    Arm3.render(f5);
    ThighTop.render(f5);
    Hair1.render(f5);
    Hair2.render(f5);
    Hair3.render(f5);
    Hair4.render(f5);
    Pupil2.render(f5);
    Eye2.render(f5);
    HairRight.render(f5);
    ThighBottom.render(f5);
    SymbolCoverFront.render(f5);
    SymbolHolderFront.render(f5);
    Leg1Top.render(f5);
    Leg2Top.render(f5);
    Leg1MidT.render(f5);
    Leg1MidB.render(f5);
    Foot1.render(f5);
    Heel1.render(f5);
    Toe1.render(f5);
    SymbolHolderBack.render(f5);
    SymbolCoverBack.render(f5);
    Leg2MidT.render(f5);
    Leg2MidB.render(f5);
    Foot2.render(f5);
    Heel2.render(f5);
    Toe2.render(f5);
    Hair5.render(f5);
    Hair6.render(f5);
    Hair7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	    
	    this.Leg1MidB.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Leg1MidT.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Foot1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Heel1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Foot1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Toe1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

	    this.Leg2MidB.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    this.Leg2MidT.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    this.Foot2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    this.Heel2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    this.Toe2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	   
	    this.Arm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Arm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.Arm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    this.Arm4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
  {
}
  }
}
