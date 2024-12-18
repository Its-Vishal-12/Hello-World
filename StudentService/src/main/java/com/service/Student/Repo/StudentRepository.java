package com.service.Student.Repo;

import java.util.List;

import com.service.Student.Entity.Student;

public interface StudentRepository {
	
	
	
	public Student addStudent(Student stu);
	
	public List<Student> getAllStudent();
	
	public Student getBySid(String sid);

}
