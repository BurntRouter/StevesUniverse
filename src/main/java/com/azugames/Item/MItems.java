package com.azugames.Item;

import com.azugames.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {

	public static void mainRegistry(){
		InitializeItem ();
		RegisterItem();
		
		
	}
	public static ToolMaterial Pearl = EnumHelper.addToolMaterial("Pearl", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Rose = EnumHelper.addToolMaterial("Rose", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Quartz = EnumHelper.addToolMaterial("Quartz", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 3, 1000000, 16.0f, 10.5f, 1);
	
	public static Item amethyst, pearl, roseq, ruby, sapphire, peridot,
	jasper, sugilite, sardonyx, opal, rainbow, malachite, garnet, alexandrite, amethystH, pearlH, roseqH, rubyH, sapphireH, peridotH, jasperH,
	pearlS, amethystW, roseS, quartzS, peridotC,
	lapisH, sapphireG, sonic, rkick, rubyG, jasperC, lapisW,
	stevenU, GiantW, CrystalG, StrongerTY, ForH, WhatCID, StrongRW, WhereverYA,
	FullD, LapisLS, JamS, Comet, CookieK, OnR, WailingS, StevenAS, 
	DearOD, StevenCG, LilB, 
	cookieC, togetherB, lionL, babyM, chips, fryB, dogN,
	durianJ, donuts1, donuts2, donuts3, fishSP, bagelS, creamC,
	whipI;
	
		public static void InitializeItem (){
		
		amethyst = new Item().setUnlocalizedName("amethyst").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Amethyst");
		sugilite = new Item().setUnlocalizedName("sugilite").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Sugilite");
		garnet = new Item().setUnlocalizedName("garnet").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Garnet");
		rainbow = new Item().setUnlocalizedName("rainbow").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Rainbow");
		opal = new Item().setUnlocalizedName("opal").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Opal");
		malachite = new Item().setUnlocalizedName("malachite").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Malachite");
		alexandrite = new Item().setUnlocalizedName("alexandrite").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Alexandrite");
		sardonyx = new Item().setUnlocalizedName("sardonyx").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Sardonyx");
		sonic = new Item().setUnlocalizedName("sonic").setTextureName(RefStrings.MODID + ":Sonic");
		rkick = new Item().setUnlocalizedName("rkick").setTextureName(RefStrings.MODID + ":RubyKick");
		amethystH = new amethystH().setUnlocalizedName("amethystH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":Amethyst");
		amethystW = new amethystW(Amethyst).setUnlocalizedName("amethystW").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":AmethystW");
		pearlS = new pearlS(Pearl).setUnlocalizedName("pearlS").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":PearlS");
		pearl = new Item().setUnlocalizedName("pearl").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Pearl");
		pearlH = new pearlH().setUnlocalizedName("pearlH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":Pearl");
		roseq = new Item().setUnlocalizedName("roseq").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":RoseQuartzGem");
		roseqH = new roseqH().setUnlocalizedName("roseqH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":RoseQuartzGem");
		ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Ruby");
		sapphire = new Item().setUnlocalizedName("sapphire").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Sapphire");
		peridot = new Item().setUnlocalizedName("peridot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Peridot");
		peridotC = new peridotC().setUnlocalizedName("peridotC").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":PeridotC");
		jasper = new Item().setUnlocalizedName("jasper").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":Jasper");
		jasperH = new jasperH().setUnlocalizedName("jasperH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":Jasper");
		jasperC = new jasperC().setUnlocalizedName("jasperC").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":JasperC");
		roseS = new roseS(Rose).setUnlocalizedName("roseS").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":RoseS");
		quartzS = new quartzS(Quartz).setUnlocalizedName("quartzS").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":QuartzS");
		peridotH = new peridotH().setUnlocalizedName("peridotH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":Peridot");
		lapisH = new lapisH().setUnlocalizedName("lapisH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":LapisLazuli");
		rubyH = new rubyH().setUnlocalizedName("rubyH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":Ruby");
		rubyG = new rubyG(Ruby).setUnlocalizedName("rubyG").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":RubyG");
		sapphireH = new sapphireH().setUnlocalizedName("sapphireH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":Sapphire");
		sapphireG = new sapphireG().setUnlocalizedName("sapphireG").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":SapphireG");
		lapisW = new lapisW().setUnlocalizedName("lapisW").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":LapisW");
		cookieC = new cookieC(2, (float) 0.7, false).setAlwaysEdible().setUnlocalizedName("cookieC").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":CookieC");
		togetherB = new togetherB(2, (float) 1.0, false).setAlwaysEdible().setUnlocalizedName("togetherB").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":TogetherB");
		dogN = new dogN(2, (float) 1.1, false).setAlwaysEdible().setUnlocalizedName("dogN").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":DogN");
		fryB = new fryB(2, (float) 0.8, false).setAlwaysEdible().setUnlocalizedName("fryB").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":FryB");
		chips = new chips(2, (float) 0.7, false).setAlwaysEdible().setUnlocalizedName("chips").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":Chaaaps");
		durianJ = new durianJ(2, (float) 0.5, false).setAlwaysEdible().setUnlocalizedName("durianJ").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":durianJ");
		whipI = new whipI(2, (float) 0.7, false).setAlwaysEdible().setUnlocalizedName("whipI").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":whipI");
		bagelS = new bagelS(2, (float) 1.3, false).setAlwaysEdible().setUnlocalizedName("bagelS").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":bagelS");
		creamC = new creamC(2, (float) 1.2, false).setAlwaysEdible().setUnlocalizedName("creamC").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":creamC");
		stevenU = new stevenU().setUnlocalizedName("stevenU").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":stevenU");
		GiantW = new GiantW().setUnlocalizedName("GiantW").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":GiantW");
		JamS = new JamS().setUnlocalizedName("JamS").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":JamS");
		StrongerTY = new StrongerTY().setUnlocalizedName("StrongerTY").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":StrongerTY");
		WhatCID = new WhatCID().setUnlocalizedName("WhatCID").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":WhatCID");
		ForH = new ForH().setUnlocalizedName("ForH").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":ForH");
		FullD = new FullD().setUnlocalizedName("FullD").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":FullD");
		}
		
	public static void RegisterItem(){
		GameRegistry.registerItem(amethyst, amethyst.getUnlocalizedName());
		GameRegistry.registerItem(sonic, sonic.getUnlocalizedName());
		GameRegistry.registerItem(rkick, rkick.getUnlocalizedName());
		GameRegistry.registerItem(pearl, pearl.getUnlocalizedName());
		GameRegistry.registerItem(pearlH, pearlH.getUnlocalizedName());
		GameRegistry.registerItem(roseq, roseq.getUnlocalizedName());
		GameRegistry.registerItem(roseqH, roseqH.getUnlocalizedName());
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName());
		GameRegistry.registerItem(sapphire, sapphire.getUnlocalizedName());
		GameRegistry.registerItem(sapphireH, sapphireH.getUnlocalizedName());
		GameRegistry.registerItem(sapphireG, sapphireG.getUnlocalizedName());
		GameRegistry.registerItem(peridot, peridot.getUnlocalizedName());
		GameRegistry.registerItem(jasper, jasper.getUnlocalizedName());
		GameRegistry.registerItem(amethystW, amethystW.getUnlocalizedName());
		GameRegistry.registerItem(amethystH, amethystH.getUnlocalizedName());
		GameRegistry.registerItem(pearlS, pearlS.getUnlocalizedName());
		GameRegistry.registerItem(roseS, roseS.getUnlocalizedName());
		GameRegistry.registerItem(quartzS, quartzS.getUnlocalizedName());
		GameRegistry.registerItem(peridotC, peridotC.getUnlocalizedName());
		GameRegistry.registerItem(peridotH, peridotH.getUnlocalizedName());
		GameRegistry.registerItem(lapisH, lapisH.getUnlocalizedName());
		GameRegistry.registerItem(lapisW, lapisW.getUnlocalizedName());
		GameRegistry.registerItem(rubyH, rubyH.getUnlocalizedName());
		GameRegistry.registerItem(rubyG, rubyG.getUnlocalizedName());
		GameRegistry.registerItem(jasperH, jasperH.getUnlocalizedName());
		GameRegistry.registerItem(jasperC, jasperC.getUnlocalizedName());
		GameRegistry.registerItem(cookieC, cookieC.getUnlocalizedName());
		GameRegistry.registerItem(togetherB, togetherB.getUnlocalizedName());
		GameRegistry.registerItem(dogN, dogN.getUnlocalizedName());
		GameRegistry.registerItem(fryB, fryB.getUnlocalizedName());
		GameRegistry.registerItem(chips, chips.getUnlocalizedName());
		GameRegistry.registerItem(durianJ, durianJ.getUnlocalizedName());
		GameRegistry.registerItem(whipI, whipI.getUnlocalizedName());
		GameRegistry.registerItem(bagelS, bagelS.getUnlocalizedName());
		GameRegistry.registerItem(creamC, creamC.getUnlocalizedName());
		GameRegistry.registerItem(GiantW, GiantW.getUnlocalizedName());
		GameRegistry.registerItem(JamS, JamS.getUnlocalizedName());
		GameRegistry.registerItem(StrongerTY, StrongerTY.getUnlocalizedName());
		GameRegistry.registerItem(WhatCID, WhatCID.getUnlocalizedName());
		GameRegistry.registerItem(ForH, ForH.getUnlocalizedName());
		GameRegistry.registerItem(FullD, FullD.getUnlocalizedName());
		GameRegistry.registerItem(stevenU, stevenU.getUnlocalizedName());
		GameRegistry.registerItem(garnet, garnet.getUnlocalizedName());
		GameRegistry.registerItem(opal, opal.getUnlocalizedName());
		GameRegistry.registerItem(rainbow, rainbow.getUnlocalizedName());
		GameRegistry.registerItem(sardonyx, sardonyx.getUnlocalizedName());
		GameRegistry.registerItem(sugilite, sugilite.getUnlocalizedName());
		GameRegistry.registerItem(alexandrite, alexandrite.getUnlocalizedName());
		GameRegistry.registerItem(malachite, malachite.getUnlocalizedName());
	}
}
