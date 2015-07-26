package com.steveuniverse.client;

import com.steveuniverse.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class SUTabs extends CreativeTabs {

	public SUTabs(String label) {
		super(label);
		
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.rose_heart;
	}

}
