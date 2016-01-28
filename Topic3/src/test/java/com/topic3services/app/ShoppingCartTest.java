package com.topic3services.app;

import org.junit.Before;
import org.junit.Test;

import practice1.Item;
import practice1.ShoppingCartService;
import practice1.ShoppingCartServiceImp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ShoppingCartTest {

	private Item item;
	
	@Before
	public void setUp(){
		
		item = mock(Item.class);

		Item item1 = new Item("ItemName1",10,"1");
		Item item2 = new Item("ItemName2",20,"2");
		Item item3 = new Item("ItemName3",10,"3");
		
		
	}
	
	@Test
	public void testAddItem(){
		ShoppingCartServiceImp scart = new ShoppingCartServiceImp();
		
		scart.addItem(new Item("ItemName1",10,"1"));
		scart.addItem(new Item("ItemName2",20,"2"));
		
		assertEquals(40, scart.updateCart());
	}
	
	

	
}
