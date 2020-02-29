package com.reviewclass1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {

	@BeforeClass
	public void Open() {
		System.out.println("Open Browser");
	}
	
	
	@Test
	public void testOne() {
		System.out.println("Login functionality");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Search functionality");
	}
	
	@Test
	public void testThree() {
		System.out.println("Finish test message");
	}
	
	@AfterClass
	public void Close() {
		System.out.println("Close Browser");
	}
	
}
