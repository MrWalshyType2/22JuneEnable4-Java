package com.qa.design_patterns.command_pattern;

import java.util.Map;

import com.qa.design_patterns.command_pattern.commands.PrintCommand;
import com.qa.design_patterns.command_pattern.strategies.BorderedStrategy;

public class Runner {

	public static void main(String[] args) {
		Menu menu = new Menu("Main Menu", new BorderedStrategy(), Map.of(
				"Hi", new PrintCommand("Hello"),
				"Exit", () -> System.exit(0)
		));
		menu.run();
	}

}
