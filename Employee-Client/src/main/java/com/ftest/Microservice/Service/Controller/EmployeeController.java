package com.ftest.Microservice.Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftest.Microservice.Service.Entity.Employee;
import com.ftest.Microservice.Service.Response.EmployeeResponse;
import com.ftest.Microservice.Service.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController   {
	
@Autowired	
 private EmployeeService  service;	


        

        @GetMapping("/get/{eid}")
       public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("eid")int eid){
		      
    	   
    	   
    	   
    	   
    	   return new ResponseEntity<EmployeeResponse>(service.getEmployeeById(eid),HttpStatus.OK);
	
	
}
        @PostMapping("/add")
        public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        	
        	return new ResponseEntity<Employee>(service.addEmployee(employee),HttpStatus.CREATED);
        }
	      
        @GetMapping("/getall")
	     public ResponseEntity<List<Employee>>getAllEmployee(){
	    	 
	    	 return new ResponseEntity<List<Employee>>(service.getAllEmployee(),HttpStatus.OK);
	    	 
	     }
	
	
	
	
	
	

}
