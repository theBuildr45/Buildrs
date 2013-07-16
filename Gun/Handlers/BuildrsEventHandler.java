package Buildrs.Gun.Handlers;

import Buildrs.Gun.Blocks.Assistants.BlockGetter;
import Buildrs.Gun.Events.EventAssistant.BlockRegistry;
import Buildrs.Gun.Items.Assistants.ItemGetter;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BuildrsEventHandler {
	
	public BuildrsEventHandler(){
		
		registerBlocks();
		registerNames();
		addShapelessRecipes();
		addShapedRecipes();
		addSmeltingRecipes();
		
		addBiome();
		removeBiome();
		registerBiome();
		
		registerWorldHandler();
	}

	public static void registerNames() {
		LanguageRegistry.instance().addName(BlockGetter.blockCover, "Cover Block");
		LanguageRegistry.instance().addName(BlockGetter.blockSupplies, "Supply Block");
		
		LanguageRegistry.instance().addName(ItemGetter.mp5, "Mp5");
		LanguageRegistry.instance().addName(ItemGetter.m1911, "M1911");
	}

	public static void registerBlocks() {
		//TODO Move register Blocks to BuildrsPreEventHandler class
		//for simplicity purposes
		BlockRegistry.registerBlock(BlockGetter.blockCover, "coverBlock");
		BlockRegistry.registerBlock(BlockGetter.blockSupplies, "supplyBlock");
	}
	
	public static void addShapelessRecipes(){
		
	}
	
	public static void addShapedRecipes(){
		
	}
	
	public static void addSmeltingRecipes(){}
	
	public static void addBiome(){}
	
	public static void removeBiome(){}
	
	public static void registerBiome(){}
	
	public static void registerWorldHandler(){}
	
	public static void registerProxies(){
		//NetworkRegistry.instance().registerGuiHandler("Buildrs_Gun_Mod", BuildrsGun_Main.proxy);
	}
	/**
	 * 
	 * Was going to be used for adding the names to guns 
	 * but ill wait until forge updates to see if they 
	 * fix the LanguageRegistry issue.
	 * 
	 * @param gun
	 * @param name
	 */
	@Deprecated
	public static void addNameToEventHandler(Buildrs.Gun.Items.ItemGun gun, String name){
		LanguageRegistry.instance().addName(gun, name);
	}
}
