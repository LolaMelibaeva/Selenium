package com.class12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class BrokenLinkAndTakesShot extends CommonMethods{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int linkSize=links.size();
		System.out.println("The size of link list is "+linkSize);
		for(WebElement link:links) {
			String linkUrl=link.getAttribute("href");
			
			try {
				URL url = new URL(linkUrl);
				HttpURLConnection conn=(HttpURLConnection)url.openConnection();
				int code=conn.getResponseCode();
				String message=conn.getResponseMessage();
				if(code==200) {
					System.out.println("The link is valid: "+linkUrl+"--> "+message);
				}else {
					System.out.println("The link is NOT valid: "+linkUrl+"-->"+message+" -- "+code);
				}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

		public static byte[] takeScreenshot() {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screen = ts.getScreenshotAs(OutputType.BYTES);
			return screen;
}
}