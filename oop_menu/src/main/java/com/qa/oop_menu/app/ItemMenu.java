package com.qa.oop_menu.app;

import java.util.List;

import com.qa.oop_menu.app.actions.CreateItemAction;
import com.qa.oop_menu.app.actions.ReadItemsAction;
import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.menu.Menu;
import com.qa.oop_menu.menu.MenuItem;

public class ItemMenu extends Menu {

	private ItemController itemController;
	
	public ItemMenu(String name, ItemController itemController) {
		super(name);
		this.itemController = itemController;
		this.menuItems = List.of(
				new MenuItem("Add a new item", "1", new CreateItemAction(itemController)),
				new MenuItem("View all items", "2", new ReadItemsAction(itemController)),
				new MenuItem("Return to the previous menu", "R", () -> isRunning = false)
		);
	}
	
}
