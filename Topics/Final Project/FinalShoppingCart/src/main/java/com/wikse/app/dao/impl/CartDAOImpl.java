package com.wikse.app.dao.impl;

import java.util.Calendar;

import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.wikse.app.dao.CartDAO;
import com.wikse.app.entities.Cart;
import com.wikse.app.entities.User;

public class CartDAOImpl extends GenericDAOImpl<Cart, Integer> implements CartDAO {

	@Transactional
	public Cart closingPurchase(Cart cart) {
		cart.setDate_bought(Calendar.getInstance().getTime());
		cart.setIsclose(true);
		Cart c=getManager().find(Cart.class, cart.getId_cart());
		if (c!=null) {
			c=getManager().merge(cart);
		}else{
			getManager().persist(cart);
		}
		return c;
	}

	@Override
	public Cart getUserCartOpen(User user) {
		@SuppressWarnings("unchecked")
		TypedQuery<Cart> query=(TypedQuery<Cart>) getManager().createQuery("SELECT c FROM Cart c WHERE c.user= :user");
		query.setParameter("user", user);
		return query.getSingleResult();
	}

	

}
