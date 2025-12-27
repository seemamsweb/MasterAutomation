package com.unee.driver;

import org.openqa.selenium.WebDriver;
import com.unee.config.factory.web.local.ConfigFactory;
import com.unee.driver.entity.MobileDriverData;
import com.unee.driver.entity.WebDriverData;
import com.unee.driver.factory.DriverFactory;
import com.unee.enums.MobilePlatformType;

public class Driver {
    // local web, remote web, local mobile, remote mobile
    private Driver() {}

    public static void initDriverForWeb() {
        WebDriverData driverData = WebDriverData.builder()
            .browserType(ConfigFactory.getConfig().browser())
            .browserRemoteModeType(ConfigFactory.getConfig().browserRemoteMode())
            .runModeType(ConfigFactory.getConfig().browserRunMode())
            .build();
        
        WebDriver driver = DriverFactory
            .getDriverForWeb(ConfigFactory.getConfig().browserRunMode())
            .getDriver(driverData);
        
        // REMOVE driver.quit() from here! 
        // You should quit the driver in a @AfterMethod or @AfterTest in TestNG/JUnit.
    }

    public static void initDriverForMobile() {
        MobileDriverData driverData = MobileDriverData.builder()
            .mobilePlatformType(MobilePlatformType.ANDROID)
            .mobileRemoteModeType(ConfigFactory.getConfig().mobileRemoteMode())
            .runModeType(ConfigFactory.getConfig().mobileRunMode())
            .build();
        WebDriver driver = DriverFactory
            .getDriverForMobile(ConfigFactory.getConfig().mobileRunMode())
            .getDriver(driverData);
        driver.quit();
    }
}