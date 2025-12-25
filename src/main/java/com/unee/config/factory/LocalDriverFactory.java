package com.unee.config.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.unee.driver.manager.web.local.ChromeManager;
import com.unee.driver.manager.web.local.FirefoxManager;
import com.unee.enums.BrowserType;


public class LocalDriverFactory {
	
	private LocalDriverFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		
		return isBrowserChrome(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
	}

	private static boolean isBrowserChrome(BrowserType browserType) {
		// TODO Auto-generated method stub
		return browserType == BrowserType.CHROME;
	}
}


