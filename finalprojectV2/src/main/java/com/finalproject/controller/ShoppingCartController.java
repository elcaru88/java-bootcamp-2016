package com.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.model.ShoppingCart;
import com.finalproject.service.ProductService;
import com.finalproject.service.ShoppingCartService;
import com.finalproject.service.UserService;

@RestController
@RequestMapping("/{userId}/shoppingCart")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST)
	void createCart(@PathVariable String userId) {
		this.validateUser(userId);
		
		shoppingCartService.createShoppingCart(
				new ShoppingCart(userService.findByUserName(userId)));
	}
	
	@RequestMapping(value = "/{shoppingCartId}/{productName}", method = RequestMethod.POST)
	public void addProduct(@PathVariable String userId,
			@PathVariable("shoppingCartId") Long shoppingCartId,
			@PathVariable("productName") String productName) {

		validateUser(userId);

		shoppingCartService.addProduct(userId, shoppingCartId,
				productService.getProductByName(productName));

	}
	
	private void validateUser(String userId) {
		userService.findByUserName(userId);

		if (userService.existUserName(userId)) {
		} else
			try {
				throw new Exception(userId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
}
