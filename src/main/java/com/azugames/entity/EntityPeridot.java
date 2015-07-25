package com.azugames.entity;

import com.azugames.Item.MItems;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityPeridot extends EntityMob{


	public EntityPeridot(World p) {
		super(p);
		
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

