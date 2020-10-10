package com.xworkz.app.mgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.app.mgmt.dto.EnvironmentDTO;


public interface EnvironmentRepo extends JpaRepository<EnvironmentDTO, Long>{
	
	
}
