package com.Tcs;


import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Student{
	
	String name;
	int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	}

public class Tcs {

	public static void main(String[] args) {
		System.out.println("-------------TCS---------------------\n");

      
		
		PriorityQueue  pq=new PriorityQueue();
		
		pq.add("Vishall");
		pq.add("Aabhi");
		pq.add("Manish");
		
		System.out.println(pq);
		System.out.println(pq.remove());
	    System.out.println(pq); 
	    
	    // 1> sorted order
	
	    System.out.println("\n--------------------FailSafe---------------\n");
	  
	    //fail safe iterator
	    
	     List<String> hs=new CopyOnWriteArrayList<>();
	     hs.add("Vishal");
	     hs.add("Nishant");
	     hs.add("Niraj");
	     
	    Iterator i= hs.iterator();
	     while(i.hasNext()) {
	    	 System.out.println(i.next());
	    	 hs.remove("Niraj");  // iteration done on cloned object and modification done in original object
	    	 }
	    System.out.println("Modified list"+hs);
	     System.out.println("\n--------------------Non-FailSafe---------------\n"); 
	     //fail fast iterator
		    
		    ArrayList<String> ar=new ArrayList<String>();
		    
		    ar.add("Vishal");
		    ar.add("Nishant");
		    ar.add("Niraj");
		    
		     Iterator it=ar.iterator();
		     while(it.hasNext()) {
		    	 
		    	 System.out.println(it.next());
		    	// ar.remove("Niraj");    //java.util.ConcurrentModificationException
		     }
	     
	     //stream questions
		     
		     //1. sum of element in array
		     
		    List<Integer> li= Arrays.asList(1,2,3,4,5,3);
		     
		    int sum=   li.stream().mapToInt(Integer::intValue).sum();
		    int sm=li.stream().reduce((x,y)->x+y).get();
		    System.out.println("sum   "+ sum); 
		    System.out.println("sum2  "+ sm);
		    
		    
		    int max = Collections.max(li);
		    int max2=  li.stream().max(Comparator.naturalOrder()).get();
		    System.out.println("Max "+max);
	        System.out.println("MAX2   " +max2);
	        
	        
	        List<String>  list=Arrays.asList("Vishal","Kumar","Nishu");
	        
	        List<String> olist=list.stream().filter(x->x.startsWith("K")).collect(Collectors.toList());
	           long count=list.stream().filter(x->x.startsWith("K")).count();
	        System.out.println("Starst with K:"+olist+"Count:"+count);
	        
	        
	       List<String> upper= list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());        
    	        System.out.println("UPPERCASE :"+upper);
    	        
    	        
    	 long cnt=  li.stream().filter(x->x%2!=0).count() ;    
	     System.out.println("Count: "+cnt);
	     
	      List<Double> db=Arrays.asList(1.2,1.3,1.4,1.5);
	       double avg= db.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	     System.out.println("Average: "+avg);
	     
	     
	     String concatinated =  ar.stream().collect(Collectors.joining("."));
	     System.out.println("Concatinated:"+concatinated);
	     
	    List<Integer>li2= Arrays.asList(2,4,6,8);
	    
	  boolean val=  li2.stream().allMatch(number->number%2==0);
	  boolean val2=  li.stream().allMatch(number->number%2==0);
	     System.out.println("All Matches:?"+val);
	     System.out.println("All Matches:?"+val2);
	     
	     
	     
	     String sentence="My name is vishal kumar amd i am a good boy vishal ";
	     List<String> str=Arrays.asList(sentence.split(" "));
	   Map<String , Long> freq=str.stream().collect(Collectors.groupingBy(String::toLowerCase , Collectors.counting()));
	   Long  f=str.stream().collect(Collectors.counting());
	   System.out.println("Count Elements: "+f);
	   System.out.println("Frequency: "+freq);
	     
	     
	   List<Integer> list2=Arrays.asList(12,4,16,8,1,15,111,114,212).stream().filter(number-> String.valueOf(number).startsWith("1")).collect(Collectors.toList());
	     System.out.println("List contain elements starts with 1 :"+list2);
	     
	Map<Character, Long> mm=Arrays.asList("Vishal","Kumar","Nishu","Vikrant","Kumawt","Nishant","vishal").stream().map(x->x.toUpperCase()).collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
	     System.out.println("Name starting with common Alfabet :"+mm);
	     
	     Arrays.asList(12,4,15,8,111,15,111,114,212).stream()
	     .collect(Collectors.groupingBy(e->e, Collectors.counting()))
	     .entrySet()
	     .stream()
	     .filter(x->x.getValue()>1)
	     .map(Map.Entry::getKey)
	     .forEach(System.out::println); 
	     
	     
	     Arrays.asList("Madam","Civic","Level","Vishal").stream().filter(x-> x.equalsIgnoreCase(new StringBuilder(x).reverse().toString())).forEach(System.out::println);
	     
	     
	     int[] arr1= {1,2,3,4,5,6,7,8,9};
	     int[] arr2= {5,3,1,12,13,4};
	     
