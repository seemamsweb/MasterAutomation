package com.unee.config.factory;

import org.openqa.selenium.WebDriver;

import com.unee.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.unee.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.unee.enums.BrowserType;

public class SeleniumGridFactory {
	
	private SeleniumGridFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		
		return browserType == BrowserType.CHROME
				? SeleniumGridChromeManager.getDriver()
						: SeleniumGridFirefoxManager.getDriver();
				
							
	}

}
