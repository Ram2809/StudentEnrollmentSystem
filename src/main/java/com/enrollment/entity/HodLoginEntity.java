package com.enrollment.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@ToString
@Entity
@Table(name="HODLogin")
public class HodLoginEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long loginId;
	@NotNull
	private Integer userId;
	@NotNull
	@Size(max=50)
	private String password;
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="hodId",nullable=false)
	private HodEntity hodPersonal;
}
