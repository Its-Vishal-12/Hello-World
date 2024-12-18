package com.GigPractice;

  class Solution {

    
	
	//1> to reverse a  number

	public int reverseNumber(int x) {
		
		int temp=0;
		
		while(x>0) {
			
			int unit=x%10;
			
			temp=temp*10+unit;
			
		  x=x/10;
		}
		
		return temp;
	}
	
	
	//2>Reverse a number using string
	
	public String Reverse(int number) {
		
	String num=String.valueOf(number);
	
	  StringBuffer buff= new StringBuffer(num);
	   StringBuffer rev=buff.reverse();
		
	   return  rev.toString();
	  }
	
	//3> to check number is palindrome or not
	
	public boolean checkpalindrome(int number) {
		int n=number;
		int temp=0;
		
		while(number>0) {
			
			int unit= number%10;
			
			temp=temp*10+unit;
			
			number=number/10;
			
		}
		System.out.println(temp);
		return temp-n==0 ? true:false;
		
	}
	
	//4>check whether a string is palidrome or not
	
	public boolean palindromeString(String word) {
		
		String val=word.toLowerCase();
		
		StringBuffer  sb=new StringBuffer(val);
		String rev=sb.reverse().toString();
		
		return rev.equals(val)? true:false;
	}
	
	//5>Sum of units of integer number is
	
	
	public int sumInteger(int number) {
		
		int temp=0;
		
		while(number>0) {
			
			int unit=number%10;
			
			temp=temp+unit;
			number=number/10;
			}
		return temp;
	}
	
	//6> Find even sum and odd sum off number
	
	public int filerSumOfEven(int number) {
		
		int oddsum=0;
		int evensum=0;
		
		while( number > 0) {
            
			int unit=number%10;
			
			if(unit%2==0) {
			evensum=evensum+unit;
			}else {
			oddsum=oddsum+unit;	
			}
			
			number=number/10;
		}
		return evensum;
	}
	
	//7>Find the number is prime or not
	
	public boolean checkPrime(int number) {
		
		int div=0;
		int reff=0;
		int index=number;
		//int sum=0;
		 for(int i=1;i<=number;i++) {
			 
			 if(index%i==0) {
				div++;
				 reff=i;             }
			 }
//		 if(div==2){
//				 
//				 sum=sum+reff;
//			 }
           //  System.out.println(sum);
		  return div==2 ? true:false;
		  }
	
	
	//8.Find the power of number
	
	
	public double powerOfNumber(double number, int power) {
		
		double mul=1;
		for(double i=1; i<=power;i++) {
			
			mul=mul*number;
			
		}
		
		return mul;
	}
	
	
	
	
	
	
}




public class Gig {

	public static void main(String[] args) {
	
		
		Solution sol=new Solution();
		      int res=sol.reverseNumber(1234);
		      System.out.println("Reverse number:"+res);
		      
		      String outp=sol.Reverse(123456);
		      System.out.println("Reverse a number using String : "+outp);
		      
		     boolean re=sol.checkpalindrome(111);
		      System.out.println("Palindrome ?:"+re);
		      
		      boolean boo=sol.palindromeString("Madame");
		      System.out.println("Ceck string is palindrome ?:"+boo);
		      
		       int sm=sol.sumInteger(123);
		      System.out.println("Sum of units are:"+sm);
		      
		      
		      int evensum=sol.filerSumOfEven(123456);
		      System.out.println("Even Sum :"+evensum);
		      
		      boolean result=sol.checkPrime(100);
		      System.out.println("Prime :"+result);
		      
		      
		    double pow= sol.powerOfNumber(4.0, 3);
		      System.out.println("Power :"+pow);
		      
		      
	}

}
