package com.wikse.app.bo.helper;

public class CourseDay {
	public static final String MONDAY="MONDAY";
	public static final String TUESDAY="TUESDAY";
	public static final String WEDNESDAY="WEDNESDAY";
	public static final String THURSDAY="THURSDAY";
	public static final String FRIDAY="FRIDAY";
	
	private int id_course;
	private String day_week;
	private String init;
	private String finish;

	public CourseDay() {
		// TODO Auto-generated constructor stub
	}
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	
	public String getInit() {
		return init;
	}
	public void setInit(String init) {
		this.init = init;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getDay_week() {
		return day_week;
	}
	public void setDay_week(String day_week) {
		this.day_week = day_week;
	}
	
	
	
}
