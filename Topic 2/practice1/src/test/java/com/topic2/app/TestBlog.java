package com.topic2.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestBlog {

private ActionsEntry ae;
	
	@Before
	public void setUp() {
		
		ae = mock(ActionsEntry.class);
		
		when(ae.getEntry("Fede","Post",1)).thenReturn(new Entry("Fede", "Post1"));
		when(ae.getEntry("Fede","Post",2)).thenReturn(new Entry("Fede", "Post2"));
		when(ae.getEntry("Fede","Post",3)).thenReturn(new Entry("Fede", "Post3"));
		when(ae.getEntry("Fede","Post",4)).thenReturn(new Entry("Fede", "Post4"));
		when(ae.getEntry("Fede","Post",5)).thenReturn(new Entry("Fede", "Post5"));
		when(ae.getEntry("Fede","Post",6)).thenReturn(new Entry("Fede", "Post6"));
		when(ae.getEntry("Fede","Post",7)).thenReturn(new Entry("Fede", "Post7"));
		when(ae.getEntry("Fede","Post",8)).thenReturn(new Entry("Fede", "Post8"));
		when(ae.getEntry("Fede","Post",9)).thenReturn(new Entry("Fede", "Post9"));
		when(ae.getEntry("Fede","Post",10)).thenReturn(new Entry("Fede", "Post10"));
		when(ae.getEntry("Fede","Post",11)).thenReturn(new Entry("Fede", "Post11"));
	
        		
	}
	
	@Test
	public void testOfBlogSave(){

	Blog bl= new Blog();
	bl.setActionsEntry(ae);
	assertEquals(11,bl.saveMessage());
	
	}

	@Test
	public void testOfBlogRemove(){

	Blog bl= new Blog();
	bl.setActionsEntry(ae);
	assertEquals(10,bl.removeMessage(0));
	}

	@Test
	public void testlistWithMoreThan10Entries(){

	Blog bl= new Blog();
	bl.setActionsEntry(ae);
	assertEquals(0,bl.list10MoreRecentEntries());
	}
		
}
