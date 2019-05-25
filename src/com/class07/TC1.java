package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

/*TC 1: ToolsQA Frame verification
Open chrome browser
Go to “https://www.toolsqa.com/iframe-practice-page/”
Click on “Blogs” link inside first frame
Verify element “Interactions” is present in second frame
Navigate to Home Page
Quit browser*/
public class TC1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Blogs")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//h3[text()='Interactions']"));
		System.out.println("The title is: "+title.getText());
				boolean isDisplayed=title.isDisplayed();
				System.out.println(isDisplayed);
				Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
