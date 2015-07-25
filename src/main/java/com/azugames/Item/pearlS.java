package com.azugames.Item;



import com.azugames.entity.EntityPearlS;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class pearlS extends ItemSword{

	public pearlS(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.bow", 0.7f, 0.8f);
	
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityPearlS(world, player));
		}
		
		return itemstack;
	}

	
		
	
}