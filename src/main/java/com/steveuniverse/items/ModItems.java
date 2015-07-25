package com.steveuniverse.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;

public class ModItems {
	
	public static void MainRegistry(){
		initItems();
		regItems();
	}
	
	public static Item amethyst_heart, amethyst_whip, bagel, chips, cookie_cat, creamed_corn, dog_nut, 
	durian_juice, fry_bits, giant_woman, jasper_crashhelmet, jasper_heart, lapis_heart, lapis_hydro, 
	pearl_heart, pearl_spear, peridot_claw, peridot_heart, rose_heart, rose_sword, ruby_glove, ruby_heart, ruby_kick, sapphire_glove, 
	sapphire_heart, sapphire_screech, rose_shield, steven_uklele, whip_it_up;
	
	public static void initItems(){
		amethyst_heart = new amethyst_heart();
		amethyst_whip = new amethyst_whip();
		bagel = new ItemFood(3, false);
		chips = new ItemFood(4, false);
		cookie_cat = new ItemFood(10, false);
		creamed_corn = new ItemFood(5, false);
		dog_nut = new ItemFood(7, false);
		durian_juice = new ItemFood(3, false);
		fry_bits = new ItemFood(4, false);
		giant_woman = new Item();
		jasper_crashhelmet = new Item();
		jasper_heart = new jasper_heart();
		lapis_heart = new lapis_heart();
		lapis_hydro = new Item();
		pearl_heart = new pearl_heart();
		pearl_spear = new pearl_spear(null);
		peridot_claw = new peridot_claw();
		peridot_heart = new peridot_heart();
		rose_heart = new rose_heart();
		rose_sword = new ItemSword(null);
		ruby_glove = new Item();
		ruby_heart = new Item();
		ruby_kick = new Item();
		sapphire_screech = new Item();
		sapphire_glove = new Item();
		sapphire_heart = new Item();
		steven_uklele = new Item();
		whip_it_up = new ItemFood(6, false);
		
		
	}

	public static void regItems(){
		GameRegistry.registerItem(amethyst_heart, "amethyst_heart");
		GameRegistry.registerItem(amethyst_whip, "amethyst_whip");
		GameRegistry.registerItem(bagel, "bagel");
		GameRegistry.registerItem(chips, "chips");
		GameRegistry.registerItem(cookie_cat, "cookie_cat");
		GameRegistry.registerItem(creamed_corn, "creamed_corn");
		GameRegistry.registerItem(dog_nut, "dog_nut");
		GameRegistry.registerItem(durian_juice, "durian_juice");
		GameRegistry.registerItem(fry_bits, "fry_bits");
		GameRegistry.registerItem(giant_woman, "giant_woman");
		GameRegistry.registerItem(jasper_crashhelmet, "jasper_crashhelmet");
		GameRegistry.registerItem(jasper_heart, "jasper_heart");
		GameRegistry.registerItem(lapis_heart, "lapis_heart");
		GameRegistry.registerItem(lapis_hydro, "lapis_hydro");
		GameRegistry.registerItem(pearl_heart, "pearl_heart");
		GameRegistry.registerItem(pearl_spear, "pearl_spear");
		GameRegistry.registerItem(peridot_claw, "peridot_claw");
		GameRegistry.registerItem(peridot_heart, "peridot_heart");
		GameRegistry.registerItem(rose_heart, "rose_heart");
		GameRegistry.registerItem(rose_shield, "rose_shield");
		GameRegistry.registerItem(rose_sword, "rose_sword");
		GameRegistry.registerItem(ruby_glove, "ruby_glove");
		GameRegistry.registerItem(ruby_heart, "ruby_heart");
		GameRegistry.registerItem(ruby_kick, "ruby_kick");
		GameRegistry.registerItem(sapphire_glove, "sapphire_glove");
		GameRegistry.registerItem(sapphire_heart, "sapphire_heart");
		GameRegistry.registerItem(sapphire_screech, "sapphire_screech");
		GameRegistry.registerItem(steven_uklele, "steven_uklele");
		GameRegistry.registerItem(whip_it_up, "whip_it_up");
		
	}
}
