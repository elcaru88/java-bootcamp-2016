package com.finalprojectV3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalprojectV3.dao.ShoppingCartDAO;
import com.finalprojectV3.model.ShoppingCart;

@Service
public class ShoppingCartServiceImp {
	
	@Autowired
	ShoppingCartDAO shoppingcartdao;
	
	public boolean addEntity(ShoppingCart cart) {
		shoppingcartdao.addEntity(cart);
		return true;
	}

	public ShoppingCart getEntity(int id) {
		ShoppingCart result = shoppingcartdao.getEntity(id);
		return result;
	}

	public List<ShoppingCart> getEntities() {
		List<ShoppingCart> result = new ArrayList<ShoppingCart>();
		for (ShoppingCart cart : shoppingcartdao.getEntities()) {      //
			result.add(cart);
		}
		return result;
	}

	public boolean updateEntity(ShoppingCart cart) {
		shoppingcartdao.updateEntity(cart);
		return true;
	}
	

}
