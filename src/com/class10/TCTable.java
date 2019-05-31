package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TCTable extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Table headers and rows verification
		 * 
		 * Open chrome browser Go to
		 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		 *  Login to the application
		 *   Verify customer “Susan McLaren” is present in the table
		 *    Click on customer details 
		 *    Update customers last name
		 *     Verify updated customers name is displayed in table
		 *      Close browser
		 */
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

		setUpDriver("chrome", url);
		WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(userName, "Tester");
		WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, "test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String newName="Susan Smith";
        String expectedValue="Susan McLaren";
		
        List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		
		
		
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		
			
			if(rowText.contains(expectedValue)) {
				
				driver.findElement(By.cssSelector("input[onclick*='editOrder$4']")).click();
				WebElement ele=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
				ele.clear();
				
				ele.sendKeys(newName);
				driver.findElement(By.linkText("Update")).click();
			
				 WebElement eleUpdated = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[2]"));
				String newLastName =eleUpdated.getText();
				 if (newName.equals(newLastName)) {
					System.out.println("The cell is updated with new lastname");
				}else {
					System.out.println("Please, verify your codes");
				}
			
        	}
		}
			Thread.sleep(5000);	
			driver.quit();
			  }	
					
				}
	
				
			
	


