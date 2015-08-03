package com.steveuniverse.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class steven_ukulele extends Item {
	
	public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
		
		 world.playSoundAtEntity(player, "steveuniverse:for_her", 1f, 1f);
		 
		 return itemstack; 

	}

}
