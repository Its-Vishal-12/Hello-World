package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stest {
	
	
	static Employee Meth(Employee emp) {
	Optional<Employee> opt=Optional.ofNullable(null);
	 Employee oemp= opt.get() ;
	   int eid=oemp.getEid();
	   String ename=oemp.getEname();
	   
	   Employee empp=new Employee();
	   empp.setEid(eid);
	   empp.setEname(ename);
	
	return empp;
	}

	public static void main(String[] args) {
		
		
		Employee e=new Employee(1,"Vishal");
		Employee e1=new Employee(2,"Nishant");
		Employee e2=new Employee(3,"Vanish");
		Employee e3=new Employee(4,"Ashish");
		
		Employee e4=new Employee(5,null);
		
		
		List<Employee> lis=new ArrayList<>();
		lis.add(e);
		lis.add(e1);
		lis.add(e2);
		lis.add(e3);
		
		
		lis.add(e4);
		
//		Optional<Employee> opt=Optional.ofNullable(null);
//        opt.orElseThrow();
	   
		
		System.out.println("Employee List"+lis);
		 
     List<Employee> emp=  lis.stream().dropWhile(x->x.getEname()==null).filter(x->x.getEname()!=null).sorted((x,y)->x.getEname().compareTo(y.getEname())).collect(Collectors.toList());
    
     List<Employee> empP=  lis.stream().filter(x->x.getEname()!=null).sorted((x,y)->x.getEname().compareTo(y.getEname())).collect(Collectors.toList());
		
     System.out.println("Sorted Employee List"+empP);
		
     
   //  List<Employee> eemp=  lis.stream().map(Stest::Meth).collect(Collectors.toList());   //Exception in thread "main" java.util.NoSuchElementException: No value present
     
  //   System.out.println(eemp);
     
     
     List<Integer> lst=new ArrayList<>();
     lst.add(1);
     lst.add(2);
     System.out.println(lst);
     
     List l=lst;
     
     
     l.add("Vishal");
     
     System.out.println(l);
     
     List<String> ls=l;
     
     System.out.println(ls);
     
     ls.add("Kumar");
     
     System.out.println(ls);
     
     ls.add(1,"kkk");
     ls.add(2,"jjj");
    System.out.println(ls); 
    
    System.out.println("\n Iterator List \n");
    
   Iterator i=ls.iterator();
	while(i.hasNext())	{
		
		System.out.println(i.next());
	}
	}

}
