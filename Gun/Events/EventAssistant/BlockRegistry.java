package Buildrs.Gun.Events.EventAssistant;

import java.lang.reflect.Constructor;
import java.util.logging.Level;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.LoaderException;
import cpw.mods.fml.common.LoaderState;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.registry.BlockProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockRegistry {

    private static Multimap<ModContainer, BlockProxy> blockRegistry = ArrayListMultimap.create();

	
	public static void registerBlock(net.minecraft.block.Block block, String name)
	{
		registerBlock(block, ItemBlock.class, name);
	}

	public static void registerBlock(net.minecraft.block.Block block, Class<? extends ItemBlock> itemclass, String name, String modId)
	{
		if (Loader.instance().isInState(LoaderState.CONSTRUCTING))
		{
			FMLLog.warning("Buildrs Gun Mod is attempting to register a block whilst it it being constructed. Please inform Buildr45!!!!", Loader.instance().activeModContainer());
		}
		try
		{
			assert block != null : "registerBlock: block cannot be null";
			assert itemclass != null : "registerBlock: itemclass cannot be null";
			int blockItemId = block.blockID - 256;
			Constructor<? extends ItemBlock> itemCtor;
			Item i;
			try
			{
				itemCtor = itemclass.getConstructor(int.class);
				i = itemCtor.newInstance(blockItemId);
			}
			catch (NoSuchMethodException e)
			{
				itemCtor = itemclass.getConstructor(int.class, net.minecraft.block.Block.class);
				i = itemCtor.newInstance(blockItemId, block);
			}
			GameRegistry.registerItem(i,name, modId);
		}
		catch (Exception e)
		{
			FMLLog.log(Level.SEVERE, e, "Caught an exception during Buildrs block registration");
			throw new LoaderException(e);
		}
		blockRegistry.put(Loader.instance().activeModContainer(), (BlockProxy) block);
	}

	public static void registerBlock(net.minecraft.block.Block block, Class<? extends ItemBlock> itemclass, String name)
	{
		registerBlock(block, itemclass, name, null);
	}
}
