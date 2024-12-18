package com.ConsumerApi.ConsumerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ConsumerApi.Entity.Consumer;
import com.ConsumerApi.Service.ConsumerJpa;
import com.ConsumerApi.Service.ConsumerService;

@Service
public class ConsumerImplement  implements  ConsumerService  {
	
	@Autowired
	 private ConsumerJpa  jpa;
	

	@Override
	public Consumer registerConsumer(Consumer consumer) {
		
		 Consumer cons= jpa.save(consumer);
		 return cons;
	}

	@Override
	public Consumer getConsumerByPhone(String phone) {
		 
	Consumer con=	jpa.findById(phone).get(); 
		return con;
	}

	@Override
	public Consumer updateConsumer(Consumer consumer) {
		 Consumer con= jpa.save(consumer);
		return con;
	}

	@Override
	public List<Consumer> getAll() {
	   List<Consumer> list= jpa.findAll();
		return list;
	}

}
