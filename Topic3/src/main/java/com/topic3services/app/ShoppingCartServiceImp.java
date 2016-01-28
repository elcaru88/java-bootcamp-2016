package com.topic3services.app;

import java.util.ArrayList;

public class ShoppingCartServiceImp implements ShoppingCartService {

	protected ShoppingCartServiceImp() {
		super();
	}

	static ArrayList<Item> scart;
	
	public static ArrayList<Item> getInstance(){
		if (scart==null){
			scart = new ArrayList<Item>();
		}
		return scart;
	}
	
	
	public void addItem(Item item) {
	
		ArrayList<Item> scart = scart.getInstance();
		
	}

	public void removeItem(int itemId) {

		
	}

	public void doCheckout() {
		
		
	}

	public void clearCart() {
		
		
	}

	public int isCartEmpty() {

		return 0;
	}

	public void viewCart() {
		
	}
	
			
}
