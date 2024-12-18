package com.Spring.Controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {
	
	@Autowired
	 private JobLauncher  joblaunch;
	
	@Autowired
	private Job job;
	
	
	@GetMapping("/enitity")
	public  void  csvToDb() throws Exception {
		
	JobParameters  para=new JobParametersBuilder().addLong("Start-at",System.currentTimeMillis())
			.toJobParameters();
	
	joblaunch.run(job, para);
		
	}
	
	@GetMapping("/")
	public String  getCall() {
		
		return "WELCOME TO VISHAL DOCKER: ";
	}
	
	

}
