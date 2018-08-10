package com.router.stevesuniverse.items;

import com.router.stevesuniverse.StevesUniverse;

import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(StevesUniverse.creativeTab);
	}
	
	public void registerItemModel() {
		StevesUniverse.proxy.registerItemRenderer(this, 0, name);
	}
}