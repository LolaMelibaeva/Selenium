package com.class09;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

/*
 * TC 3: Verify element is enabled1.Open chrome browser
 * 2.Go to “https://the-internet.herokuapp.com/”
 * 3.Click on “Click on the “Dynamic Controls” link
 * 4.Click on enable button
 * 5.Enter “Hello” and verify text is entered successfully
 * 6.Close the browser
 */
public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		
		String textToEnter="Hello";
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
		ele.sendKeys("Hello");		
		
		String enteredText=ele.getAttribute("value");
		if (enteredText.equals(textToEnter)) {
			
			System.out.println("The text "+textToEnter+" is entered successfully");
			
			
		}else {
			System.out.println("The text "+textToEnter+" is NOT entered");
		}
		
		driver.quit();
			}

}
