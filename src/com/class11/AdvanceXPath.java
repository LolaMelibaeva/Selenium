package com.class11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class AdvanceXPath extends CommonMethods{

	public static void main(String[] args) {
	/*TC 1: OrangeHRM Login
	 * 1.Navigate to “https://opensource-demo.orangehrmlive.com/”
	 * 2.Login to the application by writing xpath based on “parent and child relation”
	 * TC 1: OrangeHRM Login
	 * 3.Navigate to “https://opensource-demo.orangehrmlive.com/”
	 * 4.Login to the application by writing xpath based on “following and preceding siblings”	
	 */
		
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
//		//1. if Parent is having unique identification
//		
//		sendText(driver.findElement(By.xpath("//div[@id='divUsername']/input")), "Admin");
//		
//		//2. if immediate child is having unique identification
//		
//		
//	    sendText(driver.findElement(By.xpath("//div[@id='divPassword']/input")),"admin123");
//	    
//	    clickElement(driver.findElement(By.xpath("//div[@id='divLoginButton']/input")));
	    
	    
	    
		
		//3. if the next element is having unique identificaiton
		sendText(driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")),"Admin");
		
		//4. if the previous element is having unique identification
		
		sendText(driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input[@name='txtPassword']")), "admin123");		
		click(driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input")));
	}

}
