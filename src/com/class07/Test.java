package com.class07;

import utils.CommonMethods;

public class Test extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("firefox", "http://google.com");
		Thread.sleep(2000);
		driver.close();
		

	}

}
