package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_command {

	public static void main(String[] args) {
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");	
		driver.manage().window().maximize();
		
		//Storing Title name in the String variable
		String title=driver.getTitle();
		
		
		//Storing Title length in the Int variable
		int titleLength=driver.getTitle().length();
		
		//Printing Title % Title length in the Console window
		System.out.println("Title of the page is : "+title);
		System.out.println("Length of the title is : "+titleLength);
		
		//Storing URL in String variable
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals("http://google.com")) {
			System.out.println("Verification Successful - The correct Url is opened.");
		}else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
		}
		
		//Storing Page Source in String variable
		
		String pageSource=driver.getPageSource();
		
		//Storing Page Source length in Int variable
		
		int pageSourcelength=pageSource.length();
		
		//Printing length of the Page Source on console
		System.out.println("Total length of the Page Source is : "+pageSourcelength);
		
		//Closing browser
		
		driver.close();
	}

}
