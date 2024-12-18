package com.service.AddressService.AddressJpa;

import java.util.List;

import com.service.AddressService.Entity.Address;

public interface AddressRepository {
	
	public Address addAddress(Address address); 
	
	public List<Address> getAllAddress();
	
	public Address getByAid(String aid);

}
