package com.wikse.app;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListBehaviorTest {
	public static ListBehavior behaviorList; 
	
	@BeforeClass
	public static void setUpList(){
		behaviorList= new ListBehavior();
	}
	
	@Before
	public void cleanList(){
		behaviorList.clean();
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
	
	@Test
	public void givenAListWithFilesWhenAFileIsReenteredIsPutToTheTop(){
		File file1= new File();
		file1.open();
		File file2= new File();
		file2.open();
		File file3= new File();
		file3.open();
		behaviorList.addFile(file1);
		behaviorList.addFile(file2);
		behaviorList.addFile(file3);
		behaviorList.addFile(file1);
		assertEquals(3, behaviorList.length());
		
	}
	
	
}
