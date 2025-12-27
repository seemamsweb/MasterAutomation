package com.unee.driver.factory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import com.unee.driver.IMobileDriverData;
import com.unee.driver.IWebDriver;
import com.unee.driver.LocalMobileDriverImpl;
import com.unee.driver.LocalWebDriverImpl;
import com.unee.driver.RemoteMobileDriverImpl;
import com.unee.driver.RemoteWebDriverImpl;
import com.unee.enums.RunModeBrowserType;

public final class DriverFactory {
	
	private DriverFactory() {}

	// Only keep WEB and MOBILE maps for driver instantiation
	private static final Map<RunModeBrowserType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeBrowserType.class);
	private static final Map<RunModeBrowserType, Supplier<IMobileDriverData>> MOBILE = new EnumMap<>(RunModeBrowserType.class);

	static {
		WEB.put(RunModeBrowserType.LOCAL, LocalWebDriverImpl::new);
		WEB.put(RunModeBrowserType.REMOTE, RemoteWebDriverImpl::new);
		MOBILE.put(RunModeBrowserType.LOCAL, LocalMobileDriverImpl::new);
		MOBILE.put(RunModeBrowserType.REMOTE, RemoteMobileDriverImpl::new);
	}

	public static IWebDriver getDriverForWeb(RunModeBrowserType runModeType) {
		return WEB.get(runModeType).get();
	}

	// If you want a mobile driver, use a method like this:
	public static IMobileDriverData getDriverForMobile(RunModeBrowserType runModeType) {
		return MOBILE.get(runModeType).get();
	}

}