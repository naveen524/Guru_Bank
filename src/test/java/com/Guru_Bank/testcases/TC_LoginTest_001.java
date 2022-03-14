package com.Guru_Bank.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Guru_Bank.pageobjectmodel.Facebook_Login;
import com.Guru_Bank.pageobjectmodel.Flipkart_Login;
import com.Guru_Bank.pageobjectmodel.Login_Page;
import com.Guru_Bank.utilities.Flipkart_Utility;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL1);
		Login_Page lp1 = new Login_Page(driver);
		lp1.setUserName1(userName1);
		Thread.sleep(2000);
		lp1.setPassword1(Password1);
		Thread.sleep(2000);
		lp1.clickSubmit1();
		Thread.sleep(4000);
		List<WebElement> alllinks1 = driver.findElements(By.xpath("//a"));
		int count1 = alllinks1.size();
		System.out.println(count1);
		for(int i=0;i<count1;i++)
		{
			String text = alllinks1.get(i).getText();
			System.out.println(text);
		}
		String title1 = driver.getTitle();
		System.out.println(title1);
		String currenturl1 = driver.getCurrentUrl();
		System.out.println(currenturl1);
		
		
		
		driver.get(baseURL2);
		Flipkart_Login lp2 = new Flipkart_Login(driver);
		driver.navigate().refresh();
		lp2.setUserName2(userName2);
		Thread.sleep(2000);
		lp2.setPassword2(Password2);
		Thread.sleep(2000);
		lp2.clickSubmit2();
		Thread.sleep(4000);
		List<WebElement> alllinks2 = driver.findElements(By.xpath("//a"));
		int count2 = alllinks2.size();
		System.out.println(count2);
		for(int i=0;i<count2;i++)
		{
			String text = alllinks2.get(i).getText();
			System.out.println(text);
		}
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currenturl2 = driver.getCurrentUrl();
		System.out.println(currenturl2);
		
		
		
		driver.get(baseURL3);
		Facebook_Login lp3= new Facebook_Login(driver);
		lp3.setUserName3(userName3);
		Thread.sleep(2000);
		lp3.setPassword3(Password3);
		Thread.sleep(2000);
		lp3.clickSubmit3();
		Thread.sleep(4000);
		List<WebElement> alllinks3 = driver.findElements(By.xpath("//a"));
		int count3 = alllinks1.size();
		System.out.println(count3);
		for(int i=0;i<count3;i++)
		{
			String text = alllinks3.get(i).getText();
			System.out.println(text);
		}
		String title3 = driver.getTitle();
		System.out.println(title1);
		String currenturl3 = driver.getCurrentUrl();
		System.out.println(currenturl1);
		
		
		if(baseURL2.equals(baseURL3))
		{
			Assert.assertTrue(true);
			System.out.println("both urls are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("both urls are not equals");
		}

		if(alllinks2.equals(alllinks3))
		{
			Assert.assertTrue(true);
			System.out.println("both links are equals");	
		}
		else {
			Assert.assertFalse(false);
			System.out.println("both links are not equals");
		}
	
		if(title2.equals(title3))
		{
			Assert.assertTrue(true);
			System.out.println("both titles are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("both titles are not equals");
		}
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("./Screenshots/screenshot.png");
		FileUtils.copyFile(source, destination);
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			//Utility.takes_Screenshot(driver, result.getName());
			Flipkart_Utility.takes_Screenshot(driver, result.getName());
		}
		driver.close();
	}
}

