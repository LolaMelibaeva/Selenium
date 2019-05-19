package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'account?')]")).click();
		
		////a[text()='Forgot account?']
		//a[starts-with(text(),'Forgot ')]
		
		Thread.sleep(2000);
		driver.navigate().back();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Syntax123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
