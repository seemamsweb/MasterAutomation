package com.unee.driver;

import org.openqa.selenium.WebDriver;

import com.unee.config.factory.web.remote.RemoteDriverFactory;
import com.unee.driver.entity.WebDriverData;

public class RemoteWebDriverImpl implements IWebDriver {

	@Override
	public WebDriver getDriver(WebDriverData driverData) {
		// TODO Auto-generated method stub
		return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), 
				driverData.getBrowserType());
	}

}
