package com.ThymeLeafTest.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ThymeLeafTest.Entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/list")
	public String getEmployee(Model model) {
		
		Employee emp=new Employee();
		emp.setId("1214");
		emp.setFirstName("Vishalkk");
		emp.setLastName("Kumar");
		emp.setDate("12 Dec 1997");
		emp.setCurrentdate(LocalDate.now());
		
		
		model.addAttribute("Employee", emp);
		
		return "List";
		
	}
	
	
	@GetMapping("/home")
	public String getHome() {
		
		return "Home";
	}
	
	
	@GetMapping("/iterator")
	public String iterator(Model model) {
		
		Employee emp=new Employee("123","Vishal","Kumar","12-12-1997",LocalDate.now());
		Employee emp1=new Employee("321","Heema","Kumari","13-12-1997",LocalDate.now());
		Employee emp2=new Employee("456","Lata","Kumari","14-12-1997",LocalDate.now());
		Employee emp3=new Employee("654","Manish","Kumar","15-12-1997",LocalDate.now());
		Employee emp4=new Employee("789","Ashish","Kumar","16-12-1997",LocalDate.now());
		Employee emp5=new Employee("987","Neelam","Kumari","17-12-1997",LocalDate.now());
		
		
	List<Employee> list=List.of(emp, emp1, emp2, emp3, emp4, emp5);

	model.addAttribute("List", list);
	
	
		
		return "Iterator";
	}
	

}
