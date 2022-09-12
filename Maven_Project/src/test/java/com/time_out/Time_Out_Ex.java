package com.time_out;

import org.testng.annotations.Test;

public class Time_Out_Ex {
	
	@Test(timeOut=5000)
	private void amazon() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("amazon is Usa comapny ");
	}
	@Test(timeOut=1000)
	private void flipkart () throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("amazon is Usa comapny ");
	}

}
