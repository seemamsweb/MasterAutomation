package com.unee.driver;

import org.openqa.selenium.WebDriver;


public class Driver {
	 

	public static void initDriver() {
		//LocalDriverFactory
		WebDriver driver = LocalDriverFactory.getDriver();
		driver.get("https://www.google.com");

}
	public static void quitDriver(WebDriver driver) {
		if(driver!=null) {
			driver.quit();
		}
	}
}
