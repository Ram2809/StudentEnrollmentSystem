package com.enrollment.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
//@ToString
@Entity
@Table(name="Department")
public class DepartmentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long deptId;
	@NotNull
	@Size(max=50)
	private String deptName;
	@OneToMany(mappedBy="department",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<CourseEntity> course;
	public DepartmentEntity(Long deptId, @NotNull @Size(max = 50) String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "DepartmentEntity [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
