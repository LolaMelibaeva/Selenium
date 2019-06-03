package com.class10;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.CommonMethods;

public class HW1 extends CommonMethods {
/*
 *TC 1: Users Application Form Fill
 *1.Open chrome browser
 *2.Go to “http://uitestpractice.com/”
 *3.Click on “Form” link
 *4.Fill out the entire form
 *5.Close the browser
 *MUST USE Functions: 
}
 */
	public static void main(String[] args) throws InterruptedException {
		String url="http://uitestpractice.com/";
		
		setUpDriver("chrome", url);
		//click on Form linkn
		click(driver.findElement(By.xpath("//a[text()='Form']")));
		//enter FirstName
		sendText(driver.findElement(By.cssSelector("input#firstname")), "Anna");
		//enter LastName
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Smith");
		
		//select Martial status from radio buttons
		selectRadioBtn(driver.findElements(By.xpath("//label[@class='radio-inline']")),"Single");
		
		//select Hobby from checkbox
		selectCheckbox(driver.findElements(By.xpath("//label[@class='checkbox-inline']")), "Reading");
		
		//select country
		selectValueFromDD(driver.findElement(By.xpath("//select[@class='form-control dropdown-header']")), "Denmark");
		
		//click Date of Birth calender
		click(driver.findElement(By.cssSelector("input#datepicker")));
		
		//select Month
		selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-month")), "Jun");
		
		//select Year
		selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-year")), "1980");
		
		//select Day from Calendar
		selectDateFromCalendar(driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")), "15");
		
		//Sendkeys to input boxes
		sendText(driver.findElement(By.cssSelector("input#phonenumber")), "2024561234");
		sendText(driver.findElement(By.cssSelector("input#username")), "AnnaSmith");
		sendText(driver.findElement(By.cssSelector("input#email")),"Annasmith1980F@gmail.com");
		sendText(driver.findElement(By.cssSelector("textarea#comment")), "Happy to fill out your application form");
		sendText(driver.findElement(By.cssSelector("input#pwd")), "Anna@123");
		Thread.sleep(2000);
		
		//click submit button
		click(driver.findElement(By.xpath("//button[text()='Submit']")));
		
		
			Thread.sleep(2000);
			driver.quit();
		}
	}


