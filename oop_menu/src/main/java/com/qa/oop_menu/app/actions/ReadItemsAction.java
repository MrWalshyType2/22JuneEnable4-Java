package com.qa.oop_menu.app.actions;

import java.util.List;

import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.app.domain.Item;
import com.qa.oop_menu.menu.Action;

public class ReadItemsAction implements Action {

	protected ItemController itemController;

	public ReadItemsAction(ItemController itemController) {
		super();
		this.itemController = itemController;
	}

	@Override
	public void execute() {
		String headerName = "Items view";
		String headerBar = "=".repeat(headerName.length() + 4);
		String headerOutput = headerBar + "\n" + "| " + headerName + " |\n" + headerBar;
		System.out.println(headerOutput);

		List<Item> items = itemController.getAll();
		for (Item item : items) {
			String itemOutput = "[%d] %s\nDescription:\n%s\nQuantity: %d".formatted(item.getId(), item.getName(),
					item.getDescription(), item.getQuantity());
			System.out.println(itemOutput);
		}
	}

}
