package com.topic3services.app;

public class Item {

	public Item(String itemName, int itemPrice, String itemId) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemId = itemId;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String itemName;
	private int itemPrice;
	private String itemId;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemId=" + itemId + "]";
	}
	
}
