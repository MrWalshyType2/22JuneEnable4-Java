package com.qa.oop_menu.menu;

import java.util.List;

import com.qa.oop_menu.InputUtilities;

public class Menu implements Action {

	protected String name;
	protected List<MenuItem> menuItems;
	protected boolean isRunning;
	
	public Menu(String name) {
//		this.name = name;
//		isRunning = false;
		this(name, List.of());
	}
	
	public Menu(String name, List<MenuItem> menuItems) {
		this.name = name;
		this.menuItems = menuItems;
		isRunning = false;
	}

	@Override
	public void execute() {
		isRunning = true;
		
		while (isRunning) {
			printMenu();
			String input = InputUtilities.getString("> ");
			executeInput(input);
		}
	}

	private void executeInput(String input) {
		boolean validInput = false;
		
		for (MenuItem item : menuItems) {
			if (item.getUserInputCode().toUpperCase().equals(input.toUpperCase())) {
				validInput = true;
				item.execute();
				break;
			}
		}
		
		if (!validInput) System.out.println("Uh-oh, that wasn't a valid command.\n");
	}

	protected void printMenu() {
		String headerBar = "=".repeat(name.length() + 4);
		String headerOutput = headerBar + "\n" 
					+ "| " + name + " |\n" 
					+ headerBar; 
		System.out.println(headerOutput);
		
		for (MenuItem item : menuItems) {
			String itemOutput = "[%s] %s".formatted(item.getUserInputCode(), item.getName());
			System.out.println(itemOutput);
		}
	}
}
