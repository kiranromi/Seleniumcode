package com.itlearn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	 public ConfigDataProvider () {
		 File file= new File("./configuration/config.properties");
		
		 try {
		 FileInputStream fis =  new FileInputStream (file); 
			
		 pro = new Properties ();
		 pro.load(fis);
		 }
		 catch(Exception e)
		 {
			 System.out.println("The file is not loaded");
		 }
		 }
	 
	 public String getBrowser() {
		 return pro.getProperty("browser");
	 }
	 public String getUrl() {
		 
		 return pro.getProperty("url");
	 }

}
