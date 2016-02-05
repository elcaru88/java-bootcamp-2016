package com.finalprojectV3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalprojectV3.model.ShoppingCart;
import com.finalprojectV3.service.ShoppingCartServiceImp;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCartServiceImp shoppingcartserviceImp;
	
	@RequestMapping(value = "/buy", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ShoppingCart> createCart(@RequestBody ShoppingCart cart) {
		shoppingcartserviceImp.addEntity(cart);
		return new ResponseEntity<ShoppingCart>(cart, HttpStatus.OK);
	}
	
	
	
}
