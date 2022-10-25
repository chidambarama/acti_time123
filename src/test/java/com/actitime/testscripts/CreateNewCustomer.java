package com.actitime.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.config.CommonSetup;
import com.actitime.pages.CreateCustomerPage;
import com.actitime.pages.HomePage;
import com.actitime.pages.TaskPage;
import com.actitime.utilities.WebDriverUtils;

public class CreateNewCustomer extends CommonSetup 
{

	
	@Test(priority = 1)
	
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		WebDriverUtils a1=new WebDriverUtils();
		HomePage hp=new HomePage(driver);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		hp.clickonTasks();
		Thread.sleep(5000);
		TaskPage tp=new TaskPage(driver);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		tp.AddNewCust();
		Thread.sleep(3000);
		CreateCustomerPage a2=new CreateCustomerPage(driver);
		
	
		//System.out.println(s1);
		a2.createNewCust(a1.readtestdata("./chidu.xlsx", "Sheet1", 0, 0));
		Thread.sleep(2000);
		
		
		
	}
	
	@Test(priority = 2)
	public void createCustomer1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		WebDriverUtils a1=new WebDriverUtils();
		HomePage hp=new HomePage(driver);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		hp.clickonTasks();
		Thread.sleep(5000);
		TaskPage tp=new TaskPage(driver);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		tp.AddNewCust();
		Thread.sleep(3000);
		CreateCustomerPage a2=new CreateCustomerPage(driver);
		
	
		//System.out.println(s1);
		a2.createNewCust(a1.readtestdata("./chidu.xlsx", "Sheet1", 1, 0),a1.readtestdata("./chidu.xlsx", "Sheet1", 1, 1));
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
}
