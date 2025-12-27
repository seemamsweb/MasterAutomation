package com.unee.driver.manager.mobile.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.web.remote.BrowserStackConfigFactory;

public final class BrowserStackIosManager {
	
	private BrowserStackIosManager() {}
	
	public static WebDriver getDriver() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "bs://<app-id>");
		capabilities.setCapability("device", "iPhone 12");
		capabilities.setCapability("os.version", "14");
		capabilities.setCapability("automationName", "XCUITest");
		
		capabilities.setCapability("project", "First Java Project");
		capabilities.setCapability("build", "Java iOS");
		capabilities.setCapability("name", "first_test");	
		//URL("http://hub-cloud.browserstack.com/wd/hub")
		
			return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
		
	}

}
