package com.class08;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task5 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
	
	 setUpDriver("chrome","http://demo.guru99.com/test/simple_context_menu.html" );
	WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action = new Actions(driver);
	action.contextClick(rightClick).perform();
	Thread.sleep(2000);
	driver.close();

}
}