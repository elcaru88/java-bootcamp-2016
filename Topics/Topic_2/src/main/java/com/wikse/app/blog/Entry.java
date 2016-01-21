package com.wikse.app.blog;

import java.util.Date;

public class Entry {
	private int id;
	private Date datePblished;
	private String title;
	private String body;
	private int idPhotograph;
	private int idAudio;
	private int idVideo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatePblished() {
		return datePblished;
	}
	public void setDatePblished(Date datePblished) {
		this.datePblished = datePblished;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getIdPhotograph() {
		return idPhotograph;
	}
	public void setIdPhotograph(int idPhotograph) {
		this.idPhotograph = idPhotograph;
	}
	public int getIdAudio() {
		return idAudio;
	}
	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}
	public int getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}
	
	
}
