package com.steveuniverse.blocks;

import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.main.StevesUniverse;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block alexandrite_block, amethyst_block, amethyst_ore, 
	garnet_block, ash_block, jasper_block, jasper_ore, malachite_block, opal_block, 
	pearl_block, pearl_ore, peridot_block, peridot_ore, rainbow_block, 
	rose_block, rose_ore, ruby_block, sapphire_block, sapphire_ore, 
	sardonyx_block, sugilite_block, ruby_ore;
	
	public static void mainRegistry(){
		initBlocks();
		regBlock();
	}
	
	public static String modid = StevesUniverse.MODID;
	
	public static void initBlocks(){

		alexandrite_block = new SUBlock(Material.iron).setBlockName("alexandrite_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":alexandrite_block");
		amethyst_block = new SUBlock(Material.iron).setBlockName("amethyst_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":amethyst_block");
		amethyst_ore = new SUBlock(Material.rock).setBlockName("amethyst_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":amethyst_ore");
		ash_block = new ash_block().setBlockName("ash_block").setBlockTextureName(StevesUniverse.MODID + ":ash_block");
		garnet_block = new SUBlock(Material.iron).setBlockName("garnet_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":garnet_block");
		jasper_block = new SUBlock(Material.iron).setBlockName("jasper_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":jasper_block");
		jasper_ore = new SUBlock(Material.rock).setBlockName("jasper_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":jasper_ore");
		malachite_block = new SUBlock(Material.iron).setBlockName("malachite_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":malachite_block");
		opal_block = new SUBlock(Material.iron).setBlockName("opal_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":opal_block");
		pearl_block = new SUBlock(Material.iron).setBlockName("pearl_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":pearl_block");
		pearl_ore = new SUBlock(Material.rock).setBlockName("pearl_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":pearl_ore");
		peridot_block = new SUBlock(Material.iron).setBlockName("peridot_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":peridot_block");
		peridot_ore = new SUBlock(Material.rock).setBlockName("peridot_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":peridot_ore");
		rainbow_block = new SUBlock(Material.iron).setBlockName("rainbow_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":rainbow_block");
		rose_block = new SUBlock(Material.iron).setBlockName("rose_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":rose_block");
		rose_ore = new SUBlock(Material.rock).setBlockName("rose_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":rose_ore");
		ruby_block = new SUBlock(Material.iron).setBlockName("ruby_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":ruby_block");
		ruby_ore = new SUBlock(Material.rock).setBlockName("ruby_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":ruby_ore");
		sapphire_block = new SUBlock(Material.iron).setBlockName("sapphire_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":sapphire_block");
		sapphire_ore = new SUBlock(Material.rock).setBlockName("sapphire_ore").setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(StevesUniverse.MODID + ":sapphire_ore");
		sardonyx_block = new SUBlock(Material.iron).setBlockName("sardonyx_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":sardonyx_block");
		sugilite_block = new SUBlock(Material.iron).setBlockName("sugilite_block").setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(StevesUniverse.MODID + ":sugilite_block");
	}
	public static void regBlock(){
		GameRegistry.registerBlock(alexandrite_block, "alexandrite_block");
		GameRegistry.registerBlock(amethyst_block, "amethyst_block");
		GameRegistry.registerBlock(amethyst_ore, "amethyst_ore");
		GameRegistry.registerBlock(ash_block, "ash_block");
		GameRegistry.registerBlock(garnet_block, "garnet_block");
		GameRegistry.registerBlock(jasper_block, "jasper_block");
		GameRegistry.registerBlock(jasper_ore, "jasper_ore");
		GameRegistry.registerBlock(malachite_block, "malachite_block");
		GameRegistry.registerBlock(opal_block, "opal_block");
		GameRegistry.registerBlock(pearl_block, "pearl_block");
		GameRegistry.registerBlock(pearl_ore, "pearl_ore");
		GameRegistry.registerBlock(peridot_block, "peridot_block");
		GameRegistry.registerBlock(peridot_ore, "peridot_ore");
		GameRegistry.registerBlock(rainbow_block, "rainbow_block");
		GameRegistry.registerBlock(rose_block, "rose_block");
		GameRegistry.registerBlock(rose_ore, "rose_ore");
		GameRegistry.registerBlock(ruby_block, "ruby_block");
		GameRegistry.registerBlock(ruby_ore, "ruby_ore");
		GameRegistry.registerBlock(sapphire_block, "sapphire_block");
		GameRegistry.registerBlock(sapphire_ore, "sapphire_ore");
		GameRegistry.registerBlock(sardonyx_block, "sardonyx_block");
		GameRegistry.registerBlock(sugilite_block, "sugilite_block");
	}
}