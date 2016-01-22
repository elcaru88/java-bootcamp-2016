package com.topic2.app;

public class ActionsEntry {

	public Entry getEntry(String entryWriter, String entryBody, int number){
		return new Entry(entryWriter, entryBody + number);
	}
}
