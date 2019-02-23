package me.numin.darkavatar.ability;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.GeneralMethods;
import com.projectkorra.projectkorra.ability.AddonAbility;

import me.numin.darkavatar.Main;
import me.numin.darkavatar.element.DarkAvatarAbility;

public class DarkAvatarState extends DarkAvatarAbility implements AddonAbility {

	private long cooldown;
	private long time;
	private long duration;
	
	public DarkAvatarState(Player player) {
		super(player);
		
		if (!bPlayer.canBend(this)) {
			return;
		}
		
		setFields();
		time = System.currentTimeMillis();
		start();
	}
	
	private void setFields() {
	}

	@Override
	public void progress() {
		if (player.isDead() || !player.isOnline() || GeneralMethods.isRegionProtectedFromBuild(this, player.getLocation())) {
			remove();
			return;
		}
		if (System.currentTimeMillis() - time > duration) {
			remove();
			return;
		}
	}

	@Override
	public long getCooldown() {
		return cooldown;
	}

	@Override
	public Location getLocation() {
		return null;
	}

	@Override
	public String getName() {
		return "DarkAvatarState";
	}
	
	@Override
	public String getDescription() {
		return null;
	}
	
	@Override
	public String getInstructions() {
		return null;
	}
	
	@Override
	public String getAuthor() {
		return "Numin";
	}

	@Override
	public String getVersion() {
		return Main.plugin.getDescription().getVersion();
	}

	@Override
	public boolean isExplosiveAbility() {
		return false;
	}

	@Override
	public boolean isHarmlessAbility() {
		return false;
	}

	@Override
	public boolean isIgniteAbility() {
		return false;
	}

	@Override
	public boolean isSneakAbility() {
		return false;
	}


	@Override
	public void load() {
		
	}

	@Override
	public void stop() {
		
	}

}
