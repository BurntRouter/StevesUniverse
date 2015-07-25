package com.steveuniverse.entities;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class rose_entity extends EntityMob{


	public rose_entity(World r) {
		super(r);
		setSize(4F, 4F);
	}
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(80.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(35.0D);
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

