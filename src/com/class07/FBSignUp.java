package com.class07;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class FBSignUp extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Lucy");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_e")).sendKeys("Cirus");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("lycysyntax@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Syntax@123");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Syntax@123");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		Select obj=new Select(month);
		obj.selectByVisibleText("Feb");
		Thread.sleep(1000);
		WebElement days= driver.findElement(By.cssSelector("select#day"));
		Select obj2=new Select(days);
		obj2.selectByVisibleText("15");
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.cssSelector("select#year"));
		Select obj3=new Select(year);
		obj3.selectByIndex(20);
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='sex']")).click();
		 Thread.sleep(1000);
		 WebElement pronoun=driver.findElement(By.cssSelector("select[name='preferred_pronoun']"));
	        Select pr=new Select(pronoun);
	        pr.selectByValue("6");
	        
	        driver.findElement(By.cssSelector("input[name='custom_gender']")).sendKeys("ono");
	        Thread.sleep(1000);
		 driver.close();
		

	}

}
