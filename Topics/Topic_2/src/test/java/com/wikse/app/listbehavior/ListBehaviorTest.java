package com.wikse.app.listbehavior;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wikse.app.listbehavior.File;
import com.wikse.app.listbehavior.ListBehavior;

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

	
	@Test
	public void givenAFullListWith15FilesDeleteTheFirstWhenANewFileIsAdded(){
		behaviorList=getFullList();
		File first=behaviorList.getFirstElement();
		File newFile= new File();
		newFile.open();
		behaviorList.addFile(newFile);
		assertNotEquals(first, behaviorList.getFirstElement());
		assertEquals(newFile, behaviorList.getLastFile());
		
	}

	/**
	 * return a ListBehavior with 15 files
	 * @return
	 */
	private ListBehavior getFullList() {
		File file1= new File();
		file1.open();
		File file2= new File();
		file2.open();
		File file3= new File();
		file3.open();
		File file4= new File();
		file4.open();
		File file5= new File();
		file5.open();
		File file6= new File();
		file6.open();
		File file7= new File();
		file7.open();
		File file8= new File();
		file8.open();
		File file9= new File();
		file9.open();
		File file10= new File();
		file10.open();
		File file11= new File();
		file11.open();
		File file12= new File();
		file12.open();
		File file13= new File();
		file13.open();
		File file14= new File();
		file14.open();
		File file15= new File();
		file15.open();
		
		ListBehavior list= new ListBehavior();
		list.addFile(file1);
		list.addFile(file2);
		list.addFile(file3);
		list.addFile(file4);
		list.addFile(file5);
		list.addFile(file6);
		list.addFile(file7);
		list.addFile(file8);
		list.addFile(file9);
		list.addFile(file10);
		list.addFile(file11);
		list.addFile(file12);
		list.addFile(file13);
		list.addFile(file14);
		list.addFile(file15);
		
		return list;
	}
	
}
