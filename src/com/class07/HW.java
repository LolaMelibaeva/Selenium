package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
/*TC 1: ToolsQA Windows verification
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Multiple Windows” link
Click on “Elemental Selenium”
Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
Close second window
Click on “Click Here” link
Verify title if newly open window is “New Window”
Close second window
Verify title of second window is “The Internet”
Quit browser
NOTE: Selenium execution could be too fast, please use Thread.sleep*/

public class HW extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(3000);
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		String parentWindowID=it.next();		
		System.out.println("1 Parent window id "+parentWindowID);
		String childWindowID=it.next();		
		System.out.println("1 Child window id "+childWindowID);
					
		driver.switchTo().window(childWindowID);
		String titleChildWindowID=driver.getTitle();
		System.out.println("The title of child window is "+titleChildWindowID);
		String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		if (titleChildWindowID.equals(expectedTitle)) {
			System.out.println("The title text is valid");
		}else {
			System.out.println("The title text is NOT valid");
		}
		 
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		windows=driver.getWindowHandles();
		Iterator<String> it2=windows.iterator();
		String parentWindowID2=it2.next();	
		
		System.out.println("2 Parent window id "+parentWindowID2);
		Thread.sleep(2000);
		String childWindowID2=it2.next();		
		Thread.sleep(2000);
		System.out.println("2 Child window id "+childWindowID2);
		
			
		Thread.sleep(2000);
		driver.switchTo().window(childWindowID2);
				
		
		String titleChildWindowID2=driver.getTitle();		
		String expectedTitle2="New Window";
		System.out.println("The title of 2 child window is "+titleChildWindowID2);
		if(titleChildWindowID2.equals(expectedTitle2)) {
			System.out.println("Newly opened window title is valid");
		}else {
			System.out.println("Newly opened window title is NOT valid");
		}
		
				
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowID2);
		Thread.sleep(2000);

		String titleParentWindowID2=driver.getTitle();
		System.out.println("The title of the parent window is " +titleParentWindowID2);
		String titleExpected2="The Internet";
		if (titleParentWindowID2.equals(titleExpected2)) {
			System.out.println("The title of the parent window is valid");
		}else {
			System.out.println("The title of the parent window is NOT valid");
		}
		driver.quit();
	}

}
