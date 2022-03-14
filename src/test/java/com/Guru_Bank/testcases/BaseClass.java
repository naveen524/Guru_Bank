package com.Guru_Bank.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL1="https://demo.guru99.com/V1/index.php";
	public String userName1="mngr391866";
	public String Password1="nYmAdys";

	public String baseURL2="https://www.flipkart.com/";
	public String userName2="Enter username";
	public String Password2="Enter password";

	public String baseURL3="https://www.facebook.com/";
	public String userName3="Enter username";
	public String Password3="Enter password";

	public String baseURL4="https://demo.guru99.com/V1/index.php";
	public String userName4="mngr391866";
	public String Password4="nYmAdys";

	public static WebDriver driver;
	@BeforeClass
	public void setUp() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		Thread.sleep(3000);
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
