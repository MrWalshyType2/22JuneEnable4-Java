package com.qa.oop_menu.app;

import java.util.List;
import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.menu.ExitAction;
import com.qa.oop_menu.menu.Menu;
import com.qa.oop_menu.menu.MenuItem;

public class ItemManagementSystem {
	
	public void start() {
		ItemController itemController = new ItemController();
		Menu mainMenu = new Menu("=== MAIN MENU ===", List.of(
				new MenuItem("Access the item inventory", "1", new ItemMenu("Item inventory", itemController)),
				new MenuItem("Exit the application", "2", new ExitAction())
		));
		mainMenu.execute();
	}
}
