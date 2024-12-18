package com.Spring.Config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.Spring.Entity.Data;

@Configuration

public class BatchConfig {
	
	
	//private JobExecutionListnerImpl  listner;
	
// 1. create a Job
	
	//object needed
	//2>JobExecutionListnerImpl listner;
	// 3>Step step;
 	// String jobname ; 
	//1> JobRepository  repository;
	
	 
	@Bean 
	 public Job jobBean(JobRepository  repository,JobExecutionListnerImpl listner , Step step) {
		
	return new JobBuilder("job-name" , repository)
			.listener(listner)
			.start(step)
			.build();
	}
	 
	
	
	
	//2. create Step  for Job 
	
	
	//required object 
//	ItemReader<Data> reader;
//	ItemProcessor<Data,Data> process;
//	ItemWriter<Data>  writer;
	
	@Bean
	public Step stepBean(JobRepository  repository,
			DataSourceTransactionManager transaction,
			FlatFileItemReader<Data> reader,
			 ItemProcessor<Data, Data> proces,
			 ItemWriter<Data>  writer
			 
			
			) {
		
		
		return new StepBuilder("step-name-1",  repository)
				.<Data, Data>chunk(5, transaction)
				.reader(reader)
				.processor(proces)
				.writer(writer)
				.build();
	}
	
	
	//3.create  Reader
	
	@Bean
	public FlatFileItemReader<Data> readerBean(){
		
		
		return new FlatFileItemReaderBuilder<Data>()
				.name("Item-Reader")
				.resource(new ClassPathResource("data.csv"))
				.delimited()
			    .names("batch_id","name","email","phone")
			    .targetType(Data.class)
			    .build();
	}
	
	
	
	//4. create Processor
	
	@Bean
	 public   ItemProcessor<Data, Data> processBean(){
		 
		  return new ItemProcessorImp();
		 
	 }
	
	
	//5. create Writer
	  // DataSource datasource
	
	@Bean
	public ItemWriter<Data>  writerBean( DataSource datasource) {
		
		return new JdbcBatchItemWriterBuilder<Data>()   //jpaBatchItemWriter<Data>  for jpa repo
				.sql("insert into batchtest(batch_id,name,email,phone) values(:batch_id,:name,:email,:phone)")
				.dataSource(datasource)
				.beanMapped()
				.build();
				
		
	}
	
	

}
