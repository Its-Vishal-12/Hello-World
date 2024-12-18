package com.Spring.Config;

import org.springframework.batch.item.ItemProcessor;

import com.Spring.Entity.Data;

public class ItemProcessorImp  implements ItemProcessor<Data, Data> {

	@Override
	public Data process(Data item) throws Exception {
		// all processing logics and transformation logics were implemented here
		
	Data d=new Data();	
		
	String name=item.getName()+"Kumar";
	String phone="+91"+item.getPhone();	
	d.setBatch_id(item.getBatch_id());	
	d.setName(name);
	d.setPhone(phone);
	d.setEmail(item.getEmail());
		
		return d;
	}

}
