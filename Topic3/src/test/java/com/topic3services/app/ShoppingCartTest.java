package com.topic3services.app;

import org.junit.Before;
import org.junit.Test;

import practice1.Item;
import practice2.ShoppingCartServiceImp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ShoppingCartTest {

	ShoppingCartServiceImp scart;
	Item item1, item2, item3;
		
	@Before
	public void setUp(){
		
		scart = new ShoppingCartServiceImp();
		
		item1 = new Item("Item1",10,"1");
		item2 = new Item("Item2",25,"2");
		item3 = new Item("Item3",10,"3");

	}
	
	@Test
	public void testEmptyCart(){
				
		assertEquals(0,scart.updateCart());
			
	}
	
	@Test
	public void testAddItem(){
				
		scart.addItem(item1);
		scart.addItem(item2);
		scart.addItem(item3);
		
		assertEquals(45,scart.updateCart());
			
			
	}
	
	
}
