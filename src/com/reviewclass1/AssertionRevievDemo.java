package com.reviewclass1;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionRevievDemo {
	
	@Test
	public void testOne() {
		String actualTitle="HRM";
		String expectedTitle="HRM";
		boolean test=actualTitle.equals(expectedTitle);
		
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Test Pass");
//		}else {
//			System.out.println("Test Failed");
//		}
		Assert.assertEquals(actualTitle, expectedTitle,"Actual Title did not match");
		Assert.assertTrue(test);
		
		
		System.out.println("Another Testcase");
	}
	
	@Test
	public void testTwo() {
		ArrayList<String> ui=new ArrayList<>();
		ui.add("a");
		ui.add("b");
		ui.add("c");
		
		ArrayList<String> db=new ArrayList<>();
		db.add("a");
		db.add("b");
		db.add("c");
		
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertEquals(ui, db);
		sAssert.assertEquals("name", "name2");
		sAssert.assertAll();
		
//		Assert.assertEquals(ui,db,"Different assertion");

		System.out.println("After Assertion demo");
	}
	
	
	
	
}

