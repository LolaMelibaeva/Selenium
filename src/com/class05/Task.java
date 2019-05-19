package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> yearExpRadioButton = driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement radioButton: yearExpRadioButton) {
			if(radioButton.isEnabled()) {
				radioButton.click();
				Thread.sleep(1000);
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
