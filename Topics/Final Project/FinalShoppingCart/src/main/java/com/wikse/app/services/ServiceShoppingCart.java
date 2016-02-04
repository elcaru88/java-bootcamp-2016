package com.wikse.app.services;

import java.util.List;

import com.wikse.app.entities.Cart;
import com.wikse.app.entities.Product;

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
	Cart closingPurchase(Cart cart);

	
	Product findProductByName(String name);
	
	List<Product> findProductByCategory(int id_category);
	
	boolean SaveShoppingCart(Cart cart);
	
	Cart findOpenCartsByUserId(int idUser);
}
