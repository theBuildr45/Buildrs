package Buildrs.Gun.Items.Assistants;

import Buildrs.Gun.Enums.EnumGunTypes;
import Buildrs.Gun.Items.ItemGun;
import net.minecraft.item.Item;

public class ItemGetter {
	
	public static Item mp5 = new ItemGun(650, EnumGunTypes.SUB_MACHINE_GUN).setUnlocalizedName("Mp5");
	public static Item m1911 = new ItemGun(651, EnumGunTypes.PISTOL).setUnlocalizedName("M1911");
}
