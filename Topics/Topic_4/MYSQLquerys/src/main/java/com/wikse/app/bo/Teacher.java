package com.wikse.app.bo;

import java.util.Date;

public class Teacher {
	private int id_teacher;
	private String first_name;
	private String last_name;
	private Date birthDay;
	public Teacher(int id_teacher, String first_name, String last_name, Date birthDay) {
		super();
		this.id_teacher = id_teacher;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birthDay = birthDay;
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public int getId_teacher() {
		return id_teacher;
	}
	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	
}
