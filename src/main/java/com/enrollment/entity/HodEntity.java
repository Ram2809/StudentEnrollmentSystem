package com.enrollment.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Table(name = "HODPersonal")
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
public class HodEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String dateOfBirth;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private String qualification;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private Long contactNo;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private Integer deptId;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="hodPersonal")
	private HodLoginEntity hodLoginCredentials;
	public HodEntity() {
		super();
	}

	public HodEntity(Integer id, String firstName, String lastName, String dateOfBirth, String gender,
			String qualification, String email, Long contactNo, String address, Integer deptId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.qualification = qualification;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.deptId = deptId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public HodLoginEntity getHodLoginCredentials() {
		return hodLoginCredentials;
	}

	public void setHodLoginCredentials(HodLoginEntity hodLoginCredentials) {
		this.hodLoginCredentials = hodLoginCredentials;
	}

	@Override
	public String toString() {
		return "HodEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", qualification=" + qualification + ", email=" + email
				+ ", contactNo=" + contactNo + ", address=" + address + ", deptId=" + deptId + "]";
	}
	

}
