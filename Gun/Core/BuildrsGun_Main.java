package Buildrs.Gun.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import Buildrs.Gun.Blocks.BlockCover;
import Buildrs.Gun.Handlers.BuildrsEventHandler;
import Buildrs.Gun.Handlers.BuildrsLoggerHandler;
import Buildrs.Gun.Handlers.BuildrsPreEventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(name = "Buildr`s Gun Mod!", modid = "buildrs_gun_mod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BuildrsGun_Main {	

	
	public BuildrsGun_Main(){
		BuildrsLoggerHandler.severe("Buildr`s Gun mod has been activated!!!");
	}
	
	/*@SidedProxy(clientSide = "Buidrs.Gun.Client.ClientProxy", serverSide = "Buildrs.Gun.Common.CommonProxy")
	public static CommonProxy proxy;
	*/
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		//TODO fix BuildrsPreEventHandler`s config options
		//BuildrsPreEventHandler.registerFiles();
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		BuildrsEventHandler.registerBlocks();
		BuildrsEventHandler.registerNames();
		BuildrsEventHandler.addShapedRecipes();
		BuildrsEventHandler.addShapelessRecipes();
		BuildrsEventHandler.addSmeltingRecipes();
		BuildrsEventHandler.registerWorldHandler();
	}
}
