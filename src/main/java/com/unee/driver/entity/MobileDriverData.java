package com.unee.driver.entity;

import com.unee.enums.MobilePlatformType;
import com.unee.enums.MobileRemoteModeType;
import com.unee.enums.RunModeBrowserType;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
    private RunModeBrowserType runModeType;

    public MobilePlatformType getMobilePlatformType() { return mobilePlatformType; }
    public MobileRemoteModeType getMobileRemoteModeType() { return mobileRemoteModeType; }
    public RunModeBrowserType getRunModeType() { return runModeType; }
}