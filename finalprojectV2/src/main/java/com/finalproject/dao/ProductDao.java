package com.finalproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.model.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

	Product findByName(String name);
	List<Product> findByCategory(String category);
	
}
