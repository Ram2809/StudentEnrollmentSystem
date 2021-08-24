package com.enrollment.service;

import org.springframework.http.ResponseEntity;

import com.enrollment.entity.TimeTableEntity;
import com.enrollment.exception.DepartmentNotFoundException;
import com.enrollment.exception.SemesterNotFoundException;

public interface TimeTableService {
	ResponseEntity<String> addTimeTableDetails(Long semId,Long deptId,TimeTableEntity timeTableDetails) throws SemesterNotFoundException, DepartmentNotFoundException;
	ResponseEntity<String> deleteTimeTableDetails(Long semId,Long deptId,String day) throws SemesterNotFoundException, DepartmentNotFoundException;
}
