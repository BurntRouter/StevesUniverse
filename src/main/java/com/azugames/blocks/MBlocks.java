package com.azugames.blocks;

import com.azugames.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {

	public static void mainRegistry(){
		InitializeBlock ();
		RegisterItem();
		
		
	}
	
		public static Block AmethystB, PearlB, RoseB, RubyB, SapphireB, PeridotB,
		JasperB, AmethystO, PearlO, RoseO, PeridotO, JasperO, RubyO, SapphireO, OpalB,
		GarnetB, SugiliteB, SardonyxB, RainbowB, MalachiteB, AlexandriteB;
	
		public static void InitializeBlock (){
			AmethystB = new AmethystB (Material.iron).setBlockName("AmethystB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":AmethystB");
			AmethystO = new AmethystO (Material.rock).setBlockName("AmethystO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":AmethystO");
			RoseB = new RoseB (Material.iron).setBlockName("RoseB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RoseB");
			RoseO = new RoseO (Material.rock).setBlockName("RoseO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RoseQ");
			PearlB = new PearlB (Material.iron).setBlockName("PearlB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PearlB");
			PearlO = new PearlO (Material.rock).setBlockName("PearlO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PearlO");
			PeridotO = new PeridotO (Material.rock).setBlockName("PeridotO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PeridotO");
			JasperO = new JasperO (Material.rock).setBlockName("JasperO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":JasperO");
			RubyB = new RubyB (Material.iron).setBlockName("RubyB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RubyB");
			SapphireB = new SapphireB (Material.iron).setBlockName("SapphireB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":SapphireB");
			RubyO = new RubyO (Material.rock).setBlockName("RubyO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RubyO");
			SapphireO = new SapphireO (Material.rock).setBlockName("SapphireO").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":SapphireO");
			PeridotB = new PeridotB (Material.iron).setBlockName("PeridotB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PeridotB");
			JasperB = new JasperB (Material.iron).setBlockName("JasperB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":JasperB");
			OpalB = new OpalB (Material.iron).setBlockName("OpalB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":OpalB");
			GarnetB = new GarnetB (Material.iron).setBlockName("GarnetB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":GarnetB");
			SugiliteB = new SugiliteB (Material.iron).setBlockName("SugiliteB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":SugiliteB");
			SardonyxB = new SardonyxB (Material.iron).setBlockName("SardonyxB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":SardonyxB");
			AlexandriteB = new AlexandriteB (Material.iron).setBlockName("AlexandriteB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":AlexandriteB");
			RainbowB = new RainbowB (Material.iron).setBlockName("RainbowB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RainbowB");
			MalachiteB = new MalachiteB (Material.iron).setBlockName("MalachiteB").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":MalachiteB");
		}
		
	public static void RegisterItem(){
		GameRegistry.registerBlock(AmethystB,AmethystB.getUnlocalizedName());
		GameRegistry.registerBlock(AmethystO,AmethystO.getUnlocalizedName());
		GameRegistry.registerBlock(PearlB, PearlB.getUnlocalizedName());
		GameRegistry.registerBlock(PearlO, PearlO.getUnlocalizedName());
		GameRegistry.registerBlock(RoseB,RoseB.getUnlocalizedName());
		GameRegistry.registerBlock(RoseO,RoseO.getUnlocalizedName());
		GameRegistry.registerBlock(RubyB, RubyB.getUnlocalizedName());
		GameRegistry .registerBlock(SapphireB, SapphireB.getUnlocalizedName());
		GameRegistry .registerBlock(PeridotB, PeridotB.getUnlocalizedName());
		GameRegistry .registerBlock(JasperB, JasperB.getUnlocalizedName());
		GameRegistry .registerBlock(PeridotO, PeridotO.getUnlocalizedName());
		GameRegistry .registerBlock(JasperO, JasperO.getUnlocalizedName());
		GameRegistry .registerBlock(RubyO, RubyO.getUnlocalizedName());
		GameRegistry .registerBlock(SapphireO, SapphireO.getUnlocalizedName());
		GameRegistry .registerBlock(OpalB, OpalB.getUnlocalizedName());
		GameRegistry .registerBlock(GarnetB, GarnetB.getUnlocalizedName());
		GameRegistry .registerBlock(SugiliteB, SugiliteB.getUnlocalizedName());
		GameRegistry .registerBlock(SardonyxB, SardonyxB.getUnlocalizedName());
		GameRegistry .registerBlock(AlexandriteB, AlexandriteB.getUnlocalizedName());
		GameRegistry .registerBlock(RainbowB, RainbowB.getUnlocalizedName());
		GameRegistry .registerBlock(MalachiteB, MalachiteB.getUnlocalizedName());
}
	
}

