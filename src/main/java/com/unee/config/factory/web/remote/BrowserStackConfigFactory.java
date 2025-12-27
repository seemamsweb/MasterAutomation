package com.unee.config.factory.web.remote;

import org.aeonbits.owner.ConfigCache;

import com.unee.config.BrowserStackConfig;


public final class BrowserStackConfigFactory {
	
	private BrowserStackConfigFactory() {}
	
	public static BrowserStackConfig getConfig() {
		return ConfigCache.getOrCreate(BrowserStackConfig.class);
		
	}

}
