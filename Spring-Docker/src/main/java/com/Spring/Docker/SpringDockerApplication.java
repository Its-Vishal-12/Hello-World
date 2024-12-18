package com.Spring.Docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringDockerApplication {
	
	
	@GetMapping("/")
	public ResponseEntity<String> getMsg(){
		
      return	new ResponseEntity<>("HELLO TO DOCKERS",HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
