package com.Guru_Bank.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login {
	public static WebDriver driver;
	public WebDriver idriver;
	public Facebook_Login(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id = "email")
	WebElement txtUserName3;
	@FindBy(id = "pass")
	WebElement txtPassword3;
	@FindBy(name = "login")
	WebElement clickSubmit3;
	public void setUserName3(String userName3)
	{
		txtUserName3.sendKeys(userName3);
	}
	public void setPassword3(String Password3)
	{
		txtPassword3.sendKeys(Password3);
	}
	public void clickSubmit3()
	{
		clickSubmit3.click();
	}
}
