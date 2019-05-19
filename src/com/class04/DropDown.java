package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		 
		          
		       // System Property for Chrome Driver   
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");  
		  
		        // Instantiate a ChromeDriver class.      
		        WebDriver driver=new ChromeDriver();  
		  
		        // Launch Website  
		        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
		  
		  Thread.sleep(3000);
		//Using Select class for selecting value from dropdown  
		      
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
		 Thread.sleep(3000);
		dropdown.selectByVisibleText("Database Testing");  
		 Thread.sleep(3000);
		  
		    // Close the Browser  
		        driver.close();  
		  
		  
		    }  
		}  
	