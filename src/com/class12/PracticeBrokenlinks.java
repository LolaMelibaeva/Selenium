package com.class12;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class PracticeBrokenlinks extends CommonMethods {
	public static void main(String[] args) throws Exception {
		
		

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("img"));
		for (WebElement link: links) {
			String linkList=link.getAttribute("src");
		
		if(linkList!=null) {
			URL url=new URL(linkList);
			HttpURLConnection http=(HttpURLConnection)url.openConnection();
				int code=http.getResponseCode();
			String mess=http.getResponseMessage();
			if(code==200) {
				System.out.println("The link is: "+linkList+"--->"+code+"--->"+mess);
			}else {
				System.out.println("The link is broken"+linkList+"--->"+code+"--->"+mess);
			}
				
				
			}
		}
	}

}
