package com.Guru_Bank.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String userName="mngr377966";
	public String Password="Gurubank@43";
	public static WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
