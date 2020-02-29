package com.reviewclass1;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority=1)
	public void E() {
		System.out.println("Open Browser");
	}
	
	
	@Test(priority=2)
	public void A() {
		System.out.println("PIM Test case");
	}
	
	@Test(priority=3)
	public void B() {
		System.out.println("Leave test Case");
	}
	
	@Test(priority=4)
	public void C() {
		System.out.println("Close Browser");
	}
	
	@Test(priority=5)
	public void D() {
		System.out.println("Second Close Browser :)  ");
	}
	
}
