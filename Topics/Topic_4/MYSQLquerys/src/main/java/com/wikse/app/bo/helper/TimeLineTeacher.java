package com.wikse.app.bo.helper;

import java.util.List;

import com.wikse.app.bo.Teacher;

public class TimeLineTeacher {
	private Teacher teacher=null;
	private List<String> courses=null;
	private List<CourseDay> courseDays=null;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<CourseDay> getCourseDays() {
		return courseDays;
	}
	public void setCourseDays(List<CourseDay> courseDays) {
		this.courseDays = courseDays;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
}
