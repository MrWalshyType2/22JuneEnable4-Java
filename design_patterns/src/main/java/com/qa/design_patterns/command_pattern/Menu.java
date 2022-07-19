package com.qa.design_patterns.command_pattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.qa.design_patterns.command_pattern.strategies.MenuPrintingStrategy;

public class Menu {

	private String title;
	private Map<String, MenuCommand> menuItems;
	private MenuPrintingStrategy menuPrintingStrategy;
	
	public Menu(String title, MenuPrintingStrategy menuPrintingStrategy) {
		if (title == null) throw new NullPointerException("title cannot be null");
		if (menuPrintingStrategy == null) throw new NullPointerException("menuPrintingStrategy cannot be null");
		this.title = title;
		this.menuPrintingStrategy = menuPrintingStrategy;
		this.menuItems = new HashMap<>();
	}
	
	public Menu(String title, MenuPrintingStrategy menuPrintingStrategy, Map<String, MenuCommand> menuItems) {
		if (title == null) throw new NullPointerException("title cannot be null");
		if (menuItems == null) throw new NullPointerException("menuItems cannot be null");
		if (menuPrintingStrategy == null) throw new NullPointerException("menuPrintingStrategy cannot be null");
		this.title = title;
		this.menuItems = menuItems;
		this.menuPrintingStrategy = menuPrintingStrategy;
	}
	
	public void addMenuItem(String name, MenuCommand command) {
		this.menuItems.put(name, command);
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		
		do {
			menuPrintingStrategy.print(title, menuItems.keySet());
			System.out.print("> ");
			String input = sc.nextLine();
			executeCommand(input);
		} while (isRunning);
	}

	private void executeCommand(String input) {
		for (var key : menuItems.keySet()) {
			if (key.equalsIgnoreCase(input)) {
				menuItems.get(key).execute();
				return;
			}
		}
		// if the method didn't return, there wasn't a matching menu item to execute
		System.out.println("Error: Command does not exist!");
	}

	public void setMenuPrintingStrategy(MenuPrintingStrategy menuPrintingStrategy) {
		if (menuPrintingStrategy == null) throw new NullPointerException("menuPrintingStrategy cannot be null");
		this.menuPrintingStrategy = menuPrintingStrategy;
	}

}
