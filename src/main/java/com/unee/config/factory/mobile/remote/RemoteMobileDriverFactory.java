package com.unee.config.factory.mobile.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import org.openqa.selenium.WebDriver;

import com.unee.enums.MobilePlatformType;
import com.unee.enums.MobileRemoteModeType;

public class RemoteMobileDriverFactory {
	
private RemoteMobileDriverFactory() {}
	
	public static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> Map = 
			new EnumMap<>(MobileRemoteModeType.class);
	static {
		Map.put(MobileRemoteModeType.REMOTE_BROWSERSTACK, BrowserStackMobileFactory::getDriver);
		//Map.put(MobileRemoteModeType.REMOTE_SAUCELABS, SauceLabsMobileFactory::getDriver);
	}
	
	public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType platformType) {
		return Map.get(mobileRemoteModeType).apply(platformType);
	}
	
	public static WebDriver getDriver(MobileRemoteModeType mobilePlatformType, MobilePlatformType platformType, Object broswerRemoteModeType) {
		return Map.get(broswerRemoteModeType).apply(platformType);
	}
}

