package tddPostNewEntry;

import java.util.ArrayList;
import java.util.Date;

public class CrudDb {
	
	ArrayList<Entry> newPost = new ArrayList<Entry>();
	ArrayList<Entry> newPost2 = new ArrayList<Entry>();
	Entry a = new Entry();
	Entry b = new Entry();
	int newPostSize;

	public boolean addNewEntry()    {
		
		a.setId(1);
		a.setPostPublished(new Date());
		a.setName("Pepe");
		a.setBody("hola que tal");
		newPost.add(a);
		
		b.setId(1);
		b.setPostPublished(new Date());
		b.setName("Pepe");
		b.setBody("hola que tal");
		newPost2.add(b);
		
		boolean validate = newPost.isEmpty();
		
		return validate;
		
	}

	public boolean deleteNewEntry() {
		newPost.remove(a);
		return true;
	}

	public int showEntries() {
		
		for(int i = 0; i < 5; i++){
			
			newPost2.add(b);
			System.out.println(b);
			
		}

		return newPostSize  = newPost2.size();
	}

}
