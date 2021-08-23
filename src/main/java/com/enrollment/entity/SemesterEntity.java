package com.enrollment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name="Semester")
public class SemesterEntity {
	@Id
	@Column(unique=true,nullable=false)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date beginDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	public SemesterEntity(Long id, Date beginDate, Date endDate) {
		super();
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
}
