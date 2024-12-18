package com.Spring.Configurations;

import org.springframework.batch.item.ItemProcessor;

import com.Spring.Entity.Entities;

public class EntityProcessor  implements ItemProcessor<Entities,Entities> {

	
	//this process method used to build logics of processing item reading
	@Override
	public Entities process(Entities item) throws Exception {
		
		
		//what-ever the logic you want to built to filter/processing logic  data from source must be implemented here 
		
//		if(item.getName()=="Vishal") {
//			
//		return item;
//			
//		}else {
//			return null;
//		}
		return item;
	}

}
