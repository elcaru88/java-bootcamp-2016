package com.topic2.app;

import java.util.ArrayList;

public class Demo {

	 public static void main(String[] args) {
		 
		ArrayList<Entry> blog= Blog.getInstance();
		Blog bl = new Blog();
	   ActionsEntry ae = new ActionsEntry();
	   bl.setActionsEntry(ae);
	   int a=bl.saveMessage();
	   System.out.println(a);
	    
	   bl.list10MoreRecentEntries();
	   bl.removeMessage(2);
	    
	 }

	
}
