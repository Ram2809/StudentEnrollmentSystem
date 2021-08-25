package com.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.entity.EnrollmentEntity;
import com.enrollment.exception.CourseCodeNotFoundException;
import com.enrollment.exception.RollNoNotFoundException;
import com.enrollment.exception.StaffIdNotFoundException;
import com.enrollment.service.EnrollmentService;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
	@Autowired
	private EnrollmentService enrollmentServiceImpl;
	@PostMapping("/student/{rollNo}/course/{code}/staff/{staffId}/addEnrollmentDetails")
	public ResponseEntity<String> addEnrollmentDetails(@PathVariable("rollNo") Long rollNo,@PathVariable("code") String code,@PathVariable("staffId") Long staffId,@RequestBody EnrollmentEntity enrollmentDetails) throws RollNoNotFoundException, CourseCodeNotFoundException, StaffIdNotFoundException
	{
		return enrollmentServiceImpl.addEnrollmentDetails(rollNo,code,staffId,enrollmentDetails);
	}
}
