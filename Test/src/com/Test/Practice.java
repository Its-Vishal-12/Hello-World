package com.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		
		
		System.out.println("----------test-----------------\n");
		
		
        String  str="Vishal is a good boy Vishal";
        List<String>common= new ArrayList<>();
        
        String ss[]  = str.split(" ");
        
        for(String s:ss) {
        	
        	System.out.print(" "+s);
        	
      boolean b= str.regionMatches(0, s, 0, s.length());
      
       if(b==true) {
    	   
       }else {
    	   common.add(s);
       }
      
      
        	System.out.println(b);
        }
        
    
        
        System.out.println("Distinct"+ common);
        
        System.out.println("==================================================\n");
        
        String word="aabbcddffgz";
        
        
        Map<Character , Integer> map=new HashMap<>();
        
        
        for(int i=0; i<word.length();i++) {
        	
        	char ch=word.charAt(i);
        if(map.containsKey(ch)) {
        	
        	map.put(ch, map.get(ch)+1);
         }else {
        	
        	map.put(ch, 1);
        }
   }
  
        System.out.println(map); 
       
        int x=0;
        for(Entry<Character,Integer> entryset : map.entrySet()) {
        	
        	
        	if(entryset.getValue()==1) {
        	 if(x==2) {
        	   System.out.println(entryset.getKey());	
        	 }
        		x++;
        	}
         }
        
        //reverse a string
        
        String name="Vishal";
         char[] arr =name.toCharArray();
        for(int i=arr.length-1;i>=0;i--) {
        	
        	System.out.print(arr[i]);
        	
        }
        
        //remove special characters
        String val="@%&#asfrts%Edd";
        
    String val2="a   b   y   u  i";
    
        
           String n= val.replaceAll("[^a-zA-Z0-9]", "");
        	System.out.println("\n"+n);
        	
     String  newval2=val2.replaceAll(" ", "");    	
        System.out.println(newval2);
        
        System.out.println("=========================================\n");
        
        
        //remove duplicate  characters from string
        String dup="aakfhskrfhskzdfksjfhtjjd";
        
        
        Map<Character, Integer> mapa=new HashMap<>();
        
        
        for(int i=0;i<dup.length();i++){
                char chaa=dup.charAt(i);
                        if(mapa.containsKey(chaa)) {
                            mapa.put(chaa, mapa.get(chaa)+1);
                           }else {
    	   
    	                      mapa.put(chaa, 1);
                            }
        	
           }
        System.out.println(mapa); 
        
        int xx=0;
        for(Entry<Character,Integer> cc: mapa.entrySet()) {
        	
        	if(cc.getValue()==1) {
        		System.out.print(cc.getKey());
        	if(xx==2) {
        		
        		System.out.print("\n"+cc.getKey());
        		
        	}
        	xx=xx+1;
        	}
        	
        }
        
        //short string char
        System.out.println("\n=========================");
        String no="Vishalkumar";
        
      char[] charr= no.toLowerCase().toCharArray();
        
       for(int i=0; i<charr.length;i++) {
    	   
    	   char temp;
    	   for(int j=i+1;j<charr.length;j++) {
    		   
    		   if(charr[i]>charr[j]) {
    			   
    			    temp=charr[i];
    			    charr[i]=charr[j];
    			    charr[j]=temp;
    			 }
    		  }
    	    }
        
        for(char v: charr) {
        	System.out.print(" "+v);
        }
        
        
        //to replace char to repeating number
        
        
        String ch="asdfthjktfdst";
          char[] charry= ch.toCharArray();
        int rep=1;
        char copy='t';
        
        for(int i=0;i<charry.length;i++) {
        	
        	if(charry[i]==copy) {
        		charry[i]=String.valueOf(rep).charAt(0);
        		rep++;
        	        
        	         
        	}
        	
        }
        String newone="";
        for(char  sss: charry) {
        	
        	newone=newone+String.valueOf(sss);
        	System.out.print(sss);
        }
        
        System.out.println("\nNew String:\t" +newone);
        
        
     //reverse of string in given words 
        
        
        String detail="Hello my name is vishal kumar";
        
        String arry []= detail.split(" ");
        
        String newvalues="";
        for(int a=0; a<arry.length;a++) {
        	
        	
          StringBuilder  sb=new StringBuilder(arry[a]);
        	newvalues=newvalues+" "+sb.reverse().toString();
 }
        
        
 for(String a : arry) {
	 System.out.print(a);
 }
   
 System.out.println("\n"+newvalues);
        
        
     String given="Hello my name is vishal  kumarrsongh";
     
    String[] nm= given.split(" ");
 
    int len=0;
    String maxlen="";
      for(int v=0;v<nm.length;v++) {
    	  
    	 if(nm[v].length()>len) {
    		 
    		len=nm[v].length() ;
    		maxlen=nm[v];
    		 
    	 }
    	  }
        
        System.out.println(maxlen);
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
