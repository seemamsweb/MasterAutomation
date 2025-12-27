package com.unee.driver;



import org.openqa.selenium.WebDriver;

import com.unee.config.factory.web.local.LocalDriverFactory;
import com.unee.driver.entity.WebDriverData;
// Ensure this points to your ACTUAL factory class that has the getDriver logic


public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        // Change getBrowserRemoteModeType() to getBrowserType()
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}