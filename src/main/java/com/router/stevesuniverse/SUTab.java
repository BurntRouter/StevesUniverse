package com.router.stevesuniverse;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SUTab extends CreativeTabs {

	public SUTab() {
		super(StevesUniverse.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.APPLE);
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}

}