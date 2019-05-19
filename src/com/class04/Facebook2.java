package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Syntax123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value*='Log']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
