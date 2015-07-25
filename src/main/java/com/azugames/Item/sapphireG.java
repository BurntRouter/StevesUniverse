package com.azugames.Item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;




import com.azugames.entity.EntityPearlS;
import com.azugames.entity.EntitySonicScreech;

public class sapphireG extends Item{
		
	

	public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
		
		
		world.playSoundAtEntity(player, "random.bow", 0.7f, 0.8f);
	
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntitySonicScreech(world, player));
		}
		
		return itemstack;
	}

	
	
}