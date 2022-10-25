package com.actitime.config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import com.actitime.utilities.WebDriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSetup{
	public static  WebDriver driver;

	@BeforeClass
	//@Parameters("browser")
	public  void setup() throws IOException
	{
	
		//if (browser.equalsIgnoreCase("firefox"))
			
			//	{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

				//}
		
		
		//else if(browser.equalsIgnoreCase("chrome"))
		//{
			//WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
		//}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(WebDriverUtils.getPropertiesdata("url"));


	}


	@BeforeMethod
	public  void loginP() throws InterruptedException, IOException
	{
		LoginPage login=new LoginPage(driver);
		login.loginOperation(WebDriverUtils.getPropertiesdata("username"),WebDriverUtils.getPropertiesdata("password"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

	}


	@AfterMethod
	public void logout() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.clickonlogout();
	}




	@AfterClass
	public  void teardown(){
		driver.quit();
	}
}
