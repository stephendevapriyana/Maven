package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Valdation_Vefication {
	@Test
public void stephen() {
		
		String actual="Mossad";
	    String expected="Mossad";	
	    
          Assert.assertEquals(actual, expected);
	//    Assert.assertNotSame(actual, expected);
		
		
	}
	
//	@Test
//	public void deva() {
//		
//		String acutal="Ford";
//		String expected="ford";
//		
//		SoftAssert soft=new SoftAssert();		
//			 soft.assertEquals(acutal, expected);
//			 
//			 
//	}

}
