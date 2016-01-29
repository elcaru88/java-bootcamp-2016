package com.topic3services.app;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import practice1.Item;
import practice2.ShoppingCartServiceImp;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ShoppingCartTest {

	ShoppingCartServiceImp scartTest,scartE;
	Item item1, item2, item3;
	
		
	@Before
	public void setUp(){
		
		scartTest = new ShoppingCartServiceImp();
		
		item1 = new Item("Item1",10,"1");
		item2 = new Item("Item2",25,"2");
		item3 = new Item("Item3",10,"3");

	}
		
	@Test
	public void A_emptyCartTest(){
				
		assertEquals(0,scartTest.getTotal());
			
			
	}
	
	@Test
	public void B_addItemTest(){
				
		scartTest.addItem(item1);
		scartTest.addItem(item2);
		scartTest.addItem(item3);
		
		assertEquals(45,scartTest.getTotal());
			
	}

	@Test
	public void C_removeItemTest(){
		
		scartTest.removeItem(item1);
		scartTest.removeItem(item2);
				
		assertEquals(10,scartTest.getTotal());
	}
	
	@Test
	public void D_viewCartTest(){
		
		scartTest.viewCart();
		
	}
}
