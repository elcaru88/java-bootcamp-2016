package tddPostNewEntry;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PostAndDeleteTest {
	
	private static Entry entry;
	private static DbConnection db;
	private static CrudDb crudDb;

	@Before
	public void setUp() throws Exception {
		entry = new Entry();
		db = new DbConnection();
		crudDb = new CrudDb();
	}

	@Test
	public void validatePostNewEntry()
	{
		
		boolean dbConnected = db.ConnectionReady();
		assertEquals("validateDbConnected", true, db.ConnectionReady());
		assertEquals("validateNewPost", false, crudDb.addNewEntry());
		
	}
	
	@Test
	public void validateDeletePost(){
		
		boolean dbConnected = db.ConnectionReady();
		assertEquals("validateDbConnected", true, db.ConnectionReady());
		assertEquals("validateDeletePost", true, crudDb.deleteNewEntry());
		
	}
	@Test	
	public void showFiveEntries(){
		
		boolean dbConnected = db.ConnectionReady();
		assertEquals("validateDbConnected", true, db.ConnectionReady());
		assertEquals(5, crudDb.showEntries());
		
}
}
