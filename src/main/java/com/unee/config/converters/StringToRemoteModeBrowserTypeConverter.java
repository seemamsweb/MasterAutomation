package com.unee.config.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.unee.enums.BrowserRemoteModeType;
import com.unee.enums.BrowserType;
import com.unee.enums.RunModeBrowserType;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {

	@Override
	public BrowserRemoteModeType convert(Method method, String remoteMode) {
        
     
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
		