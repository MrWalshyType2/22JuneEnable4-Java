package com.qa.design_patterns.factory_method_pattern;

import com.qa.design_patterns.factory_method_pattern.strategies.AttackStrategyFactory;
import com.qa.design_patterns.factory_method_pattern.strategies.AttackType;

public class Runner {

	public static void main(String[] args) {
		Player p1 = new Player("Fred", 100, 4);
		p1.setAttackStrategy(AttackStrategyFactory.getAttackStrategy(AttackType.UNARMED_PUNCH));
		
		Player p2 = new Player("Bob", 100, 8);
		p1.attack(p2);
		
		System.out.println(p2);
	}

}
