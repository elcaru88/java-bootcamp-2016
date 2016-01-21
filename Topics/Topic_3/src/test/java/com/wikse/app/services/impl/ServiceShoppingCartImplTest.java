package com.wikse.app.services.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.wikse.app.services.ServiceShoppingCart;

public class ServiceShoppingCartImplTest {
	public ServiceShoppingCart service;
	
	@Before
	public void setUp() {
		service= new ServiceShoppingCartImpl();
	}
	
	@Test
	public void AddToCartAProductLookingForAName(){
		assertEquals(true, service.addToCartByName("notebook", 1));
	}
	
	
	@Test
	public void closingPurchaseAndReturningTheShoppingList(){
		service.addToCartByName("notebook", 1);
		service.addToCartByName("monitor", 1);
		service.addToCartByName("mouse", 1);
		assertEquals(3, service.closingPurchase().size());
	}
}
