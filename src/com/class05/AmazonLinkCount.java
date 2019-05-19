package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkCount {
/*TC 1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text*/
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		Iterator <WebElement>it=links.iterator();
		while(it.hasNext()) {
			String textLink= it.next().getText();
			
			if(!textLink.isEmpty()) {
				System.out.println(textLink);
				count++;
				
			}
		}
		System.out.println("Total number of links with text are " +count);
		driver.quit();
	}

}
