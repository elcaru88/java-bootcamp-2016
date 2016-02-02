package com.wikse.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wikse.app.bo.Product;
import com.wikse.app.dao.ProductDAO;
import com.wikse.app.dao.impl.ProductDAOImp;
import com.wikse.app.services.ServiceShoppingCart;

/**
 * This class manages the implementation of a shopping cart
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
@Service
public class ServiceShoppingCartImpl  implements ServiceShoppingCart{
	
	/**
	 *  this is the shopping list of a user
	 */
	private List<Product> itemList;
	
	private ProductDAO productDAO;
	
	public ServiceShoppingCartImpl() {
		itemList =new ArrayList<>();
		productDAO= new ProductDAOImp();
	}
	
	@Override
	public List<Product> closingPurchase() {
		return itemList;
	}

	@Override
	public Product addToCartByName(String nameProduct, int quantity) {
		Product product=productDAO.getProductByName(nameProduct);
		if (product != null && quantity <= product.getStock()) {
			Product p=product;
			p.setStock(quantity);
			itemList.add(p);
			return product;
		}
		Product notaddProduct= new Product();
		notaddProduct.setId_product(0);
		return notaddProduct;
	}

}
