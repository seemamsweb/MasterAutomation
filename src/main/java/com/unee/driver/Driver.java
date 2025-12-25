package com.unee.driver;

import org.openqa.selenium.WebDriver;

import com.unee.config.factory.LocalDriverFactory;
import com.unee.enums.BrowserType;


public class Driver {
	 

	public static void initDriver() {
		//LocalDriverFactory
		WebDriver driver = LocalDriverFactory.getDriver(BrowserType.CHROME);
		driver.get("https://www.google.com");

}
	public static void quitDriver(WebDriver driver) {
		if(driver!=null) {
			driver.quit();
		}
	}
}
