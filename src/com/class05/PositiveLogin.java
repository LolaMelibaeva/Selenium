package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveLogin {
	/*TC 1: Swag Labs Positive login:
Open chrome browser
Go to “""/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon***********/

	public static void main(String[] args) throws InterruptedException {
		
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#user-name")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		Thread.sleep(3000);
		boolean logoIsDisplayed =driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
		if (logoIsDisplayed) {
			System.out.println("Robot image is displayed");
		}else {
			System.out.println("Robot image is NOT displayed");
		}
		Thread.sleep(3000);
		WebElement product =driver.findElement(By.xpath("//div[@class='product_label']"));
		boolean displayProduct=product.isDisplayed();
		String value=product.getText();
		String expectedText="Products";
		Thread.sleep(3000);
		if (displayProduct && value.equals(expectedText)) {
			System.out.println("Element is displayed and text is " +value);
		}else {
			System.out.println("Element is NOT displayed and text is NOT  "+ value);
		}
		Thread.sleep(3000);
		driver.close();
	}

}
