package com.Core.Strings;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.IntegerSyntax;




class Employee{
	
	 private int impId;
	
	 private String name;
	 
	 private String email;

	public Employee(int impId, String name, String email) {
		super();
		this.impId = impId;
		this.name = name;
		this.email = email;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getImpId() {
		return impId;
	}

	public void setImpId(int impId) {
		this.impId = impId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [impId=" + impId + ", name=" + name + ", email=" + email + "]";
	}
	 
	 
	
}

 class Job {
	
	
	 private int id;
	 
	 private String    stream;
	 
	 private String    name;
	  
	 private String    address;
	
	 private String    state;
	 
	 private  int      vaccancy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getVaccancy() {
		return vaccancy;
	}

	public void setVaccancy(int vaccancy) {
		this.vaccancy = vaccancy;
	}

	public Job(int id, String stream, String name, String address, String state, int vaccancy) {
		super();
		this.id = id;
		this.stream = stream;
		this.name = name;
		this.address = address;
		this.state = state;
		this.vaccancy = vaccancy;
	}

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", stream=" + stream + ", name=" + name + ", address=" + address + ", state=" + state
				+ ", vaccancy=" + vaccancy + "]";
	}
	
	

}

public class CoreJavaCollections {
	
	static List<Job> joblist=new ArrayList<>();
	 
	static {
		
		  Job j=new Job(1411,"IT","HTC","Pune","Maharashtra",5);
			Job j1=new Job(1401,"Manufacturing","Suzuki","Mumbai","Maharashtra",2);
			Job j2=new Job(1210,"Manufacturing","Denso","Manesar","Haryana",1);
			Job j3=new Job(1300,"IT","Amdocs","Hyderabad","Telangana",6);
			Job j4=new Job(1300,"IT","Amdocs","Hyderabad","Telangana",6);
			Job j5=new Job(1281,"IT","HCL","Delhi","New Delhi",5);
			Job j6=new Job(1521,"Manufacturing","HTC","Pune","Maharashtra",5);
			Job j7=new Job(1641,"IT","Accenture","Noida","Uttar Pradesh",2);
			Job j8=new Job(1981,"Manufacturing","Marelli","Manesar","Haryana",1);
			Job j9=new Job(1871,"IT","Infosis","Pune","Maharashtra",4);
			Job j10=new Job(1311,"Manufacturing","3M","Jaipur","Rajesthan",8);
			
			joblist=List.of(j, j1, j2, j3, j4, j5, j6, j7, j8,j9,j10);
		
		
	}
	
	
	
	
	
	
	
	public static Employee  update(Employee emp) {
		
		Employee e=new Employee();
		
		e.setImpId(emp.getImpId());
		e.setName(emp.getName()+"Kumar Singh");
		e.setEmail(emp.getEmail());
		
		return e;
		
		
	}
	

