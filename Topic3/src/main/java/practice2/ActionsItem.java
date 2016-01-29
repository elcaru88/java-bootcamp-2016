package practice2;

import practice1.Item;

public class ActionsItem {

	public Item getItem(String itemName, int itemPrice, String itemId){
		return new Item (itemName, itemPrice, itemId);
	}
	
}
