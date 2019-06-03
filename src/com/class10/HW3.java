package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class HW3 extends CommonMethods {
/*
 * TC 1: Table headers and rows verification
 * 1.Open chrome browser
 * 2.Go to “https://jqueryui.com/”
 * 3.Click on “Datepicker”
 * 4.Select August 10 of 2019
 * 5.Verify date “08/10/2019” has been entered successfully
 * 6.Close browser
 */
	public static void main(String[] args) throws InterruptedException {
		String url="https://jqueryui.com";
		
		setUpDriver("chrome", url);
		click(driver.findElement(By.xpath("//a[text()='Datepicker']")));
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		click(driver.findElement(By.id("datepicker")));
		
		String xpath="//span[@class='ui-datepicker-month']";	
		
		
			do {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
			}	
			
			while(!driver.findElement(By.xpath(xpath)).getText().equals("August")) ;
			
			Thread.sleep(1000);
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td "));
		
		for (WebElement row:rows) {
			String rowText=row.getText();
			if(rowText.contains("10")) {
				row.click();
				break;
				
			}
		}
		String expectedValue="08/10/2019";
		String date=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
		
		if (date.equals(expectedValue)) {
		System.out.println("The date "+date+" successfully entered");
		}else {
			System.out.println("The date"+date+ "is NOT entered correctly");
		}
		driver.close();
		}
	}


