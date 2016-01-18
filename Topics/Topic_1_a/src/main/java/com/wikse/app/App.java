package com.wikse.app;

/**
 * App Testing 
 *
 */
public class App
{
	private int a;
	private int b;
	
    public App(int a, int b) {
    	this.a=a;
    	this.b=b;
	}
	
    public int add(){
    	return a+b;
    }
    
    public int subt(){
    	return a-b;
    }
}
