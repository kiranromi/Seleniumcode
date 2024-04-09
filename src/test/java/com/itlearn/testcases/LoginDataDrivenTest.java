package com.itlearn.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;
import com.itlearn.utilities.ReadExcelFile;

public class LoginDataDrivenTest extends BaseClass {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\text.xlsx";
	@Test(dataProvider="loginmutiple")
	void verifyLogin(String username,String pass) {
		
		LoginPage lp= new LoginPage(driver);
		
		lp.loginPortal(username, pass);
		
		if(username.equals("Demo12")&& pass.equals("Test123456$"))
		{
			Assert.assertTrue(true);
			lp.logout();
		}
			else
			{
				Assert.assertTrue(false);
			}
		
		
	}
	
	@DataProvider
   public String [][] loginmutiple() {
		
		System.out.println(fileName);
	   int rows = ReadExcelFile.getRowCount(fileName,  "Login");
	   System.out.println(rows);
	   int coluns = ReadExcelFile.getColCount(fileName, "Login");
	   System.out.println(coluns);
	   
	   String data[][] =new String[rows-1][coluns];
	   
	    for(int r=1; r<rows; r++) {
	    	for(int c= 0; c<coluns;c++){
	    		data[r-1][c]=ReadExcelFile.getCellValue(fileName, "Login", r, c);
	    	}
	    }
	    return data;
	   
   }
	
}
