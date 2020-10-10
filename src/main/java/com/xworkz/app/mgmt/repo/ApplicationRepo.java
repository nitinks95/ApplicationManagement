package com.xworkz.app.mgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.app.mgmt.dto.ApplicationDTO;

public interface ApplicationRepo extends JpaRepository<ApplicationDTO, Long>{
	
}
