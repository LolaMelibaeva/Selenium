package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task7 extends CommonMethods {
/*
		/*
		 * Task Three
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click and hold on 1,2,3,4 boxes
Close the browser*/
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUpDriver("chrome","http://demo.guru99.com/test/drag_drop.html");
		WebElement drag=driver.findElement(By.xpath("//li[@data-id='2']"));
		WebElement drop=driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable']"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
	}

}
