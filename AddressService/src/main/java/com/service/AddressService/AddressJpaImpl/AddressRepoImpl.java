package com.service.AddressService.AddressJpaImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.AddressService.AddressJpa.AddressJpaRepo;
import com.service.AddressService.AddressJpa.AddressRepository;
import com.service.AddressService.Entity.Address;
import com.service.AddressService.Util.GenerateAid;
@Service
public class AddressRepoImpl  implements  AddressRepository{
   @Autowired
	private AddressJpaRepo  repo;
	
	
	@Override
	public Address addAddress(Address address) {
		Address add=new Address();
		add.setAid(GenerateAid.generateAid());
		add.setAddress(address.getAddress());
		add.setPincode(address.getPincode());
		
		return repo.save(add);
	}

	@Override
	public List<Address> getAllAddress() {
		
		return repo.findAll();
	}

	@Override
	public Address getByAid(String aid) {
		  Address add=repo.findById(aid).get();
		return add;
	}

}
