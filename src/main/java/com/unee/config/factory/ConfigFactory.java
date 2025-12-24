package com.unee.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.unee.config.FrameworkConfig;

public final class ConfigFactory {
	private ConfigFactory() {}
	
	public static FrameworkConfig getConfig() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

}
// Compare this snippet from MasterAutomation/src/test/java/com/unee/tests/DemoTest.java: