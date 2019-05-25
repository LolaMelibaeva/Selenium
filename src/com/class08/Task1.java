package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://www.toolsqa.com");
		WebElement hoverOver=driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions action=new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
