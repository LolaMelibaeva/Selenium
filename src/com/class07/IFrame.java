package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class IFrame extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
////		Way 1; name 
//		driver.switchTo().frame("Iframe");
//		//Way 2 webelelement 
//		WebElement ele = driver.findElement(By.cssSelector("input#name"));
//		driver.switchTo().frame(ele);
//		//Way 3 //index
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Lola");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();

	}

}
