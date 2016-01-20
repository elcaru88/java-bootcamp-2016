package com.wikse.app.services;

import java.util.List;

import com.wikse.app.bo.Product;

public interface ServiceShoppingCart {


	/**
	 * closing the purchase
	 * @return returning a list of the products
	 */
	List<Product> closingPurchase();

	/**
	 * Add a pruduct to the shopping list
	 * @param string name of the product
	 * @param quantity the amount of product to buy
	 * @return true if the product has been added to list, false if not
	 */
	boolean addToCartByName(String string, int i);
	
	
	
//	/**
//	 * Add a product to the shopping list.
//	 * @param product the product to add to the list.
//	 * @param quantity the amount of product to buy
//	 * @return true if the product has been added to list, false if not
//	 */
//	boolean addToCart(Product product, int quantity);
//	
}
