package com.steveuniverse.items;

import com.azugames.Item.MItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class rose_heart extends Item{
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer){

		for(int counter = 1; counter <= 1; counter++){
		if(entityplayer.inventory.getCurrentItem().stackSize == 1){
		entityplayer.inventory.addItemStackToInventory(new ItemStack( MItems.quartzS, 1));
		
		for(int counter1 = 1; counter1 <= 1; counter1++){
			if(entityplayer.inventory.getCurrentItem().stackSize == 1){
			entityplayer.inventory.addItemStackToInventory(new ItemStack( MItems.roseS, 1));
		
			
				
}
}
		}	
		}
		return itemstack;
		
	}
	

	
	public boolean hasEffect(ItemStack itemstack)
	{
		 return true;
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
	  super.onUpdate(stack, world, entity, par4, par5);
	  EntityPlayer player = (EntityPlayer) entity;
	  ItemStack equipped = player.getCurrentEquippedItem();
	  if(equipped == stack) {
	   player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 6, 5));
	  }
	}
	}