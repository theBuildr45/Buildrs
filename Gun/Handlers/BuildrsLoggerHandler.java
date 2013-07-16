package Buildrs.Gun.Handlers;

import java.util.logging.Level;

import Buildrs.Gun.Core.BuildrsGun_Main;

import cpw.mods.fml.common.FMLLog;

public class BuildrsLoggerHandler {
	static FMLLog log = new FMLLog();
	
	public BuildrsLoggerHandler(){
		
	}
	
	public static void severe(String data){
		log.getLogger().log(Level.SEVERE, data, data);
	}
	
	public static void fine(String fine, String data){
		log.getLogger().log(Level.FINE, fine, data);
	}
	
	public static void finer(String finer, String data){
		log.getLogger().log(Level.FINER, finer, data);
	}
	
	public static void finest(String finest, String data){
		log.getLogger().log(Level.FINEST, finest, data);
	}
	
	public static void log( String info){
		log.getLogger().log(Level.INFO, "Just to let you know: ", info);
	}
}
