package com.qa.design_patterns.strategy_pattern;

import java.util.List;

// Creating a strategy as a class
public class BorderedStrategy implements MenuPrintingStrategy {

	@Override
	public void print(String title, List<String> menuItems) {
		String header = String.format("# %s #%n", title);
		String items = "";
		for (var item : menuItems) {
			items += String.format("| %s |%n", item);
		}
		System.out.print(header);
		System.out.print(items);
	}

}
