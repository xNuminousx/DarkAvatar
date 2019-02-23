package me.numin.darkavatar.element;

import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ability.ElementalAbility;

public abstract class DarkAvatarAbility extends ElementalAbility {
	
	public DarkAvatarAbility(Player player) {
		super(player);
	}
	
	@Override
	public Element getElement() {
		return DarkAvatarElement.DARKAVATAR;
	}
}
