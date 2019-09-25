package com.class12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Documents\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("iPhone");
		driver.findElement(By.cssSelector("input[data-ved*='0ahUKEwix4pHaoIrkAhXG1VkKHdFADGgQ4dUDCAc']")).click();
		driver.close();
		
	}

}
