package com.Spring.Fc.Service.AppService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Feign-Client")
public interface AppClient {

	
	@GetMapping("/App1/getstatus")
    ResponseEntity<String> getUpdate();
	
	
	@GetMapping("/App1/getStudent")
	ResponseEntity<List<String>> getList();
		
	

}