package com.qa.design_patterns.factory_method_pattern.strategies.simple;

import com.qa.design_patterns.factory_method_pattern.Player;
import com.qa.design_patterns.factory_method_pattern.strategies.AttackStrategy;

public class Kick implements AttackStrategy {
	
	@Override
	public void attack(Player player) {
		int damage = 40 - player.getStrength();
		System.out.println("Kicking " + player.getName() + " for " + damage + " points.");
		int newHealth = player.getHealth() - damage;
		player.setHealth(newHealth);
	}

}
