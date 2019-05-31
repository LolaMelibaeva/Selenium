package com.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.MethodsReuse;

public class Task1 extends MethodsReuse{

	public static void main(String[] args) throws InterruptedException {
		MethodsReuse.browserSetUp("chrome", "https://the-internet.herokuapp.com/tables");
		
		List<WebElement> rowlist = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		String expectedValue="Doe";
		for (int i = 1; i <= rowlist.size(); i++) {
			
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]"));
			String text=ele.getText();
			if( text.equals(expectedValue)) {
			driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td[6]/a[1]")).click();
		}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
