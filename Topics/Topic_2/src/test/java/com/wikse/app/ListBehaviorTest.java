package com.wikse.app;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListBehaviorTest {
	public static ListBehavior behaviorList; 
	
	@BeforeClass
	public static void setUpList(){
		behaviorList= new ListBehavior();
	}
	
	@Test
	public void whenStartsTheListIsEmpty(){
		assertEquals(true, behaviorList.isEmpty());
	}
	
	@Test
	public void whenAFileIsOpenCanBeAddedToTheList(){
		File file= new File();
		file.open();
		assertEquals(true, behaviorList.addFile(file));
	}
	
	
}
