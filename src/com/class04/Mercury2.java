package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury2 {

	public static void main(String[] args) throws InterruptedException {
//				css=tag#id
//				css=
//				tag[attribute=’value’]
//				css=tag.class
//				css=tag^='value']     for starts with
//
//				css=tag$='value']     for ends with
//				css=tag*='value']     for contains
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Lola");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Meli");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys("347-487-7812");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#userName")).sendKeys("lolameli@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='address1']")).sendKeys("123 Chestnut Street");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("Philadelphia");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='state']")).sendKeys("Pennsylvania");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='post']")).sendKeys("18041");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='confirm']")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='image']")).click();
		Thread.sleep(2000);
		driver.close();

	
		
	}

}
