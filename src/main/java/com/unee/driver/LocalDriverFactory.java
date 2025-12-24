package com.unee.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.unee.config.ConfigFactory;
import com.unee.driver.manager.ChromeManager;
import com.unee.driver.manager.FirefoxManager;
import com.unee.enums.BrowserType;


public class LocalDriverFactory {
	
	private LocalDriverFactory() {}
	
	public static WebDriver getDriver() {
		WebDriver driver = null;
		if(isBrowserChrome()) driver =ChromeManager.getDriver();
		else driver =FirefoxManager.getDriver();
		return driver;
		
	}

	private static boolean isBrowserChrome() {
		// TODO Auto-generated method stub
		return ConfigFactory.getConfig().browser()==BrowserType.CHROME;
	}
}


