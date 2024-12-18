package com.ftest.Microservice.Service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Detail")
public class Detail {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "detailId")
private int did;

@Column(name="address")
private String address;

@Column(name="employeeId")
private int eid;

@Column(name="pincode")
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

public Detail(int did, String address, int eid, int pincode) {
	super();
	this.did = did;
	this.address = address;
	this.eid = eid;
	this.pincode = pincode;
}

public Detail(String address, int eid, int pincode) {
	super();
	this.address = address;
	this.eid = eid;
	this.pincode = pincode;
}


public Detail() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Detail [did=" + did + ", address=" + address + ", eid=" + eid + ", pincode=" + pincode + "]";
}



	
}
