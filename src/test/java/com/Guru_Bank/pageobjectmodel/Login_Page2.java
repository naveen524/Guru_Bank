package com.Guru_Bank.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page2 {
	//	User ID :	mngr377966
	//	Password :	Gurubank@143

	public WebDriver idriver;
	 public Login_Page2(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtUserName;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(name="btnLogin")
	WebElement clickSubmit;

	public void setUserName(String userName)
	{
		txtUserName.sendKeys(userName);
	}
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	public void clickSubmit()
	{
		clickSubmit.click();
	}
}
