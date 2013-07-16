package Buildrs.Gun.Items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import Buildrs.Gun.Enums.EnumGunSightAttachment;
import Buildrs.Gun.Enums.EnumGunTypes;

public class ItemGunSight extends ItemGun{
	
	
	private EnumGunTypes gunTypes;
	private EnumGunSightAttachment sights;
	
	public ItemGunSight(int id, EnumGunTypes gunType, EnumGunSightAttachment attachment){
		super(id, gunType);
		
		this.maxStackSize = 1;
		this.canRepair = false;
		this.setCreativeTab(CreativeTabs.tabCombat);
	
		this.gunTypes = gunType;
		this.sights = attachment;
	}
	
	@Override
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
		list.add("This gun has the attachment " + sights);
    }
}
