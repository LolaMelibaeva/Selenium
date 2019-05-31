package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods2;

public class HW2 extends CommonMethods2{
/*
 * C 1: Table headers and rows verification
 * 1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
 * 2.Login to the application
 * 3.Create an Order
 * 4.Verify order of that person is displayed in the table “List of All Orders”
 * 5.Click on edit of that specific order
 * 6.Verify each order details
 * 7.Update street address
 * 8.Verify in the table that street has been updated
 * 9.Close browser
 */
	public static void main(String[] args) throws InterruptedException {

		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
		
		//login to the application
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		clickElement(driver.findElement(By.xpath("//a[text()='Order']")));
		selectValueFromDD(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")),"FamilyAlbum");
		//quantity
		WebElement quantity=driver.findElement(By.cssSelector("input[id$='Quantity']"));
        sendText(quantity, "5");
        //customer name
        WebElement name=driver.findElement(By.cssSelector("input[id$='Order_txtName']"));
        sendText(name, "Anna Smith");
        //Street 
        WebElement street=driver.findElement(By.cssSelector("input[id$='Order_TextBox2']"));
        sendText(street, "123 Walnut Street");
        //city
        WebElement city=driver.findElement(By.cssSelector("input[id$='Order_TextBox3']"));
        sendText(city,"Chantilly");
        //state
        WebElement state=driver.findElement(By.cssSelector("input[id$='Order_TextBox4']"));
        sendText(state,"VA");
        //zipcode
        WebElement zipcode=driver.findElement(By.cssSelector("input[id$='Order_TextBox5']"));
        sendText(zipcode,"20147");
        
        //choose CC
        WebElement chooseCC=driver.findElement(By.cssSelector("input[id$='Order_cardList_0"));
        clickElement(chooseCC);
        
        //enter CC number
        WebElement ccNumber=driver.findElement(By.cssSelector("input[id$='Order_TextBox6"));
        sendText(ccNumber,"4215456478941412");
        
        //Exp.date
        
        WebElement expDate=driver.findElement(By.cssSelector("input[id$='Order_TextBox1"));
        sendText(expDate,"11/2020");
        
        Thread.sleep(2000);
        //click Proceed
        WebElement clickProceed=driver.findElement(By.cssSelector("a[id$='Order_InsertButton"));
        clickElement(clickProceed);
        
        //click View all orders
         clickElement(driver.findElement(By.xpath("//a[text()='View all orders']")));
         
         //Verify "Anna Smith" is appeared on the table
         String expectedValue="Anna Smith";
       
         List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr"));
         List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr/th"));
         for(int i=1; i<=rows.size(); i++) {
             WebElement row=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]"));
             String rowText=row.getText();
             
             if (rowText.contains(expectedValue)) {
                 driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[2]/td[1]")).click();
                 System.out.println("Order of person "+expectedValue+" is displayed in the table");
             }
         }
         
         //5.
         driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[2]/td[13]")).click();
         String enteredProduct="FamilyAlbum";
         String enteredQuantity="5";
         String enteredName="Anna Smith";
         String enteredStreet="123 Walnut Street";
         String enteredCity="Chantilly";
         String enteredState="VA";
         String enteredZip="20147";
         String enteredCard="Visa";
         String enteredCardNum="4215456478941412";
         String enteredExpDate="11/20";

         WebElement product2=driver.findElement(By.xpath("//select[contains(@id,'Product')]"));
         String prodText=product2.getAttribute("value");
             if(prodText.equals(enteredProduct)) {
                 System.out.println("Product is verified");
             }
         WebElement quant=driver.findElement(By.cssSelector("input[onchange*='Changed()']"));
         String quantText=quant.getAttribute("value");
              if(quantText.equals(enteredQuantity)) {
                   System.out.println("Quantity is verified");
              }
         WebElement custName=driver.findElement(By.cssSelector("input[id*='Name']"));
         String nameText=custName.getAttribute("value");
             if(nameText.equals(enteredName)) {
                   System.out.println("Name is verified");
              }else {
            	  System.out.println("Entered name is wrong");
              }
         WebElement street2=driver.findElement(By.cssSelector("input[id*='TextBox2']"));
         String streetText=street2.getAttribute("value");     
              if(streetText.equals(enteredStreet)) {
                  System.out.println("Street is verified");
              }else {
            	  System.out.println("Entered street is wrong");
              }
              WebElement city2=driver.findElement(By.cssSelector("input[value='Chantilly']"));    
              String cityText=city2.getAttribute("value");   
                   if(cityText.equals(enteredCity)) {
                       System.out.println("City is verified");
                   }
              WebElement state2=driver.findElement(By.cssSelector("input[value='VA']"));      
              String stateText=state2.getAttribute("value");   
                   if(stateText.equals(enteredState)) {
                       System.out.println("State is verified");
               }
              WebElement zip2=driver.findElement(By.cssSelector("input[value='20147']"));            
              String zipText=zip2.getAttribute("value"); 
                   if(zipText.equals(enteredZip)) {
                       System.out.println("Zip code is verified");
                   }
              WebElement card2=driver.findElement(By.cssSelector("input[value='Visa']"));
              String cardText=card2.getAttribute("value");
                   if(cardText.equals(enteredCard)) {
                       System.out.println("Card is verified");
                   }
	  
         WebElement cardNum2=driver.findElement(By.cssSelector("input[id*='TextBox6']"));
         String cardNumText=cardNum2.getAttribute("value");
              if(cardNumText.equals(enteredCardNum)) {
                  System.out.println("Card number is verified");
              }else {
            	  System.out.println("Entered card number is wrong");
              }
         WebElement exDate=driver.findElement(By.cssSelector("input[id*='TextBox1']"));
         String dateText=exDate.getAttribute("value");
              if(dateText.equals(enteredExpDate)) {
                  System.out.println("Expire date is verified");
              }else {
            	  System.out.println("Entered exp date is wrong");
              }
               
         //7.
         WebElement streetNew=driver.findElement(By.cssSelector("input[id*='TextBox2']"));
         sendText(streetNew, "456 Chestnut Street");
         driver.findElement(By.linkText("Update")).click();
                 
         //8.
         //click View all orders
         clickElement(driver.findElement(By.xpath("//a[text()='View all orders']")));
         
         String expectedStreet="456 Chestnut Steet";

         for(int i=1; i<=rows.size(); i++) {
             WebElement row=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]"));
             String rowText=row.getText();
             if(rowText.contains(expectedStreet)) {
                 System.out.println("Street address has been updated");
             }   
         }
             
         Thread.sleep(4000);
         driver.quit();
             
         
     
	}

}
