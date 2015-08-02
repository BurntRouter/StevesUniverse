package com.steveuniverse.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class amethyst_model_1 extends ModelBase
{
	  //fields
	    ModelRenderer Foot1;
	    ModelRenderer Toe1;
	    ModelRenderer Leg1;
	    ModelRenderer Leg2;
	    ModelRenderer Foot2;
	    ModelRenderer Toe2;
	    ModelRenderer WaistBottom;
	    ModelRenderer FlapFont;
	    ModelRenderer FlapBack;
	    ModelRenderer WaistTop;
	    ModelRenderer Torso;
	    ModelRenderer Chest;
	    ModelRenderer Arm1;
	    ModelRenderer Arm2;
	    ModelRenderer Head;
	    ModelRenderer Neck;
	    ModelRenderer Pupils;
	    ModelRenderer Mouth;
	    ModelRenderer Hair1;
	    ModelRenderer Hair2;
	    ModelRenderer Hair3;
	    ModelRenderer Hair4;
	    ModelRenderer Hair5;
	    ModelRenderer Hair6;
	    ModelRenderer Hair7;
	    ModelRenderer Hair8;
	    ModelRenderer Hair9;
	    ModelRenderer Hair10;
	    ModelRenderer Hair11;
	    ModelRenderer Hair12;
	    ModelRenderer Hair13;
	    ModelRenderer Hair14;
	    ModelRenderer Hair15;
	    ModelRenderer Hair16;
	    ModelRenderer Hair17;
	    ModelRenderer Hair18;
	    ModelRenderer HairBack;
	    ModelRenderer Hair19;
	    ModelRenderer HairStick1;
	    ModelRenderer HairStick2;
	    ModelRenderer HairStick3;
	    ModelRenderer Hair20;
	    ModelRenderer Hair21;
	    ModelRenderer Hair22;
	    ModelRenderer Hair23;
	    ModelRenderer Hair24;
	    ModelRenderer Hair25;
	    ModelRenderer Hair26;
	    ModelRenderer Hair27;
	    ModelRenderer Eyetop;
	    ModelRenderer Eyebottom;
	  
	  public amethyst_model_1()
	  {
	    textureWidth = 512;
	    textureHeight = 512;
	    
	      Foot1 = new ModelRenderer(this, 0, 0);
	      Foot1.addBox(0F, 0F, 0F, 4, 2, 4);
	      Foot1.setRotationPoint(-5F, 22F, -3F);
	      Foot1.setTextureSize(512, 512);
	      Foot1.mirror = true;
	      setRotation(Foot1, 0F, 0F, 0F);
	      Toe1 = new ModelRenderer(this, 0, 0);
	      Toe1.addBox(0F, 0F, 0F, 3, 1, 1);
	      Toe1.setRotationPoint(-4.5F, 23F, -4F);
	      Toe1.setTextureSize(512, 512);
	      Toe1.mirror = true;
	      setRotation(Toe1, 0F, 0F, 0F);
	      Leg1 = new ModelRenderer(this, 67, 18);
	      Leg1.addBox(0F, 0F, 0F, 4, 9, 4);
	      Leg1.setRotationPoint(-5F, 13F, -3F);
	      Leg1.setTextureSize(512, 512);
	      Leg1.mirror = true;
	      setRotation(Leg1, 0F, 0F, 0F);
	      Leg2 = new ModelRenderer(this, 67, 18);
	      Leg2.addBox(0F, 0F, 0F, 4, 9, 4);
	      Leg2.setRotationPoint(1F, 13F, -3F);
	      Leg2.setTextureSize(512, 512);
	      Leg2.mirror = true;
	      setRotation(Leg2, 0F, 0F, 0F);
	      Leg2.mirror = false;
	      Foot2 = new ModelRenderer(this, 0, 0);
	      Foot2.addBox(0F, 0F, 0F, 4, 2, 4);
	      Foot2.setRotationPoint(1F, 22F, -3F);
	      Foot2.setTextureSize(512, 512);
	      Foot2.mirror = true;
	      setRotation(Foot2, 0F, 0F, 0F);
	      Toe2 = new ModelRenderer(this, 0, 0);
	      Toe2.addBox(0F, 0F, 0F, 3, 1, 1);
	      Toe2.setRotationPoint(1.5F, 23F, -4F);
	      Toe2.setTextureSize(512, 512);
	      Toe2.mirror = true;
	      setRotation(Toe2, 0F, 0F, 0F);
	      WaistBottom = new ModelRenderer(this, 0, 50);
	      WaistBottom.addBox(0F, 0F, 0F, 10, 1, 4);
	      WaistBottom.setRotationPoint(-5F, 12F, -3F);
	      WaistBottom.setTextureSize(512, 512);
	      WaistBottom.mirror = true;
	      setRotation(WaistBottom, 0F, 0F, 0F);
	      FlapFont = new ModelRenderer(this, 0, 42);
	      FlapFont.addBox(0F, 0F, 0F, 3, 3, 0);
	      FlapFont.setRotationPoint(-1.5F, 13F, -3F);
	      FlapFont.setTextureSize(512, 512);
	      FlapFont.mirror = true;
	      setRotation(FlapFont, 0F, 0F, 0F);
	      FlapBack = new ModelRenderer(this, 0, 42);
	      FlapBack.addBox(0F, 0F, 0F, 3, 3, 0);
	      FlapBack.setRotationPoint(-1F, 13F, 1F);
	      FlapBack.setTextureSize(512, 512);
	      FlapBack.mirror = true;
	      setRotation(FlapBack, 0F, 0F, 0F);
	      WaistTop = new ModelRenderer(this, 0, 68);
	      WaistTop.addBox(0F, 0F, 0F, 9, 2, 4);
	      WaistTop.setRotationPoint(-4.5F, 10F, -3F);
	      WaistTop.setTextureSize(512, 512);
	      WaistTop.mirror = true;
	      setRotation(WaistTop, 0F, 0F, 0F);
	      Torso = new ModelRenderer(this, 65, 47);
	      Torso.addBox(0F, 0F, 0F, 10, 6, 4);
	      Torso.setRotationPoint(-5F, 4.5F, -3F);
	      Torso.setTextureSize(512, 512);
	      Torso.mirror = true;
	      setRotation(Torso, 0F, 0F, 0F);
	      Chest = new ModelRenderer(this, 69, 65);
	      Chest.addBox(0F, 0F, 0F, 8, 4, 1);
	      Chest.setRotationPoint(-4F, 5.5F, -3.5F);
	      Chest.setTextureSize(512, 512);
	      Chest.mirror = true;
	      setRotation(Chest, 0F, 0F, 0F);
	      Arm1 = new ModelRenderer(this, 43, 47);
	      Arm1.addBox(0F, 0F, 0F, 3, 11, 4);
	      Arm1.setRotationPoint(-8F, 4.5F, -3F);
	      Arm1.setTextureSize(512, 512);
	      Arm1.mirror = true;
	      setRotation(Arm1, 0F, 0F, 0F);
	      Arm2 = new ModelRenderer(this, 43, 47);
	      Arm2.addBox(0F, 0F, 0F, 3, 11, 4);
	      Arm2.setRotationPoint(5F, 4.5F, -3F);
	      Arm2.setTextureSize(512, 512);
	      Arm2.mirror = true;
	      setRotation(Arm2, 0F, 0F, 0F);
	      Head = new ModelRenderer(this, 80, 0);
	      Head.addBox(0F, 0F, 0F, 8, 8, 8);
	      Head.setRotationPoint(-4F, -4.5F, -5F);
	      Head.setTextureSize(512, 512);
	      Head.mirror = true;
	      setRotation(Head, 0F, 0F, 0F);
	      Neck = new ModelRenderer(this, 47, 44);
	      Neck.addBox(0F, 0F, 0F, 2, 2, 2);
	      Neck.setRotationPoint(-1F, 2.5F, -2F);
	      Neck.setTextureSize(512, 512);
	      Neck.mirror = true;
	      setRotation(Neck, 0F, 0F, 0F);
	      Pupils = new ModelRenderer(this, 64, 9);
	      Pupils.addBox(0F, 0F, 0F, 1, 1, 1);
	      Pupils.setRotationPoint(-2.3F, -0.7F, -5.2F);
	      Pupils.setTextureSize(512, 512);
	      Pupils.mirror = true;
	      setRotation(Pupils, 0F, 0F, 0F);
	      Mouth = new ModelRenderer(this, 88, 34);
	      Mouth.addBox(0F, 0F, 0F, 1, 1, 1);
	      Mouth.setRotationPoint(-0.5F, 2F, -5.1F);
	      Mouth.setTextureSize(512, 512);
	      Mouth.mirror = true;
	      setRotation(Mouth, 0.7853982F, 0F, 0F);
	      Hair1 = new ModelRenderer(this, 0, 105);
	      Hair1.addBox(0F, 0F, 0F, 6, 1, 1);
	      Hair1.setRotationPoint(-3F, -4.5F, -5.5F);
	      Hair1.setTextureSize(512, 512);
	      Hair1.mirror = true;
	      setRotation(Hair1, 0F, 0F, 0F);
	      Hair2 = new ModelRenderer(this, 0, 113);
	      Hair2.addBox(0F, 0F, 0F, 6, 1, 8);
	      Hair2.setRotationPoint(-3F, -5F, -5F);
	      Hair2.setTextureSize(512, 512);
	      Hair2.mirror = true;
	      setRotation(Hair2, 0F, 0F, 0F);
	      Hair3 = new ModelRenderer(this, 0, 113);
	      Hair3.addBox(0F, 0F, 0F, 8, 1, 6);
	      Hair3.setRotationPoint(-4F, -5F, -4F);
	      Hair3.setTextureSize(512, 512);
	      Hair3.mirror = true;
	      setRotation(Hair3, 0F, 0F, 0F);
	      Hair4 = new ModelRenderer(this, 0, 105);
	      Hair4.addBox(0F, 0F, 0F, 5, 1, 1);
	      Hair4.setRotationPoint(-1F, -3.5F, -5.5F);
	      Hair4.setTextureSize(512, 512);
	      Hair4.mirror = true;
	      setRotation(Hair4, 0F, 0F, 0F);
	      Hair5 = new ModelRenderer(this, 0, 105);
	      Hair5.addBox(0F, 0F, 0F, 1, 2, 1);
	      Hair5.setRotationPoint(-3F, -4F, -5.5F);
	      Hair5.setTextureSize(512, 512);
	      Hair5.mirror = true;
	      setRotation(Hair5, 0F, 0F, 0F);
	      Hair6 = new ModelRenderer(this, 0, 105);
	      Hair6.addBox(0F, 0F, 0F, 1, 3, 1);
	      Hair6.setRotationPoint(-4F, -3.5F, -5.5F);
	      Hair6.setTextureSize(512, 512);
	      Hair6.mirror = true;
	      setRotation(Hair6, 0F, 0F, 0F);
	      Hair7 = new ModelRenderer(this, 0, 105);
	      Hair7.addBox(0F, 0F, 0F, 4, 2, 1);
	      Hair7.setRotationPoint(0F, -3F, -5.5F);
	      Hair7.setTextureSize(512, 512);
	      Hair7.mirror = true;
	      setRotation(Hair7, 0F, 0F, 0F);
	      Hair8 = new ModelRenderer(this, 0, 105);
	      Hair8.addBox(0F, 0F, 0F, 1, 3, 1);
	      Hair8.setRotationPoint(-4.5F, -3.5F, -5F);
	      Hair8.setTextureSize(512, 512);
	      Hair8.mirror = true;
	      setRotation(Hair8, 0F, 0F, 0F);
	      Hair9 = new ModelRenderer(this, 0, 105);
	      Hair9.addBox(0F, 0F, 0F, 1, 6, 7);
	      Hair9.setRotationPoint(-4.5F, -3.5F, -4F);
	      Hair9.setTextureSize(512, 512);
	      Hair9.mirror = true;
	      setRotation(Hair9, 0F, 0F, 0F);
	      Hair10 = new ModelRenderer(this, 0, 105);
	      Hair10.addBox(0F, 0F, 0F, 6, 1, 1);
	      Hair10.setRotationPoint(-3F, -4.5F, 2.5F);
	      Hair10.setTextureSize(512, 512);
	      Hair10.mirror = true;
	      setRotation(Hair10, 0F, 0F, 0F);
	      Hair11 = new ModelRenderer(this, 0, 105);
	      Hair11.addBox(0F, 0F, 0F, 1, 1, 6);
	      Hair11.setRotationPoint(-4.5F, -4.5F, -4F);
	      Hair11.setTextureSize(512, 512);
	      Hair11.mirror = true;
	      setRotation(Hair11, 0F, 0F, 0F);
	      Hair12 = new ModelRenderer(this, 0, 105);
	      Hair12.addBox(0F, 0F, 0F, 3, 1, 1);
	      Hair12.setRotationPoint(1F, -1F, -5.5F);
	      Hair12.setTextureSize(512, 512);
	      Hair12.mirror = true;
	      setRotation(Hair12, 0F, 0F, 0F);
	      Hair13 = new ModelRenderer(this, 0, 105);
	      Hair13.addBox(0F, 0F, 0F, 3, 1, 1);
	      Hair13.setRotationPoint(0.5F, 0.5F, -5.5F);
	      Hair13.setTextureSize(512, 512);
	      Hair13.mirror = true;
	      setRotation(Hair13, 0F, 0F, -0.4461433F);
	      Hair14 = new ModelRenderer(this, 0, 105);
	      Hair14.addBox(0F, 0F, 0F, 2, 2, 1);
	      Hair14.setRotationPoint(2F, 0F, -5.5F);
	      Hair14.setTextureSize(512, 512);
	      Hair14.mirror = true;
	      setRotation(Hair14, 0F, 0F, 0F);
	      Hair15 = new ModelRenderer(this, 0, 105);
	      Hair15.addBox(0F, 0F, 0F, 1, 1, 1);
	      Hair15.setRotationPoint(-4.5F, 0F, -4.9F);
	      Hair15.setTextureSize(512, 512);
	      Hair15.mirror = true;
	      setRotation(Hair15, 0F, 0F, 0F);
	      Hair16 = new ModelRenderer(this, 0, 105);
	      Hair16.addBox(0F, 0F, 0F, 1, 1, 6);
	      Hair16.setRotationPoint(-4.5F, 2F, -3F);
	      Hair16.setTextureSize(512, 512);
	      Hair16.mirror = true;
	      setRotation(Hair16, 0F, 0F, 0F);
	      Hair17 = new ModelRenderer(this, 0, 105);
	      Hair17.addBox(0F, 0F, 0F, 1, 1, 1);
	      Hair17.setRotationPoint(2.5F, 1.3F, -5.5F);
	      Hair17.setTextureSize(512, 512);
	      Hair17.mirror = true;
	      setRotation(Hair17, 0F, 0F, 0F);
	      Hair18 = new ModelRenderer(this, 0, 113);
	      Hair18.addBox(0F, 0F, 0F, 8, 8, 2);
	      Hair18.setRotationPoint(-4F, -3.5F, 1.5F);
	      Hair18.setTextureSize(512, 512);
	      Hair18.mirror = true;
	      setRotation(Hair18, 0F, 0F, 0F);
	      HairBack = new ModelRenderer(this, 0, 105);
	      HairBack.addBox(0F, 0F, 0F, 9, 14, 2);
	      HairBack.setRotationPoint(-4.5F, 4F, 1.5F);
	      HairBack.setTextureSize(512, 512);
	      HairBack.mirror = true;
	      setRotation(HairBack, 0F, 0F, 0F);
	      Hair19 = new ModelRenderer(this, 0, 105);
	      Hair19.addBox(0F, 0F, 0F, 1, 1, 5);
	      Hair19.setRotationPoint(-4.5F, 3F, -2F);
	      Hair19.setTextureSize(512, 512);
	      Hair19.mirror = true;
	      setRotation(Hair19, 0F, 0F, 0F);
	      HairStick1 = new ModelRenderer(this, 0, 105);
	      HairStick1.addBox(0F, 0F, 0F, 1, 2, 4);
	      HairStick1.setRotationPoint(3F, 6F, 3F);
	      HairStick1.setTextureSize(512, 512);
	      HairStick1.mirror = true;
	      setRotation(HairStick1, 0F, 1.041001F, 0.3346075F);
	      HairStick2 = new ModelRenderer(this, 0, 105);
	      HairStick2.addBox(0F, 0F, 0F, 1, 2, 4);
	      HairStick2.setRotationPoint(-3F, 10F, 2F);
	      HairStick2.setTextureSize(512, 512);
	      HairStick2.mirror = true;
	      setRotation(HairStick2, 0F, -1.041001F, 0.3346075F);
	      HairStick3 = new ModelRenderer(this, 0, 105);
	      HairStick3.addBox(0F, 0F, 0F, 1, 2, 4);
	      HairStick3.setRotationPoint(3F, 12F, 3F);
	      HairStick3.setTextureSize(512, 512);
	      HairStick3.mirror = true;
	      setRotation(HairStick3, -0.1115358F, 1.041001F, 0.0743572F);
	      Hair20 = new ModelRenderer(this, 0, 105);
	      Hair20.addBox(0F, 0F, 0F, 1, 6, 7);
	      Hair20.setRotationPoint(3.5F, -2F, -4F);
	      Hair20.setTextureSize(512, 512);
	      Hair20.mirror = true;
	      setRotation(Hair20, 0F, 0F, 0F);
	      Hair21 = new ModelRenderer(this, 0, 105);
	      Hair21.addBox(0F, 0F, 0F, 1, 5, 1);
	      Hair21.setRotationPoint(3.5F, -3.5F, -5F);
	      Hair21.setTextureSize(512, 512);
	      Hair21.mirror = true;
	      setRotation(Hair21, 0F, 0F, 0F);
	      Hair22 = new ModelRenderer(this, 0, 105);
	      Hair22.addBox(0F, 0F, 0F, 1, 5, 1);
	      Hair22.setRotationPoint(3.5F, -3F, -5F);
	      Hair22.setTextureSize(512, 512);
	      Hair22.mirror = true;
	      setRotation(Hair22, 0F, 0F, 0F);
	      Hair23 = new ModelRenderer(this, 0, 105);
	      Hair23.addBox(0F, 0F, 0F, 1, 1, 6);
	      Hair23.setRotationPoint(3.5F, -4.5F, -4F);
	      Hair23.setTextureSize(512, 512);
	      Hair23.mirror = true;
	      setRotation(Hair23, 0F, 0F, 0F);
	      Hair24 = new ModelRenderer(this, 0, 105);
	      Hair24.addBox(0F, 0F, 0F, 1, 5, 7);
	      Hair24.setRotationPoint(3.5F, -3.5F, -4F);
	      Hair24.setTextureSize(512, 512);
	      Hair24.mirror = true;
	      setRotation(Hair24, 0F, 0F, 0F);
	      Hair25 = new ModelRenderer(this, 0, 105);
	      Hair25.addBox(0F, 0F, 0F, 7, 1, 2);
	      Hair25.setRotationPoint(-2.5F, 18F, 1.5F);
	      Hair25.setTextureSize(512, 512);
	      Hair25.mirror = true;
	      setRotation(Hair25, 0F, 0F, 0F);
	      Hair26 = new ModelRenderer(this, 0, 105);
	      Hair26.addBox(0F, 0F, 0F, 6, 2, 2);
	      Hair26.setRotationPoint(-3F, 19F, 1.5F);
	      Hair26.setTextureSize(512, 512);
	      Hair26.mirror = true;
	      setRotation(Hair26, 0F, 0F, 0F);
	      Hair27 = new ModelRenderer(this, 0, 105);
	      Hair27.addBox(0F, 0F, 0F, 5, 2, 2);
	      Hair27.setRotationPoint(-4F, 20F, 1.5F);
	      Hair27.setTextureSize(512, 512);
	      Hair27.mirror = true;
	      setRotation(Hair27, 0F, 0F, 0F);
	      Eyetop = new ModelRenderer(this, 0, 0);
	      Eyetop.addBox(0F, 0F, 0F, 2, 1, 1);
	      Eyetop.setRotationPoint(-3F, -1F, -5.1F);
	      Eyetop.setTextureSize(512, 512);
	      Eyetop.mirror = true;
	      setRotation(Eyetop, 0F, 0F, 0F);
	      Eyebottom = new ModelRenderer(this, 0, 0);
	      Eyebottom.addBox(0F, 0F, 0F, 2, 1, 1);
	      Eyebottom.setRotationPoint(-3F, -0.5F, -5.1F);
	      Eyebottom.setTextureSize(512, 512);
	      Eyebottom.mirror = true;
	      setRotation(Eyebottom, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    Foot1.render(f5);
	    Toe1.render(f5);
	    Leg1.render(f5);
	    Leg2.render(f5);
	    Foot2.render(f5);
	    Toe2.render(f5);
	    WaistBottom.render(f5);
	    FlapFont.render(f5);
	    FlapBack.render(f5);
	    WaistTop.render(f5);
	    Torso.render(f5);
	    Chest.render(f5);
	    Arm1.render(f5);
	    Arm2.render(f5);
	    Head.render(f5);
	    Neck.render(f5);
	    Pupils.render(f5);
	    Mouth.render(f5);
	    Hair1.render(f5);
	    Hair2.render(f5);
	    Hair3.render(f5);
	    Hair4.render(f5);
	    Hair5.render(f5);
	    Hair6.render(f5);
	    Hair7.render(f5);
	    Hair8.render(f5);
	    Hair9.render(f5);
	    Hair10.render(f5);
	    Hair11.render(f5);
	    Hair12.render(f5);
	    Hair13.render(f5);
	    Hair14.render(f5);
	    Hair15.render(f5);
	    Hair16.render(f5);
	    Hair17.render(f5);
	    Hair18.render(f5);
	    HairBack.render(f5);
	    Hair19.render(f5);
	    HairStick1.render(f5);
	    HairStick2.render(f5);
	    HairStick3.render(f5);
	    Hair20.render(f5);
	    Hair21.render(f5);
	    Hair22.render(f5);
	    Hair23.render(f5);
	    Hair24.render(f5);
	    Hair25.render(f5);
	    Hair26.render(f5);
	    Hair27.render(f5);
	    Eyetop.render(f5);
	    Eyebottom.render(f5);
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
