package com.steveuniverse.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block alexandrite_block, amethyst_block, amethyst_ore, 
	garnet_block, jasper_block, jasper_ore, malachite_block, opal_block, 
	pearl_block, pearl_ore, peridot_block, peridot_ore, rainbow_block, 
	rose_block, rose_ore, ruby_block, sapphire_block, sapphire_ore, 
	sardonyx_block, sugilite_block;
	
	public static void mainRegistry(){
		initBlocks();
		regBlock();
	}
	
	public static void initBlocks(){
		alexandrite_block = new SUBlock(Material.iron);
		amethyst_block = new SUBlock(Material.iron);
		amethyst_ore = new SUBlock(Material.rock);
		garnet_block = new SUBlock(Material.iron);
		jasper_block = new SUBlock(Material.iron);
		jasper_ore = new SUBlock(Material.rock);
		malachite_block = new SUBlock(Material.iron);
		opal_block = new SUBlock(Material.iron);
		pearl_block = new SUBlock(Material.iron);
		pearl_ore = new SUBlock(Material.rock);
		peridot_block = new SUBlock(Material.iron);
		peridot_ore = new SUBlock(Material.rock);
		rainbow_block = new SUBlock(Material.iron);
		rose_block = new SUBlock(Material.iron);
		rose_ore = new SUBlock(Material.rock);
		ruby_block = new SUBlock(Material.iron);
		sapphire_block = new SUBlock(Material.iron);
		sapphire_ore = new SUBlock(Material.rock);
		sardonyx_block = new SUBlock(Material.iron);
		sugilite_block = new SUBlock(Material.iron);
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
