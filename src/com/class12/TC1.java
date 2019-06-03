package com.class12;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TC1 extends CommonMethods{
	Properties prop;
/*TC 1: OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file*/
	   @Test
	    public void login() {
	        String path="configs\\credentials.properties";
	        try {
	            FileInputStream fis=new FileInputStream(path);
	            prop=new Properties();
	            prop.load(fis);
	            
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        String browser=prop.getProperty("browser");
	        String url=prop.getProperty("url");
	        String login=prop.getProperty("username");
	        String password=prop.getProperty("password");
	        
	        setUpDriver(browser, url);
	        sendText(driver.findElement(By.cssSelector("input#txtUsername")),login);
	        sendText(driver.findElement(By.cssSelector("input#txtPassword")),password);
	        click(driver.findElement(By.cssSelector("input#btnLogin")));
	        
	    }
	
	@AfterClass
	public void tearDown() {
		CommonMethods.driver.quit();
	}
	
}
