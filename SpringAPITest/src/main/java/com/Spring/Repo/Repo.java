package com.Spring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Entity.Entities;

public interface Repo  extends JpaRepository<Entities,Integer> {
	
	
  public Entities	findByName(String name);

}
