package com.topic3services.app;

public interface ShoppingCartService {

	public void addItem(Item item);
	public void removeItem(int itemId);
	public void doCheckout();
	public void clearCart();
	public int isCartEmpty();
	
}
