package me.numin.darkavatar.config;

import me.numin.darkavatar.config.ConfigFile;

import org.bukkit.configuration.file.FileConfiguration;

import com.projectkorra.projectkorra.configuration.ConfigManager;

import me.numin.darkavatar.Main;

public class Config {
	
	private static ConfigFile main;
	static Main plugin; 

	public Config(Main plugin) {
		Config.plugin = plugin;
		main = new ConfigFile("config");
		loadConfig();
	}
	
	public static FileConfiguration getConfig() {
		return main.getConfig();
	}
	
	public void loadConfig() {
		FileConfiguration config = Main.plugin.getConfig();
		FileConfiguration rankConfig = ConfigManager.languageConfig.get();
		FileConfiguration langConfig = config;
		
		//Language configuration
		rankConfig.addDefault("Chat.Colors.DarkAvatar", "DARK_GRAY");
		rankConfig.addDefault("Chat.Colors.DarkAvatarSub", "DARK_RED");
	}
}