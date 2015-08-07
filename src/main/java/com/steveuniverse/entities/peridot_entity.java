package com.steveuniverse.entities;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class peridot_entity extends EntityMob{

	public peridot_entity(World p) {
		super(p);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, false));
		this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityZombie.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));

	}
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
        getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
        getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);
    }

	@Override
	protected boolean isAIEnabled(){
		return true;
	}
	
	@Override
	protected String getLivingSound()
    {
        return null;
    }

    @Override
    protected String getHurtSound()
    {
        return null;
    }

    @Override
    protected String getDeathSound()
    {
        return null;
    }
    
    
    	
    
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return null;
    }
    
   
}

