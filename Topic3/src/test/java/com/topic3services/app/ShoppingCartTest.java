package com.topic3services.app;

import org.junit.Before;
import org.junit.Test;

import practice1.Item;
import practice1.ShoppingCartService;
import practice1.ShoppingCartServiceImp;
import practice2.ActionsItem;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ShoppingCartTest {

	ShoppingCartServiceImp scartEmpty;
	ShoppingCartServiceImp scart;
	Item item1;
		
	@Before
	public void setUp(){
		
		scartEmpty = new ShoppingCartServiceImp();
		
		scart = new ShoppingCartServiceImp();

		
	}
	
	@Test
	public void testEmptyCart(){
				
		assertEquals(0,scartEmpty.updateCart());
			
	}
	
	@Test
	public void testAddItem(){
				
		assertEquals(0,scart.updateCart());
			
	}
	
	
}
