package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;
public class Task4 extends CommonMethods {
	




	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://jqueryui.com/droppable");
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement box=driver.findElement(By.cssSelector("div#draggable"));
		WebElement box2=driver.findElement(By.cssSelector("div#droppable"));
		Actions action=new Actions(driver);
		action.clickAndHold(box).moveToElement(box2).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();

	}

}



