package com.topic2.app;

public class Entry {
	
	private String entryWriter;
	private String entryBody;
		
	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entry(String entryWriter, String entryBody) {
		super();
		this.entryWriter = entryWriter;
		this.entryBody = entryBody;
	}
	
	public String getEntryWriter() {
		return entryWriter;
	}
	public void setEntryWriter(String entryWriter) {
		this.entryWriter = entryWriter;
	}
	public String getEntryBody() {
		return entryBody;
	}
	public void setEntryBody(String entryBody) {
		this.entryBody = entryBody;
	}
	
}
