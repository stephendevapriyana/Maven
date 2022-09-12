package com.Testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priorityy {
	

	@Test(priority=2)
	public void myntra() {
		
		System.out.println("myntra is dress web applcation ");
	}
	@Test
	
    public void ajio() {
		
    	System.out.println("ajio is mens dress only");
    }
	@Test
    public void amazon() {
    	
    	System.out.println("amazon is world wide useing applcation ");
    }
	@Test(priority=-2)
    public void flipkart() {
    	
    	System.out.println("flipkart is india level using applcation");
    }
	@Test(priority=1)
    public void snapdeal() {
    	System.out.println("snapdeal is local level is using applcation");
    }
	@Test(priority=-3)
    public void  meeshow() {
    	
    	System.out.println("i dont know meeshow applaction");
    }
    

}
