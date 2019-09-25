package com.class12;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The size of link list: "+links.size());
		
		for(WebElement link:links) {
			
			String linkUrl=link.getAttribute("href");
			
			try {
				URL	url = new URL(linkUrl);			
				HttpURLConnection conn=(HttpURLConnection)url.openConnection();
				int code=conn.getResponseCode();
				String message=conn.getResponseMessage();
				if(code==200) {
					System.out.println("The link is valid: "+linkUrl+"-->"+message);
				}else {
					System.out.println("The link is NOT valid:"+linkUrl+"-->"+message);
				}
				
				
			} catch (Exception e) {
				
			}
		}
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile (src, new File("screenshots/google/images.png"));	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}