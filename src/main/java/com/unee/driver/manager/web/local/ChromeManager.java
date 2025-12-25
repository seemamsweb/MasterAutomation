package com.unee.driver.manager.web.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeManager {
	
	private ChromeManager() {}
	
	public static WebDriver getDriver()
	{
		WebDriverManager.chromedriver().setup(); 
		return new ChromeDriver(); 
		
	}

}
