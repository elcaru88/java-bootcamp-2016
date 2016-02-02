package com.wikse.app.dao.impl;

import java.util.List;

import com.wikse.app.bo.Product;
import com.wikse.app.dao.ProductDAO;
import com.wikse.app.helper.DataBaseHelper;

public class ProductDAOImp implements ProductDAO{
	
	public ProductDAOImp() {
		
	}
	
	@Override
	public List<Product> getAllProducts() {
		return DataBaseHelper.getListProducts();
	}

	@Override
	public Product getProduct(int id_product) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Product getProductByName(String nameProduct) {
		for (Product product : DataBaseHelper.getListProducts()) {
			if (product.getName().equals(nameProduct) ) {
				return product;
			}
		}
		return null;
	}

}
