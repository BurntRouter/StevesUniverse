package com.steveuniverse.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ruby_glove extends ItemSword{
	
public ruby_glove(ToolMaterial ruby) {
		super(ruby);
	}

public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
	
	
	

	if(!world.isRemote){
		world.spawnEntityInWorld(new EntityLargeFireball(world, player, 0, 0, 1));
	}
	
	return itemstack;
}


	

}
