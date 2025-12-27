package com.unee.driver.manager.mobile.local;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.unee.config.factory.web.local.ConfigFactory;

public final class AndroidManager {
	
	private AndroidManager() {}
	
	public static RemoteWebDriver getAndroidManager() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app", "System.getProperty('user.dir') +/android-app.apk");
		
		return new RemoteWebDriver(ConfigFactory.getConfig().localappiumServerURL(), capabilities);
	}
	

}
