package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		/*Open chrome browser
		Go to “https://www.facebook.com/”
		Enter valid username and valid password and click login
		User successfully logged in*/
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("Syntax123");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.navigate().back();
		driver.findElement(By.name("pass")).sendKeys("Syntax123");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		 driver.close();
		
		
	}

}
