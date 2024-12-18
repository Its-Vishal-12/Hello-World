import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		String name= new String("Vishal"); 
		String lname="Vishal";
		String str="kumar";
		
		System.out.println(name.equals(lname));  //on basis of content character by character
		//System.out.println(name.intern()  +"   and  " +  lname.intern());
		System.out.println(name.hashCode()+"    "+(str==lname)+"      "+lname.hashCode());        //on basis of 
//		if(name==lname) {
//			System.out.println("Equal"); 
//			
//		}else{
//		  System.out.println("Not equal");
//		}
//		
		
//		String s=" ";             //one object inside scp
//		String s1=s.trim();       // one object scp
//		System.out.println(s==s1); //false
//		String s2=new String("ABC");  //scp and heap
//		String s3=new String("abc");   //scp and heap
//		System.out.println(s2==s3);  //false
//		String s4="TEST";     //scp
//		String s5="test";      //scp
//		System.out.println(s4==s5);   //false
		
//		System.out.println(s4.equals(s5)); //false  
		
//		System.out.println(s4.equalsIgnoreCase(s5));  //true;
		
//		String s6="TEST";              //inside scp
//		System.out.println(s4==s6);     //true  
//		String s7="Hello";              //inside scp
//		s4= s7.concat("world");         // inside scp and heap
//		 System.out.println(s7==s4);  //false
//		 System.out.println(s4);  //hello world
		
//		 String s8="Hello World";  
//		 String s9=s7+" World";
//		 System.out.println(s8);
//		 System.out.println(s9);
//		 System.out.println(s8==s9);   false
//		 final String  s10="Hello";   
//		 String s11=s10+" World";
//		 System.out.println(s8==s11);   //all correct  answers
		
		
//		List<Integer> a1= new ArrayList<>();
//		a1.add(1);
//		a1.add(2);
//        System.out.println(a1);   
//		
//		List a2 = a1;             //error
//       
//	   System.out.println(a2);    //error
//	   
//		a2.add("String");           //error
//        System.out.println(a2);
//		
//		List<String> a3 = a2;          //error
//        System.out.println(a3);      
//		a3.add(3," ");    
//		
//		
//
	}

}
