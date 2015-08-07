package com.steveuniverse.items;

import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.main.StevesUniverse;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static void MainRegistry(){
		initItems();
		regItems();
	}
	
	public static Item alexandrite, amethyst, amethyst_heart, amethyst_whip, bagel, chips, cookie_cat, creamed_corn, dog_nut, 
	durian_juice, fry_bits, garnet, garnet_gauntlet, giant_woman, jasper, jasper_crashhelmet, jasper_heart, lapis_heart, lapis_hydro, lapis_wings,
	malachite, malachite_hydro, opal, opal_bow, pearl, pearl_heart, pearl_spear, peridot, peridot_claw, peridot_heart, rainbow, rose,
	rose_heart, rose_sword, rose_shield, ruby_glove, ruby, ruby_heart, sapphire, sapphire_glove, sapphire_heart, sapphire_screech,
	sardonyx, sardonyx_hammer, steven_ukulele, sugilite, sugilite_flail, together_breakfast, whip_it_up;
	
	public static ToolMaterial Pearl = EnumHelper.addToolMaterial("Pearl", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Rose = EnumHelper.addToolMaterial("Rose", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Quartz = EnumHelper.addToolMaterial("Quartz", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 3, 1000000, 16.0f, 10.5f, 1);
	
	public static void initItems(){

		alexandrite = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":alexandrite_gem").setUnlocalizedName("alexandrite");
		amethyst = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst_gem").setUnlocalizedName("amethyst");
		amethyst_heart = new amethyst_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst_gem").setUnlocalizedName("amethyst_heart");
		amethyst_whip = new amethyst_whip().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst_whip").setUnlocalizedName("amethyst_whip");
		bagel = new ItemFood(3, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":bagel_sandwich").setUnlocalizedName("bagel");
		chips = new ItemFood(4, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":chips").setUnlocalizedName("chips");
		cookie_cat = new ItemFood(10, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":cookie_cat").setUnlocalizedName("cookie_cat");
		creamed_corn = new ItemFood(5, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":creamed_corn").setUnlocalizedName("creamed_corn");
		dog_nut = new ItemFood(7, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":dog_nut").setUnlocalizedName("dog_nut");
		durian_juice = new ItemFood(3, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":durian_juice").setUnlocalizedName("durian_juice");
		fry_bits = new ItemFood(4, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":fry_bits").setUnlocalizedName("fry_bits");
		garnet = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":garnet_gem").setUnlocalizedName("garnet_gem");
		garnet_gauntlet = new garnet_gauntlet(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":garnet_gauntlet").setUnlocalizedName("garnet_gauntlet");
		//		giant_woman = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":giant_woman").setUnlocalizedName("giant_woman");
		jasper = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_gem").setUnlocalizedName("jasper_gem");
		jasper_crashhelmet = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_crashhelmet").setUnlocalizedName("jasper_crashhelmet");
		jasper_heart = new jasper_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_gem").setUnlocalizedName("jasper_heart");
		lapis_heart = new lapis_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapis_gem").setUnlocalizedName("lapis_heart");
		lapis_wings = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapis_wings").setUnlocalizedName("lapis_wings");
		malachite = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":malachite_gem").setUnlocalizedName("malachite");
		malachite_hydro = new malachite_hydro(Pearl).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":malachite_hydro").setUnlocalizedName("malachite_hydro");
		opal = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":opal_gem").setUnlocalizedName("opal");
