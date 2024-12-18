package com.ftest.Microservice.Service.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ftest.Microservice.Service.Entity.Employee;
import com.ftest.Microservice.Service.FeignClients.EmployeeFeign;
import com.ftest.Microservice.Service.Repositrory.EmployeeJpa;
import com.ftest.Microservice.Service.Repositrory.EmployeeRepo;
import com.ftest.Microservice.Service.Response.DetailResponse;
//import com.ftest.Microservice.Service.Repositrory.EmployeeRepo;
import com.ftest.Microservice.Service.Response.EmployeeResponse;

@Service
public class EmployeeService  implements EmployeeRepo{
	
	@Autowired
	private   EmployeeJpa  repo; 
	@Autowired
     private	ModelMapper  mapper;
    @Autowired	
    private EmployeeFeign   feign;
	
	
	public EmployeeResponse  getEmployeeById(int employeeId) {
		
         	Employee emp=repo.findById(employeeId).get();
		
		    EmployeeResponse  eresponse=mapper.map(emp, EmployeeResponse.class);
		    
		       
		  ResponseEntity<DetailResponse>  detailresponse = feign.getDetailByEmployeeId(emp.getId());
		   eresponse.setDetail(detailresponse.getBody());
		
		return eresponse;
		
	}


	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp=new Employee();
		
		emp.setId(employee.getId());
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setEmail(employee.getEmail());
		return repo.save(emp);
	}


	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}
	
	
	
	
	
	
	

}
