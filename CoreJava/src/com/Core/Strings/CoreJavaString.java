package com.Core.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A
{
	
	A(){
	System.out.println("Default Constructor");	
	}
	
	
	public int m1(int a, int b) {
		return (a+b);
	}
	
	
	public int m2() {
		
		A a=new A();
		return a.m1(10, 10);
	}
	
	
	public void Method() {
	 A w=new A();
	
	synchronized(this){
		
		w=new A();
		System.out.println("Synchronized block executed"+Thread.currentThread().getName());
		
	}}
	
}

 final class  Strr  implements Comparable {
	
	  int str;

	@Override
	public int compareTo(Object o) {
		 Strr s=(Strr)o;
		return (this.str-s.str);
	}
	
	Strr(){
		
		
	}
	
	Strr(int str){
		
		
	}}
 
 class Comp implements  Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Strr s1=(Strr)o1;
		Strr s2=(Strr)o2;
		return  s1.str-s2.str;
	}
	 
	 
	 
	 
	 
	 
	 
 }
public class CoreJavaString {
	
	
	public static void main(String[] args) {
		
		//String Class
		
		//by object 
		String s=new String("Vishal");
		
		//by literals
		
		String s2="Vishal";
		String s3="Vishal";
		String s5=s2+"Kumar";
		System.out.println(s==s2);  //false one outside  the scp and inside scp
		
		System.out.println(s2==s3); // true  same place reffering is scp
		
		String s6=s3+"Kumar";
		System.out.println(s3==s2); // true  inside scp
		
		String s4=s2;
		System.out.println(s4==s2); // true     inside scp
		
		System.out.println(s5);
		System.out.println(s6);
		
		System.out.println(s5==s6); // false
		
		
		String fname="Vishal"+"Kumar";
		String lname="Vishal"+"Kumar";
		
		System.out.println(fname==lname); // true  inside scp
		System.err.println(fname  +"   "+ lname);
		
		String a=s2+s3;
		String a1=s4+s3;
		System.out.println(a==a1); //  false outside scp
		
		
	String action= s4.toUpperCase();  // false
	                 //s4.trim();    true
		System.out.println(s4==action); //true inside scp when trim;  flase when to uppercase;
		
		 
		String scp="Vishal Kumar"; // scp
		
		final String name="Vishal";  //scp  final -> scp
		 
		  String n=scp+name;
		  
		  String newname=name+" Kumar";      //scp  final object -> scp
		
		  
		  
		System.out.println("Result:");
		System.out.println( scp==newname);   //true
		
		System.out.println("==============================================");
		
		String sentence="My name is vishall kumar";
		
	String []arr=sentence.split(" ");
		
	int max=0;
	
	for(String ss: arr) {
      		
	 int count=ss.length();
	 System.out.println(count);
	
	 
	 if(count > max) {
		  max=count;
		  System.out.println(ss);
		}else {
			System.out.println(ss);
		}
	 
		
	}
	
	System.out.println("Maximun count of words is :" +max);
	
	System.out.println("==============================================\n");
	
	String  pattern="{()}}}{{";
	
	
	
	
	int cbraopen=0;
	int cbraclose=0;
	
	int sbraopen=0;
	
	int sbraclose=0;
	
	
	  char [] br=pattern.toCharArray();
	  
	  for(char c: br) {
		  
		  if(c=='{') {
			  cbraopen++;
		  }else if(c=='}') {
			  cbraclose++;  
		  }else if(c=='(') {
			  sbraopen++;
		  }else if(c==')'){
			  sbraclose++;  
		  }
		                 }
	  
	  if(cbraopen==cbraclose && sbraopen==sbraclose) {
		  System.out.println("True");
	  }else {
		  
		  System.out.println("False");
	  }
	  
	
	System.out.println("------------------------------------------------------------\n");
	  
	  String  string1="Vishal";  //inside pool
	  String string2=new String("vishal"); // outside pool
	  String  string3="Vishal";
	
	  System.out.println(string1.hashCode()+"     "+string1);
	  System.out.println(string2.hashCode()+"     "+ string2);
	  
	  System.out.println("Double Equal Operator:"+ (string1==string2) );   //  comparison on basis of refference
	  System.out.println("Equals Method:"+string1.equals(string2)); // comparision content of object
	
	  System.out.println("Double Equal Operator:"+ (string1==string3) );
		
		Strr strrr=new Strr();

		
		
		String name1="Vishal Kumar Singh";
		String name2="Manish Kumar Singh";
		
		
		System.out.println(name1.regionMatches(6,name2, 6,11 ));
		
		
		String sss="aaaabbbbccccdeffff";
		System.out.println(sss.matches("a*b*c*de*f*"));//true
		System.out.println(sss.matches("a*b*c*de*f"));//false
		
		 int aa='a';
		 int zz='A';
		System.out.println(aa);
		System.out.println(zz);
		
		System.out.println(aa-zz);//small to big -32    big to small +32   used ASCII value
		
		
		A aaa=new A();
		System.out.println(aaa.m2());
		
		
		Strr ss1=new Strr(12);
		Strr ss2=new Strr(10);
		Strr ss3=new Strr(26);
		Strr ss4=new Strr(9);
		
		List<Strr> l=Arrays.asList(ss1,ss2,ss3,ss4);
		
        int res=ss1.compareTo(ss2);
        System.out.println(res);
		
       
		
	}

}
