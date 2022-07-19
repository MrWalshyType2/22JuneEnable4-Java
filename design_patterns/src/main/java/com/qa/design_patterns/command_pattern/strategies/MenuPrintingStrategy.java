package com.qa.design_patterns.command_pattern.strategies;

import java.util.List;
import java.util.Set;

public interface MenuPrintingStrategy {

	void print(String title, Set<String> set);
}
