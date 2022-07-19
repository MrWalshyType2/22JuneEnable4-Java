package com.qa.design_patterns.factory_method_pattern;

import com.qa.design_patterns.factory_method_pattern.strategies.advanced.AbstractAttackStrategyFactory;
import com.qa.design_patterns.factory_method_pattern.strategies.advanced.PunchStrategyFactory;
import com.qa.design_patterns.factory_method_pattern.strategies.simple.AttackStrategyFactory;
import com.qa.design_patterns.factory_method_pattern.strategies.simple.AttackType;

public class Runner {

	public static void main(String[] args) {
		System.out.println("=== ROUND 1 ===");
		// Simple static factory method
		Player p1 = new Player("Fred", 100, 3);
		p1.setAttackStrategy(AttackStrategyFactory.getAttackStrategy(AttackType.UNARMED_PUNCH));
		
		Player p2 = new Player("Bob", 100, 8);
		p1.attack(p2);
		
		System.out.println(p2);
	
		System.out.println("\n=== ROUND 2 ===");
		// Complex factories through inheritance
		AbstractAttackStrategyFactory strategyFactory = new PunchStrategyFactory();
		p1.setAttackStrategy(strategyFactory.getStrategy(p1));
		p2.setAttackStrategy(strategyFactory.getStrategy(p2));
		p2.attack(p1);
		p1.attack(p2);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
