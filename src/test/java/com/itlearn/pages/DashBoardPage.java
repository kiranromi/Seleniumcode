package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	public DashBoardPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	} 
	
	@FindBy(xpath= "//*[@id=\"login-list\"]/li[1]/a") WebElement dashboard;
	@FindBy(xpath= "//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a") WebElement offeredacedemy;
	@FindBy(xpath= "//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button") WebElement subscribenow;
	
	
	public void dashboardmethods() {
		
		dashboard.click();
		offeredacedemy.click();
		subscribenow.click();
		
	}

}
