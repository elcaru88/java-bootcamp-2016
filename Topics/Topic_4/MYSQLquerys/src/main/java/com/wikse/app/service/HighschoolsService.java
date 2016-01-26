package com.wikse.app.service;

import com.wikse.app.bo.helper.TimeLineTeacher;

public interface HighschoolsService {

	/**
	 * Get a teacher with his courses and schedules.
	 * @param id of prodesor.
	 * @return TimeLineTeacher  which contain all data. if not, it will return a TimeLineTeacher object with all his fields null 
	 */
	TimeLineTeacher getTimelineForTeacher(int id);

}
