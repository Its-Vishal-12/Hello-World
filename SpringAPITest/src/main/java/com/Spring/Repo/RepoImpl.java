package com.Spring.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Entity.Entities;
import com.Spring.Excep.NotFoundException;

@Service
public  class RepoImpl implements   RepoMeth{
     
	 @Autowired
	 private Repo repo;
	
	
	@Override
	public Entities addEntity(Entities add) {
		 
		Entities e=new Entities(add.getId(),add.getName());
		
		return repo.save(e);
	}

	@Override
	public Entities getEntityById(int id) {
		   
		Entities ee=  repo.findById(id).get();
//		if(ee==null) {
//			throw new NotFoundException("Entity Not Found");
//		}
		return ee;
	}

	@Override
	public Entities removeEntities(int id) {
	 
	Entities e=	repo.findById(id).get();
	if(e==null) {
		
		throw new NotFoundException("Not Found For Remove");
	}
		
		return e ;
	}



}
