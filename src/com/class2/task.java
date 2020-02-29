package com.class2;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.util.CommonMethods;

public class task extends CommonMethods {
	/*Open chrome browser
	 * 1.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	 * 2.Login into the application
	 * 3.Click on Add EmployeeVer
	 * 4.ify labels: Full Name, Employee Id, Photograph are displayed
	 * 5.Provide Employee First and Last Name
	 * 6.Verify Employee has been added successfully
	 * 7.Close the browser */
	
	@BeforeMethod
	public void OpenAndNavigate() throws InterruptedException {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
	}
	
	@Test
	public void LogoAndLogin() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	

}
