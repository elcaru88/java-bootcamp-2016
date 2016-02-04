package com.wikse.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wikse.app.dao.CartDAO;
import com.wikse.app.dao.ProductDAO;
import com.wikse.app.dao.UserDAO;
import com.wikse.app.entities.Cart;
import com.wikse.app.entities.Product;
import com.wikse.app.entities.User;
import com.wikse.app.services.ServiceShoppingCart;

/**
 * This class manages the implementation of a shopping cart
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
@Service
public class ServiceShoppingCartImpl  implements ServiceShoppingCart{
	
	/**
	 *  this is the shopping list of a user
	 */
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public Cart closingPurchase(Cart cart) {
		return cartDAO.closingPurchase(cart);
	}

	@Override
	public Product findProductByName(String name) {
		return productDAO.getByName(name);
	}

	@Override
	public List<Product> findProductByCategory(int id_category) {
		
		return productDAO.getByCategory(id_category);
	}

	@Override
	public boolean SaveShoppingCart(Cart cart) {
		cartDAO.add(cart);
		return true;
	}


	@Override
	public Cart findOpenCartsByUserId(int idUser) {
		return cartDAO.getUserCartOpen(idUser);
	}


	
}
