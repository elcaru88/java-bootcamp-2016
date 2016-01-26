package com.wikse.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wikse.app.bo.Teacher;
import com.wikse.app.bo.helper.CourseDay;
import com.wikse.app.bo.helper.TimeLineTeacher;
import com.wikse.app.db.MySQLConnection;
import com.wikse.app.service.HighschoolsService;

public class HighschoolServiceImpl implements HighschoolsService {
	
	
	public TimeLineTeacher getTimelineForTeacher(int id) {
		Connection dbConnection= null;
		PreparedStatement ps= null;
		TimeLineTeacher timeLineTeacher=new TimeLineTeacher();
		List<CourseDay> courseDays= new ArrayList<CourseDay>();
		List<String> courses=new ArrayList<String>();
		
		String query=" SELECT t.first_name, t.last_name, cd.day_week, cd.init, cd.finish, c.name FROM teacher t,course c, course_day cd WHERE t.id_teacher = ? AND c.id_teacher = t.id_teacher AND cd.id_course = c.id_course";
		dbConnection=MySQLConnection.getConnection();
		try {
			ps= dbConnection.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet data= ps.executeQuery();
			
			while (data.next()) {
				if(timeLineTeacher.getTeacher()==null){
					Teacher teacher= new Teacher();
					teacher.setFirst_name(data.getString("first_name"));
					teacher.setLast_name(data.getString("last_name"));
					timeLineTeacher.setTeacher(teacher);
				}
				CourseDay courseDay= new CourseDay();
				switch (data.getInt("day_week")) {
				case 1:
					courseDay.setDay_week(CourseDay.MONDAY);
					break;
				case 2:
					courseDay.setDay_week(CourseDay.TUESDAY);
					break;
				case 3:
					courseDay.setDay_week(CourseDay.WEDNESDAY);
					break;
				case 4:
					courseDay.setDay_week(CourseDay.THURSDAY);
					break;
				case 5:
					courseDay.setDay_week(CourseDay.FRIDAY);
					break;

				default:
					break;
				}				
				
				
				courseDay.setInit(data.getString("init"));
				courseDay.setFinish(data.getString("finish"));
				courseDays.add(courseDay);
				
				courses.add(data.getString("name"));
			}
			timeLineTeacher.setCourseDays(courseDays);
			timeLineTeacher.setCourses(courses);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (timeLineTeacher==null) {
			timeLineTeacher= new TimeLineTeacher();
		}
		
		return timeLineTeacher;
	}

}
