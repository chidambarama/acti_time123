package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

	public HomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[.='Tasks']") private WebElement taskBu;
	@FindBy(xpath = "//div[.='Reports']") private WebElement reportBu;
	@FindBy(xpath = "//div[.='Users']") private WebElement usrsrBu;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutu;
	
	
	
	public void  clickonTasks()
	{
	
		taskBu.click();
	}
	
	public void  clickonReports()
	{
	
		reportBu.click();
	}
	
	public void  clickonUsers()
	{
	
		usrsrBu.click();
	}
	
	public void  clickonlogout()
	{
	
		logoutu.click();
	}
	
}	
