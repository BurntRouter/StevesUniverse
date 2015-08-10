package com.steveuniverse.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class sapphire_heart extends Item{
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer){

		for(int counter = 1; counter <= 1; counter++){
		if(entityplayer.inventory.getCurrentItem().stackSize == 1){
		entityplayer.inventory.addItemStackToInventory(new ItemStack( ModItems.sapphire_glove, 1));

}
}
		return itemstack;
	}
}