	      int [] merge=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
	      System.out.println(Arrays.toString(merge));
	       
	      String[] str1= {"Vishal","Myank","Raj","Nishu"};
	      String[] str2= {"Raj","Nishu","Abhi","Nishi"};
	      
	    List<String>  segg= Stream.concat(Arrays.stream(str1), Arrays.stream(str2)).distinct().collect(Collectors.toList());
	      System.out.println(segg);
	      
	     Student ss1= new Student("Vishal",88);
	    
	     Student ss2= new Student("Rahul",78);
	     Student ss3 = new Student("Ravi",35);
	     Student ss4= new Student("Vivek",28);
	      
	     List<Student> stuu=Arrays.asList(ss1,ss2,ss3,ss4);
	     
	 Map<String , List<Student>> sss=   stuu.stream().collect(Collectors.groupingBy(x->x.getMarks()>60 ? "Pass":"Fail"));
	    System.out.println(sss);  
	      
	      
	 List<String>ssrt=   Arrays.asList("Vishal","Myank","Raj","Nishu","R","Vishalllll").stream().sorted(Comparator.comparing(x->x.toString().length())).collect(Collectors.toList());
    System.out.println(ssrt); 
    
	
	
	
	int[]org= {1,2,3,4,5,6,19,43,25};
	
	   int position=8;
	  Arrays.sort(org);
	  int number=org[org.length-position];
	  
	 System.out.println("Second: "+ number);
	 
	
	 String name="Madam";
	 
	 String name2=name.toLowerCase();
     
	
     String nvar="";
	  char[]arry= name2.toCharArray();
     
	  for(int k=arry.length-1;k>=0;k--) {
		  
		    char cc=name2.charAt(k);
		    nvar=nvar+cc;
		    }
	  
	  System.out.println("New One:"+nvar);
	  if(nvar.trim().equals(name2)) {
		  System.out.println("Palindrome");
	  }else{
		  System.out.println("Not Palindrome");
	 }
	  
	  
	  int odd=0;
	  int even=0;
	  
	  int sumodd=0;
	  int sumeven=0;
	  
	  for(int j=0;j<org.length;j++) {
		  
		  if(org[j]%2==0) {
			  
			  even=even+1;
			  sumeven=sumeven+org[j];
		  }else {
			  
			  odd=odd+1;
			  sumodd=sumodd+org[j];
			 }
		    }
	  System.out.println("no of odds:"+odd  +"         "+"total oddsum: "+sumodd);
	  System.out.println("nO of even:"+even+"                  "+"total even sum: "+sumeven);
	  
	  
	  System.out.println("--------------------------------------------------------------\n");
	  
	  int mumber=107;
	   int div=0;
	  for(int z=1; z<=100;z++) {
		  
		  if(mumber%z==0) {
			  div++;
			}else {
				
			}
		  }
	  if(div==2) {
		  System.out.println("Prime Number:");
	  }else{
		 System.out.println("Not  Prine Number"); 
	  }
	  
	  System.out.println("-----------------------------");
	  
	  int ini=1;
	  int fina=100;
	  
	  int disum=0;
	  
	  for(int j=ini;j<=fina;j++) {
		
		 //System.out.println(j);
		  
		  if(j>1) {
		  
		  
		 for(int z=1;z<=j;z++) {
			 
			 if(j%z==0) {
				 
				 disum++;
			
			 }}
		 } }
	  
	 if(disum==2) {
		 System.out.println("Prime");
	 }
	 System.out.println(disum);
	  
	  
	 //fabnocci series  
	 
	 int fabnum=10;
	 
	 int a=0;
	 int b=1;
	  int summ=0;
	 System.out.print(a+" ");
	 System.out.print(b+" ");
	  for(int ii=2;ii<fabnum;++ii) {
		  
		   summ=a+b;
		  System.out.print(" "+sum);
		  a=b;
		  b=summ;
		  }
	
	  System.out.println("///////////////////////////////////////////////");
	  
	 int cc[] ={1,2,3,4,5,6,19,43,25};
	 
	 int v=0;
	 for(int z=0;z<cc.length;z++) {
		 
		 for(int x=z;x<cc.length;x++) {
			 
			 if(cc[z]>cc[x]) {
				 
				 //System.out.println(cc[z]);
				 v=cc[z];
				 cc[z]=cc[x];
				 cc[x]=v;
				 }
			}
	 }
		 for(int ccc:cc) {
			 System.out.print(" "+ccc);
		 }
		 
		 
		 
		List<String[]> lm= new ArrayList<>();
	
		
		String as[]= {"Vishal","Kumar"};
		String ass[]= {"Shalini","Kumari"};
		 
		 lm.add(as);
		 lm.add(ass);
		 
		 
		 lm.stream().map(x-> x).forEach(System.out::println);
	 
	 
	 
	 
	 
	 
	 
	  
     
	}
}
