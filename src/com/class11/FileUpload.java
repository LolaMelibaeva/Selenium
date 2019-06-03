package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		 String url="http://the-internet.herokuapp.com";
		 setUpDriver("chrome", url);
		 
		 WebElement fileUpLoad=driver.findElement(By.linkText("File Upload"));
		 click(fileUpLoad);
		 WebElement chooseFile=driver.findElement(By.id("file-upload"));
		 String filePath="C:\\Users\\Lola Melibaeva\\Desktop\\Mariam\\MarchMenu.pdf";
		 chooseFile.sendKeys(filePath);
		 
		 click(driver.findElement(By.id("file-submit")));
		 
		 boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		  if(isDisplayed) {
			  System.out.println("File is successfully uploaded");
		  }else {
			  System.out.println("File is NOT uploaded");
		  }
		  //steps to take screenshot
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File pic= ts.getScreenshotAs(OutputType.FILE);
		  try {
			FileUtils.copyFile(pic, new File("screenshots/TheInternet/FileUpload.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		  Thread.sleep(2000);
		  driver.close();
		  
	}

}
