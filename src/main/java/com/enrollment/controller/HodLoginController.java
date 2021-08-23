package com.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.entity.HodLoginEntity;
import com.enrollment.exception.HodIdNotFoundException;
import com.enrollment.exception.LoginIdNotFoundException;
import com.enrollment.service.HodLoginService;

@RestController
@RequestMapping("/hodLogin")
public class HodLoginController {
	@Autowired
	private HodLoginService hodLoginServiceImpl;

	@PostMapping("/hodPersonal/{id}/addLoginDetails")
	public ResponseEntity<String> addHodLoginDetails(@PathVariable("id") Long id,
			@RequestBody HodLoginEntity hodLoginDetails) throws HodIdNotFoundException {
		return hodLoginServiceImpl.addHodLoginDetails(id, hodLoginDetails);
	}

	@PutMapping("/hodPersonal/{id}/updateLoginDetails/{loginId}")
	public ResponseEntity<String> updateHodLoginDetails(@PathVariable("id") Long hodId,
			@PathVariable("loginId") Long loginId, @RequestBody HodLoginEntity hodLoginDetails)
			throws HodIdNotFoundException, LoginIdNotFoundException {
		return hodLoginServiceImpl.updateHodLoginDetails(hodId, loginId, hodLoginDetails);
	}

}