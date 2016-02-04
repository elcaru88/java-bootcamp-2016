package com.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.ShoppingCartDao;
import com.finalproject.model.Product;
import com.finalproject.model.ShoppingCart;

@Service
public class ShoppingCartServiceImp {

	@Autowired
	private ShoppingCartDao shoppingcartdao;
	
	public ShoppingCart createShoppingCart(ShoppingCart shoppingcart){
		return shoppingcartdao.saveAndFlush(shoppingcart);
	}
	
	/*public boolean addProduct(String nickName, Product product){
		
		ShoppingCart sc;
		
		sc = shoppingcartdao.findByNickName(nickName);
		
		sc.products.add(product);
		
		if (shoppingcartdao.saveAndFlush(sc)!=null){
			return true;
		}
		else {
			return false;
		}*/
	}
	

