package com.finalprojectV3.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.finalprojectV3.model.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Product getEntity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.get(Product.class, new Integer(id));
		return p;
	}
	
	@Transactional
	public boolean addEntity(Product entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Product> getEntities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> personsList = session.createQuery("from Product").list();
		return personsList;
	}

}
