package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	void verify()
	{
		LoginPage lp= new LoginPage(driver);
		String username="Demo12";
		String password="Test123456$";
		lp.loginPortal(username, password);
	}
	
	


}
