package com.unee.driver;

import org.openqa.selenium.WebDriver;

import com.unee.config.factory.mobile.local.LocalMobileDriverFactory;
import com.unee.driver.entity.MobileDriverData;

public interface IMobileDriverData {
	
	 default WebDriver getMobileDriver(MobileDriverData driverData) {
	        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
	    }
	 
	 WebDriver getDriver(MobileDriverData driverData);
	}