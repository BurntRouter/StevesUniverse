package com.steveuniverse.items;

import com.steveuniverse.entities.pearlspear_entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class pearl_spear extends ItemSword{

	public pearl_spear(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.bow", 0.7f, 0.8f);
	
		if(!world.isRemote){
			world.spawnEntityInWorld(new pearlspear_entity(world, player));
		}
		
		return itemstack;
	}

	
		
	
}