package com.unee.config.converters;

import java.lang.reflect.Method;
import java.util.*;

import org.aeonbits.owner.Converter;

import com.unee.enums.BrowserType;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
        // Correct syntax: Map.of(key1, value1, key2, value2, ...)
        Map<String, BrowserType> stringBrowser = Map.of(
            "CHROME",  BrowserType.CHROME,
            "FIREFOX", BrowserType.FIREFOX,
            "EDGE",    BrowserType.EDGE
        );

        return stringBrowser.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }
}
