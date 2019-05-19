package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	/*TC 1: Tools QA check all elements
Open chrome browser
Go to “https://www.toolsqa.com/automation-practice-form/”
Fill out:
First Name
Last Name
Check that sex radio buttons are enabled and select “Male”
Check all Years of Experience radio buttons are clickable
Date
Select both checkboxes for profession
Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
Quit browser*/

	public static void main(String[] args) throws InterruptedException {
		String userName="John";
		String lastName="Brown";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='sex-0']"));
		List <WebElement> sexes=driver.findElements(By.xpath("//label[text()='Sex']"));
		
		for (WebElement sexFM: sexes) {
			if (sexFM.isEnabled()) {
				maleRadioButton.click();
			}
		}
		List<WebElement> yearExpRadioButton = driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement radioButton: yearExpRadioButton) {
			if(radioButton.isEnabled()) {
				radioButton.click();
				Thread.sleep(1000);
			}}
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/18/2019");
		Thread.sleep(1000);
		
		List <WebElement> profession=driver.findElements(By.name("profession"));
		for (WebElement pros: profession) {
			
			if (pros.isEnabled()){
				pros.click();

				Thread.sleep(2000);
			}
			
		}
		
		
		List <WebElement> autoToolButton=driver.findElements(By.xpath("//input[@name='tool']"));
		for (WebElement tool:autoToolButton) {
			if(tool.isEnabled()) {
				tool.click();
				Thread.sleep(1000);
			}
		}
		
		for (WebElement tools:autoToolButton) {
			WebElement tool=driver.findElement(By.xpath("//input[@id='tool-2']"));
			
			Thread.sleep(1000);
			if (!tools.equals(tool)) {
				tools.click();
			}
		}
		Thread.sleep(1000);
		driver.quit();
		
	}

}
