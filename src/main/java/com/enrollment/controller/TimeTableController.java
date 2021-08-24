package com.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.entity.TimeTableEntity;
import com.enrollment.exception.DepartmentNotFoundException;
import com.enrollment.exception.SemesterNotFoundException;
import com.enrollment.service.TimeTableService;

@RestController
@RequestMapping("/timeTable")
public class TimeTableController {
	@Autowired
	private TimeTableService timeTableServiceImpl;
	@PostMapping("/semester/{semId}/department/{deptId}/addTimeTableDetails")
	public ResponseEntity<String> addTimeTableDetails(@PathVariable("semId") Long semId,@PathVariable("deptId") Long deptId,@RequestBody TimeTableEntity timeTableDetails) throws SemesterNotFoundException, DepartmentNotFoundException
	{
		return timeTableServiceImpl.addTimeTableDetails(semId,deptId,timeTableDetails);
	}
	@DeleteMapping("/semester/{semId}/department/{deptId}/deleteTimeTableDetails/{day}")
	public ResponseEntity<String> deleteTimeTableDetails(@PathVariable("semId") Long semId,@PathVariable("deptId") Long deptId,@PathVariable("day") String day) throws SemesterNotFoundException, DepartmentNotFoundException
	{
		return timeTableServiceImpl.deleteTimeTableDetails(semId,deptId,day);
	}
}
