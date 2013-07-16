package Buildrs.Gun.Items.Assistants;

import net.minecraft.entity.player.EntityPlayer;

public interface IShooterAssistant {
	
	/**
	 * 
	 * Check for item in inventory.
	 * 
	 */
	public boolean hasAmmoInInventory(int ammoID, EntityPlayer player);
	
	
}
