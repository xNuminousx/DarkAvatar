package me.numin.darkavatar;

import org.bukkit.plugin.java.JavaPlugin;

import com.projectkorra.projectkorra.ability.CoreAbility;

import me.numin.darkavatar.config.Config;
import me.numin.darkavatar.element.DarkAvatarElement;
import me.numin.darkavatar.listeners.AbilityListener;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		
		new Config(this);
		new DarkAvatarElement();
		registerListeners();
		CoreAbility.registerPluginAbilities(plugin, "me.numin.darkavatar.ability");
		
		plugin.getLogger().info("Successfully enabled Spirits " + plugin.getDescription().getVersion());
	}
	
	@Override
	public void onDisable() {
		plugin.getLogger().info("Successfully enabled Spirits " + plugin.getDescription().getVersion());
	}
	
	public static Main getInstance() {
		return plugin;
	}
	
	public void registerListeners() {
		getServer().getPluginManager().registerEvents(new AbilityListener(), this);
	}
}
