package com.unee.driver.manager;

import org.openqa.selenium.WebDriver;

import com.unee.config.ConfigFactory;
import com.unee.enums.BrowserRemoteModeType;

public class RemoteDriverFactory {

	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver() {
		
		BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();
		if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM) 
		{}
		else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID) 
		{}
		else {
		}
		return null;
		
	}
	
}
