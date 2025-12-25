package com.unee.config.converters;



import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.aeonbits.owner.Converter;

public class StringToURLConverter implements Converter<URL> {
	
	public URL convert(Method method,String stringURL) {
	try {
		return new URL(stringURL);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}
}
