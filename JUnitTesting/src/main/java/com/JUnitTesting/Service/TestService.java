package com.JUnitTesting.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.JUnitTesting.Entity.Student;

@Service
public class TestService {
	
	List<Student> list =new ArrayList<>();
	
    static	List<Student> lst=null;
	
	//add student
	public Student addStudent(Student student) {
		
		list.add(student);
		
		return student;
	}
	
	//get student
	
	public List<Student> getStudent(){
	return list;
	}
	
	
	//get student by roll number
	
	public List<Student>  getByRoll(int roll) {
		
	 lst=	list.stream().filter(x->x.getRoll()==roll).collect(Collectors.toList());
	return lst;
	}
	
    //remove student by roll

	public List<Student>  removeStudentByRoll(int roll) {
		
	 List<Student> st=	list.stream().filter(x-> x.getRoll()!=roll).collect(Collectors.toList());
		
	 list.addAll(st);
	 
	 return st;
	}
	
	
}
