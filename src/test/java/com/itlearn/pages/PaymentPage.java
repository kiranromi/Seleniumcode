package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver driver;
	public PaymentPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= " //*[@id=\"learn-press-payment\"]/ul/li/label") WebElement paystipe;
	@FindBy(xpath= "//*[@id=\"learn-press-checkout-place-order\"] ") WebElement placeorder;
	

}
