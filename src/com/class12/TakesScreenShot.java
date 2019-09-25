package com.class12;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class TakesScreenShot extends CommonMethods{
	
		
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			
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
