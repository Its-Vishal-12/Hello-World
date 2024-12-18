package com.service.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.service.Student.Entity.*;


public interface StudentRepo  extends JpaRepository<Student, String>{

}
