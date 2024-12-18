package com.Tcs;

import java.util.HashSet;
import java.util.Set;

class Thread1 implements Runnable{

	int balance=200;
	
	
	
	
	@Override
	public void run() {
		
		for(int i=0;i<=3;i++) {
		
		System.out.println("Waiting  for  Withdraw:"+"    "+ Thread.currentThread().getName());
		synchronized(this){
		if(balance>=50) {
			
			System.out.println("Balance deducted:"+"    "); 
			balance -=50;
			System.out.println("Balance Left :"+ this.balance +"     " );
		}else {
			
			System.out.println("Balance Low:"+ balance+"    "+Thread.currentThread().getName());
		}
	}
	}}
	
}

public class Threadings {

	public static void main(String[] args) {
	    Thread1 tt=new Thread1();
		
	    Thread Vishal=new Thread(tt,"Vishal");
	    Thread Sonal=new Thread(tt,"Sonal");
		Vishal.run();
        Sonal.run();
        Set s=new HashSet<Object>();
	}

}
