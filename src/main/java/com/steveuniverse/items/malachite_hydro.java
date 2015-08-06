package com.steveuniverse.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class malachite_hydro extends ItemSword{
	
public malachite_hydro(ToolMaterial ruby) {
		super(ruby);
	}

public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
	
	
	

	if(!world.isRemote){
		world.spawnEntityInWorld(new EntityLargeFireball(world, player, 1, 1, 1));
	}
	
	return itemstack;
}


	

}
