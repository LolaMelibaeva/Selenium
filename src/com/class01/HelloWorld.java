package com.class01;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {

	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
	/*	WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		  System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());*/
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("http://google.com");	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");		 
		driver.get("https://www.facebook.com");
		
		
		
		
	}

}
