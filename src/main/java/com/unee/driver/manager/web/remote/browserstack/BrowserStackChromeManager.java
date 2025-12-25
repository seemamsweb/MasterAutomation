package com.unee.driver.manager.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.unee.config.factory.BrowserStackConfigFactory;




public class BrowserStackChromeManager {
	
	private BrowserStackChromeManager() {}
	
	public static WebDriver getDriver(String capabilityName, String value) {
		// TODO Auto-generated method stub
		

		// ... inside your method ...

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("browserVersion", "latest");
		capabilities.setCapability("enableVNC", true); // Note: standard Selenoid key is "enableVNC"
		capabilities.setCapability("enableVideo", false);

		// RemoteWebDriver requires a new URL object created from your config string
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);


	}

}
