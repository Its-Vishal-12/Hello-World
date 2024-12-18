package com.service.Student.Repo.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service.Student.Entity.Student;
import com.service.Student.Repo.StudentRepo;
import com.service.Student.Repo.StudentRepository;
import com.service.Student.Util.StudentUtil;

@Service
public class StudentRepoImpl implements StudentRepository {
	
	@Autowired
   private  StudentRepo  repo;

	@Autowired
    private  RestTemplate template; 
	

	private  Logger logger=LoggerFactory.getLogger(StudentRepoImpl.class);;
	
    @Override
	public Student addStudent(Student stu) {
		
		Student st=new Student();
		st.setSid(StudentUtil.createSid());
		st.setName(stu.getName());
		st.setEmail(stu.getEmail());
		st.setAddres(stu.getAddres());
		
		return repo.save(st);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list=repo.findAll();
		return  list;
	}

	@Override
	public Student getBySid(String sid) {
		 Student stu=repo.findById(sid).get();
	ArrayList  forobject= template.getForObject("localhost:59684/address/"+stu.getSid(),ArrayList.class );
	
	 logger.info("",forobject);
		return stu;
	}

}
