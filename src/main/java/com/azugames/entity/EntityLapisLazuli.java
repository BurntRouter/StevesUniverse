package com.azugames.entity;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityLapisLazuli extends EntityMob{

	public EntityLapisLazuli(World l) {
		super(l);
		


	}
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
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
