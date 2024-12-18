package com.CS;


public class Test {

	public static void main(String[] args) {
		System.out.println(" ---------TEST-------------");
	
		
		int arr[]= {6,8,4,3,1,6};
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j] ) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}}}
		System.out.println(arr[0]);
		System.out.println("=========");
		for(int a: arr) {
			
			System.out.println(a+" ");
			
			
			//1. Reverse A string
			
			String  org="Vishal";
			
			String rev="";
			
	 char[] ca=org.toCharArray();
			 System.out.println(ca.length);
	 
	 for(int i=ca.length-1 ; i>=0; i--) {
		 
		    char tempp=ca[i];
		       rev=rev+String.valueOf(tempp);
		 
	 }
			
			System.out.println("Reverse :"+rev);
			
			
			
			//remove duplicate cahracter
			
			
			String  orignal="Hello Madam Good Morning";

		    String lower=orignal.toLowerCase();
		}

	}

}
