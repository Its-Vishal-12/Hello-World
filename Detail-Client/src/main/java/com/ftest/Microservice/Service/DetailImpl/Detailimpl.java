package com.ftest.Microservice.Service.DetailImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftest.Microservice.Service.Entity.Detail;
import com.ftest.Microservice.Service.JpaRepo.DetailJpa;
import com.ftest.Microservice.Service.JpaRepo.DetailRepo;
import com.ftest.Microservice.Service.Response.DetailResponse;

@Service
public class Detailimpl  implements  DetailRepo {
     @Autowired
	 private DetailJpa  jpa;
     
     @Autowired
      private ModelMapper  model;
	
	@Override
	public Detail addDetail(Detail detail) {
		
		Detail d=new Detail();
		d.setEid(detail.getEid());
		d.setDid(detail.getDid());
		d.setAddress(detail.getAddress());
		d.setPincode(detail.getPincode());
		return  jpa.save(d);
	}

	@Override
	public DetailResponse getDetailByEmployeeId(int eid) {
	
		Detail detail= jpa.findDetailByEmployeeId(eid);
		DetailResponse dresponse=model.map(detail, DetailResponse.class);
		    
		return dresponse;
		
	}

	@Override
	public List<Detail> GetAllDetail() {
		
		return jpa.findAll();
	}

	@Override
	public Detail getDetailById(int did) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
