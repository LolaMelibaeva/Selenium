package com.class08;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task6 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
	
	 setUpDriver("chrome","http://demo.guru99.com/test/simple_context_menu.html" );
	WebElement doubleClick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions action=new Actions(driver);
	action.doubleClick(doubleClick).perform();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	driver.close();

}
}