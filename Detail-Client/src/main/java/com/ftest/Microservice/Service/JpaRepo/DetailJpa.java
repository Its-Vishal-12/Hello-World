package com.ftest.Microservice.Service.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ftest.Microservice.Service.Entity.Detail;

@Repository
public interface DetailJpa  extends JpaRepository<Detail , Integer> {
	
	
	@Query(nativeQuery=true, value="SELECT det.detailId , det.address , det.pincode  FROM  feignclient.detail det join  feignclient.employee  emp on emp.employeeId=det.employeeId where det.employeeId=:employeeId ")
	Detail findDetailByEmployeeId(@Param("employeeId")int employeeId);

}
