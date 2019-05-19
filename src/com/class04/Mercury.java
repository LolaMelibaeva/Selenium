package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		
		/*Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Lola");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Meli");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("347-487-7812");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("lolameli@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Chestnut Street");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Philadelphia");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Pennsylvania");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("18041");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'ma')]")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'reg')]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}


