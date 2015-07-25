package com.steveuniverse.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class pearlspear_entity extends EntityThrowable{

	public pearlspear_entity(World p_i1776_1_) {
		super(p_i1776_1_);
		// TODO Auto-generated constructor stub
	}
	public pearlspear_entity(World world,  EntityLivingBase entity){
		super(world, entity);
	}
	@Override
	protected void onImpact(MovingObjectPosition mop) {
		for(int i = 0; i < 10; i++){
			this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0f, 0f, 0f);
			
			if (mop.entityHit != null) {
				float pearlDamage = 18;
			mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), pearlDamage);
			}

		if(!this.worldObj.isRemote){
			this.setDead();
			
			}
		}
	}
}
