package com.enrollment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollment.entity.HodEntity;
import com.enrollment.repository.HodRepository;
@Service
@Transactional
public class HodServiceImpl implements HodService{
	@Autowired
	private HodRepository hodRepository;
	@Override
	public HodEntity addHodDetails(HodEntity hodEntity) {
		// TODO Auto-generated method stub
		return hodRepository.save(hodEntity);
	}
	@Override
	public List<HodEntity> getHodDetails() {
		// TODO Auto-generated method stub
		return hodRepository.findAll();
	}
	@Override
	public HodEntity getParticularHodDetails(Integer id) {
		// TODO Auto-generated method stub
		return hodRepository.findById(id).get();
	}

}
