package com.xworkz.app.mgmt.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.app.mgmt.dto.ApplicationDTO;
import com.xworkz.app.mgmt.dto.EnvironmentDTO;
import com.xworkz.app.mgmt.entity.Application;
import com.xworkz.app.mgmt.entity.Environment;
import com.xworkz.app.mgmt.repo.ApplicationRepo;
import com.xworkz.app.mgmt.repo.EnvironmentRepo;


@RestController
public class AppController {
	
	private static final Logger log = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private ApplicationRepo appRepo;
	
	@Autowired
	private EnvironmentRepo envRepo;
	
	@PostMapping("/testApp")
    public ApplicationDTO testAppPage(@RequestBody Application app) {
        ApplicationDTO appFinal = appRepo.save(new ApplicationDTO(app.getsAppName(), app.getsVersion(), app.getsLastRelease(), app.getsNextRelease(), app.getsDevDate(), app.getsIsDecommisioned(), app.getsTLName(), app.getsTeamMail()));
        log.info("created App on testApp call - " + appFinal.toString());
        for(Environment env : app.getmyTableData()) {
        	envRepo.save(new EnvironmentDTO(appFinal, env.getsEnvName(), env.getsLocationId(), env.getbIsActive()));
        }
        return appFinal;
    }
	
	@GetMapping("/getApp")
	public List<ApplicationDTO> getApp() {
		List<ApplicationDTO> appFinal = appRepo.findAll();
		return appFinal;
	}
	
}