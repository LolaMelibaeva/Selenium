package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainStartWith {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[contains(@data-test,'user')])")).sendKeys("standar_user");
		driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		
	}

}
