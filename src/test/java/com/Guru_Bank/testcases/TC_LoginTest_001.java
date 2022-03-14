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
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Guru_Bank.pageobjectmodel.Facebook_Login;
import com.Guru_Bank.pageobjectmodel.Flipkart_Login;
import com.Guru_Bank.pageobjectmodel.Gurubank_Login;
import com.Guru_Bank.pageobjectmodel.Gurubank_Login2;
import com.Guru_Bank.utilities.Flipkart_Utility;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL1);
		Gurubank_Login lp1 = new Gurubank_Login(driver);
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

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
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

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
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
		System.out.println(currenturl3);

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

		driver.get(baseURL4);
		Gurubank_Login2 lp4 = new Gurubank_Login2(driver);
		lp4.setUserName4(userName4);
		Thread.sleep(2000);
		lp4.setPassword4(Password4);
		Thread.sleep(2000);
		lp4.clickSubmit4();
		Thread.sleep(4000);
		List<WebElement> alllinks4 = driver.findElements(By.xpath("//a"));
		int count4 = alllinks1.size();
		System.out.println(count4);
		for(int i=0;i<count4;i++)
		{
			String text = alllinks4.get(i).getText();
			System.out.println(text);
		}
		String title4 = driver.getTitle();
		System.out.println(title4);
		String currenturl4 = driver.getCurrentUrl();
		System.out.println(currenturl4);

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

		if(baseURL1.equals(baseURL2))
		{
			Assert.assertTrue(true);
			System.out.println("Gurubank and flipkart urls are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("Gurubank and flipkart urls are not equals");
		}

		if(alllinks1.equals(alllinks2))
		{
			Assert.assertTrue(true);
			System.out.println("Gurubank and flipkart links are equals");	
		}
		else {
			Assert.assertFalse(false);
			System.out.println("Gurubank and flipkart links are not equals");
		}

		if(title1.equals(title2))
		{
			Assert.assertTrue(true);
			System.out.println("Gurubank and flipkart titles are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("Gurubank and flipkart titles are not equals");
		}

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

		if(baseURL2.equals(baseURL3))
		{
			Assert.assertTrue(true);
			System.out.println("flipkart and facebook urls are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("flipkart and facebook urls are not equals");
		}

		if(alllinks2.equals(alllinks3))
		{
			Assert.assertTrue(true);
			System.out.println("flipkart and facebook links are equals");	
		}
		else {
			Assert.assertFalse(false);
			System.out.println("flipkart and facebook links are not equals");
		}

		if(title2.equals(title3))
		{
			Assert.assertTrue(true);
			System.out.println("flipkart and facebook titles are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("flipkart and facebook titles are not equals");
		}

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

		if(baseURL3.equals(baseURL4))
		{
			Assert.assertTrue(true);
			System.out.println("facebook and Gurubank4 urls are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("facebook and Gurubank4 urls are not equals");
		}

		if(alllinks3.equals(alllinks4))
		{
			Assert.assertTrue(true);
			System.out.println("facebook and Gurubank4 links are equals");	
		}
		else {
			Assert.assertFalse(false);
			System.out.println("facebook and Gurubank4 links are not equals");
		}

		if(title3.equals(title4))
		{
			Assert.assertTrue(true);
			System.out.println("facebook and Gurubank4 titles are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("facebook and Gurubank4 titles are not equals");
		}

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		if(baseURL1.equals(baseURL4))
		{
			Assert.assertTrue(true);
			System.out.println("Gurubank and Gurubank2 urls are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("Gurubank and Gurubank2 urls are not equals");
		}

		if(alllinks1.equals(alllinks4))
		{
			Assert.assertTrue(true);
			System.out.println("Gurubank and Gurubank2 links are equals");	
		}
		else {
			Assert.assertFalse(false);
			System.out.println("Gurubank and Gurubank2 links are not equals");
		}

		if(title1.equals(title4))
		{
			Assert.assertTrue(true);
			System.out.println("Gurubank and Gurubank2 titles are equals");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("Gurubank and Gurubank2 titles are not equals");
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

