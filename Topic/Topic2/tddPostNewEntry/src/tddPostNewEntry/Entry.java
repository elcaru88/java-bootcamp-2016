package tddPostNewEntry;

import java.util.Date;

public class Entry {
	
	private int id;
	private Date postPublished;
	private String name;
	private String body;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPostPublished() {
		return postPublished;
	}
	public void setPostPublished(Date postPublished) {
		this.postPublished = postPublished;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}