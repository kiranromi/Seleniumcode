package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.DashBoardPage;
import com.itlearn.pages.LoginPage;
import com.itlearn.utilities.ReadExcelFile;

public class DashBoardTest extends BaseClass {
	String fileName= System.getProperty("user.dir")+ "\\TestData\\text.xlsx";
@Test
void verifyLogin() {
	
		  System.out.println(fileName);
		  LoginPage lp = new LoginPage(driver);
		  String username= ReadExcelFile.getCellValue(fileName, "Login", 1, 0);
		 
		  
		  String pass= ReadExcelFile.getCellValue(fileName, "Login",1 ,1);
		  
		  lp.loginPortal(username, pass);

}
@Test(dependsOnMethods= "verifyLogin" )
void dashBoardPageTest() {
	DashBoardPage dp = new DashBoardPage(driver);
	dp.dashboardmethods();
}
}