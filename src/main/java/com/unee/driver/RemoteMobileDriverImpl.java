package com.unee.driver;

import org.openqa.selenium.WebDriver;
import com.unee.config.factory.mobile.remote.RemoteMobileDriverFactory;
import com.unee.driver.entity.MobileDriverData;

public class RemoteMobileDriverImpl implements IMobileDriverData {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        // Use the correct remote mobile driver factory
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
    }
}