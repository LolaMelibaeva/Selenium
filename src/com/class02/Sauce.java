package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
