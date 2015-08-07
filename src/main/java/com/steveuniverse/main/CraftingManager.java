package com.steveuniverse.main;

import com.steveuniverse.blocks.ModBlocks;
import com.steveuniverse.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {

	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
}
	
	public static void addCraftingRec(){
	//Shaped
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pearl_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.pearl});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ruby_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.ruby});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rose_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.rose});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sapphire_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.sapphire});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.peridot_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.peridot});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.jasper_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.jasper});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.opal_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.opal});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.garnet_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.garnet});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sugilite_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.sugilite});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sardonyx_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.sardonyx});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.alexandrite_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.alexandrite});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rainbow_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.rainbow});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.malachite_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.malachite});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.amethyst_block, 1), new Object[]{"XXX","XXX","XXX", 'X', ModItems.amethyst});
		GameRegistry.addRecipe(new ItemStack(ModItems.amethyst_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.amethyst});
		GameRegistry.addRecipe(new ItemStack(ModItems.pearl_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.pearl});
		GameRegistry.addRecipe(new ItemStack(ModItems.peridot_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.peridot});
		GameRegistry.addRecipe(new ItemStack(ModItems.jasper_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.jasper});
		GameRegistry.addRecipe(new ItemStack(ModItems.ruby_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.ruby});
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphire_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.sapphire});
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(ModItems.rose_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.rose});
		GameRegistry.addRecipe(new ItemStack(ModItems.garnet_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.garnet});
		GameRegistry.addRecipe(new ItemStack(ModItems.opal_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.opal});
		GameRegistry.addRecipe(new ItemStack(ModItems.sugilite_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.sugilite});
		GameRegistry.addRecipe(new ItemStack(ModItems.sardonyx_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.sardonyx});
		GameRegistry.addRecipe(new ItemStack(ModItems.alexandrite_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.alexandrite});
		GameRegistry.addRecipe(new ItemStack(ModItems.rainbow_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.rainbow});
		GameRegistry.addRecipe(new ItemStack(ModItems.malachite_heart, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', ModItems.malachite});
		GameRegistry.addRecipe(new ItemStack(ModItems.cookie_cat, 4), new Object[]{"0C0","MIM","0C0", 'C', Items.cookie, 'M', Items.milk_bucket, 'I', Blocks.ice});
		GameRegistry.addRecipe(new ItemStack(ModItems.together_breakfast, 1), new Object[]{"EAE","WMW","WMW", 'E', Items.egg, 'M', Items.milk_bucket, 'W', Items.wheat, 'A', Items.apple});
		GameRegistry.addRecipe(new ItemStack(ModItems.dog_nut, 3), new Object[]{"CCC","PPP","CCC", 'C', Items.cake, 'P', Items.cooked_porkchop});
		GameRegistry.addRecipe(new ItemStack(ModItems.fry_bits, 8), new Object[]{"0M0","BBB","PPP", 'M', Items.milk_bucket, 'B', Items.baked_potato, 'P', Items.paper});
		GameRegistry.addRecipe(new ItemStack(ModItems.chips, 4), new Object[]{"SBS","PBP","PPP", 'S', Items.sugar, 'B', Items.baked_potato, 'P', Items.paper});
		GameRegistry.addRecipe(new ItemStack(ModItems.durian_juice, 8), new Object[]{"PSP","PAP","PWP", 'S', Items.sugar, 'A', Items.apple, 'P', Items.paper, 'W', Items.water_bucket});
		GameRegistry.addRecipe(new ItemStack(ModItems.whip_it_up, 2), new Object[]{"SSS","SMS","SSS", 'S', Items.sugar, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(ModItems.bagel, 4), new Object[]{"0B0","EPM","0B0", 'B', Items.bread, 'E', Items.egg, 'P', Items.cooked_porkchop, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(ModItems.creamed_corn, 2), new Object[]{"0W0","0W0","0M0", 'W', Items.wheat, 'M', Items.milk_bucket});
	//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sardonyx, 1), ModItems.pearl, ModItems.garnet);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.garnet, 1), ModItems.ruby, ModItems.sapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sugilite, 1), ModItems.amethyst, ModItems.garnet);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.opal, 1), ModItems.pearl, ModItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alexandrite, 1), ModItems.pearl, ModItems.garnet, ModItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rainbow, 1), ModItems.pearl, ModItems.rose);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.malachite, 1), new ItemStack(Items.dye, 1, 4), ModItems.jasper);
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting( ModBlocks.amethyst_ore, new ItemStack(ModItems.amethyst, 1), 20.0f);
		GameRegistry.addSmelting( ModBlocks.pearl_ore, new ItemStack(ModItems.pearl, 1), 20.0f);
		GameRegistry.addSmelting( ModBlocks.rose_ore, new ItemStack(ModItems.rose, 1), 20.0f);
		GameRegistry.addSmelting( ModBlocks.jasper_ore, new ItemStack(ModItems.jasper, 1), 20.0f);
		GameRegistry.addSmelting( ModBlocks.peridot_ore, new ItemStack(ModItems.peridot, 1), 20.0f);
		GameRegistry.addSmelting( ModBlocks.ruby_ore, new ItemStack(ModItems.ruby, 1), 20.0f);
		GameRegistry.addSmelting( ModBlocks.sapphire_ore, new ItemStack(ModItems.sapphire, 1), 20.0f);
		
		
}
}