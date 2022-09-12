package com.grouping;

import org.testng.annotations.Test;

public class Group_Ex {
	
	@Test(groups="my counties")
	public void Isreal() {
		
		System.out.println("Isreal Pm Is Nafitali Bennett");
	}
    @Test(groups="my counties")
	public void USA() {
		
		System.out.println("US Former President Is Donald Trump");
	}
	@Test(groups=" Danny counties")
	public void India() {
		
		System.out.println("India President Is Modi");
	}
	@Test(groups="my counties")
	public void London() {
		
		System.out.println("London pm is Boris Johnson");
	}
	@Test(groups=" Danny counties")
	public void Canada() {
		
		System.out.println("canada pm is Justin Trudeau");
	}
	@Test(groups=" Danny counties")
	public void Australia() {
		
		System.out.println("australia pm is Anthony Albanese");
		
	}
}

