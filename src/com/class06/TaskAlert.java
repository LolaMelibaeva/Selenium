package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAlert {
/*TC 1: JavaScript alert text verification
Open chrome browser
Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
Verify
alert box with text “I am an alert box!” is present
confirm box with text “Press a button!” is present
prompt box with text “Please enter your name” is present
Quit browser*/
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Text of alert test is: "+alertText);
		alert.accept();
		String expected="I am an alert box!";
		if (alertText.equals(expected)) {
			System.out.println("Alert box with text 'I am an alert box!' is present ");
			
		}
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();;
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		String alertText1=alert.getText();
		System.out.println("Text of alert test is: "+alertText1);
		alert1.accept();
		String expected1="Press a button!";
		if (alertText1.equals(expected1)) {
			System.out.println("Alert box with text 'Press a button!' is present ");
		
		}
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();;
		Thread.sleep(2000);
		Alert alert2=driver.switchTo().alert();
		String alertText2=alert2.getText();
		System.out.println("Text of alert test is: "+alertText2);
		alert2.accept();
		String expected2="Please enter your name";
		if (alertText2.equals(expected2)) {
			System.out.println("Alert box with text 'Please enter your name' is present ");
		
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
