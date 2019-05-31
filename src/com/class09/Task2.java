package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

/*
 * C 2: Verify element is clickable1.Open chrome browser
 * 2.Go to “https://the-internet.herokuapp.com/”
 * 3.Click on “Click on the “Dynamic Controls” link
 * 4.Select checkbox and click Remove
 * 5.Click on Add button and verify “It's back!” text is displayed
 * 6.Close the browser
 */
public class Task2 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id='message']"));
		
		if (ele.isDisplayed()) {
			String text=ele.getText();
			System.out.println("The text '"+text +"' is displayed");
		}else {
			System.out.println("The text is not displayed.");
		}
			driver.quit();
	}
	

}
