package com.unee.config.factory.mobile.local;

import java.util.*;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.unee.driver.manager.mobile.local.AndroidManager;
import com.unee.driver.manager.mobile.local.IOSManager;
import com.unee.enums.MobilePlatformType;
import com.unee.enums.MobileRemoteModeType;
import com.unee.enums.RunModeBrowserType;

public class LocalMobileDriverFactory {

	private LocalMobileDriverFactory() {}
	
	public static final Map<MobilePlatformType, Supplier<WebDriver>> Map = 
			new EnumMap<>(MobilePlatformType.class);
	static {
		Map.put(MobilePlatformType.ANDROID, AndroidManager::getAndroidManager);
		Map.put(MobilePlatformType.IOS, IOSManager::getIosManager);
	}
	
	public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
		return Map.get(mobilePlatformType).get();
	}

	public static WebDriver getDriver(MobilePlatformType mobilePlatformType, MobileRemoteModeType mobileRemoteModeType, RunModeBrowserType runModeType) {
		// You can use the additional parameters as needed for future logic
		return Map.get(mobilePlatformType).get();
	}
	
}