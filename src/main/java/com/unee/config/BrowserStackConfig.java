package com.unee.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.unee.config.converters.StringToURLConverter;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
    // 👇 Added the forward slash "/" after ${user.dir}
    "file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {
    
    @Key("username") 
    String userName();
    
    @Key("key") 
    String key();
    
    // Expanded based on KEY names "username" and "key"
    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();
}
