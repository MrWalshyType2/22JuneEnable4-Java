package com.qa.design_patterns.strategy_pattern;

import java.util.List;
import java.util.Scanner;

public class Menu {

	private String title;
	private List<String> menuItems;
	private MenuPrintingStrategy menuPrintingStrategy;
	
	public Menu(String title, MenuPrintingStrategy menuPrintingStrategy) {
		if (title == null) throw new NullPointerException("title cannot be null");
		if (menuPrintingStrategy == null) throw new NullPointerException("menuPrintingStrategy cannot be null");
		this.title = title;
		this.menuPrintingStrategy = menuPrintingStrategy;
	}
	
	public Menu(String title, MenuPrintingStrategy menuPrintingStrategy, List<String> menuItems) {
		if (title == null) throw new NullPointerException("title cannot be null");
		if (menuItems == null) throw new NullPointerException("menuItems cannot be null");
		if (menuPrintingStrategy == null) throw new NullPointerException("menuPrintingStrategy cannot be null");
		this.title = title;
		this.menuItems = menuItems;
		this.menuPrintingStrategy = menuPrintingStrategy;
	}
	
	public void addMenuItem(String item) {
		this.menuItems.add(item);
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean isRunning = false; // usually would be set to true by default, false for the example
		
		do {
			menuPrintingStrategy.print(title, menuItems);
			System.out.print("> ");
			String input = sc.nextLine();
		} while (isRunning);
	}

	public void setMenuPrintingStrategy(MenuPrintingStrategy menuPrintingStrategy) {
		if (menuPrintingStrategy == null) throw new NullPointerException("menuPrintingStrategy cannot be null");
		this.menuPrintingStrategy = menuPrintingStrategy;
	}

}
