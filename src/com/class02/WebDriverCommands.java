package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("This is the right title");
		}
		else {
			System.out.println("Sorry, this is not the title");
		}
		
		driver.get("http://facebook.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		String title2=driver.getTitle();
		if(title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("Sorry, this is not the title");
		}
		driver.close();
	}

}
