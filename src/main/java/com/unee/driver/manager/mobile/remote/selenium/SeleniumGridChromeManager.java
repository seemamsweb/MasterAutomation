package com.unee.driver.manager.mobile.remote.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.web.local.ConfigFactory;


public final class SeleniumGridChromeManager {
	
	private SeleniumGridChromeManager() {}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome".toUpperCase());
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
		
		

}
}
