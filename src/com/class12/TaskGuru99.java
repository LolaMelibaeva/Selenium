package com.class12;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TaskGuru99 {
	static WebDriver driver;

	@Test
	public static double getChangeData() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lola Melibaeva\\eclipse-workspace\\SeleniumBasics\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php#");
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[5]"));
		double data = 0.0;
		for (int i = 1; i < rows.size(); i++) {
			String rowdata = rows.get(i).getText();
			String rowData = rowdata.replace("+", "");
			data = Double.parseDouble(rowData);
		}
		return data;
	}

	@Test
	public static void getMax() {
		List<Double> alist = new ArrayList<Double>();
		alist.add(getChangeData());
		double max = Collections.max(alist);
		System.out.println(max);
		String maxdata = Double.toString(max);
		System.out.println("Max data: " + maxdata);

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
			String rowdata = rows.get(i).getText();
			if (rowdata.contains(maxdata)) {
				System.out.println(rowdata);
			}

		}
	}
//	@Test
//	public void tearDown() {
//		driver.quit();
//	}

}
