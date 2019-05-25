package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

/*
 * TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
 */
public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
		
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='finish']/h4"));
		
		if (ele.isDisplayed()) {
			String text=ele.getText();
			System.out.println(text);
		}else {
			System.out.println("Element is not displayed");
		}
		
		driver.quit();
		
	}
	

}
