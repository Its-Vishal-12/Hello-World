package com.Spring.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobExecutionListnerImpl  implements JobExecutionListener  {
	
	
	private Logger logger=LoggerFactory.getLogger(JobExecutionListnerImpl.class); 
	
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		
		logger.info("JobExecutionListnerImpl  Before Job Done:");
		
		
	}

	@Override
	public  void afterJob(JobExecution jobExecution) {
		
		if(jobExecution.getStatus()==BatchStatus.COMPLETED) {
		
		logger.info("JobExecutionListnerImpl  After Job Done:");
	}
	}

}
