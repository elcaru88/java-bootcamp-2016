package com.finalprojectV3.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.finalprojectV3.model.ShoppingCart;

@Repository
public class ShoppingCartDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(ShoppingCart entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return false;
	}

	@Transactional
	public ShoppingCart getEntity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ShoppingCart p = (ShoppingCart) session.get(ShoppingCart.class, new Integer(id));
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ShoppingCart> getEntities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ShoppingCart> cartList = session.createQuery("from Cart").list();
		return cartList;
	}

	
	@Transactional
	public boolean updateEntity(ShoppingCart entity) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
