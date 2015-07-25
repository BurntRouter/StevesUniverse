package com.steveuniverse.client;

import net.minecraft.creativetab.CreativeTabs;

public class ModCreativeTabs{

	public static CreativeTabs tabSU;
	
	public static void initTabs(){
		
		tabSU = new SUTabs("tabSU");
	}
}