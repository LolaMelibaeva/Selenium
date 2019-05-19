package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
	/*TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth    
Quit browser*/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		Select obj=new Select(month);
		Thread.sleep(2000);
		
		List <WebElement> values=obj.getOptions();
		int totalValues=values.size()-1;
		System.out.println("Total number of the months is: "+totalValues);
		Thread.sleep(2000);
		WebElement days= driver.findElement(By.cssSelector("select#day"));
		Select obj2=new Select(days);
		List<WebElement> num=obj2.getOptions();
		int totalValueDays=num.size()-1;
		System.out.println("Total number of the days is: "+totalValueDays);
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.cssSelector("select#year"));
		Select obj3=new Select(year);
		List<WebElement> numYear=obj3.getOptions();
		int totalValueOfYear=numYear.size()-1;
		System.out.println("Total number of the year is: "+totalValueOfYear);
		
		obj.selectByVisibleText("Feb");
		Thread.sleep(2000);
		obj2.selectByVisibleText("1");
		Thread.sleep(2000);
		obj3.selectByValue("1989");
		Thread.sleep(2000);
		driver.quit();
	}

}
