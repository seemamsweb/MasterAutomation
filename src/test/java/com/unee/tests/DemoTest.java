package com.unee.tests;



import org.testng.annotations.Test;

import com.unee.config.ConfigFactory;






public class DemoTest {
	
	//local ,remote(selenium grid,cloud,broewserstack,lambda etc)
	@Test
	public void testlogin() {
		
		System.out.println(ConfigFactory.getConfig().browser());
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://www.google.com"); driver.quit();
		 */
		
	}

}
