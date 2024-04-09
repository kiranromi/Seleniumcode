package com.itlearn.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName, String urlName) {
		
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
        driver = new ChromeDriver();
		
	}else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        driver = new FirefoxDriver();
		
		
	}	
	else if (browserName.equals("IE")) {
		System.setProperty("webdriver.ie.driver", "./drivers/iedriver.exe");
        driver = new FirefoxDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.get(urlName);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;

}
}	
