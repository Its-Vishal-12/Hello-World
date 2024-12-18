package com.JUnitTesting;



import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.JUnitTesting.Entity.Student;
import com.JUnitTesting.Service.TestService;

@SpringBootTest
public class JUnitTestingService {

	
	  static TestService  t=new TestService();
	
    static Student student=new Student();
    
    List<Student> lists=null;
    
    
	//1.  insertion of student object
	@Test
   void   addStudentTest() {
		
   Student stu=t.addStudent(new Student(12,"Vishal","@gmail.com"));
   Student stud=t.addStudent(new Student(11,"Vikey","@gmail.com"));

  if(stu!=null) {
	  
	  
	  student.setRoll(stu.getRoll());
	  student.setName(stu.getName());
	  student.setEmail(stu.getEmail());
	  
	 }
  
    Assertions.assertSame(student.getRoll(), stu.getRoll());
    Assertions.assertSame(student.getName(), stu.getName());
    Assertions.assertSame(student.getEmail(), stu.getEmail());
		}
	
	
	//2. get student
	@Test
  void getStudentTest() {
	  
	 lists=t.getStudent();
	 if(!lists.isEmpty()) {
		 
		 
		lists.stream().forEach(System.out::println); 
		 
	 }
	 Assertions.assertTrue(!lists.isEmpty());
	  
  }
	
	//3.  get student by roll number
	@Disabled
	 @Test
	 void getByRollNumberTest() {
	List<Student> studentlist=null;    	 
	   int roll=12;
	   List<Student> list=t.getByRoll(12);
	   System.out.println(list);
	  
	  System.out.println("------------------centre---------------------");
	   
	   if(!list.isEmpty()) {
		   
	 studentlist=lists.stream().filter(x->x.getRoll()==roll).collect(Collectors.toList());
	     
	     System.out.println(studentlist);		   
		   }
	   
	   Assertions.assertTrue(list.contains(studentlist));
	  }
		
	
	
	//4.remove student by roll
	@Test
	void deleteTest() {
		
	List<Student> lst=t.removeStudentByRoll(12);
	List<Student>l=lst.stream().filter(x->x.getRoll()==12).collect(Collectors.toList());
     Assertions.assertTrue(l.isEmpty());
	
}
	
	
	
	
	
	
	
}
