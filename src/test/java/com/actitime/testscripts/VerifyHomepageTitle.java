package com.actitime.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.config.CommonSetup;
import com.actitime.pages.HomePage;
import com.actitime.utilities.WebDriverUtils;

public class VerifyHomepageTitle extends CommonSetup 
{

	

	@Test
	public void homepage() throws IOException, InterruptedException
	{WebDriverUtils a1=new WebDriverUtils();
	

		if (driver.getTitle().equalsIgnoreCase(driver.getTitle()))
		{

			Assert.assertTrue(true);
		}

		else
		{
			a1.getFailedScreenShot("verifytitle", driver);
			Assert.assertTrue(false);


		}

	}




}
