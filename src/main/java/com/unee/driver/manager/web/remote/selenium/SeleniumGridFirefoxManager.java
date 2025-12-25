package com.unee.driver.manager.web.remote.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.ConfigFactory;

public class SeleniumGridFirefoxManager {

	
		private SeleniumGridFirefoxManager() {}

		public static WebDriver getDriver() {
			// TODO Auto-generated method stub
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("firefox".toUpperCase());
			return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
			
			

	}
}
