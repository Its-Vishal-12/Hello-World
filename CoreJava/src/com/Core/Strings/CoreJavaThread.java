package com.Core.Strings;

class AA{
	
	AA(){
		
	System.out.println("Default A Constuctor");	
	
	}
	
	public static void Meth() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("Method of class A");
			
			System.out.println(Thread.currentThread().getName()+"   "+Thread.currentThread().getId()+"   "+Thread.currentThread().getThreadGroup().getName()   );
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
		
		
	}
}


//creating Thread With Thread Class

class ThreadA extends Thread {
	
	ThreadA(){
		super();
		start();
		}
	
	ThreadA(String name){
		super(name);
		start();
	}
	
	ThreadA(String name,ThreadGroup  tg){
		super( tg, name);
		start();
		}
	
	@Override
	public void run() {
	  
		AA.Meth();
		
		
	}
	
	
	}

class ThreadB implements Runnable{
	
	
	ThreadB(){
		
		Thread t=new Thread( this);
		t.start();
		
	}
	
	ThreadB(String name){
		
		Thread t=new Thread(this,name);
        t.start();
	
	}
	
ThreadB(String name,ThreadGroup tg) {
		
		Thread t=new Thread(tg,this,name);
        t.start();
        try {
			t.wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	
	}
	

	@Override
	public void run() {
		AA.Meth();
	}
}





public class CoreJavaThread {

	public static void main(String[] args) {
		// Thread 
		ThreadGroup tg=new ThreadGroup("Kumar");
		ThreadA th=new ThreadA("ThreadNo-1",tg);
		th.run();
		System.out.println("-----------------------------------------------------------"); 
		
		ThreadGroup tgg=new ThreadGroup("Singh");
		ThreadB thb=new ThreadB("Vishal",tgg);
		thb.run();
		
	}

}
