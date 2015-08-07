package com.steveuniverse.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class lapislazuli_entity extends EntityFlying implements IMob {
	public int courseChangeCooldown;
	public double waypointX;
	public double waypointY;
	public double waypointZ;
	private Entity targetedEntity;

	/** Cooldown time between target loss and new target aquirement. */
	private int aggroCooldown;
	public int prevAttackCounter;
	public int attackCounter;

	/** The explosion radius of spawned fireballs. */
	private int explosionStrength = 1;

	public lapislazuli_entity(World par1World) {
		super(par1World);
		this.setSize(4.0F, 4.0F);
		this.experienceValue = 5;
		
	}

	@SideOnly(Side.CLIENT)
	public boolean func_110182_bF() {
		return this.dataWatcher.getWatchableObjectByte(16) != 0;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, Byte.valueOf((byte) 0));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200);
	}

		@Override
		protected void updateEntityActionState() {

			this.despawnEntity();
			double d0 = this.waypointX - this.posX;
			double d1 = this.waypointY - this.posY;
			double d2 = this.waypointZ - this.posZ;
			double d3 = d0 * d0 + d1 * d1 + d2 * d2;

			if (d3 < 1.0D || d3 > 3600.0D) {
				this.waypointX = this.posX + (this.rand.nextFloat() * 2.0F - 1.0F)
						* 16.0F;
				this.waypointY = this.posY + (this.rand.nextFloat() * 2.0F - 1.0F)
						* 16.0F;
				this.waypointZ = this.posZ + (this.rand.nextFloat() * 2.0F - 1.0F)
						* 16.0F;
			}

			if (this.courseChangeCooldown-- <= 0) {
				this.courseChangeCooldown += this.rand.nextInt(5) + 2;
				d3 = MathHelper.sqrt_double(d3);

				if (this.isCourseTraversable(this.waypointX, this.waypointY,
						this.waypointZ, d3)) {
					this.motionX += d0 / d3 * 0.1D;
					this.motionY += d1 / d3 * 0.1D;
					this.motionZ += d2 / d3 * 0.1D;
				} else {
					this.waypointX = this.posX;
					this.waypointY = this.posY;
					this.waypointZ = this.posZ;
				}
			}
		}

		/**
		 * True if the ghast has an unobstructed line of travel to the waypoint.
		 */
		private boolean isCourseTraversable(double par1, double par3, double par5,
				double par7) {
			double d4 = (this.waypointX - this.posX) / par7;
			double d5 = (this.waypointY - this.posY) / par7;
			double d6 = (this.waypointZ - this.posZ) / par7;
			AxisAlignedBB axisalignedbb = this.boundingBox.copy();

			for (int i = 1; i < par7; ++i) {
				axisalignedbb.offset(d4, d5, d6);

				if (!this.worldObj.getCollidingBoundingBoxes(this, axisalignedbb)
						.isEmpty()) {
					return false;
				}
			}

			return true;
		}
}