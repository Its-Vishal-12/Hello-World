package com.ftest.Microservice.Service.Repositrory;

import java.util.List;

import com.ftest.Microservice.Service.Entity.Employee;
import com.ftest.Microservice.Service.Response.EmployeeResponse;

public interface EmployeeRepo {
	
	public Employee addEmployee(Employee employee); 
	
	public EmployeeResponse getEmployeeById(int eid);
	
	
	public List<Employee> getAllEmployee();
	
	

}
