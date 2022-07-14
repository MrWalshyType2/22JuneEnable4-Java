package com.qa.oop_menu.app.actions;

import com.qa.oop_menu.InputUtilities;
import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.app.domain.Item;
import com.qa.oop_menu.menu.UndoableAction;

public class DeleteItemsAction implements UndoableAction {

	private ItemController itemController;
	private Item deleted;

	@Override
	public void execute() {
		long id = InputUtilities.getLong("Please enter the ID of the item to delete: ");
		deleted = itemController.getById(id);
		itemController.delete(id);
		System.out.println("Item deleted successfully.");
	}

	@Override
	public void undo() {
		System.out.println("Recreating deleted item...");
		itemController.create(deleted);
	}

}
