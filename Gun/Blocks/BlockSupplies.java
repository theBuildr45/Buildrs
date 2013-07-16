package Buildrs.Gun.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSupplies extends Block{
	
	public BlockSupplies(int id){
		super(id, Material.iron);
		
		setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName("buildrs_gun_mod:SupplyBlock");
		this.func_111022_d("buildrs_gun_mod:SupplyBlock");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("buildrs_gun_mod:SupplyBlock");
	}
}
