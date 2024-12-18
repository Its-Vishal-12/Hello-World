package com.Spring.Cont;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.Entities;
import com.Spring.Repo.RepoImpl;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/entity")
public class Control {
	 @Autowired
	 private RepoImpl impl;
	 
	
	 @PostMapping("/add")
	 public ResponseEntity<Entities> addEntity(@RequestBody Entities ent){
		 
	return new ResponseEntity<>(impl.addEntity(ent),HttpStatus.OK);
		 
	 }
	 
	 @GetMapping("/get/id")
	 public ResponseEntity<Entities> getEntityById(@PathParam(value = "id") int id ){
		 
			return new ResponseEntity<>(impl.getEntityById(id),HttpStatus.FOUND);
				 
			 }
	 @DeleteMapping("/delete/id")
	 public ResponseEntity<Entities> removeEntities(@PathParam("id") int id ){
		 
			return new ResponseEntity<>(impl.removeEntities(id),HttpStatus.OK);
				 
			 }
	
	

}
