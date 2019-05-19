package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Second {
	
		  
	    public static void main(String[] args) throws InterruptedException {  
	          
	          // System Property for Gecko Driver   
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\geckodriver.exe");
	          
	         // Initialize Gecko Driver using Desired Capabilities Class  
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	        capabilities.setCapability("marionette",true);  
	        WebDriver driver= new FirefoxDriver(capabilities);  
	          
	        // Launch Website  
	     driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
	     Thread.sleep(2000);
	      
	        // Fetch the text "This is sample text." and print it on console  
	        // Use the class name of the div to locate it and then fetch text using getText() method  
	     String sampleText = driver.findElement(By.className("col-md-12")).getText();  
	     System.out.println(sampleText);  
	     Thread.sleep(2000);
	          // Use the linkText locator method to find the link and perform click using click() method  
	     driver.findElement(By.linkText("This is a link")).click();  
	     Thread.sleep(2000);
	          // Click on the textbox and send value  
	     driver.findElement(By.id("fname")).sendKeys("JavaTpoint");  
	     Thread.sleep(2000);
	        // Clear the text written in the textbox  
	     driver.findElement(By.id("fname")).clear();  
	     Thread.sleep(2000);
	        // Click on the Submit button using click() command  
	     driver.findElement(By.id("idOfButton")).click();  
	     Thread.sleep(2000);
	        // Locate the radio button by id and check it using click() function  
	     driver.findElement(By.id("male")).click();  
	     Thread.sleep(2000);
	        // Locate the checkbox by cssSelector and check it using click() function  
	     driver.findElement(By.cssSelector("input.Automation")).click();  
	     Thread.sleep(2000);
	        // Use Select class for selecting value from dropdown  
	    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
	    dropdown.selectByVisibleText("Automation Testing");  
	    Thread.sleep(2000);
	        // Close the Browser  
	              
	      
	    }  
	  
	}  


