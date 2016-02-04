package com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	public User() {
		super();
	}
	
	public User(String nickName, String password) {
		super();
		this.nickName = nickName;
		this.password = password;
	}
	@Id
	@Column
	private String nickName;
	@Column
	private String password;
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
