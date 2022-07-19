package com.qa.design_patterns.factory_method_pattern.strategies.simple;

import com.qa.design_patterns.factory_method_pattern.strategies.AttackStrategy;

public class AttackStrategyFactory {

	// Simple factory method using an attack type enum, it is better to use inheritance as the type returned can be narrowed
	public static AttackStrategy getAttackStrategy(AttackType type) {
		switch (type) {
		case UNARMED_PUNCH:
			return new Punch();
		case UNARMED_KICK:
			return new Kick();
		default:
			throw new IllegalArgumentException("No attack strategies present for the given type");
		}
	}
}
