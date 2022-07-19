package com.qa.design_patterns.factory_method_pattern.strategies;

public class AttackStrategyFactory {

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
