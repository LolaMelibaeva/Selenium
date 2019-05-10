package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		
		driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.lastName")).sendKeys("Snow");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("123 Walnut Street");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22206");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7890");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("125-81-2589");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("Mamluk123");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("College2019");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("College2019");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		driver.close();

	}

}
