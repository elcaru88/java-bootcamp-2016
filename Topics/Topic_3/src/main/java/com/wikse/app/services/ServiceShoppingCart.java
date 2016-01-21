package com.wikse.app.services;

import java.util.List;

import com.wikse.app.bo.Product;

/**
 * This class manages the implementation of the shopping cart.
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
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
	
	
	
}
