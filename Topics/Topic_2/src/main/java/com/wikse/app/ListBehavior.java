package com.wikse.app;

import java.util.LinkedList;
import java.util.Queue;

public class ListBehavior {
	private Queue<File> myList;
	
	
	public ListBehavior(){
		myList= new LinkedList<File>();
	}

	public boolean isEmpty() {
		return myList.isEmpty();
	}

	public boolean addFile(File file) {
		if (file.hasbeenOpend()) {
			myList.add(file);
			return true;
		}
		return false;
	}

}
