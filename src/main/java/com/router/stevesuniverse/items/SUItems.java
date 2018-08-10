package com.router.stevesuniverse.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class SUItems {
	public static ItemBase alexandrite = new ItemBase("alexandrite");
	public static ItemBase alexandrite_heart = new ItemBase("alexandrite_heart");
	public static ItemBase amethyst = new ItemBase("amethyst");
	public static ItemBase amethyst_heart = new ItemBase("amethyst_heart");
	public static ItemBase amethyst_whip = new ItemBase("amethyst_whip");
	public static ItemBase bagel = new ItemBase("bagel");
	public static ItemBase chips = new ItemBase("chips");
	public static ItemBase cookie_cat = new ItemBase("cookie_cat");
	public static ItemBase durian_juice = new ItemBase("durian_juice");
	public static ItemBase fry_bits = new ItemBase("fry_bits");
	public static ItemBase garnet = new ItemBase("garnet");
	public static ItemBase garnet_gauntlet = new ItemBase("garnet_gauntlet");
	public static ItemBase garnet_heart = new ItemBase("garnet_heart");
	public static ItemBase jasper = new ItemBase("jasper");
	public static ItemBase jasper_heart = new ItemBase("jasper_heart");
	public static ItemBase lapis_heart = new ItemBase("lapis_heart");
	public static ItemBase malachite = new ItemBase("malachite");
	public static ItemBase malachite_heart = new ItemBase("malachite_heart");
	public static ItemBase opal = new ItemBase("opal");
	public static ItemBase opal_bow = new ItemBase("opal_bow");
	public static ItemBase opal_heart = new ItemBase("opal_heart");
	public static ItemBase pearl = new ItemBase("pearl");
	public static ItemBase pearl_heart = new ItemBase("pearl_heart");
	public static ItemBase pearl_spear = new ItemBase("pearl_spear");
	public static ItemBase peridot = new ItemBase("peridot");
	public static ItemBase peridot_claw = new ItemBase("peridot_claw");
	public static ItemBase peridot_heart = new ItemBase("peridot_heart");
	public static ItemBase rose = new ItemBase("rose");
	public static ItemBase rose_heart = new ItemBase("rose_heart");
	public static ItemBase rose_shield = new ItemBase("rose_shield");
	public static ItemBase rose_sword = new ItemBase("rose_sword");
	public static ItemBase ruby = new ItemBase("ruby");
	public static ItemBase ruby_glove = new ItemBase("ruby_glove");
	public static ItemBase ruby_heart = new ItemBase("ruby_heart");
	public static ItemBase sapphire = new ItemBase("sapphire");
	public static ItemBase sapphire_glove = new ItemBase("sapphire_glove");
	public static ItemBase sapphire_heart = new ItemBase("sapphire_heart");
	public static ItemBase sardonyx = new ItemBase("sardonyx");
	public static ItemBase sardonyx_hammer = new ItemBase("sardonyx_hammer");
	public static ItemBase sardonyx_heart = new ItemBase("sardonyx_heart");
	public static ItemBase steven_ukulele = new ItemBase("steven_ukulele");
	public static ItemBase sugilite = new ItemBase("sugilite");
	public static ItemBase sugilite_flail = new ItemBase("sugilite_flail");
	public static ItemBase sugilite_heart = new ItemBase("sugilite_heart");
	
	public static void registerItems(IForgeRegistry<Item> registry) {
		registry.registerAll(
				alexandrite,
				alexandrite_heart,
				amethyst,
				amethyst_heart,
				amethyst_whip,
				bagel,
				chips,
				cookie_cat, 
				durian_juice,
				fry_bits,
				garnet,
				garnet_gauntlet,
				garnet_heart,
				jasper,
				jasper_heart,
				lapis_heart,
				malachite,
				malachite_heart,
				opal,
				opal_bow,
				opal_heart,
				pearl,
				pearl_heart,
				pearl_spear,
				peridot,
				peridot_claw,
				peridot_heart,
				rose,
				rose_heart,
				rose_sword,
				rose_shield,
				ruby_glove,
				ruby,
				ruby_heart,
				sapphire,
				sapphire_glove,
				sapphire_heart,
				sardonyx,
				sardonyx_hammer,
				sardonyx_heart,
				steven_ukulele,
				sugilite,
				sugilite_flail,
				sugilite_heart
		);
	}
	
	public static void registerItemModels() {
		alexandrite.registerItemModel(); 
		alexandrite_heart.registerItemModel(); 
		amethyst.registerItemModel(); 
		amethyst_heart.registerItemModel(); 
		amethyst_whip.registerItemModel(); 
		bagel.registerItemModel(); 
		chips.registerItemModel(); 
		cookie_cat.registerItemModel();  
		durian_juice.registerItemModel(); 
		fry_bits.registerItemModel(); 
		garnet.registerItemModel(); 
		garnet_gauntlet.registerItemModel(); 
		garnet_heart.registerItemModel(); 
		jasper.registerItemModel(); 
		jasper_heart.registerItemModel(); 
		lapis_heart.registerItemModel(); 
		malachite.registerItemModel(); 
		malachite_heart.registerItemModel(); 
		opal.registerItemModel(); 
		opal_bow.registerItemModel(); 
		opal_heart.registerItemModel(); 
		pearl.registerItemModel(); 
		pearl_heart.registerItemModel(); 
		pearl_spear.registerItemModel(); 
		peridot.registerItemModel(); 
		peridot_claw.registerItemModel(); 
		peridot_heart.registerItemModel(); 
		rose.registerItemModel();
		rose_heart.registerItemModel(); 
		rose_sword.registerItemModel(); 
		rose_shield.registerItemModel(); 
		ruby_glove.registerItemModel(); 
		ruby.registerItemModel(); 
		ruby_heart.registerItemModel(); 
		sapphire.registerItemModel(); 
		sapphire_glove.registerItemModel(); 
		sapphire_heart.registerItemModel();
		sardonyx.registerItemModel(); 
		sardonyx_hammer.registerItemModel(); 
		sardonyx_heart.registerItemModel(); 
		steven_ukulele.registerItemModel(); 
		sugilite.registerItemModel(); 
		sugilite_flail.registerItemModel(); 
		sugilite_heart.registerItemModel();
	}
}
