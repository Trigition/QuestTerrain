package com.SkyIsland.QuestTerrain;

import org.bukkit.plugin.java.JavaPlugin;

public class QuestTerrainPlugin extends JavaPlugin {
	//Keep track of Plugin Object
	public static QuestTerrainPlugin questTerrainPlugin;
	
	//Configuration settings (world names and generation settings)
	public static String configFileName = "QuestTerrainConfig.yml";
	
	//Begin vital JavaPlugin overrides
	@Override
	public void onLoad() {
		
	}
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	/**
	 * This method reads a specified configuration file in order
	 * to construct a proper QuestTerrainPlugin.
	 * @param fileName -- The configuration filename. Must be specified.
	 * @return -- Returns <i>false</i> if configuration file could not be loaded.
	 */
	public boolean loadConfigFile(String fileName) {
		return true;
	}
	
	/**
	 * This method reads a specified configuration file in order
	 * to construct a proper QuestTerrainPlugin. 
	 * @param fileName -- The configuration filename. Must be specified.
	 * @param force -- If true, plugin will force loading of a configuration files.<br>
	 * Please note that this will NOT save configuration file loading from fatal errors.<br>
	 * It is highly recommended that this parameter is set to FALSE.
	 * @return -- Returns <i>false</i> if configuration file could not be loaded.
	 */
	public boolean loadConfigFile(String fileName, boolean force) {
		return true;
	}
}
