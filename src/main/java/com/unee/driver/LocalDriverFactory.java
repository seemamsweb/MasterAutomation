package com.unee.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.unee.config.ConfigFactory;
import com.unee.enums.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocalDriverFactory {
	
	private LocalDriverFactory() {}
	
	public static WebDriver getDriver() {
		WebDriver driver = null;
		
		if(ConfigFactory.getConfig().browser()==BrowserType.CHROME)
		{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		driver.get("https://www.google.com"); 
				
		
	}
	else
	{
		WebDriverManager.firefoxdriver().setup(); 
		 driver = new FirefoxDriver();
	}
		return driver;
	}
	
	
		
	}


