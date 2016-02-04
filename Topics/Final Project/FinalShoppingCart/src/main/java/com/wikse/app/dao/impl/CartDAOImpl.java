package com.wikse.app.dao.impl;

import java.util.Calendar;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wikse.app.dao.CartDAO;
import com.wikse.app.entities.Cart;

@Repository
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
	@Transactional
	public Cart getUserCartOpen(int idUser) {
		@SuppressWarnings("unchecked")
		TypedQuery<Cart> query=(TypedQuery<Cart>) getManager().createQuery("SELECT c FROM Cart c WHERE c.user.idUser= :idUser and c.isclose= false");
		query.setParameter("idUser", idUser);
		return query.getSingleResult();
	}

	

}
