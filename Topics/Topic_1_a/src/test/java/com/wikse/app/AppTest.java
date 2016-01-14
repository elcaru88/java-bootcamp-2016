package com.wikse.app;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest {
    private static App app;
    
    @BeforeClass
    public static void setUp() {
    	app= new App(2, 2);
	}
    
    @Test
    public void testAdd() {
    	assertEquals(4, app.add());
    	assertNotEquals(0, app.add());
	}
    @Test
    public void testSubt(){
    	assertEquals(0, app.subt());
    	assertNotEquals(4, app.subt());
    }
	
}
