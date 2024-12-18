package com.Spring.ServiceLayer;

import org.springframework.stereotype.Service;

@Service
public class Services {
	
	
	
	public float Add(int first , int second) {
		
		int sum= first+second;
		return sum;
	}
	
	public float Sub(int first, int second) {
		int sub=first-second;
		return sub;
	}
	
	
	public float Mul(int first, int second) {
		int mul=first*second;
		return mul;
	}
	
	public float Div(int first, int second) {
		int div=first/second;
		return div;
	}
	
	
	

}
