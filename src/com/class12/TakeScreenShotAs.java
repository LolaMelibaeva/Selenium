package com.class12;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenShotAs {
	
	

	WebDriver driver=new ChromeDriver();
	
	TakesScreenShot tk=(TakesScreenShot)driver;
//	File fl=tk.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(fl, new File("screenshots/google/image.png"));
	

}
