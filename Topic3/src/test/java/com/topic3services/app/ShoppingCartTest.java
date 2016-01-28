package com.topic3services.app;

import org.junit.Before;
import org.junit.Test;

import practice1.Item;
import practice1.ShoppingCartService;
import practice1.ShoppingCartServiceImp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ShoppingCartTest {

	private static Item item;
	
	@Before
	public void setUp(){
		
		item = new Item("ItemName1",10,"1");
		item = new Item("ItemName2",20,"2");
		item = new Item("ItemName3",10,"3");
		
	
		
	}
	
	@Test
	public void testAddItem(){
		ShoppingCartServiceImp scart = new ShoppingCartServiceImp();
		
		scart.addItem(item);
		
		assertEquals(5, scart.updateCart());
	}
	
	

	
}
