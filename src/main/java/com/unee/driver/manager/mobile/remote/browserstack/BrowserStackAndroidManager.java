package com.unee.driver.manager.mobile.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.web.remote.BrowserStackConfigFactory;

public final class BrowserStackAndroidManager {
	
	private BrowserStackAndroidManager() {}
	
	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "bs://<app-id>");
		capabilities.setCapability("device", "Google Pixel 3");
		capabilities.setCapability("os.version", "9.0");
		capabilities.setCapability("automationName", "UiAutomator2");
		
		capabilities.setCapability("project", "First Java Project");
		capabilities.setCapability("build", "Java Android");
		capabilities.setCapability("name", "first_test");	
		//URL("http://hub-cloud.browserstack.com/wd/hub")
		
			return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
		
	}
}
