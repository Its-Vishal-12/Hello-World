package com.Spring.Configurations;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
	@EnableBatchProcessing
	public class MystepConfig {

	    @Bean
	    public Tasklet myTasklet() {
	       return new TaskletImpl();
	    }

	    @Bean
	    public Step myStep(JobRepository jobRepository, Tasklet myTasklet, PlatformTransactionManager transactionManager) {
	        return new StepBuilder("myStep", jobRepository)
	                .tasklet(myTasklet, transactionManager) // or .chunk(chunkSize, transactionManager)
	                .build();
	    }

	}

