package com.enrollment.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.enrollment.entity.HodEntity;
import com.enrollment.exception.HodIdNotFoundException;

public interface HodService {
	HodEntity addHodDetails(HodEntity hodEntity);
	List<HodEntity> getHodDetails();
	HodEntity getParticularHodDetails(Long id);
	ResponseEntity<String> deleteHodDetails(Long id) throws HodIdNotFoundException;
	ResponseEntity<String> updateHodDetails(Long id,HodEntity hodEntity) throws HodIdNotFoundException;
}