	public static void main(String[] args) {
		
		
		
		// Collections
		
		   List<String> namelist= List.of("Vishal", "Mohit", "Amit", "Sonal", "Ashish", "Zeein");
		   
		   
		    List<String >namelistnew=  namelist.stream().sorted().collect(Collectors.toList());
		   
		    System.out.println(namelistnew);
		
		  System.out.println("---------------------------------------------------------");
		
			List<Employee> list=new ArrayList<>();
			
			Employee emp=new Employee(1,"Vishal","Vishal@gmail.com");
			Employee emp1=new Employee(2,"Nishal","Nishal@gmail.com");
			Employee emp2=new Employee(3,"Sishal","Sishal@gmail.com");
			Employee emp3=new Employee(4,"Kishal","Kishal@gmail.com");
			Employee emp4=new Employee(5,"Vishal","Tishal@gmail.com");
			Employee emp5=new Employee(6,"Qishal","Qishal@gmail.com");
			Employee emp6=new Employee(7,null,"Jishal@gmail.com");
		//	Employee emp7=null;
		
			  list=List.of(emp, emp1, emp2, emp3, emp4, emp5, emp6 );
			   
			  List<Employee>  emplist=list.stream().filter(x->x.getName()!=null).sorted((x,y)-> x.getName().compareTo(y.getName())).collect(Collectors.toList());
			   System.out.println(emplist);
			   System.out.println("---------------------------------------------------------");
		Integer[] in= {1,2,3,4,5,6,7,8,9,0,11,12};
		   
		   List<Integer> ll= List.of(in);
		   System.out.println(ll);
                      List<Integer>lllll=Arrays.asList(in);
		  System.out.println(lllll);
		  List<Integer> intlist=List.of(1,3,5,6);
		   
	int sum=intlist.stream().reduce((x,y)->x-y).get();
		System.out.println("SUM of all elements: "+sum); 
		
		
		
		List li=new ArrayList();
		String name="Vishal";
		Integer  number=1;
		
		boolean boo=false;
		float  flow=456.25f;
		double doub=456.241;
		char cha='V';
		char chaa='V';
		
		li.add(name);
		li.add(number);
		li.add(boo);
		li.add(flow);
		li.add(doub);
		li.add(cha);
		
		System.out.println(li);
		int  b=1;
		li.stream().filter(x->x.equals(b)).forEach(System.out::println);
		
		Set s=new HashSet();
		
		//s.add(li);
		s.addAll(li);
		
		System.out.println(s);
		
		//lambda expression
		
		//consumer  -> 1. void accept(T)   bi-consumer      Urinary
		//predicate -> 2. boolean  test(T)  bi-predicate    Binary
		//function  -> 3.  T apply(T)       bi-function     Collectors
		
		List<String> string=List.of("Vishal","Manish","Nishant","Sudeep","Shalini","Vishal","Manish","Nishant","Sudeep","Shalini");
	
		//to find out repetation of element 
		int rep = Collections.frequency(string, "Vishal");
		System.out.println("Repetation: "+rep);
	
		
	
		
  
   
    Map<Integer,Employee> map=new HashMap<>();
    
       
    
//    Optional.ofNullable(emp7).ifPresent(x->{
//    	
//    	x.setImpId(0);
//    	x.setName("not defined");
//    	x.setEmail("not defined");
//    	
//    });
    
             
    
    List<String> ss= list.stream().filter(x->Objects.nonNull(x)).map(Employee::getName).collect(Collectors.toList());
    System.out.println(ss);
    
     list.stream().filter(x->x!=null).forEach(System.out::println);
    
    List<Employee> eee= list.stream().filter(x-> x.getName()=="Vishal").map(CoreJavaCollections::update).collect(Collectors.toList());
    
  System.out.println(eee);
     System.out.println("---------------------------------------------------------------");
   
   List<Employee> elist = list.stream().filter(x-> x!=null).filter(x->x.getName()!=null).collect(Collectors.toList());
    
   System.out.println(elist);
		
   
   List<Integer>integers = new ArrayList<>();
   
   integers.add(1);
   integers.add(2);
   integers.add(3);
   
   System.out.println(integers);
  
   integers.add(0,9);  // internally number will swap by injection element at particular index 
   
   System.out.println(integers); 
   
   
   List<Integer>inte = new LinkedList<>();
   inte.add(10);
   inte.add(20);
   inte.add(30);
   System.out.println(inte);
   inte.remove(1);
   System.out.println(inte);
   System.out.println(inte.get(1));

   System.out.println("\n---------------------------------------------------------------");
	
	Set<Integer> set=new HashSet<>();
      set.add(100);
      set.addAll(inte);
      set.add(200);
      set.add(300);
      
      
      System.out.println(set);
	   set.add(400);
	   set.add(1);
	   System.out.println(set);
	  set.remove(100);
	  set.add(600);
	  System.out.println(set);
	
	  System.out.println("\n---------------------------------------------------------------");  
	  
	  Set<Integer> sets=new LinkedHashSet<>();
	  sets.addAll(set);
	  sets.add(20);
	  sets.add(40);
	  System.out.println(sets);
	 
	  System.out.println("\n----------------------------------------------");
	  Set<Integer> treeset=new TreeSet<>();
	   treeset.add(12);
	   treeset.add(14);
	   treeset.add(15);
	   
	   System.out.println(treeset);
	   treeset.add(15);
	  System.out.println(treeset);
	  
	  
	  Map<Integer,String>  mapp=new HashMap<>();
	  
	  mapp.put(10, "Vihsal");
	  mapp.put(11, "Vishal");
	  mapp.put(15, "Manish");
	  mapp.put(13, "Sonal");
	  
	  System.out.println(mapp);
      mapp.put(12, "Nishant");
      
      System.out.println(mapp);
      
      String stream="IT";
 	 List<Job>streamjob= joblist.stream().filter(x->x.getStream()==stream).collect(Collectors.toList());
      System.out.println(streamjob);
      
      
      System.out.println("\n----------------------------Interview Question-------------------------------------/n");
      
      
      
       List<Integer>  integerlist=Arrays.asList(10,20,30,40,50);
       
       Collections.sort(integerlist);
       
     int mins=integerlist.stream().distinct().findFirst().get();
      System.out.println("Minimun number ="+ mins);
      
    //  1. to find maximun  number in array
      
      int max= Collections.max(integerlist);
      System.out.println("Maximun number ="+max);
      
      int max1=integerlist.stream().mapToInt(Integer::intValue).max().getAsInt();
      System.out.println("Max number ="+max1);
      
    // 2. to find mimimum  number in array 
      
       int min=Collections.min(integerlist);
      
      System.out.println("Minimun number ="+min);
      
      int min1=integerlist.stream().mapToInt(Integer::intValue).min().getAsInt();
      System.out.println("Min number ="+min1);
      //3. to find average of number
      
         long sums=(long) integerlist.stream().reduce((x , y)-> x+y).get();
         long count=integerlist.stream().count();
         
        long average=sums/count;
        System.out.println("Average ="+average);
        
         double avg=integerlist.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average Number ="+avg);
        
      // to find sum of elements
        
        System.out.println("Sum of elements="+sums);
        
      //to find count of number
        
        System.out.println("Count of number ="+count);
        
        
      List<Integer> list1=  List.of(1,2,3,4,5,6);
        
      List<Integer> list2=List.of(4,5,6,7,8);
     
  List<Integer> newlist=list1.stream().filter(list2::contains).collect(Collectors.toList());
        
  System.out.println("New list common elements:="+newlist);
  
  List<String> namestring=List.of("Spring Boot", "Spring Security", "Java","Python");
  
  
  String substr="Spring";
  
   List<String> sun=namestring.stream().filter( x->x.contains(substr)).collect(Collectors.toList());
  System.out.println("Founded List ="+sun);
  
 
  String user="Vishal Kumar";
  
  
  boolean res=user.contains("Kumar");
        System.out.println("Result   "+res);
        
        
        String sentence="Vishal Kumar  is a good boy";
        
        
      String senarr[]=sentence.split(" ");
        
      List<String> listsent=  Stream.of(senarr).map(x-> new StringBuilder(x).reverse().toString()).collect(Collectors.toList());
        
     ListIterator lil= listsent.listIterator();
     
     
       while(lil.hasNext()) {
    	   
    	   System.out.print(lil.next()+" ");
       }
        System.out.println("-------------------------------\n");
     
        
        while(lil.hasPrevious()) {
        	
        	System.out.print(lil.previous()+" ");
        	
        	
        }
        
        
        
        
        
        
        
}}
