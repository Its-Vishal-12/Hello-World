package com.service.AddressService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	private String aid;
	
	private String address;
	
	private String pincode;

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(String aid, String address, String pincode) {
		super();
		this.aid = aid;
		this.address = address;
		this.pincode = pincode;
	}

	public Address( String address, String pincode) {
		super();
		
		this.address = address;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
	
	
	

}
