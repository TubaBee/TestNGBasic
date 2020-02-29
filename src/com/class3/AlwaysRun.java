package com.class3;

import org.testng.annotations.*;

public class AlwaysRun {

	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.out.println("I am before suite");
	}
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		System.out.println("I am before Test");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		System.out.println("I am before method");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("I am before Class");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod() {
		System.out.println("I am after method");
	}
	
	@AfterTest(alwaysRun=true)
	public void afterTest() {
		System.out.println("I am after Test");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("I am after Class");
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		System.out.println("I am after suite");
	}
	
	@Test
	public void testMethod() {
		System.out.println("I am test");
	}
	
	
	
}
