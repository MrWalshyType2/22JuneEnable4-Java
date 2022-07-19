package com.qa.design_patterns.command_pattern.commands;

import com.qa.design_patterns.command_pattern.MenuCommand;

public class PrintCommand implements MenuCommand {

	private String value;

	public PrintCommand(String value) {
		if (value == null) throw new NullPointerException("Cannot print null values");
		if (value.isEmpty()) throw new IllegalArgumentException("Cannot print empty strings");
		this.value = value;
	}
	
	@Override
	public void execute() {
		System.out.println(value);
	}
	
}
