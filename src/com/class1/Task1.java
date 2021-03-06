package com.class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {
	
/*Task 1: Executing different test based TestNG annotations

Create class that will have:
Before and After Class annotation
Before and After Method annotation
2 methods with Test annotation

Observe the results! */
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before C");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After C");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before T");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After T");
	}
	
	@Test
	public void MyTest1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void MyTest2() {
		System.out.println("Test 2");
	}
}
