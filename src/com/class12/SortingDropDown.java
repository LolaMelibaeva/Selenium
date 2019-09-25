package com.class12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

;

public class SortingDropDown {

	public static void main(String[] args) {
		
		
		String driverPath = "C:\\Users\\Lola Melibaeva\\eclipse-workspace\\SeleniumBasics\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
		Select se = new Select(element);
		List<String> originalList = new ArrayList();
		for (WebElement e : se.getOptions()) {
			originalList.add(e.getText());
		}
		//----logic block starts
		List<String> tempList= originalList;
		Collections.sort(tempList);
		Assert.assertEquals(tempList, originalList);
		//----logic ends starts
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        Set<String> hashSet = new HashSet();
        for (WebElement elements : options) {
        	
        	if(hashSet.add(elements.getText())==false){
                System.out.println("Dublicate elements are"+hashSet);
            }else {
                System.out.println("Not duplicate elements are"+hashSet);
            }
        }
	}

}
