package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (name= "search_course") WebElement searchcourse ;
	@FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchbutton;
	
	
// Search Page methods which perform operations on those WebElements
    public void search(String searchText) {
    
    	searchcourse.sendKeys(searchText) ;
    	searchbutton.click();

}
}