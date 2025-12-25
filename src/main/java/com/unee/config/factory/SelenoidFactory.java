package com.unee.config.factory;

import org.openqa.selenium.WebDriver;

import com.unee.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.unee.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.unee.enums.BrowserType;

public class SelenoidFactory {
	
	private SelenoidFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		
		return browserType == BrowserType.CHROME
				? SelenoidChromeManager.getDriver()
						: SelenoidFirefoxManager.getDriver();
				
							
	}

}
