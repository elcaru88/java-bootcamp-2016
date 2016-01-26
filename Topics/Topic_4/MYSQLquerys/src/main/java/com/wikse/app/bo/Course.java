package com.wikse.app.bo;

public class Course {
	private int id_course;
	private String name;
	private int id_teacher;
	private int hrs_week;
	public Course(int id_course, String name, int id_teacher, int hrs_week) {
		super();
		this.id_course = id_course;
		this.name = name;
		this.id_teacher = id_teacher;
		this.hrs_week = hrs_week;
	}
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId_teacher() {
		return id_teacher;
	}
	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}
	public int getHrs_week() {
		return hrs_week;
	}
	public void setHrs_week(int hrs_week) {
		this.hrs_week = hrs_week;
	}
	
	
	
}