//		opal_bow = new opal_bow().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":opal_bow").setUnlocalizedName("opal_bow");
		pearl = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl_gem").setUnlocalizedName("pearl");
		pearl_heart = new pearl_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl_gem").setUnlocalizedName("pearl_heart");
		pearl_spear = new pearl_spear(Pearl).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl_spear").setUnlocalizedName("pearl_spear");
		peridot = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot_gem").setUnlocalizedName("peridot");
		peridot_claw = new peridot_claw().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot_claw").setUnlocalizedName("peridot_claw");
		peridot_heart = new peridot_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot_gem").setUnlocalizedName("peridot_heart");
		rainbow = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rainbow_gem").setUnlocalizedName("rainbow");
		rose = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_gem").setUnlocalizedName("rose");
		rose_heart = new rose_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_gem").setUnlocalizedName("rose_heart");
		rose_sword = new ItemSword(Rose).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sword").setUnlocalizedName("rose");
		rose_shield = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sheild").setUnlocalizedName("rose_sheild");
		ruby = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby_gem").setUnlocalizedName("ruby");
		ruby_glove = new ruby_glove(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby_glove").setUnlocalizedName("ruby_glove");
		ruby_heart = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby_gem").setUnlocalizedName("ruby_heart");
		sapphire = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire_gem").setUnlocalizedName("sapphire");
//		sapphire_screech = new Item().setTextureName(StevesUniverse.MODID + ":sonic").setUnlocalizedName("sapphire_screech");
		sapphire_glove = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire_glove").setUnlocalizedName("sapphire_glove");
		sapphire_heart = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire_gem").setUnlocalizedName("sapphire_heart");
		sardonyx = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sardonyx_gem").setUnlocalizedName("sardonyx");
		sardonyx_hammer = new sardonyx_hammer(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sardonyx_hammer").setUnlocalizedName("sardonyx_hammer");
		steven_ukulele = new steven_ukulele().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":steven_ukulele").setUnlocalizedName("steven_ukulele");
		sugilite = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sugilite_gem").setUnlocalizedName("sugilite");
		sugilite_flail = new sugilite_flail(Ruby).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sugilite_flail").setUnlocalizedName("sugilite_flail");
		together_breakfast = new ItemFood(20, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":together_breakfast").setUnlocalizedName("together_breakfast");
		whip_it_up = new ItemFood(6, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":whip_it_up").setUnlocalizedName("whip_it_up");

		
	}

	public static void regItems(){
		GameRegistry.registerItem(alexandrite, "alexandrite");
		GameRegistry.registerItem(amethyst, "amethyst");
		GameRegistry.registerItem(amethyst_heart, "amethyst_heart");
		GameRegistry.registerItem(amethyst_whip, "amethyst_whip");
		GameRegistry.registerItem(bagel, "bagel");
		GameRegistry.registerItem(chips, "chips");
		GameRegistry.registerItem(cookie_cat, "cookie_cat");
		GameRegistry.registerItem(creamed_corn, "creamed_corn");
		GameRegistry.registerItem(dog_nut, "dog_nut");
		GameRegistry.registerItem(durian_juice, "durian_juice");
		GameRegistry.registerItem(fry_bits, "fry_bits");
		GameRegistry.registerItem(garnet, "garnet");
		GameRegistry.registerItem(garnet_gauntlet, "garnet_gauntlet");
//		GameRegistry.registerItem(giant_woman, "giant_woman");
		GameRegistry.registerItem(jasper, "jasper");
		GameRegistry.registerItem(jasper_crashhelmet, "jasper_crashhelmet");
		GameRegistry.registerItem(jasper_heart, "jasper_heart");
		GameRegistry.registerItem(lapis_heart, "lapis_heart");
		GameRegistry.registerItem(lapis_wings, "lapis_wings");
		GameRegistry.registerItem(malachite, "malachite");
		GameRegistry.registerItem(malachite_hydro, "malachite_hydro");
		GameRegistry.registerItem(opal, "opal");
		GameRegistry.registerItem(pearl, "pearl");
		GameRegistry.registerItem(pearl_heart, "pearl_heart");
		GameRegistry.registerItem(pearl_spear, "pearl_spear");
		GameRegistry.registerItem(peridot, "peridot");
		GameRegistry.registerItem(peridot_claw, "peridot_claw");
		GameRegistry.registerItem(peridot_heart, "peridot_heart");
		GameRegistry.registerItem(rainbow, "rainbow");
		GameRegistry.registerItem(rose, "rose");
		GameRegistry.registerItem(rose_heart, "rose_heart");
		GameRegistry.registerItem(rose_shield, "rose_shield");
		GameRegistry.registerItem(rose_sword, "rose_sword");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(ruby_glove, "ruby_glove");
		GameRegistry.registerItem(ruby_heart, "ruby_heart");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(sapphire_glove, "sapphire_glove");
		GameRegistry.registerItem(sapphire_heart, "sapphire_heart");
//		GameRegistry.registerItem(sapphire_screech, "sapphire_screech");
		GameRegistry.registerItem(sardonyx, "sardonyx");
//		GameRegistry.registerItem(sardonyx_hammer, "sardonyx_hammer");
		GameRegistry.registerItem(steven_ukulele, "steven_ukulele");
		GameRegistry.registerItem(sugilite, "sugilite");
//		GameRegistry.registerItem(sugilite_flail, "sugilite_flail");
		GameRegistry.registerItem(together_breakfast, "together_breakfast");
		GameRegistry.registerItem(whip_it_up, "whip_it_up");
		
	}
}
