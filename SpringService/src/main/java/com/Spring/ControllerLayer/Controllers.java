package com.Spring.ControllerLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.ServiceLayer.Services;

@RestController
@RequestMapping("/calculator")
public class Controllers {
	
	@Autowired
	 private Services service;
	
	
	@GetMapping("/add")
	public ResponseEntity<Float> Add(@RequestParam("first") int first,@RequestParam("second") int second){
		
		return new ResponseEntity<>(service.Add(first, second),HttpStatus.OK);
	}
	
	@GetMapping("/sub")
        public ResponseEntity<Float> Sub(@RequestParam("first")int first,@RequestParam("second") int second){
		
		return new ResponseEntity<>(service.Sub(first, second),HttpStatus.OK);
	}
	
	@GetMapping("/mul")
    public ResponseEntity<Float> Mul(@RequestParam("first")int first,@RequestParam("second") int second){
	
	return new ResponseEntity<>(service.Mul(first, second),HttpStatus.OK);
}
	
	@GetMapping("/div")
    public ResponseEntity<Float> Div(@RequestParam("first")int first,@RequestParam("second") int second){
	
	return new ResponseEntity<>(service.Div(first, second),HttpStatus.OK);
}
	 
	 
	 
	
	
	
	
	
	

}
