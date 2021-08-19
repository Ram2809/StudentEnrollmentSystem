package com.enrollment.service;

import java.util.List;

import com.enrollment.entity.HodEntity;

public interface HodService {
	HodEntity addHodDetails(HodEntity hodEntity);
	List<HodEntity> getHodDetails();
	HodEntity getParticularHodDetails(Integer id);
}
