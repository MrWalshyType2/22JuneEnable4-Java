package com.qa.design_patterns.factory_method_pattern.strategies.advanced;

import com.qa.design_patterns.factory_method_pattern.Player;
import com.qa.design_patterns.factory_method_pattern.strategies.AttackStrategy;

public abstract class AbstractAttackStrategyFactory {

	protected Player attacker;
	
	protected abstract AttackStrategy prepareStrategy();
	
	public AttackStrategy getStrategy(Player attacker) {
		this.attacker = attacker;
		return this.prepareStrategy();
	}
}
