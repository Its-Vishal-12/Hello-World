package com.ftest.Microservice.Service.JpaRepo;

import java.util.List;

import com.ftest.Microservice.Service.Entity.Detail;
import com.ftest.Microservice.Service.Response.DetailResponse;

public interface DetailRepo {
	
	
	
	public Detail addDetail(Detail detail);
	
	public Detail getDetailById(int did);
	
	public List<Detail> GetAllDetail();

	DetailResponse getDetailByEmployeeId(int eid);
	

}
