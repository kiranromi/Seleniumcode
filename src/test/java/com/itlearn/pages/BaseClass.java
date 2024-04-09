package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.itlearn.utilities.BrowserFactory;
import com.itlearn.utilities.ConfigDataProvider;

public class BaseClass {
	public WebDriver driver ;
	ConfigDataProvider cfd = new ConfigDataProvider();
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,cfd.getBrowser() ,cfd.getUrl() );
	}
	
	@AfterClass
	public void tearUp()
	{
		driver.close();
	}
	public void captureScreenShot() {
		
		
		
	}

}
