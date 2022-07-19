package com.qa.design_patterns.strategy_pattern;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// As the MenuPrintingStrategy follows the single-abstract method
		// (SAM) rule, we can create it with a lambda.
		MenuPrintingStrategy indentedStrategy = (title, menuItems) -> {
			String header = String.format("# %s #%n", title);
			String items = "";
			for (var item : menuItems) {
				items += String.format("\t%s%n", item);
			}
			System.out.print(header);
			System.out.print(items);
		};
		
		System.out.println("Bordered strategy strategy:\n");
		Menu menu = new Menu("Main Menu", new BorderedStrategy(), List.of("Play", "Help", "Exit"));
		menu.run();
		
		System.out.println("\nIndented strategy:\n");
		
		menu.setMenuPrintingStrategy(indentedStrategy);
		menu.run();
	}
}
