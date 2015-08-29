package com.steveuniverse.items;

import org.lwjgl.input.Keyboard;

import com.steveuniverse.entities.pearllaser_entity;
import com.steveuniverse.entities.pearlspear_entity;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class pearl_spear extends ItemSword{

	public pearl_spear(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
    public static KeyBinding ping;
	
	public ItemStack onItemRightClick(ItemStack itemstack,World world, EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.bow", 0.7f, 0.8f);
	
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) == false){
			if(!world.isRemote){
				world.spawnEntityInWorld(new pearlspear_entity(world, player));
			}
		}
		
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
			if(!world.isRemote){
				world.spawnEntityInWorld(new pearllaser_entity(world, player));
				--itemstack.stackSize;
			}
		}
		
		
		return itemstack;
	}
	
	
		
	
}