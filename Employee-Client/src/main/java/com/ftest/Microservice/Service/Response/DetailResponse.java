package com.ftest.Microservice.Service.Response;


public class DetailResponse {
	
	private int did;


	private String address;

	
	private int eid;

	
	private int pincode;
	
	


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public DetailResponse(int did, String address, int eid, int pincode) {
		super();
		this.did = did;
		this.address = address;
		this.eid = eid;
		this.pincode = pincode;
	}


	public DetailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "DetailResponse [did=" + did + ", address=" + address + ", eid=" + eid + ", pincode=" + pincode + "]";
	}
	
	


}
