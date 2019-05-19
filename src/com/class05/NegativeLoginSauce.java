package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLoginSauce {
/*Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”*/
	public static void main(String[] args) throws InterruptedException {
		String username="Lola";
		String password="pass";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);driver.findElement(By.cssSelector("input#user-name")).sendKeys("username");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("pass");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		Thread.sleep(3000);
		WebElement error=driver.findElement(By.cssSelector("h3[data-test='error']"));
		String errorText=error.getText();
		String errMessage="Username and password do not match any user in this service";
		Thread.sleep(3000);
		if (errorText.contains(errMessage)){
			System.out.println("Yes, it is true. The error contains the message");
			Thread.sleep(3000);
		}else {
			System.out.println("No, it is false. The error does not contain the message");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
