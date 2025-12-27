package com.unee.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.unee.config.converters.StringToBrowserTypeConverter;
import com.unee.config.converters.StringToURLConverter;
import com.unee.enums.BrowserRemoteModeType;
import com.unee.enums.BrowserType;
import com.unee.enums.MobileRemoteModeType;
import com.unee.enums.RunModeBrowserType;
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
    // 👇 Change "System:properties" to "system:properties"
    "system:properties",
    // 👇 Use "system:env" for consistency, or keep just "env"
    "system:env", 
    // This file path is correct as long as the system property ${user.dir} resolves correctly
    "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
	@DefaultValue("Chrome")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	
	@Key("runModeBrowser")
	@ConverterClass(StringToBrowserTypeConverter.class)
	RunModeBrowserType browserRunMode();
	
	@Key("browserRemoteMode")
	BrowserRemoteModeType browserRemoteMode();
	
	@Key("runModeMobile")
	@ConverterClass(StringToBrowserTypeConverter.class)
	RunModeBrowserType mobileRunMode();
	
	@Key("mobileRemoteMode")
	@ConverterClass(StringToBrowserTypeConverter.class)
	MobileRemoteModeType mobileRemoteMode();
	
	@ConverterClass(StringToURLConverter.class)
	URL seleniumGridURL();
	
	@ConverterClass(StringToURLConverter.class)
	URL seleniodURL();
	
	@ConverterClass(StringToURLConverter.class)
	@DefaultValue("http://127.0.0.1:4723/wd/hub")
	URL localappiumServerURL();
}