package com.JUnitTesting;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.jupiter.api.*;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.*;

import com.JUnitTesting.*;
import com.JUnitTesting.Controller.TestController;
import com.JUnitTesting.Entity.Student;
import com.JUnitTesting.Service.TestService;



@WebMvcTest(TestController.class)
public class JUnitControllerTesting {
	
	@MockBean
	private TestService  service;
	
	@Autowired
	private MockMvc  mockmvc;
	
	Student student;
	Student student2;
	List<Student> stu=new ArrayList<>();
	
	
	@BeforeEach
	void init() {
	 student=new Student(12,"Vishal","@gmail.com");
	 student2=new Student(10,"Nishu","@gmail.com");
	 
	 stu.add(student);
	 stu.add(student2);
	}
	
	
	//add student
	@Disabled
    @Test
	void addStudentTest() throws Exception {
		
	when(service.addStudent(student))
	.thenReturn(student2);
	//used to check method result by its status comparision
//       	MockHttpServletRequestBuilder  builder= MockMvcRequestBuilders.post("/add");
//	      MvcResult  result= mockmvc.perform(builder).andReturn();
//	
//	    MockHttpServletResponse   response=result.getResponse();
//	
//	     int status=response.getStatus();
//	     //t o check its coming  object is not null
	   
//	      Assertions.assertEquals(200,status);
	
	  Assertions.assertNotNull(student);
	
	  this.mockmvc.perform(post("/test/add")).andDo(print()).andExpect(status().isOk());
	 }
	
       
	
	@Test
	void getAllStudentTest() throws Exception {
		
		when(service.getStudent()).thenReturn(stu);
		
		this.mockmvc.perform(get("/test/getall")).andDo(print()).andExpect(status().isOk());
		
		}
	
	@Test
	void getByRollTest() throws Exception {
		
		when(service.getByRoll(12)).thenReturn(stu.stream().filter(x->x.getRoll()==12).collect(Collectors.toList()));
		
		this.mockmvc.perform(get("/test/get/12")).andDo(print()).andExpect(status().isOk());
		
	}
	
	@Test
	void removeStudentTest() throws Exception {
		
		when(service.removeStudentByRoll(11)).thenReturn(stu.stream().filter(x->x.getRoll()==11).collect(Collectors.toList()));
		
		this.mockmvc.perform(get("/test/get/11")).andDo(print()).andExpect(status().isOk());
		
	}
	
	

}
