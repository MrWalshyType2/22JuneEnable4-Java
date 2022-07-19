package com.qa.design_patterns.factory_method_pattern;

import com.qa.design_patterns.factory_method_pattern.strategies.AttackStrategy;

public class Player {

	private String name;
	private int health;
	private int strength;
	private AttackStrategy attackStrategy;
	
	public Player(String name, int health, int strength) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
	}

	public void attack(Player player) {
		System.out.println(name + " is attacking " + player.getName());
		attackStrategy.attack(player);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public AttackStrategy getAttackStrategy() {
		return attackStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", strength=" + strength + "]";
	}

}
