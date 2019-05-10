package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
/*TC 1: Amazon Page Title Verification:
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed*/
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://amazon.com");
				driver.getTitle();
				System.out.println(driver.getTitle());
				
				String expected=driver.getTitle();
				String actual=("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
				
				if (expected.equalsIgnoreCase(actual)) {
					
					System.out.println("This is the right title.");
				}else {
					System.out.println("Sorry, this is not the right title.");
				}
				
				
				
				driver.close();
		

	}

}
