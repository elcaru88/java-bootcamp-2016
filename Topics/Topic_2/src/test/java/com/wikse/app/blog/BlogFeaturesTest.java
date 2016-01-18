package com.wikse.app.blog;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.*;

public class BlogFeaturesTest {
	private static BlogFeature blog;
	private static Entry entry;
	
	@Before
	public void setUp() throws Exception {
		blog= EasyMock.createMock(BlogFeature.class);
		entry= getAnEntry();
	}
	
	@Test
	public void testAddNewPostFake(){
		BlogFeature blogFake= new BlogFeatureFake();
		assertEquals(true, blogFake.addNewEntry(new Entry()));
	}

	@Test
	public void testAddNewPostMock(){
		expect(blog.addNewEntry(entry)).andReturn(true);
		replay(blog);
		
		assertEquals(true, blog.addNewEntry(entry));
		verify(blog);
	}
	
	@Test
	public void testRemoveExistingPostMock(){
		expect(blog.removeEntry(entry)).andReturn(true);
		replay(blog);
		assertEquals(true, blog.removeEntry(entry));
	}
	
	
	
	
	private static Entry getAnEntry() {
		Entry e= new Entry();
		e.setId(1);
		return e;
	}
	
}
