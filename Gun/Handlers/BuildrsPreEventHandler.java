package Buildrs.Gun.Handlers;

import net.minecraftforge.common.Configuration;

public class BuildrsPreEventHandler {
	
	public BuildrsPreEventHandler(){
		
		registerFiles();
	}
	
	public static void registerFiles(){
		Configuration config = new Configuration();
		
		
		config.save();
	}
}
