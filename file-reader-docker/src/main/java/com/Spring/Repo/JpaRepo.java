package com.Spring.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Entity.Entities;

public interface JpaRepo  extends JpaRepository<Entities,Serializable>{
	
	
	

}
