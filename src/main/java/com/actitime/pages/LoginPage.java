package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver;
	public LoginPage(  WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']") private WebElement usr;
	@FindBy(xpath="//input[@name='pwd']") private WebElement pass;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginB;
	
	
	
	public  void loginOperation(String username, String password) throws InterruptedException
	{
			Thread.sleep(2000);
			usr.sendKeys(username);
			Thread.sleep(2000);
			pass.sendKeys(password);
			Thread.sleep(2000);
			loginB.click();
		
		
		
	}
	
	
}
