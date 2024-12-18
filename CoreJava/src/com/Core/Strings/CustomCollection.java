package com.Core.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class Custom  extends ArrayList {
	
	@Override
	public boolean add(Object o) {
		
	if(this.contains(o)) {
		 return true;
		}else {
			
			return super.add(o);
		}
	}
	
	
	
	
}






public class CustomCollection {

	
	public static void main(String[] args) {
		
		Custom custom=new Custom();
		
		custom.add("Vishal");
		custom.add("Vishal");
		custom.add("Kumar");
		
		System.out.println(custom);
		
	   List <String> list=new ArrayList<>();
	   
	   list.add("Vishal");
	   list.add("Niraj");
	   list.add("Manish");
	   System.out.println("Before Swap:"+list);
	   Collections.swap(list, 1, 2);
	   System.out.println("After Swap:"+list);
	   
	   Collections.reverseOrder();
	System.out.println(list);
	Collections.sort(list);
		System.out.println(list);
		
		ConcurrentHashMap<Integer,String> mp=new ConcurrentHashMap<>();
		
		mp.put(1, "Vihsal");
		mp.put(2, "Kumar");
		mp.put(3, "Nishu");
	   mp.put(1, "Shalini");
	   
    
		
		System.out.println("Concurrent Hash MAP: "+mp);
		
		System.out.println(mp.get(1));
		
		  System.out.println(mp.keySet());
	}
}
