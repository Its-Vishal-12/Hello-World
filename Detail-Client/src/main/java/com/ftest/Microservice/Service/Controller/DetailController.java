package com.ftest.Microservice.Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftest.Microservice.Service.DetailImpl.Detailimpl;
import com.ftest.Microservice.Service.Entity.Detail;
import com.ftest.Microservice.Service.Response.DetailResponse;

@RestController
@RequestMapping("/detail")
public class DetailController {
     @Autowired
	 private Detailimpl  impl;
     
     
     @PostMapping("/add")
     public ResponseEntity<Detail> addDetail(@RequestBody Detail detail){
    	 
    	 return new ResponseEntity<Detail>(impl.addDetail(detail),HttpStatus.CREATED);
    	 
     }
	
     @GetMapping("/get/{eid}")
     public  ResponseEntity<DetailResponse> getDetailByEmployeeId(@PathVariable("eid") int eid){
    	 
    	 return new ResponseEntity<DetailResponse>(impl.getDetailByEmployeeId(eid),HttpStatus.OK);
    	 
     }
	
     @GetMapping("/getall")
	  public ResponseEntity<List<Detail>> GetAllDetail(){
		  
		  return new ResponseEntity<List<Detail>>(impl.GetAllDetail(),HttpStatus.OK);
	  }
}
