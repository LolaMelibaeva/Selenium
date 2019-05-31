package com.class10;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC1 extends CommonMethods {
	/*TC 1: Table headers and rows verification

	Open chrome browser
	Go to “https://the-internet.herokuapp.com/”
	Click on “Click on the “Sortable Data Tables” link
	Verify tables consist of 4 rows and 6 columns
	Print name of all column headers
	Print data of all rows*/
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List <WebElement> rows=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		System.out.println("Number of rows="+rows.size());
		for (WebElement row: rows) {
			String rowText=row.getText();
			System.out.println(rowText);
		}
		List <WebElement> cols=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		System.out.println("Number of columns="+cols.size());
		Iterator<WebElement> it=cols.iterator();
		while(it.hasNext()) {
			String colText=it.next().getText();
			System.out.println(colText);
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
