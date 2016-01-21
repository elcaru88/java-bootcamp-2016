package com.wikse.app.listbehavior;

import java.util.LinkedList;
import java.util.List;

public class ListBehavior {
	private List<File> myList;
	private static final int LIMIT_LIST=15;
	private static final int FIRST_ELEMENT_INDEX=0;
	private static final int LAST_FILE_INDEX = LIMIT_LIST-1;
	
	public ListBehavior(){
		myList= new LinkedList<File>();
	}

	public boolean isEmpty() {
		return myList.isEmpty();
	}

	public boolean addFile(File file) {
		if (file.hasbeenOpend()) {
			if(myList.contains(file)){
				myList.remove(file);
			}
			if(myList.size()==LIMIT_LIST){
				myList.remove(FIRST_ELEMENT_INDEX);
			}
			myList.add(file);
			return true;
		}
		return false;
	}

	public void clean() {
		myList.clear();
	}

	public Object length() {
		return myList.size();
	}

	public File getFirstElement() {
		return myList.get(FIRST_ELEMENT_INDEX);
	}

	public File getLastFile() {
		return myList.get(LAST_FILE_INDEX);
	}

}
