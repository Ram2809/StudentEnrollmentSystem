package com.enrollment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.enrollment.entity.HodEntity;
import com.enrollment.exception.HodIdNotFoundException;
import com.enrollment.repository.HodRepository;

@Service
@Transactional
public class HodServiceImpl implements HodService {
	@Autowired
	private HodRepository hodRepository;

	@Override
	public HodEntity addHodDetails(HodEntity hodEntity) {
		return hodRepository.save(hodEntity);
	}

	@Override
	public List<HodEntity> getHodDetails() {
		return hodRepository.findAll();
	}

	@Override
	public HodEntity getParticularHodDetails(Integer id) {
		return hodRepository.findById(id).get();
	}

	@Override
	public ResponseEntity<String> deleteHodDetails(Integer id) throws HodIdNotFoundException {
		return hodRepository.findById(id).map(hod -> {
			hodRepository.delete(hod);
			return new ResponseEntity<String>("HOD Details deleted successfully!", new HttpHeaders(), HttpStatus.OK);
		}).orElseThrow(() -> new HodIdNotFoundException("HOD not found with the ID" + " " + id));
	}

	@Override
	public ResponseEntity<String> updateHodDetails(Integer id, HodEntity hodEntity) throws HodIdNotFoundException {
		return hodRepository.findById(id).map(hod -> {
			hod.setFirstName(hodEntity.getFirstName());
			hod.setLastName(hodEntity.getLastName());
			hod.setDateOfBirth(hodEntity.getDateOfBirth());
			hod.setGender(hodEntity.getGender());
			hod.setQualification(hodEntity.getQualification());
			hod.setEmail(hodEntity.getEmail());
			hod.setContactNo(hodEntity.getContactNo());
			hod.setAddress(hodEntity.getAddress());
			hod.setDeptId(hodEntity.getDeptId());
			hodRepository.save(hod);
			return new ResponseEntity<String>("HOD Details updated successfully!", new HttpHeaders(), HttpStatus.OK);
		}).orElseThrow(() -> new HodIdNotFoundException("HOD not found with the ID" + " " + id));
	}

}
