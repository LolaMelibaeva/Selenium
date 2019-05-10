package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lola Melibaeva\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.syntaxtechs.com");
		
		String url=driver.getTitle();
		System.out.println(url);
		driver.close();
	}

}
