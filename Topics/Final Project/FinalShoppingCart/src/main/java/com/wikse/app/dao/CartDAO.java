package com.wikse.app.dao;

import com.wikse.app.entities.Cart;

public interface CartDAO extends GenericDAO<Cart, Integer> {

	Cart closingPurchase(Cart cart);
	Cart getUserCartOpen(int idUser);

}
