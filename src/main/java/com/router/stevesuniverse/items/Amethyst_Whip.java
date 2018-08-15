package com.router.stevesuniverse.items;

import com.router.stevesuniverse.entities.Amethyst_Whip_Entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Amethyst_Whip extends ItemBase {
	
	public Amethyst_Whip(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		Amethyst_Whip_Entity whip = new Amethyst_Whip_Entity(player.world, whip);
		whip.setThrower(player);
		if (!player.world.isRemote) {
			player.world.spawnEntity(whip);
		}
		return stack;
	}

}