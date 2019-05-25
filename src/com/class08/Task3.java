package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement element=driver.findElement(By.cssSelector("input#password"));
		Actions action=new Actions(driver);
		element.sendKeys("password");
		action.doubleClick(element).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
