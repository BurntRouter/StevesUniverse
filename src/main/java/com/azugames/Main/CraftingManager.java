package com.azugames.Main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.azugames.Item.MItems;
import com.azugames.blocks.MBlocks;




import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
}
	
	public static void addCraftingRec(){
	//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.PearlB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.pearl});
		GameRegistry.addRecipe(new ItemStack(MBlocks.RubyB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ruby});
		GameRegistry.addRecipe(new ItemStack(MBlocks.RoseB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.roseq});
		GameRegistry.addRecipe(new ItemStack(MBlocks.SapphireB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.sapphire});
		GameRegistry.addRecipe(new ItemStack(MBlocks.PeridotB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.peridot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.JasperB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.jasper});
		GameRegistry.addRecipe(new ItemStack(MBlocks.AmethystB, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.amethyst});
		GameRegistry.addRecipe(new ItemStack(MItems.amethystH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.amethyst});
		GameRegistry.addRecipe(new ItemStack(MItems.pearlH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.pearl});
		GameRegistry.addRecipe(new ItemStack(MItems.peridotH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.peridot});
		GameRegistry.addRecipe(new ItemStack(MItems.jasperH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.jasper});
		GameRegistry.addRecipe(new ItemStack(MItems.rubyH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.ruby});
		GameRegistry.addRecipe(new ItemStack(MItems.sapphireH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.sapphire});
		GameRegistry.addRecipe(new ItemStack(MItems.lapisH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(MItems.roseqH, 1), new Object[]{"RXR","XGX","RXR", 'X', Items.gold_ingot, 'R', Blocks.redstone_block, 'G', MItems.roseq});
		GameRegistry.addRecipe(new ItemStack(MItems.cookieC, 4), new Object[]{"0C0","MIM","0C0", 'C', Items.cookie, 'M', Items.milk_bucket, 'I', Blocks.ice});
		GameRegistry.addRecipe(new ItemStack(MItems.togetherB, 1), new Object[]{"EAE","WMW","WMW", 'E', Items.egg, 'M', Items.milk_bucket, 'W', Items.wheat, 'A', Items.apple});
		GameRegistry.addRecipe(new ItemStack(MItems.dogN, 3), new Object[]{"CCC","PPP","CCC", 'C', Items.cake, 'P', Items.cooked_porkchop});
		GameRegistry.addRecipe(new ItemStack(MItems.fryB, 8), new Object[]{"0M0","BBB","PPP", 'M', Items.milk_bucket, 'B', Items.baked_potato, 'P', Items.paper});
		GameRegistry.addRecipe(new ItemStack(MItems.chips, 4), new Object[]{"SBS","PBP","PPP", 'S', Items.sugar, 'B', Items.baked_potato, 'P', Items.paper});
		GameRegistry.addRecipe(new ItemStack(MItems.durianJ, 8), new Object[]{"PSP","PAP","PWP", 'S', Items.sugar, 'A', Items.apple, 'P', Items.paper, 'W', Items.water_bucket});
		GameRegistry.addRecipe(new ItemStack(MItems.whipI, 2), new Object[]{"SSS","SMS","SSS", 'S', Items.sugar, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(MItems.bagelS, 4), new Object[]{"0B0","EPM","0B0", 'B', Items.bread, 'E', Items.egg, 'P', Items.cooked_porkchop, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(MItems.creamC, 2), new Object[]{"0W0","0W0","0M0", 'W', Items.wheat, 'M', Items.milk_bucket});
	//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.sardonyx, 1), MItems.pearl, MItems.garnet);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.garnet, 1), MItems.ruby, MItems.sapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.sugilite, 1), MItems.amethyst, MItems.garnet);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.opal, 1), MItems.pearl, MItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.alexandrite, 1), MItems.pearl, MItems.garnet, MItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.rainbow, 1), MItems.pearl, MItems.roseq);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.malachite, 1), new ItemStack(Items.dye, 1, 4), MItems.jasper);
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting( MBlocks.AmethystO, new ItemStack(MItems.amethyst, 1), 20.0f);
		GameRegistry.addSmelting( MBlocks.PearlO, new ItemStack(MItems.pearl, 1), 20.0f);
		GameRegistry.addSmelting( MBlocks.RoseO, new ItemStack(MItems.roseq, 1), 20.0f);
		GameRegistry.addSmelting( MBlocks.JasperO, new ItemStack(MItems.jasper, 1), 20.0f);
		GameRegistry.addSmelting( MBlocks.PeridotO, new ItemStack(MItems.peridot, 1), 20.0f);
		GameRegistry.addSmelting( MBlocks.RubyO, new ItemStack(MItems.ruby, 1), 20.0f);
		GameRegistry.addSmelting( MBlocks.SapphireO, new ItemStack(MItems.sapphire, 1), 20.0f);
		
		
}
}