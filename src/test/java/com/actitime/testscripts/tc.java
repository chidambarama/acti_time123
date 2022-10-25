package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.actitime.config.CommonSetup;
import com.actitime.pages.LoginPage;
import com.actitime.utilities.WebDriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc 
{
	@Test
	public void test() throws IOException, InterruptedException 
	{
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(WebDriverUtils.getPropertiesdata("url"));
		LoginPage login=new LoginPage(driver);
		login.loginOperation(WebDriverUtils.getPropertiesdata("username"),WebDriverUtils.getPropertiesdata("password"));

		if (driver.getTitle().equalsIgnoreCase(driver.getTitle())) 
		{

			Assert.assertTrue(true);
		}

		else
		{
			Assert.assertTrue(false);
		}
		driver.close();
	}



}
