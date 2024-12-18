package com.Spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


public class Configuration {
	
	@Autowired
	BeanB b;
	
	
	Configuration(){
	  System.out.println("Def Constructor Configuration"); 
	  
	}
	
	@Bean(name="Conf")
	public BeanB ConfigurationBeans(){
		
	  BeanA a=new BeanA();
	  a.setName("Nishu");
	  a.setRoll(12);
	   
	   return new BeanB(a,"Deoghar");
		
	}
	

}
