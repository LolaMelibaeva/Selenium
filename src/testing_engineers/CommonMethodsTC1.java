package testing_engineers;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethodsTC1 {

	public static WebDriver driver;

	public static void setUpDriver(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src/driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"src/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser given is wrong");
		}

		driver.navigate().to(url);
		;
		driver.manage().window().maximize();

	}

	/**
	 * This method will select a specified value from a drop down
	 * 
	 * @author Syntax
	 * @param Select element, String text
	 */
	public static void selectValueFromDD(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		boolean isSelected = false;
		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				isSelected = true;
				break;
			}
		}
		if (!isSelected) {
			System.out.println("Option with text +" + text + "is not available");
		}
	}

	/**
	 * This method will select a specified value from a drop down by its index
	 * 
	 * @author Syntax
	 * @param Select element, int index
	 */
	public static void selectValueFromDD(WebElement element, int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		if (options.size() > index) {
			select.selectByIndex(index);
		} else {
			System.out.println("Invalid index has been passed");
		}
	}

	public static void month(WebElement element, String text) {

		selectValueFromDD(element, text);
	}

	public static void year(WebElement element, String text) {

		selectValueFromDD(element, text);
	}
	
	public static void day(List<WebElement> days, String day) {
		
		int monthSize = days.size();
		
		for(int i = 0; i < monthSize; i++) {
			
			if(days.get(i).getText().equals(day)) {
				days.get(i).click();
			}
		}
	}
	
	
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		(element).click();
	}

	public static String getValue(WebElement element) {
		String str = element.getAttribute("value");

		return str;
	}

	/**
	 * Method will accept alert
	 * 
	 * @throws NoAlertPresentException if alert is not present
	 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}

	/**
	 * Method will dismiss alert
	 * 
	 * @throws NoAlertPresentException if alert is not present
	 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}

	/**
	 * Method will get text of an alert
	 * 
	 * @throws NoAlertPresentException if alert is not present
	 * @return String text
	 */
	public static String getAlertText() {

		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
			return null;
		}

	}

	/**
	 * Method that will switch control to the specified frame
	 * 
	 * @param frame id or frame name
	 */
	public static void switchToFrame(String idOrName) {
		try {
			driver.switchTo().frame(idOrName);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * Method that will switch control to the specified frame
	 * 
	 * @param frame element
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * Method that will switch control to the specified frame
	 * 
	 * @param frame index
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * Method that will select a radio button
	 * 
	 * @param radio value
	 */
	public static void radioButtonText(List<WebElement> element, String value) {

		List<WebElement> radioButton = element;

		for (int i = 0; i < radioButton.size(); i++) {
			String str = radioButton.get(i).getText();

			if (str.equalsIgnoreCase(value)) {
				radioButton.get(i).click();
			}
		}
	}

	public static void radioButtonAttribute(List<WebElement> element, String value) {

		List<WebElement> radioButton = element;

		for (int i = 0; i < radioButton.size(); i++) {
			String str = radioButton.get(i).getAttribute("value");

			if (str.equalsIgnoreCase(value)) {
				radioButton.get(i).click();
			}
		}
	}

	public static void checkBoxClick(List<WebElement> element, String value) {

		List<WebElement> checkBox = element;

		for (int i = 0; i < checkBox.size(); i++) {
			String str = checkBox.get(i).getText();

			if (str.equalsIgnoreCase(value)) {
				checkBox.get(i).click();
			}
		}
	}
}


