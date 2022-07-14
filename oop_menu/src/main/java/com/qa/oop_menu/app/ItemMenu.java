package com.qa.oop_menu.app;

import java.util.List;

import com.qa.oop_menu.app.actions.CreateItemAction;
import com.qa.oop_menu.app.actions.ReadItemsAction;
import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.menu.Menu;
import com.qa.oop_menu.menu.MenuItem;
import com.qa.oop_menu.menu.UndoActionManager;

public class ItemMenu extends Menu {

	private ItemController itemController;
	
	public ItemMenu(String name, ItemController itemController) {
		super(name);
		this.itemController = itemController;
		UndoActionManager undoManager = new UndoActionManager();
		
		this.menuItems = List.of(
				new MenuItem("Add a new item", "1", () -> {
					var action = new CreateItemAction(itemController);
					action.execute();
					undoManager.push(action);
				}),
				new MenuItem("View all items", "2", new ReadItemsAction(itemController)),
				new MenuItem("Undo last modification", "3", () -> undoManager.undoLastAction()),
				new MenuItem("Return to the previous menu", "R", () -> isRunning = false)
		);
	}
	
}
