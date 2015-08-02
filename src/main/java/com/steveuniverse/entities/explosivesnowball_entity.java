package com.steveuniverse.entities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class explosivesnowball_entity extends EntityThrowable{

	
	public explosivesnowball_entity(World world)
	{
	super(world);
	}
	public explosivesnowball_entity(World world, EntityPlayer player)
	{
	super(world, player);
	}
	public explosivesnowball_entity(World world, double i, double j, double k)
	{
	super(world, i, j, k);
	}
	protected float getGravityVelocity()
	{
	return 0.001F;
	}
	@Override
	protected void onImpact(MovingObjectPosition hit) {
		if(hit.typeOfHit == MovingObjectType.BLOCK)
		{
		
		switch(hit.sideHit)
		{
		case 0: //BOTTOM
		hit.blockY--;
		break;
		case 1: //TOP
		hit.blockY++;
		break;
		case 2: //EAST
		hit.blockZ--;
		break;
		case 3: //WEST
		hit.blockZ++;
		break;
		case 4: //NORTH
		hit.blockX--;
		break;
		case 5: //SOUTH
		hit.blockX++;
		break;
		}
		
		this.worldObj.newExplosion(this, hit.blockX, hit.blockY, hit.blockZ, 2.0F, true, true);
		}
		if (hit.entityHit != null) {
			float EntityDmg = (18);
			hit.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), EntityDmg);

			switch(hit.sideHit)
			{
			case 0: //BOTTOM
			hit.blockY--;
			break;
			case 1: //TOP
			hit.blockY++;
			break;
			case 2: //EAST
			hit.blockZ--;
			break;
			case 3: //WEST
			hit.blockZ++;
			break;
			case 4: //NORTH
			hit.blockX--;
			break;
			case 5: //SOUTH
			hit.blockX++;
			break;
			}
			
			this.worldObj.newExplosion(this, hit.blockX, hit.blockY, hit.blockZ, 2.0F, true, true);
			}           
		{	
	}

	if(!this.worldObj.isRemote){
		this.setDead();
		}
	}

}

		


