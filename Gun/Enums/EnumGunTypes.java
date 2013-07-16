package Buildrs.Gun.Enums;

import java.util.Random;


public enum EnumGunTypes {
	
	PISTOL(5.0, 4.0, 2, 20),
	SUB_MACHINE_GUN(7.5, 6.5, 5, 30),
	ASAULT_RIFLE(9.0, 8.6, 4, 50),
	SNIPER_RIFLE(13.0, 12.0, 1, 100),
	SHOTGUN(10.0, 10.5, 2, 10),
	ROCKET(11.0, 10.3, 1, 30);
	
	/**
	 * Item Id for the clip the gun requires is put here.
	 * 
	 * Taken out for now. Will be reimplemented when guns are created.
	 */
	
	//public final int clipID;
	
	/**
	 * 
	 *The highest damage that the fire arm can do.
	 *
	 */
	
	public final double damageHigh;
	
	/**
	 * 
	 * The lowest damage that the firearm can do. 
	 * 
	 */
	public final double damageLow;
	
	/**
	 *  
	 * How quickly the gun shoots. 
	 * 
	 * For now its an int will probably be changed to a double later
	 */
	public final int fireRate;
	
	/**
	 * How far the bullet goes. 
	 * 
	 * Added to go with attachments.
	 */
	public final int range;
	
	//public final int ammoID;
	
	private EnumGunTypes(double par1, double par2, int par3, int par4)
	{
		this.damageHigh = par1;
		this.damageLow = par2;
		this.fireRate = par3;
		this.range = par4;
		//this.ammoID = par5;
	}
	
	public double averageDamageVsEntity()
	{
		Random random = new Random();
		return this.damageHigh * this.damageLow / random.nextInt(16);
	}
	
	
	public int roundsPerMinute()
	{
		return this.fireRate;
	}
	
	public int firingRange(){
		return this.range;
	}
}
