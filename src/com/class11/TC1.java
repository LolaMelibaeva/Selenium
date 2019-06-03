package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Upload file and Take Screenshot
		 * 
		 * Navigate to
		 * “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
		 * Upload file Verify file got successfully uploaded and take screenshot
		 */

		String url = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);
		
		takeScreenshot("SampleProject", "Webpage");

		WebElement chooseFile = driver.findElement(By.cssSelector("input#gwt-debug-cwFileUpload"));
		String filePath = "C:\\Users\\Lola Melibaeva\\Desktop\\Mariam\\MarchMenu.pdf";
		chooseFile.sendKeys(filePath);
		click(driver.findElement(By.xpath("//button[text()='Upload File']")));

		
		String expected = "File uploaded!";
		String actual = getAlertText();
		
		if (actual.equals(expected)) {
			System.out.println("File uploaded successfuly");
		} else {
			System.out.println("File is NOT uploaded");
		}
		acceptAlert();
		
		TakesScreenshot camera = (TakesScreenshot) driver;
		File src = camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshots/SampleProject/SampleAlert3.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot is NOT taken");
		}
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
