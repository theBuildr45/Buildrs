package Buildrs.Gun.Items;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Buildrs.Gun.Enums.EnumGunTypes;
import Buildrs.Gun.Items.Assistants.IShooterAssistant;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGun extends Item implements IShooterAssistant{

	/**
	 * Base for all guns. 
	 * 
	 * Any gun will have to extend this class!
	 */

	private EnumGunTypes gunType;

	public ItemGun(int id, EnumGunTypes guntype)
	{
		super(id);
		this.maxStackSize = 1;

		this.gunType = guntype;
		setCreativeTab(CreativeTabs.tabCombat);
	}

	/**
	 * Removed for now.
	 * Will be reimplemented Soon.
	 */
	/*@Override
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
		player = Minecraft.getMinecraft().thePlayer;
		list.add("This gun shoots " + gunType.fireRate + " bullets per second!");
		list.add("This guns Maximum damage is " + gunType.damageHigh + " per bullet.");
		list.add("This guns minimum damage is " + gunType.damageLow + " per bullet.");
		list.add("This gun is currently attached with: " );
	}*/

	@Override
	public boolean hasAmmoInInventory(int ammoID, EntityPlayer player ) {
		//ammoID = ItemGetter.regulerAmmo.itemID;
		if(player.capabilities.isCreativeMode || player.inventory.hasItem(ammoID)){
			return true;
		}else
			return false;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconreg){
		this.itemIcon = iconreg.registerIcon("buildrs_gun_mod:" + this.getUnlocalizedName().substring(5));
	}
}
