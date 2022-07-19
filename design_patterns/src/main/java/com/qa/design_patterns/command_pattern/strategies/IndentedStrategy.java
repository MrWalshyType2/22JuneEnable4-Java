package com.qa.design_patterns.command_pattern.strategies;

import java.util.Set;

public class IndentedStrategy implements MenuPrintingStrategy {

	@Override
	public void print(String title, Set<String> menuItems) {
		String header = String.format("# %s #%n", title);
		String items = "";
		for (var item : menuItems) {
			items += String.format("\t%s%n", item);
		}
		System.out.print(header);
		System.out.print(items);
	}

}
