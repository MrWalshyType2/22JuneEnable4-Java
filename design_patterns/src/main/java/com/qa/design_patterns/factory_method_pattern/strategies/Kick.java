package com.qa.design_patterns.factory_method_pattern.strategies;

import com.qa.design_patterns.factory_method_pattern.Player;

public class Kick implements AttackStrategy {
	
	protected Kick() {
		
	}

	@Override
	public void attack(Player player) {
		int damage = 40 - player.getStrength();
		System.out.println("Kicking " + player.getName() + " for " + damage + " points.");
		int newHealth = player.getHealth() - damage;
		player.setHealth(newHealth);
	}

}
