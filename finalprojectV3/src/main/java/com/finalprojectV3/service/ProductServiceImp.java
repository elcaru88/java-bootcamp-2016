package com.finalprojectV3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalprojectV3.dao.ProductDAO;
import com.finalprojectV3.model.Product;

@Service
public class ProductServiceImp {
	
	@Autowired
	ProductDAO productDAO;
	
	public boolean addEntity(Product product) {
		productDAO.addEntity(product);
		return true;
	}

	public Product getEntity(int id) {
		Product result = productDAO.getEntity(id);
		return result;
	}

	public List<Product> getEntities() {
		List<Product> result = new ArrayList<Product>();
		for (Product product : productDAO.getEntities()) {      //
			result.add(product);
		}
		return result;
	}

	

}
