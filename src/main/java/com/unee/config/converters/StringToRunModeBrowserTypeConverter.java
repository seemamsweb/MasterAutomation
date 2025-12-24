package com.unee.config.converters;

import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;
import com.unee.enums.RunModeBrowserType;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {

	@Override
	public RunModeBrowserType convert(Method method, String runMode) {
        // Correct syntax: Map.of(key1, value1, key2, value2, ...)
     
        return RunModeBrowserType.valueOf(runMode.toUpperCase());
    }
}
		
