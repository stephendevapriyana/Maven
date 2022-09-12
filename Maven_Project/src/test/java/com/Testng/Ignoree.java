package com.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoree {
	
	@Test
	public void myntra() {
		
		System.out.println("myntra is dress web applcation ");
	}
	@Test
    public void ajio() {
		
    	System.out.println("ajio is mens dress only");
    }
	@Test(enabled = false)
	public void amazon() {
    	
    	System.out.println("amazon is world wide useing applcation ");
    }
	@Test(enabled=false)
    public void flipkart() {
    	
    	System.out.println("flipkart is india level using applcation");
    }
	@Test
    public void snapdeal() {
    	System.out.println("snapdeal is local level is using applcation");
    }
	@Test
    public void  meeshow() {
    	
    	System.out.println("i dont know meeshow applaction");
    }
    
}
