package com.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enrollment.entity.HodLoginEntity;
@Repository
public interface HodLoginRepository extends JpaRepository<HodLoginEntity,Long>{

}
