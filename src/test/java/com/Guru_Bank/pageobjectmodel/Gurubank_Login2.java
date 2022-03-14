package com.Guru_Bank.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gurubank_Login2 {
	public static WebDriver driver;
	public WebDriver idriver;
	public Gurubank_Login2(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtUserName4;
	@FindBy(name="password")
	WebElement txtPassword4;
	@FindBy(name="btnLogin")
	WebElement clickSubmit4;
	
	public void setUserName4(String userName4)
	{
		txtUserName4.sendKeys(userName4);
	}
	public void setPassword4(String Password4)
	{
		txtPassword4.sendKeys(Password4);
	}
	public void clickSubmit4()
	{
		clickSubmit4.click();
	}
}
