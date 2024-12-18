package com.Spring.Fc.Service.AppController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Fc.Service.AppActutaor;
import com.Spring.Fc.Service.AppService.AppClient;
import com.Spring.Fc.Service.AppService.AppService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/App2")
public class AppController {
	
	@Autowired
	AppClient  appclient;
	
	@Autowired
	AppService appservice;
	
	@Autowired
	AppActutaor  actuator;
	
        @GetMapping("/getupdate")	
        public ResponseEntity<String> getUpdate() {
        	
        	System.out.println("Get Update Method inside controller class Exceuted:");
		
		return appclient.getUpdate();
	     }
        
        @GetMapping("/getList")	
        public ResponseEntity<List<String>> getList() {
        	System.out.println("Get List  Method inside controller class Exceuted:");
		return appclient.getList();
	     }
        
        @GetMapping("/getCircuit")	
        public ResponseEntity<String> getBreaker() {
        	System.out.println("Get   Circuit Method inside controller class Exceuted:");
		return appclient.getUpdate();
	     }
        
        
        @GetMapping("/health")
        public Mono<Health>   getHealth() {
        	
        	return actuator.getHealth(true);
        	
        }
        
        

}
