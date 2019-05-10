package com.class01;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.mozilla.org/en-US/firefox");
		driver.manage().window().maximize();

	}

}
