package com.Test;

class Solution {

	static  String var;
    static boolean ispar(String x) {
        var=x;
        
      char[] arr=var.toCharArray();
        
        
        int  balance=0;
        
        for(int i=0;i<arr.length ;i++){
            
            if((arr[i]=='{') || (arr[i]=='(') ||  (arr[i]=='[')){
                balance++;
            }else if((arr[i]=='}') || (arr[i]==')') ||  (arr[i]==']')){
                
                balance--;
            }else{
                
            
            } }
        
        
         if(balance==0){
                return true;
            }else{
                return false;
            }
        
    }
    
    Solution(){
    	
    }
}

public class Gig {

	public static void main(String[] args) {

		Solution  sol=new Solution();
           boolean bol= sol.ispar("[(])");
System.out.println(bol);
	}

}
