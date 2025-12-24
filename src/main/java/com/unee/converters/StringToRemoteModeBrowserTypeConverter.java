package com.unee.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.unee.enums.BrowserRemoteModeType;
import com.unee.enums.BrowserType;
import com.unee.enums.RunModeBrowserType;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {

	@Override
	public BrowserRemoteModeType convert(Method method, String remoteMode) {
        // Correct syntax: Map.of(key1, value1, key2, value2, ...)
     
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
		