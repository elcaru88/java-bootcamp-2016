package com.wikse.app.tryout;

import java.util.List;

import com.wikse.app.bo.helper.CourseDay;
import com.wikse.app.bo.helper.TimeLineTeacher;
import com.wikse.app.service.HighschoolsService;
import com.wikse.app.service.impl.HighschoolServiceImpl;

public class Main {

	public static void main(String[] args) {
		HighschoolsService school= new HighschoolServiceImpl();
		TimeLineTeacher teacher=school.getTimelineForTeacher(4);
		System.out.println("profesor: "+teacher.getTeacher().getFirst_name()+" " +teacher.getTeacher().getLast_name());
		System.out.println("schedule:");
		
		List<CourseDay> courseDays= teacher.getCourseDays();
		List<String> nameCourses= teacher.getCourses();
		for (int i = 0; i < teacher.getCourses().size(); i++) {
			CourseDay cd=courseDays.get(i);
			System.out.println(cd.getDay_week()+" "+ cd.getInit() +" - "+cd.getFinish() +" "+nameCourses.get(i));
		}
		
	}
}
