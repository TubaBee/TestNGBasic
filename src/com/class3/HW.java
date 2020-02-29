package com.class3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.Constants;

@Test
public class HW extends CommonMethods {
	/*
	 * TC 1: HRMS Add Employee: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Login
	 * into the application Add 5 different Employees and create login credentials
	 * by providing: First Name Last Name Username Password Provide Employee First
	 * and Last Name Verify Employee has been added successfully and take screenshot
	 * (you must have 5 different screenshots) Close the browser Specify group for
	 * this test case, add it into specific suite and execute from xml file.
	 */

	@BeforeMethod
	public void open() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@Test (dataProvider="add_c")
	public void start1(String first, String last, String user, String pass) throws InterruptedException {
		//navigate to add employee
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[@class='firstLevelMenu']//b[text()='PIM']")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(2000);
		// adding employee
		driver.findElement(By.id("firstName")).sendKeys(first);
		driver.findElement(By.id("lastName")).sendKeys(last);
		String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("chkLogin")).click();
		Thread.sleep(2000);
		//creating login credentials
		driver.findElement(By.id("user_name")).sendKeys(user);
		driver.findElement(By.id("user_password")).sendKeys(pass);
		driver.findElement(By.id("re_password")).sendKeys(pass);
		driver.findElement(By.id("re_password")).click();
		Thread.sleep(2000);
		//verifying employee is added seccessfully
		String actualEmpId=driver.findElement(By.id("personel_txtEmployeeId")).getAttribute("value");
		Assert.assertEquals(actualEmpId,empId,"Employee ID did not match" );
		
		Thread.sleep(2000);
		//Taking Screenshot
		TakesScreenshot ss = (TakesScreenshot) driver;
		File sc = ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sc, new File(
					"C:\\Users\\Tuba\\eclipse-workspace\\SeleniumBatchV\\screenshots\\HRMS\\" + first+last + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] add_c() {
		Object[][] data = { { "Demet", "ded", "dem", "dem123456" }, 
				{ "Ayse", "asas", "asy", "ays123456" },
				{ "Sevim", "sevv", "sev", "sev123456" }, 
				{ "Mariam", "mary", "mar", "mar123456" },
				{ "John", "jojo", "jon", "jon123456" } };
		return data;
	}

	@AfterMethod
	public void finish() {
		driver.quit();
	}

}
