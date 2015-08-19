package com.steveuniverse.entities;

import com.steveuniverse.items.amethyst_whip;
import com.sun.xml.internal.ws.client.dispatch.PacketDispatch;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityWhip extends EntityThrowable
{
	/** Watchable object index for thrower entity's id, since EntityThrowable#thrower is both private and not synced to client */
	protected static final int THROWER_INDEX = 22;

	/** Watchable object index for whip's type */
	protected static final int WHIP_TYPE_INDEX = 24;

	/** Watchable object for if the player has reached the hookshot */
	protected static final int IN_GROUND_INDEX = 25;

	/** Watchable objects for whip's impact position, set to center of side of block hit;
	 *  used for determining swing point and also for rendering */
	public static final int HIT_POS_X = 26, HIT_POS_Y = 27, HIT_POS_Z = 28;

	/** Impact position, used for retrieving block; needed on both sides - requires data watcher? */
	private int hitX, hitY, hitZ;

	/** Number of ticks since whip has latched onto a block, since EntityThrowable#ticksInGround field is private */
	private int ticksInGround = 0;

	/** Number of ticks player has been swinging */
	private int swingTicks = 0;

	/** Swing vector heading */
	private Vec3 swingVec = null;

	/** The y-motion factor, based on distance from rotation point */
	private double dy;

	public EntityWhip(World world) {
		super(world);
	}

	public EntityWhip(World world, EntityLivingBase entity) {
		super(world, entity);
	}

	public EntityWhip(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		setSize(0.25F, 0.25F);
		dataWatcher.addObject(THROWER_INDEX, "");
		dataWatcher.addObject(IN_GROUND_INDEX, (byte) 0);
		dataWatcher.addObject(HIT_POS_X, 0.0F);
		dataWatcher.addObject(HIT_POS_Y, 0.0F);
		dataWatcher.addObject(HIT_POS_Z, 0.0F);
	}


	public float getMaxDistance() {
		return 4F;
	}

	public void setThrower(EntityPlayer player) {
		dataWatcher.updateObject(THROWER_INDEX, player != null ? player.getCommandSenderName() : "");
	}

	@Override
	public EntityLivingBase getThrower() {
		String name = dataWatcher.getWatchableObjectString(THROWER_INDEX);
		return (name.equals("") ? null : worldObj.getPlayerEntityByName(name));
	}

	public boolean isInGround() {
		return (dataWatcher.getWatchableObjectByte(IN_GROUND_INDEX) & 1) == 1;
	}

	protected void setInGround(boolean isInGround) {
		dataWatcher.updateObject(IN_GROUND_INDEX, isInGround ? (byte) 1 : (byte) 0);
		inGround = isInGround;
	}

	protected float getDamage() {
		return 4.0F;
		}

	/** Returns a whip damage source */
	protected DamageSource getDamageSource() {
		return new DamageSource("amethyst_whip").setDamageIsAbsolute();
	}

	/**
	 * Returns true if the coordinates given are clear of obstacles, such that the
	 * whip would be able to freely move through the space and latch on
	 */
	protected boolean isSideClear(int x, int y, int z) {
		Material m = worldObj.getBlock(x, y, z).getMaterial();
		return (!m.blocksMovement() || m == Material.leaves);
	}

	@Override // getVelocity
	protected float func_70182_d() {
		return 1.25F;
	}

	@Override
	protected float getGravityVelocity() {
		return 0.0F;
	}

	@Override
	protected void onImpact(MovingObjectPosition mop) {
		if (mop.typeOfHit == MovingObjectType.BLOCK) {
			Block block = worldObj.getBlock(mop.blockX, mop.blockY, mop.blockZ);
			if (!isInGround() && ticksExisted < getMaxDistance()) {
				motionX = motionY = motionZ = 0.0D;
					setInGround(true);
					AxisAlignedBB box = block.getCollisionBoundingBoxFromPool(worldObj, mop.blockX, mop.blockY, mop.blockZ);
					// bounding box may be null, depending on the block
					if (box != null) {
						posX = box.minX + ((box.maxX - box.minX) / 2.0D);
						posY = box.minY + ((box.maxY - box.minY) / 2.0D);
						posZ = box.minZ + ((box.maxZ - box.minZ) / 2.0D);
						switch(mop.sideHit) {
						case 5: posX = box.maxX; break;
						case 4: posX = box.minX - 0.015D; break;
						case 3: posZ = box.maxZ; break;
						case 2: posZ = box.minZ - 0.015D; break;
						}
					} else {
						posX = (double) mop.blockX + 0.5D;
						posY = (double) mop.blockY + 0.5D;
						posZ = (double) mop.blockZ + 0.5D;
						switch(mop.sideHit) {
						}
					}
					dataWatcher.updateObject(HIT_POS_X, (float) posX);
					dataWatcher.updateObject(HIT_POS_Y, (float) posY);
					dataWatcher.updateObject(HIT_POS_Z, (float) posZ);
					hitX = mop.blockX;
					hitY = mop.blockY;
					hitZ = mop.blockZ;
					if (!worldObj.isRemote) {
						boolean drop = (getThrower() instanceof EntityPlayer ? !(((EntityPlayer) getThrower()).capabilities.isCreativeMode) : true);
						worldObj.func_147480_a(mop.blockX, mop.blockY, mop.blockZ, drop);
						setDead();
					}
				} else if (block.getMaterial().blocksMovement()) {
					block.onEntityCollidedWithBlock(worldObj, mop.blockX, mop.blockY, mop.blockZ, this);
				} else {
					block.onEntityCollidedWithBlock(worldObj, mop.blockX, mop.blockY, mop.blockZ, this);
					return;
				}
			}
		}

	@Override
	public void onUpdate() {
		// Copied from Hookshot: avoiding entityThrowable's update while in ground
		if (isInGround()) {
			lastTickPosX = posX;
			lastTickPosY = posY;
			lastTickPosZ = posZ;
			super.onEntityUpdate();
		} else {
			super.onUpdate();
		}
		if (canUpdate()) {
			// can hold onto whip for five minutes
			if (isInGround() && ticksExisted < 6000) {
				++ticksInGround;
				if (shouldSwing()) {
					swingThrower();
				}
			} else if (ticksExisted > getMaxDistance()) {
				setDead();
			}
		} else {
			setDead();
		}
	}

	/**
	 * Returns true if player should swing (player far enough below whip, whip not attached to a lever, etc.)
	 */
	private boolean shouldSwing() {
		Block block = worldObj.getBlock(hitX, hitY, hitZ);
		if (block.getMaterial() == Material.air) {
			setDead();
			return false;
		}
		else if (worldObj.isRemote && swingVec == null && getThrower() != null) {
			// make sure thrower's y position is below impact position before starting swing
			return getThrower().posY < dataWatcher.getWatchableObjectFloat(HIT_POS_Y);
		}
		return true;
	}


	/**
	 * Returns true if the whip is allowed to update (i.e. thrower is holding correct item, etc.)
	 */
	protected boolean canUpdate() {
		EntityLivingBase thrower = getThrower();
		if (!isDead && thrower instanceof EntityPlayer && ((EntityPlayer) thrower).isUsingItem()) {
			return thrower.getHeldItem() != null && thrower.getHeldItem().getItem() instanceof amethyst_whip;
		} else {
			return false;
		}
	}

	protected void swingThrower() {
		EntityLivingBase thrower = getThrower();
		if (thrower != null && !thrower.onGround && isInGround()) {
			if (thrower.worldObj.isRemote) {
				// Determine the swing variables on first swing tick:
				float x = dataWatcher.getWatchableObjectFloat(HIT_POS_X);
				float y = dataWatcher.getWatchableObjectFloat(HIT_POS_Y);
				float z = dataWatcher.getWatchableObjectFloat(HIT_POS_Z);
				if (swingTicks == 0 && swingVec == null && thrower.motionY < 0) {
					swingVec = Vec3.createVectorHelper((x - thrower.posX), y - (thrower.posY + thrower.getEyeHeight()), (z - thrower.posZ)).normalize();
					dy = (thrower.getDistance(x, y, z) / 7.0D); 
					double d = Math.min(thrower.getDistance(x, thrower.posY, z), getMaxDistance());
					swingTicks = MathHelper.floor_double(((getMaxDistance() - d) / getMaxDistance()) * 8);
				}
				if (swingVec != null) {
					double sin = Math.sin(10.0D * swingTicks * Math.PI / 180.0D);
					double f = 0.8D; // arbitrary horizontal motion factor
					thrower.motionX = (sin * swingVec.xCoord * f);
					thrower.motionZ = (sin * swingVec.zCoord * f);
					// y motion needs to oscillate twice as quickly, so it goes up on the other side of the swing
					thrower.motionY = dy * -Math.sin(20.0D * swingTicks * Math.PI / 180.0D);
					++swingTicks; // increment at end
					if (thrower.fallDistance > 0 && thrower.motionY < 0) {
						// 0.466885F seems to be roughly the amount added each tick while swinging; round for a little extra server-side padding
						thrower.fallDistance -= 0.467F;
					}
				} else if (swingTicks > 0) {
					// still let player hang there after colliding, but move towards center
					if (thrower.getDistanceSq(x, thrower.posY, z) > 1.0D) {
						double dx = x - thrower.posX;
						double dz = z - thrower.posZ;
						thrower.motionX = 0.15D * dx;
						thrower.motionZ = 0.15D * dz;
					}
					if (thrower.posY < (y - (getMaxDistance() / 2.0D))) {
						thrower.motionY = 0;
					}
					++swingTicks; // increment at end
					thrower.fallDistance = 0.0F;
				}
			}
		}
	}
}