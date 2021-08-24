package com.enrollment.service;

import org.springframework.http.ResponseEntity;

import com.enrollment.entity.CourseEntity;
import com.enrollment.exception.CourseCodeNotFoundException;

public interface CourseService {
	ResponseEntity<String> addCourseDetails(Long semId,Long deptId,CourseEntity courseDetails);
	ResponseEntity<String> updateCourseDetails(Long semId,Long deptId,String courseCode,CourseEntity courseDetails) throws CourseCodeNotFoundException;
}
