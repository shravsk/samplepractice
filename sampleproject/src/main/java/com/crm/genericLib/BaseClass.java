package com.crm.genericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver d;
	CommonUtils c= new CommonUtils();
	
	@BeforeClass
	public void configBC() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:/Nikita/sampleproject/src/main/resources/chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Properties pobj=c.getPropertiesObj();
		String url=pobj.getProperty("url");
		d.get(url);
	}
	@BeforeMethod
	public void configBM()
	{
		
	}	
	@AfterMethod
	public void configAM()
	{
		
	}
	@AfterClass
	public void configAC()
	{
		
	}
}
