package com.unee.driver.manager.mobile.local;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.web.local.ConfigFactory;

public final class IOSManager {
	
	private IOSManager() {}
	
	public static RemoteWebDriver getIosManager() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("deviceName", "iPod Touch(7th generation)");
		capabilities.setCapability("app", "System.getProperty('user.dir') +/ios-app.zip");
		
		return new RemoteWebDriver(ConfigFactory.getConfig().localappiumServerURL(), capabilities);
	}
	

}
