package com.JUnitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.JUnitTesting.Controller.TestController;
import com.JUnitTesting.Entity.Student;
import com.JUnitTesting.Service.TestService;

@SpringBootTest
@WebMvcTest(value=TestController.class)
class JUnitTestingApplicationTests {
	
	@BeforeAll
	 public void init() {
		Student st=new Student(12,"Vishal","Vishal@gmail.com");
		
	}
	

	@MockBean
	private TestService service;
	
	@Autowired
	 private MockMvc  mockmvc;
	
	@Test
	void contextLoads() {
		Student st=new Student(12,"Vishal","Vishal@gmail.com");
		
		}
	
	@Test
	void testAddStudent() throws Exception {
		
		//when(service.addStudent(new Student(11,"Visal","null")).
		 
		  
		  
	  MockHttpServletRequestBuilder  request=MockMvcRequestBuilders.post("/test/add");
	        	
		
	  MvcResult result=mockmvc.perform(request).andReturn();
	
	  MockHttpServletResponse  response= result.getResponse();
	 
	  int status=  response.getStatus();
	
	   assertEquals(200,status);
	}
	
	

}
