package com.wikse.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListBehaviorTest {
	public static ListBehavior behaviorList; 
	
	@Test
	public void whenStartsTheListIsEmpty(){
		behaviorList= new ListBehavior();
		assertEquals(true, behaviorList.isEmpty());
	}
	
	
	
}
