package com.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enrollment.entity.EnrollmentEntity;
@Repository
public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long>{

}
