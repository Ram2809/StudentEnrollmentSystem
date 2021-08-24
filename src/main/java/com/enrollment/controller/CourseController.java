package com.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.entity.CourseEntity;
import com.enrollment.exception.CourseCodeNotFoundException;
import com.enrollment.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseServiceImpl;
	@PostMapping("/semester/{semId}/department/{deptId}/courseInsertion")
	public ResponseEntity<String> addCourseDetails(@PathVariable("semId") Long semId,@PathVariable("deptId") Long deptId,@RequestBody CourseEntity courseDetails)
	{
		return courseServiceImpl.addCourseDetails(semId,deptId,courseDetails);
	}
	@PutMapping("/semester/{semId}/department/{deptId}/courseUpdation/{code}")
	public ResponseEntity<String> updateCourseDetails(@PathVariable("semId") Long semId,@PathVariable("deptId") Long deptId,@PathVariable("code") String code,@RequestBody CourseEntity courseDetails) throws CourseCodeNotFoundException
	{
		return courseServiceImpl.updateCourseDetails(semId,deptId,code,courseDetails);
	}
}
