package com.steveuniverse.blocks;

import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.main.StevesUniverse;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block alexandrite_block, amethyst_block, amethyst_ore, 
	garnet_block, jasper_block, jasper_ore, malachite_block, opal_block, 
	pearl_block, pearl_ore, peridot_block, peridot_ore, rainbow_block, 
	rose_block, rose_ore, ruby_block, sapphire_block, sapphire_ore, 
	sardonyx_block, sugilite_block, ruby_ore;
	
	public static void mainRegistry(){
		initBlocks();
		regBlock();
	}
	
	public static String modid = StevesUniverse.MODID;
	
	public static void initBlocks(){
		alexandrite_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"alexandrite_block").setBlockName("alexandrite_block");
		amethyst_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"amethyst_block").setBlockName("amethyst_block");
		amethyst_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"amethyst_ore").setBlockName("amethyst_ore");
		garnet_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"garnet_block").setBlockName("garnet_block");
		jasper_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"jasper_block").setBlockName("jasper_block");
		jasper_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"jasper_ore").setBlockName("jasper_ore");
		malachite_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"malachite_block").setBlockName("malachite_block");
		opal_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"opal_block").setBlockName("opal_block");
		pearl_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"pearl_block").setBlockName("pearl_block");
		pearl_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"pearl_ore").setBlockName("pearl_ore");
		peridot_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"peridot_block").setBlockName("peridot_block");
		peridot_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"peridot_ore").setBlockName("peridot_ore");
		rainbow_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"rainbow_block").setBlockName("rainbow_block");
		rose_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"rose_block").setBlockName("rose_block");
		rose_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"rose_ore").setBlockName("rose_ore");
		ruby_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"ruby_block").setBlockName("ruby_block");
		ruby_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"sapphire_block").setBlockName("sapphire_block");
		sapphire_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"sapphire_ore").setBlockName("sapphire_ore");
		sapphire_ore = new SUBlock(Material.rock).setCreativeTab(ModCreativeTabs.tabSU).setHardness(4.0F).setBlockTextureName(modid + ":" +"sardonyx_block").setBlockName("sardonyx_block");
		sardonyx_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"sugilite_block").setBlockName("sugulite_block");
		sugilite_block = new SUBlock(Material.iron).setCreativeTab(ModCreativeTabs.tabSU).setLightLevel(1.0F).setHardness(5.0F).setResistance(30F).setBlockTextureName(modid + ":" +"ruby_ore").setBlockName("ruby_block");

	}
	
	public static void regBlock(){
		GameRegistry.registerBlock(alexandrite_block, "alexandrite_block");
		GameRegistry.registerBlock(amethyst_block, "amethyst_block");
		GameRegistry.registerBlock(garnet_block, "garnet_block");
		GameRegistry.registerBlock(jasper_block, "jasper_block");
		GameRegistry.registerBlock(malachite_block, "malachite_block");
		GameRegistry.registerBlock(opal_block, "opal_block");
		GameRegistry.registerBlock(pearl_block, "pearl_block");
		GameRegistry.registerBlock(peridot_block, "peridot_block");
		GameRegistry.registerBlock(rainbow_block, "rainbow_block");
		GameRegistry.registerBlock(rose_block, "rose_block");
		GameRegistry.registerBlock(ruby_block, "ruby_block");
		GameRegistry.registerBlock(ruby_ore, "ruby_ore");
		GameRegistry.registerBlock(sapphire_block, "sapphire_block");
		GameRegistry.registerBlock(sardonyx_block, "sardonyx_block");
		GameRegistry.registerBlock(sugilite_block, "sugilite_block");
		GameRegistry.registerBlock(amethyst_ore, "amethyst_ore");
		GameRegistry.registerBlock(jasper_ore, "jasper_ore");
		GameRegistry.registerBlock(pearl_ore, "pearl_ore");
		GameRegistry.registerBlock(peridot_ore, "peridot_ore");
		GameRegistry.registerBlock(rose_ore, "rose_ore");
		GameRegistry.registerBlock(sapphire_ore, "sapphire_ore");
	}
}