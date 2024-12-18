package com.Spring.Configurations;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

import com.Spring.Entity.Entities;
import com.Spring.Repo.JpaRepo;

@Configuration
@EnableBatchProcessing
public class FileConfig {
	
	@Autowired
	 private JpaRepo  repo;
	
	@Autowired
	private StepBuilderFactory  step;
	
	
	@Autowired
	private JobBuilderFactory  job; 
	
	   @Autowired
	    private JobLauncher jobLauncher;

	//1. ITEM READER
	//  It is used to read the  data (eg->csv file) from the source  using FLAT-FILE-ITEM-READER.
	
	public FlatFileItemReader<Entities> getRead(){
		
		FlatFileItemReader fileitemreader=new FlatFileItemReader();
		
		//location/resource  file 
		fileitemreader.setResource(new FileSystemResource("src/main/resources/employee.csv"));
		//set file name
		fileitemreader.setName("CSV Reader");
		//first line of csv file must skipped because it has data Header
		fileitemreader.setLinesToSkip(1);
		//convert each line of csv file to Java Object , mention a method inside set line mapper explicitely
		fileitemreader.setLineMapper(lineMapper());
		
		return fileitemreader;
		}
	
	
	private LineMapper<Entities> lineMapper(){
		
		DefaultLineMapper<Entities> linemapper=new DefaultLineMapper<>();
		
		DelimitedLineTokenizer delimiterlinetokenizer= new DelimitedLineTokenizer();
	    //used to seperate  all token by comma
		delimiterlinetokenizer.setDelimiter(",");
		//empty or null will be sent if line is empty
		delimiterlinetokenizer.setStrict(false);
		//fields name
		delimiterlinetokenizer.setNames("id","name");
		
		BeanWrapperFieldSetMapper<Entities>  wrapperfieldSetMapper=new BeanWrapperFieldSetMapper<>();
		//mapping done on token to which entity class
		wrapperfieldSetMapper.setTargetType(Entities.class);
		
		
		linemapper.setLineTokenizer(delimiterlinetokenizer);
		linemapper.setFieldSetMapper(wrapperfieldSetMapper);
		
		return linemapper;
	}
	
//2. ITEM PROCESSOR	
	//it is used to process the data from item reader and provide logical implementations
	@Bean
	public EntityProcessor  getProcessor() {
	return new EntityProcessor();
	}
	
//3.ITEM WRITTER
	//it is responsible to write the data in destination
	
	@Bean
	public RepositoryItemWriter<Entities>  getWriter() {

		
		
		RepositoryItemWriter<Entities>  itemwriter=new RepositoryItemWriter<>();
		itemwriter.setRepository(repo);
		//specified methods name to take action /save 
		itemwriter.setMethodName("save");
		return itemwriter;
		
	}
	
	

//4.STEP 
	
	@Bean
	public Step getStep() {
		
	return  step.get("Step-1").<Entities,Entities>chunk(10)
			.reader(getRead())
			.processor(getProcessor())
			.writer(getWriter()).build();
	                              
		}
	
	
//	@Bean
//	public Step getStep2() {
//		
//	return (Step) step.get("Step-1").<Entities,Entities>chunk(10)
//			.reader(getRead())
//			.processor(getProcessor())
//			.writer(getWriter()).build();
//	                              
//		}
	
//5.JOB
	//it consist of multiple number of step
	
	@Bean
	public Job  getJob() {
		
		return job.get("Name-1")  //.flow(getstep1).flow(getStep2())
				.flow(getStep())
				.end()
				.build();
		
		
	}
	

	@Bean
	public TaskExecutor taskExecutor() {
		SimpleAsyncTaskExecutor taskExecutor = new SimpleAsyncTaskExecutor();
		taskExecutor.setConcurrencyLimit(10);
		return taskExecutor;
	}
	

}
