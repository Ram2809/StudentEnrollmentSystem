package com.enrollment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.enrollment.entity.CourseEntity;
import com.enrollment.entity.EnrollmentEntity;
import com.enrollment.entity.StaffAssignEntity;
import com.enrollment.entity.StudentAssignEntity;
import com.enrollment.exception.CourseCodeNotFoundException;
import com.enrollment.exception.RollNoNotFoundException;
import com.enrollment.exception.StaffIdNotFoundException;
import com.enrollment.repository.CourseRepository;
import com.enrollment.repository.EnrollmentRepository;
import com.enrollment.repository.StaffAssignRepository;
import com.enrollment.repository.StudentAssignRepository;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{
	@Autowired
	private StaffAssignRepository staffRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private StudentAssignRepository studentRepository;
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	@Override
	public ResponseEntity<String> addEnrollmentDetails(Long rollNo, String code, Long staffId,
			EnrollmentEntity enrollmentDetails) throws RollNoNotFoundException, CourseCodeNotFoundException, StaffIdNotFoundException {
		// TODO Auto-generated method stub
		/*if(!studentRepository.existsById(rollNo))
		{
			throw new RollNoNotFoundException("Student Not Found!Enter the valid ID!");
		}
		if(!courseRepository.existsById(code))
		{
			throw new CourseCodeNotFoundException("Course Not Found!Enter the valid ID!");
		}
		if(!staffRepository.existsById(staffId))
		{
			throw new StaffIdNotFoundException("Staff Not Found!Enter the valid ID!");
		}*/
		StudentAssignEntity studentDetails=studentRepository.findById(rollNo).get();
		System.out.println(studentDetails);
		enrollmentDetails.setStudent(studentDetails);
		StaffAssignEntity staffDetails=staffRepository.findById(staffId).get();
		System.out.println(staffDetails);
		enrollmentDetails.setStaff(staffDetails);
		CourseEntity courseDetails=courseRepository.findById(code).get();
		System.out.println(courseDetails);
		enrollmentDetails.setCourse(courseDetails);
		enrollmentRepository.save(enrollmentDetails);
		return new ResponseEntity<String>("Enrollment Details added successfully!",new HttpHeaders(),HttpStatus.OK);
	}

}
