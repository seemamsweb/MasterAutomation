package com.unee.config.factory;

import org.openqa.selenium.WebDriver;

import com.unee.enums.BrowserRemoteModeType;
import com.unee.enums.BrowserType;

public class RemoteDriverFactory {

	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {
		
		 
		if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM) 
		{}
		else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID) 
		{}
		else if(browserRemoteModeType == BrowserRemoteModeType.BrowserStack){
		}
		return null;
		
	}
	
}
