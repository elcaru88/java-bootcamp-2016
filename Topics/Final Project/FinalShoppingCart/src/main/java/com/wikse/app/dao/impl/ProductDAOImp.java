package com.wikse.app.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wikse.app.dao.ProductDAO;
import com.wikse.app.entities.Product;

@Repository
public class ProductDAOImp extends GenericDAOImpl<Product, Integer> implements ProductDAO{

	@Override
	@Transactional
	public Product getByName(String name) {
		@SuppressWarnings("unchecked")
		TypedQuery<Product> query=(TypedQuery<Product>) getManager().createQuery("SELECT p FROM Product p WHERE p.name= :name");
		query.setParameter("name",name);
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public List<Product> getByCategory(int id_category) {
		@SuppressWarnings("unchecked")
		TypedQuery<Product> query=(TypedQuery<Product>) getManager().createQuery("SELECT p FROM Product p WHERE p.category.id_category= :id_category");
		query.setParameter("id_category",id_category);
		return query.getResultList();
	}
	
}
