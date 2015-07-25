package com.azugames.Item;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;




import com.azugames.entity.EntityPeridotLaser;

public class peridotC extends Item{
	public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
		
	
		world.playSoundAtEntity(player, "random.bow", 0.7f, 0.8f);
	
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityPeridotLaser(world, player));
		}
		
		return itemstack;
	}

	public ItemStack onItemLeftClick(ItemStack itemstack,World world, EntityPlayer player){
		
		System.out.println("TEST"); 
		world.playSoundAtEntity(player, "random.bow", 0.7f, 0.8f);
	
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityLightningBolt(world, 3.0D, 3.0D, 3.0D));
		}
		
		return itemstack;
	}
}
