package com.wikse.app.dao;

import com.wikse.app.entities.Cart;
import com.wikse.app.entities.User;

public interface CartDAO extends GenericDAO<Cart, Integer> {

	Cart closingPurchase(Cart cart);
	Cart getUserCartOpen(User user);

}
