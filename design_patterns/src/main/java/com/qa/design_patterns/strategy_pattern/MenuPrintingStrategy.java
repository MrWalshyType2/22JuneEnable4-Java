package com.qa.design_patterns.strategy_pattern;

import java.util.List;

public interface MenuPrintingStrategy {

	void print(String title, List<String> menuItems);
}
