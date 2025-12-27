package com.unee.driver;

import org.openqa.selenium.WebDriver;
import com.unee.config.factory.mobile.local.LocalMobileDriverFactory;
import com.unee.driver.entity.MobileDriverData;

public class LocalMobileDriverImpl implements IMobileDriverData {
    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        // Use all relevant fields from MobileDriverData for driver creation
        return LocalMobileDriverFactory.getDriver(
            driverData.getMobilePlatformType(),
            driverData.getMobileRemoteModeType(),
            driverData.getRunModeType()
        );
    }
}