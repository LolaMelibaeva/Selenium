package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Lola");
		driver.findElement(By.name("lastName")).sendKeys("Meli");
		driver.findElement(By.name("phone")).sendKeys("230-456-4567");
		driver.findElement(By.name("userName")).sendKeys("lolam79@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123 Walnut Street");
		driver.findElement(By.name("city")).sendKeys("Frederick");
		driver.findElement(By.name("state")).sendKeys("Maryland");
		driver.findElement(By.name("postalCode")).sendKeys("21704");
		driver.findElement(By.id("email")).sendKeys("lolam79@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Frederick@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Frederick@123");
		driver.findElement(By.name("register")).submit();		
		
		driver.close();
		
	}

}
