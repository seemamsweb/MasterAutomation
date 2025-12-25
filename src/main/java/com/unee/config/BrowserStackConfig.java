package com.unee.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.unee.config.converters.StringToURLConverter;

public interface BrowserStackConfig extends Config {
	
	@Key("username")
	String username();
	
	
	String key();
	
	@DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
	@ConverterClass(StringToURLConverter.class)
	URL browserStackURL();
	

}
