package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.Constants;

public class HWMy extends CommonMethods {
	
	/*

	 * TC 1: HRMS Application Login: 
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	Enter valid username and password
	Click on login button
	Then verify Syntax Logo is displayed
	Close the browser

	TC 2: HRMS Application Negative Login: 
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	Enter valid username
	Leave password field empty
	Verify error message with text “Password cannot be empty” is displayed.
	 */
	
	@BeforeMethod
	public void open() {
		setUp("chrome",Constants.HRMS_URL);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@Test (priority=2 , dependsOnMethods= {"validationofMessage"} , enabled = true)
	public void validationOfLogo() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hunhrm123m@");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		boolean isTrue=driver.findElement(By.xpath("//img[contains(@src,'syntax.png')]")).isDisplayed();
		if(isTrue) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is NOT displayed");
		}
	
	}
	
	@Test (priority=1)
	public void validationofMessage() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		
		WebElement error=driver.findElement(By.id("spanMessage"));
		String faildMessage="Password cannot be empty";
		if(error.isDisplayed()) {
			System.out.println("message is displayed");
			if(error.getText().equalsIgnoreCase(faildMessage)) {
				System.out.println("Displayed is correct message. Test Pass");
			}else {
				System.out.println("Displayed is NOT correct message. Test Faild");
			}
		}else {
			System.out.println("message is NOT displayed");
		}
	
	}
	

}
