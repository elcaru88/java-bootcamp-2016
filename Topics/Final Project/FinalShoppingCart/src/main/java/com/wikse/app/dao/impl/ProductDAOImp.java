package com.wikse.app.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wikse.app.dao.ProductDAO;
import com.wikse.app.entities.Category;
import com.wikse.app.entities.Product;

@Repository
public class ProductDAOImp extends GenericDAOImpl<Product, Integer> implements ProductDAO{

	@Override
	@Transactional
	public Product getByName(String name) {
		@SuppressWarnings("unchecked")
		TypedQuery<Product> query=(TypedQuery<Product>) getManager().createQuery("SELECT p FROM Producto p WHERE p.name= :name");
		query.setParameter("name",name);
		return query.getSingleResult();
	}

	@Override
	public List<Product> getByCategory(Category category) {
		
		@SuppressWarnings("unchecked")
		TypedQuery<Product> query=(TypedQuery<Product>) getManager().createQuery("SELECT p FROM Producto p WHERE p.category= :category");
		query.setParameter("category",category);
		return null;
	}
	
}
