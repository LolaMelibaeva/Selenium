package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser*/

public class TCAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement departments=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		
		Select deps=new Select(departments);
		
		List<WebElement> getAllDepartOpt=deps.getOptions();
		int numDepartments=getAllDepartOpt.size();
		System.out.println("The number of departments availabe on amazon is: "+numDepartments);
		System.out.println("Amazon departments are: ");
		Thread.sleep(3000);
		for (WebElement printDepart: getAllDepartOpt) {
			System.out.println(printDepart.getText());
		}
		
		deps.selectByVisibleText("Computers");
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
