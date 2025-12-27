package com.unee.driver.manager.mobile.remote.selenoid;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.web.local.ConfigFactory;



public class SelenoidChromeManager {
	
		private SelenoidChromeManager() {}
		
		public static WebDriver getDriver() {
			// TODO Auto-generated method stub
			

			// ... inside your method ...

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("browserName", "chrome");
			capabilities.setCapability("browserVersion", "latest");
			capabilities.setCapability("enableVNC", true); // Note: standard Selenoid key is "enableVNC"
			capabilities.setCapability("enableVideo", false);

			// RemoteWebDriver requires a new URL object created from your config string
			return new RemoteWebDriver(ConfigFactory.getConfig().seleniodURL(), capabilities);


		}
}
