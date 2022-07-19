package com.qa.design_patterns.factory_method_pattern.strategies.advanced;

import com.qa.design_patterns.factory_method_pattern.strategies.AttackStrategy;

public class PunchStrategyFactory extends AbstractAttackStrategyFactory {

	
	@Override
	protected AttackStrategy prepareStrategy() {
		if (attacker.getStrength() <= 3) {
			return (defender) -> {
				System.out.println("Throws a meek punch which inflicts barely any damage...");
				int damage = 1;
				defender.setHealth(defender.getHealth() - damage);
				System.out.println("Did " + damage + " damage to the defender.");
			};
		} else {
			return (defender) -> {
				System.out.println("Throws a meek punch which inflicts barely any damage...");
				int damage = 5 + attacker.getStrength() - defender.getStrength();
				defender.setHealth(defender.getHealth() - damage);
				System.out.println("Did " + damage + " damage to the defender.");
			};
		}
	}

}
