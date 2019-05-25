package com.class07;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class RadioButtons extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {


		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		 List <WebElement> list = driver.findElements(By.cssSelector("input[id^='sex-']"));
		 for (WebElement gender: list) {
			 if (gender.isEnabled()) {
				 gender.click();
				 Thread.sleep(1000);
			 }
		 }
		 List<WebElement> genders = driver.findElements(By.xpath("//input[@name='sex']"));
		 Iterator<WebElement> it=genders.iterator();
		 while(it.hasNext()) {
			 it.next().click();
			 Thread.sleep(1000);
		 }
		 driver.close();
	}

}
