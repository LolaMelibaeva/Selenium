package com.class12;

import java.io.File;
import java.io.IOException;
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

public class BrokenLinkTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		
		//find a list of all links and images
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("The size of link list is "+linkList.size());
		
		for(WebElement links: linkList) {
			String linkUrl=links.getAttribute("href");
			
			try {
				URL url=new URL(linkUrl);
				HttpURLConnection conn=(HttpURLConnection)url.openConnection();
				int code=conn.getResponseCode();
				String response=conn.getResponseMessage();
				if(code==200) {
					System.out.println("Link is valid "+linkUrl+"-->"+response);
				}else {
					System.out.println("Link is invalid "+linkUrl+"-->"+response);
				}
				
				
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
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
