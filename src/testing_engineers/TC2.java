package testing_engineers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC2 extends CommonMethodsTC2 {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		// 2.
		sendText(driver.findElement(By.id("ctl00_MainContent_username")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='pass']")), "test");
		click(driver.findElement(By.cssSelector("input[value='Login']")));

		// 3.
		click(driver.findElement(By.linkText("Order")));
		// product
		selectValueDropDown(driver.findElement(By.cssSelector("select[id*='Product']")), "FamilyAlbum");
		// quantity
		sendText(driver.findElement(By.cssSelector("input[id$='Quantity']")), "6");
		// name
		sendText(driver.findElement(By.cssSelector("input[id*='Name']")), "Eric Smith");
		// street
		sendText(driver.findElement(By.cssSelector("input[id*='TextBox2']")), "1222 Kalorama rd");
		// city
		sendText(driver.findElement(By.cssSelector("input[id*='TextBox3']")), "Washington");
		// state
		sendText(driver.findElement(By.cssSelector("input[id*='TextBox4']")), "DC");
		// zip
		sendText(driver.findElement(By.cssSelector("input[id*='TextBox5']")), "20009");
		// card
		String valueToSelect = "American Express";
		List<WebElement> cards = driver.findElements(By.name("ctl00$MainContent$fmwOrder$cardList"));
		for (WebElement card : cards) {
			if (card.isEnabled()) {
				String value = card.getAttribute("value");
				if (value.equals(valueToSelect)) {
					card.click();
				}
			}
		}
		// card number
		sendText(driver.findElement(By.cssSelector("input[id*='TextBox6']")), "123456789");
		// expire date
		sendText(driver.findElement(By.cssSelector("input[id*='TextBox1']")), "06/22");
		// process
		click(driver.findElement(By.linkText("Process")));

		// 4.
		click(driver.findElement(By.linkText("View all orders")));
		String expectedValue = "John Smith";
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr/th"));

		for (int i = 1; i <= rows.size(); i++) {
			WebElement row = driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[" + i + "]"));
			String rowText = row.getText();

			if (rowText.contains(expectedValue)) {
				click(driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[2]/td[1]")));
				System.out.println("Order of person " + expectedValue + " is displayed in the table");
			}
		}
		// 5.
		click(driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[2]/td[13]")));

		// 6.
		String selectedProduct = "FamilyAlbum";
		String enteredQuantity = "5";
		String enteredName = "John Smith";
		String enteredStreet = "1222 Kalorama rd";
		String enteredCity = "Washington";
		String enteredState = "DC";
		String enteredZip = "20009";
		String selectedCard = "MasterCard";
		String enteredCardNum = "123456789";
		String enteredExpDate = "06/22";

		WebElement product2 = driver.findElement(By.xpath("//select[contains(@id,'Product')]"));
		String prodText = product2.getAttribute("value");
		if (prodText.equals(selectedProduct)) {
			System.out.println("Product is verified");
		}
		WebElement quant = driver.findElement(By.cssSelector("input[onchange*='Changed()']"));
		String quantText = quant.getAttribute("value");
		if (quantText.equals(enteredQuantity)) {
			System.out.println("Quantity is verified");
		}
		WebElement custName = driver.findElement(By.cssSelector("input[id*='Name']"));
		String nameText = custName.getAttribute("value");
		if (nameText.equals(enteredName)) {
			System.out.println("Name is verified");
		}
		WebElement street2 = driver.findElement(By.cssSelector("input[id*='TextBox2']"));
		String streetText = street2.getAttribute("value");
		if (streetText.equals(enteredStreet)) {
			System.out.println("Street is verified");
		}
		WebElement city2 = driver.findElement(By.cssSelector("input[value='Washington']"));
		String cityText = city2.getAttribute("value");
		if (cityText.equals(enteredCity)) {
			System.out.println("City is verified");
		}
		WebElement state2 = driver.findElement(By.cssSelector("input[value='DC']"));
		String stateText = state2.getAttribute("value");
		if (stateText.equals(enteredState)) {
			System.out.println("State is verified");
		}
		WebElement zip2 = driver.findElement(By.cssSelector("input[value='20009']"));
		String zipText = zip2.getAttribute("value");
		if (zipText.equals(enteredZip)) {
			System.out.println("Zip code is verified");
		}
		WebElement card2 = driver.findElement(By.cssSelector("input[value='MasterCard']"));
		String cardText = card2.getAttribute("value");
		if (cardText.equals(selectedCard)) {
			System.out.println("Card is verified");
		}
		WebElement cardNum2 = driver.findElement(By.cssSelector("input[id*='TextBox6']"));
		String cardNumText = cardNum2.getAttribute("value");
		if (cardNumText.equals(enteredCardNum)) {
			System.out.println("Card number is verified");
		}
		WebElement exDate = driver.findElement(By.cssSelector("input[id*='TextBox1']"));
		String dateText = exDate.getAttribute("value");
		if (dateText.equals(enteredExpDate)) {
			System.out.println("Expire date is verified");
		}

		// 7.
		WebElement streetNew = driver.findElement(By.cssSelector("input[id*='TextBox2']"));
		sendText(streetNew, "2099 Florida Avenue NW");
		driver.findElement(By.linkText("Update")).click();

		// 8.
		String expectedStreet = "2099 Florida Avenue NW";

		for (int i = 1; i <= rows.size(); i++) {
			WebElement row = driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[" + i + "]"));
			String rowText = row.getText();
			if (rowText.contains(expectedStreet)) {
				System.out.println("Street address has been updated");
			}
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
