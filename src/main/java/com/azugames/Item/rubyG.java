package com.azugames.Item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import com.azugames.entity.EntityRubyKick;
import com.azugames.entity.EntitySonicScreech;

public class rubyG extends ItemSword{
	
public rubyG(ToolMaterial ruby) {
		super(ruby);
	}

public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
	
	
	

	if(!world.isRemote){
		world.spawnEntityInWorld(new EntityLargeFireball(world, player, 0, 0, 1));
	}
	
	return itemstack;
}


	

}
