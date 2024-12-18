package com.JUnitTesting.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.JUnitTesting.MethodsForTest.StudentTest;

public class Testing {
	
	int add=4;
	 StudentTest  t=new StudentTest();
  @Test
  public void testAdd()	{
	  
	 
	  
	 int result= t.addMeth(2, 2);
	
	 
	 assertEquals(add,result);
  }
  
  
  @Test
  public void testgetCompare() {
	  
	boolean b=  t.getCompare("Vishal", "Vishal");
	  
	assertTrue(b);
  }
	
	
	

}
