package Buildrs.Gun.Enums;

public enum EnumGunSightAttachment {
	
	REDDOTSIGHT(0.5),
	HOLOGRAPHICSIGHT(1.0),
	ACOG(2.0),
	SCOPE(3.0);
	
	/**
	 * How much the range is increased. 
	 */
	public final double range;
	
	private EnumGunSightAttachment(double par1){
		this.range = par1;
	}
	
	public double rangeAdded(){
		return this.range;
	}
}
