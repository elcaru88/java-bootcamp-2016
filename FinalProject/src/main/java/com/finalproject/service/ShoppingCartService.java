package com.finalproject.service;

import com.finalproject.model.Product;
import com.finalproject.model.ShoppingCart;

public interface ShoppingCartService {

	public ShoppingCart createShoppingCart(ShoppingCart shoppingCart);
	
	public boolean addProduct(String nickName, long idShoppingCart, Product product);
	
}
