package com.Guru_Bank.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;
	public WebDriver idriver;
	public Login_Page(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtUserName1;
	@FindBy(name="password")
	WebElement txtPassword1;
	@FindBy(name="btnLogin")
	WebElement clickSubmit1;
	
	public void setUserName1(String userName1)
	{
		txtUserName1.sendKeys(userName1);
	}
	public void setPassword1(String Password1)
	{
		txtPassword1.sendKeys(Password1);
	}
	public void clickSubmit1()
	{
		clickSubmit1.click();
	}
}
