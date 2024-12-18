package com.ftest.Microservice.Service.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ftest.Microservice.Service.Response.DetailResponse;

@FeignClient(name="Detail-Client" ,url="http://localhost:8786", path="/Detail-Client")
public interface EmployeeFeign {
	
	@GetMapping("/detail/get/{did}")
	public ResponseEntity<DetailResponse> getDetailByEmployeeId(@PathVariable("did")int did);
		
		
	
	

}
