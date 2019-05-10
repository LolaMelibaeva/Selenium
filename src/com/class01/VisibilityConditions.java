package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibilityConditions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		//object and variable instantiation
		WebDriver driver=new FirefoxDriver();
		String appUrl="https://google.com";
		
		// launch the Firefox browser and open the application url
		driver.get(appUrl);
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//declare and initialize the variable to store the expected title of the webpage.
		
		String expectedTitle="Google";
		
		//fetch the title of the web page and save it into a string variable
		String actualTitle=driver.getTitle();
		
		//compare the expected title of the page with the actual title of the page and print result
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
		}
		else {
			
			System.out.println("Verification Failed -An incorrect title is displayed on the web page.");
		}
		
		
		//verify if the "Google Search" button is displayed and print the result
		
		boolean submitbuttonPresence=driver.findElement(By.id("Google Search")).isDisplayed();
		System.out.println(submitbuttonPresence);
		
		//enter the keyword in the "Google Search" text box by which we would want to make the request
		
		WebElement searchTextBox=driver.findElement(By.id("Google Search"));
		
		searchTextBox.clear();
		searchTextBox.sendKeys("Selenium");
		
		//verify that the "Search button" is displayed and enabled
		boolean searchIconPresence=driver.findElement(By.id("Google Search")).isDisplayed();
		boolean searchIconEnabled=driver.findElement(By.id("Google Search")).isEnabled();
		
		if(searchIconPresence==true && searchIconEnabled==true) {
			//click on the search button
			WebElement searchIcon=driver.findElement(By.id("Google Search"));
			searchIcon.click();
			
			
		}
		//close the web browser
		driver.close();
		System.out.println("Test script executed successfully");
		
		
		//terminated the program
		System.exit(0);
	}
		
	}


