package com.unee.tests;




import org.junit.Test;

import com.unee.config.factory.web.local.ConfigFactory;
import com.unee.config.factory.web.remote.BrowserStackConfigFactory;






public class DemoTest {
	
	//local ,remote(selenium grid,cloud,broewserstack,lambda etc)
	@Test
	public void testlogin() {
		
		System.out.println(ConfigFactory.getConfig().browser());
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://www.google.com"); driver.quit();
		 */
		System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
		
	}

}
