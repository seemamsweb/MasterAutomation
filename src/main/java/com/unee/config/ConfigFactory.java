package com.unee.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
	private ConfigFactory() {}
	
	public static FrameworkConfig getConfig() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

}
// Compare this snippet from MasterAutomation/src/test/java/com/unee/tests/DemoTest.java: