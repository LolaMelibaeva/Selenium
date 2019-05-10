package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.syntaxtechs.com");
		Thread.sleep(1000);
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		String title=driver.getTitle();
		if (title.contains("Syntax")) {
			System.out.println("Url contain Syntax");
		}else {
			System.out.println("Sorry, url does not contain Syntax");
		}
		
		driver.close();

	}

}
