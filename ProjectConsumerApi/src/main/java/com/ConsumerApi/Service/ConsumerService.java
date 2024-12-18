package com.ConsumerApi.Service;

import java.util.List;

import com.ConsumerApi.Entity.Consumer;

public interface ConsumerService {
	
	
	
	
	public Consumer registerConsumer(Consumer  consumer);
	
	
	public Consumer getConsumerByPhone(String phone);
	
	public Consumer updateConsumer(Consumer  consumer); 
	
	public List<Consumer> getAll();

}
