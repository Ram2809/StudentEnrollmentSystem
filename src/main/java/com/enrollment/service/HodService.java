package com.enrollment.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.enrollment.entity.HodEntity;
import com.enrollment.exception.HodIdNotFoundException;

public interface HodService {
	HodEntity addHodDetails(HodEntity hodEntity);
	List<HodEntity> getHodDetails();
	HodEntity getParticularHodDetails(Integer id);
	ResponseEntity<String> deleteHodDetails(Integer id) throws HodIdNotFoundException;
}
