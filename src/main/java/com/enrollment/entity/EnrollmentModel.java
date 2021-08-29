package com.enrollment.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnrollmentModel {
	private Long rollNo;
	private String courseCode;
	private String courseName;
	private Long id;
	private String staffName;

	public EnrollmentModel(Long rollNo, String courseCode, String courseName, Long id, String staffName) {
		super();
		this.rollNo = rollNo;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.id = id;
		this.staffName = staffName;
	}
}
