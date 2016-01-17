package com.wikse.app.listbehavior;

public class File {
	private boolean isOpen;
	
	public File() {
		isOpen=false;
	}

	public void open() {
		isOpen=true;
	}

	public boolean hasbeenOpend() {
		return isOpen;
	}

}
