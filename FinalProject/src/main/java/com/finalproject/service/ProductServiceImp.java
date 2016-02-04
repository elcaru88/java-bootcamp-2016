package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.ProductDao;
import com.finalproject.model.Product;

@Service
public class ProductServiceImp {

	@Autowired
	private ProductDao productdao;
	
	public Product createProduct(Product product){
		return productdao.saveAndFlush(product);
	}
	
	public Product getProductByName(String name){
		return productdao.findByName(name);
	}
	
	public List<Product> getProductByCategory(String category) {
		return productdao.findByCategory(category);
	}
	
}
