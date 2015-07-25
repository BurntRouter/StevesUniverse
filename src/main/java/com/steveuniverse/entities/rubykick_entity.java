package com.steveuniverse.entities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class rubykick_entity extends EntityThrowable{
	
	
	public rubykick_entity(World world)
	{
	super(world);
	}
	public rubykick_entity(World world, EntityPlayer player)
	{
	super(world, player);
	}
	public rubykick_entity(World world, double i, double j, double k)
	{
	super(world, i, j, k);
	}
	protected float getGravityVelocity()
	{
	return 0.001F;
	}
	@Override
	protected void onImpact(MovingObjectPosition hit) {
		if (hit.entityHit != null) {
			float EntityDmg = (18);
			hit.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), EntityDmg);
		}

	if(!this.worldObj.isRemote){
		this.setDead();
		}
	}
}
	