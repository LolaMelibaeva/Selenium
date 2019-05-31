package testing_engineers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class CommonMethodsTC2 {
	
public static WebDriver driver;
    
    public static void setUpDriver(String browser, String url) {
        
        if (browser.equalsIgnoreCase("chrome")) {
                //for MAC
            System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");  
                //for WINDOWS
          //System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");  
            driver=new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else {
            System.out.println("Browser given is wrong");
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }
/**
 * @author Syntax 
 * This method will select a specified value from a drop down by visible text
 * @parameter Select element, String text
 */
    public static void selectValueDropDown(WebElement element, String text) {
        
        Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        boolean isSelected=false;
        for (WebElement option:options) {
            String optionText=option.getText();
            if (optionText.equals(text)) {
                select.selectByVisibleText(text); 
                System.out.println("Option with text "+text+" is selected");
                isSelected=true;
                break; //once we find the value we are looking for, we stop it; break;
            }
        }
        if(!isSelected) {
            System.out.println("Option with text "+text+" is NOT available");
        }
    }
    
/**
 * @autor Syntax
 * This method will select a specified value from a drop down by its index
 * @param Select element, int index
 */
    public static void selectValueDropDown(WebElement element, int index) { //method overloading
        
        Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        
        if (options.size()>index) {
            select.selectByIndex(index);
        }else {
            System.out.println("Invalid index has been passed");
        }
        select.deselectByIndex(index);
        
    }
/**
 * This method will clear the text box and then send text
 * @param Select element, String value
 */
    
    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
/**
 * Method will accept alert
 * @throws NoAlertPresentException if alert is not present
 */
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
 * Method that will switch control to the specify frame
 * @throws NoSuchFrameException if frame is not present
 * @param frame id or frame name
 */ 
    public static void switchToFrame(String idOrName) {
        try {
            driver.switchTo().frame(idOrName);
        }catch(NoSuchFrameException e) {
            System.out.println("Frame is not present");
        }
    }
/**
 * Method that will switch control to the specify frame
 * @param frame element
 */ 
    public static void switchToFrame(WebElement element) { //method overloading
        try {
            driver.switchTo().frame(element);
        }catch(NoSuchFrameException e) {
            System.out.println("Frame is not present");
        }
    }
/**
 * Method that will switch control to the specify frame
 * @param frame index
 */
    public static void switchToFrame(int index) { //method overloading
        try {
            driver.switchTo().frame(index);
        }catch(NoSuchFrameException e) {
            System.out.println("Frame is not present");
        }
    }
/**
 * This method will click on specific element
 * @param element
 */
    public static void click(WebElement element) {          
        element.click();        
    }
    
/**
 * This method will select specific date in the calendar
 * @param List of WebElements, String expected value
 */
    public static void selectValueCalendar(List<WebElement> list, String value) {
        
        List<WebElement> rows=(List<WebElement>) list;
        
        for (WebElement row:rows) {
            String rowText=row.getText();
            if(rowText.contains(value)) {
                row.click();
            System.out.println(value+" is selected"); 
            }
        }
    }
/**
 * This method will select specific radio button from the list of buttons   
 * @param list of radio buttons, String selectedValue
 */
   public static void selectValueRadioButton(List<WebElement> list, String selectedValue) {
        
        for (WebElement radio: list) {
            
            if(radio.isEnabled()) {
                String value=radio.getText();
                
                if(value.equals(selectedValue)) {
                    radio.click();
                    System.out.println(selectedValue+" is selected");
                }
            }
        }
    }
/**
 * This method will select specific check box
 * @param list of check boxes, String value
 */
   public static void selectValueCheckBox(List<WebElement> list, String selectedValue) {
    
      for(WebElement ckeckBox: list) {
          String value=ckeckBox.getText();
          if(value.equals(selectedValue)) {
              ckeckBox.click();
              System.out.println(selectedValue+" is selected");
          }
      }
  }
   /**
    * This method will select month from the calendar
    * @param Select element, String text
    */
   public static void selectMonth(WebElement element, String text) { 
       selectValueDropDown(element, text);
   }
   
   /**
    * This method will select year from the calendar
    * @param Select element, String text
    */
   public static void selectYear(WebElement element, String text) {
       selectValueDropDown(element, text);
   }
   
   /**
    * This method will select day from the calendar
    * @param List of Days, String days
    */
   public static void selectDay(List<WebElement> days, String day) {
       
      int monthSize=days.size();
      for(int i=0; i<monthSize; i++) {
          
          if(days.get(i).getText().equals(day)) {
              days.get(i).click();
          }
      }
       
   }
}
