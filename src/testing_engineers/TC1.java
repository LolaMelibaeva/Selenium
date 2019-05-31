package testing_engineers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utils.CommonMethods;

public class TC1 extends CommonMethodsTC1 {

	/*
	 * 1.Open chrome browser 2.Go to “http://uitestpractice.com/” 3.Click on “Forms
	 * link 4.Fill out the entire form5.Close the browser
	 */
	public static void main(String[] args) throws InterruptedException {

		String url = "http://uitestpractice.com/";
		CommonMethodsTC1.setUpDriver("chrome", url);

		click(driver.findElement(By.xpath("//a[text()='Form']")));
		sendText(driver.findElement(By.cssSelector("input#firstname")), "Zaheer");
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Haidari");

		radioButtonText(driver.findElements(By.cssSelector("label.radio-inline")), "Married");
		checkBoxClick(driver.findElements(By.cssSelector("label.checkbox-inline")), "Cricket");
		selectValueFromDD(driver.findElement(By.cssSelector("select#sel1")), "Afghanistan");

		click(driver.findElement(By.cssSelector("input#datepicker")));
		month(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")), "Aug");
		year(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")), "1988");
		day(driver.findElements(By.xpath("//td[@data-handler='selectDay']")), "20");

		sendText(driver.findElement(By.cssSelector("input#phonenumber")), "555555888");
		sendText(driver.findElement(By.cssSelector("input#username")), "zaheerhaidari");
		sendText(driver.findElement(By.cssSelector("input#email")), "haidari.zaheer@gmail.com");
		sendText(driver.findElement(By.cssSelector("textarea#comment")), "I am an automation test engineer");
		sendText(driver.findElement(By.cssSelector("input#pwd")), "Kbl12345");
		click(driver.findElement(By.cssSelector("button[type='submit']")));

		driver.close();
	}

}
