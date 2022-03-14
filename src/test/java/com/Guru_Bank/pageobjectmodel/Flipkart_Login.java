package com.Guru_Bank.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Login {
	public static WebDriver driver;
	public WebDriver idriver;
	public Flipkart_Login(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement txtUserName2;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement txtPassword2;
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	WebElement clickSubmit2;
	public void setUserName2(String userName2)
	{
		txtUserName2.sendKeys(userName2);
	}
	public void setPassword2(String Password2)
	{
		txtPassword2.sendKeys(Password2);
	}
	public void clickSubmit2()
	{
		clickSubmit2.click();
	}
}
