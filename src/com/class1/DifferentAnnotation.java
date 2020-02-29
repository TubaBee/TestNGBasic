package com.class1;

import org.testng.annotations.*;

public class DifferentAnnotation {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Test");
	}
	
	@AfterSuite
	public void afteSuite() {
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Test");
	}
	
	@Test
	public void test() {
		System.out.println("I am an actual test");
	}
	
}
