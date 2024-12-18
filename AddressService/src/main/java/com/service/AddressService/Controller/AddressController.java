package com.service.AddressService.Controller;

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

import com.service.AddressService.AddressJpaImpl.AddressRepoImpl;
import com.service.AddressService.Entity.Address;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
 private 	AddressRepoImpl  impl;
	
	
	@PostMapping("/add")
	public ResponseEntity<Address> addAddress(@RequestBody Address address){
		
		return new ResponseEntity<Address>(impl.addAddress(address),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getall")
	public ResponseEntity<List<Address>> getAllAddress(){
		
		return new ResponseEntity<List<Address>>(impl.getAllAddress(),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get/{aid}")
	public ResponseEntity<Address> getByAid(@PathVariable("aid")String aid){
		
		return new ResponseEntity<Address>(impl.getByAid(aid),HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	

}
