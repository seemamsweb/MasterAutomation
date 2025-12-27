package com.unee.driver;

import org.openqa.selenium.WebDriver;

import com.unee.driver.entity.WebDriverData;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData driverData);
}