package com.actitime.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileSystemUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class WebDriverUtils 
{

	public static String getPropertiesdata(String data) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/Logindata/login.properties");

		Properties p1=new Properties();			
		p1.load(fis);
		return p1.getProperty(data);

	}


	public void getFailedScreenShot( String tc,WebDriver driver) throws IOException
	{

		TakesScreenshot	tis=(TakesScreenshot)driver;
		File Src = tis.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\FailedScreenShot\\"+tc+"+.png");
		//File Target=new File(System.getProperty("user.dir")+"\\screenshot\\"+tcname+".png");
		Files.copy(Src, dest);
		System.out.println("screenshot captures=d");

	}
	
	
	
	public String readtestdata(String path, String Sheet, int row, int cell) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		Workbook   book=WorkbookFactory.create(new FileInputStream(path));
		return	book.getSheet(Sheet).getRow(row).getCell(cell).toString();
	}

}

