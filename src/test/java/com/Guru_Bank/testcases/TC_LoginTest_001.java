package com.Guru_Bank.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru_Bank.pageobjectmodel.Login_Page;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		Login_Page lp = new Login_Page(driver);
		lp.setUserName(userName);
		lp.setPassword(Password);
		lp.clickSubmit();
		if(driver.getTitle().equals("Welcome To Manager's Page of GTPL Bank"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
}
