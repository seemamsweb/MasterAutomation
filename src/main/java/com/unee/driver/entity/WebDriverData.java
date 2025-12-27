package com.unee.driver.entity;

import com.unee.enums.BrowserRemoteModeType;
import com.unee.enums.BrowserType;
import com.unee.enums.RunModeBrowserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private RunModeBrowserType runModeType;

    // REMOVE the manual getters that return null. 
    // @Getter automatically creates correct ones.
}