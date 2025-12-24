package com.unee.config;

import org.aeonbits.owner.Config;

import com.unee.converters.StringToBrowserTypeConverter;
import com.unee.enums.BrowserType;
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
}
