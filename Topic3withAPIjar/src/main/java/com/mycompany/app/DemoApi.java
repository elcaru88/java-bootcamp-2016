package com.mycompany.app;

import practice1.Item;
import practice2.ShoppingCartServiceImp;

public class DemoApi {

	public static void main(String[] args) {

		ShoppingCartServiceImp scart = new ShoppingCartServiceImp();

		Item item1, item2;
		
		item1 = new Item("Item1",10,"1");
		item2 = new Item("Item2",20,"2");
		
		scart.addItem(item1);
		scart.addItem(item2);
		
		scart.viewCart();
		
		int total = scart.getTotal();
		
		System.out.println("Total en cart: " + total);
		
		scart.removeItem(item1);
		
		scart.viewCart();
		
		total = scart.getTotal();
		
		System.out.println("Total en cart: " + total);
		
		scart.clearCart();
		
		scart.viewCart();
		
		total = scart.getTotal();
		
		System.out.println("Total en cart: " + total);
	}

}
