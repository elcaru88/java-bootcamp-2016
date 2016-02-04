package com.finalproject.service;

import java.util.List;

import com.finalproject.model.Product;

public interface ProductService {

	public Product createProduct(Product product);
	
	public Product getProductByName(String name);
	
	public List<Product> getProductByCategory(String category);
	
}
