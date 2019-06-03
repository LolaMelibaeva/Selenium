package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
/*TC 12356 - search flight verification
 
 *1. navigate to URL
 *2. enter details
 *verify search is successful
 *
 */


public class FlightSearch extends CommonMethods {

	String browser="chrome";
	String url="https://www.aa.com/homePage.do"		;
	
	@BeforeMethod
	public void setUp() {
		setUpDriver(browser, url);
	}

	
	
	@Test
	public void searchFlight() throws InterruptedException {
		//enter to and from
		sendText(driver.findElement(By.name("originAirport")), "DCA");
		sendText(driver.findElement(By.name("destinationAirport")), "JFK");
		//Click calendar click on
		click(driver.findElement(By.cssSelector("input#aa-leavingOn")));
		//change month and click on Date
		
		do {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            
        }    
        
        while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div")).getText().contains("October"));
		
		//capturing all cell and then loop and search for specific date
		List <WebElement> depCells=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td"));
		for(WebElement cell: depCells) {
			if(cell.getText().equals("18")) {
				cell.click();
				break;
			}
		}
	// choose arrival date
		WebElement arrCalen=(driver.findElement(By.xpath("//input[@id='aa-returningFrom']")));
	    click(arrCalen);
	do {
        driver.findElement(By.xpath("//a[@title='Next']")).click();
        
    }    
    
    while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div")).getText().contains("December"));
	
	List<WebElement> arrCells=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td/a"));
	for(WebElement cell: arrCells) {
		if(cell.getText().equals("24")) {
			cell.click();
			break;
		}
	}
	
	Thread.sleep(5000);
	}
	
}

