package com.topic2.app;

import java.util.ArrayList;
import java.util.Iterator;

public class Blog {

	
		
		protected ActionsEntry ae;
		
		public ActionsEntry getEntry() {
			return ae;
		}
		public void setActionsEntry(ActionsEntry ae) {
			this.ae = ae;
		}
		static ArrayList<Entry> blog;
		public static ArrayList<Entry> getInstance(){
			if(blog==null){
				blog=new ArrayList<Entry>();
			}
			return blog;
		}
		public int saveMessage(){
			ArrayList<Entry> blog= Blog.getInstance();
			
			blog.add(ae.getEntry("Fede","Post",1));
			blog.add(ae.getEntry("Fede","Post",2));
			blog.add(ae.getEntry("Fede","Post",3));
			blog.add(ae.getEntry("Fede","Post",4));
			blog.add(ae.getEntry("Fede","Post",5));
			blog.add(ae.getEntry("Fede","Post",6));
			blog.add(ae.getEntry("Fede","Post",7));
			blog.add(ae.getEntry("Fede","Post",8));
			blog.add(ae.getEntry("Fede","Post",9));
			blog.add(ae.getEntry("Fede","Post",10));
			blog.add(ae.getEntry("Fede","Post",11));
			

			int size = blog.size();
			
			return size;
			
		}
		
		public int removeMessage(int messageId){
			
			ArrayList<Entry> blog= Blog.getInstance();
			blog.remove(messageId);
			return blog.size();
			
		}
		
		public int list10MoreRecentEntries(){
			
			ArrayList<Entry> blog= Blog.getInstance();
			
			if (blog.size()>=10){
				
				for (int i = 0; i < 10; i++) {
				   System.out.println(blog.get(i));
				}
				return 0;
			}
			else
				
			{
				System.out.println("There are less than 10 entries created.");
				return 1;
			}
		
		}
}	



