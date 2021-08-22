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
	@Override
	public ResponseEntity<String> deleteHodDetails(Integer id) throws HodIdNotFoundException {
		// TODO Auto-generated method stub
		return hodRepository.findById(id)
				.map(hod->{
				hodRepository.delete(hod);
				return new ResponseEntity<String>("HOD Details deleted successfully!",new HttpHeaders(),HttpStatus.OK);
				}).orElseThrow(()->new HodIdNotFoundException("HOD not found with the ID"+" "+id));
	}
	
}

/*@PutMapping("/students/{id}")
public Student updateStudent(@PathVariable Long id,
                                @RequestBody Student studentUpdated) {
    return studentRepository.findById(id)
            .map(student -> {
                student.setName(studentUpdated.getName());
                student.setAge(studentUpdated.getAge());
                return studentRepository.save(student);
            }).orElseThrow(() -> new NotFoundException("Student not found with id " + id));
}*/