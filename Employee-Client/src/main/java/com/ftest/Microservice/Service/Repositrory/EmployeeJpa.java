package com.ftest.Microservice.Service.Repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftest.Microservice.Service.Entity.Employee;

@Repository
public interface EmployeeJpa  extends JpaRepository<Employee,Integer>{

}
