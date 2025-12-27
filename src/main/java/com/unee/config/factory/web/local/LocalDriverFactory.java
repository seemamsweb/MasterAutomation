package com.unee.config.factory.web.local;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import com.unee.driver.manager.web.local.ChromeManager;
import com.unee.driver.manager.web.local.FirefoxManager;
import com.unee.enums.BrowserType;


public class LocalDriverFactory {
	
	private LocalDriverFactory() {}
	
	public static final Map<BrowserType, Supplier<WebDriver>> MAP = 
			new EnumMap<>(BrowserType.class);
	static {
		MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
		MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
		}
	

	public static WebDriver getDriver(BrowserType browserType) {
		return MAP.get(browserType).get();
	}
}


