package com.cucumberpom.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;



public class BaseTest 
{
	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() 
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/cucumberpom/config/config.properties");
			prop.load(fis);
		     } 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initBrowser()
	{
		
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			ChromeOptions options = new ChromeOptions();
			  options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			  options.addArguments("--headless");
			  options.addArguments("--remote-debugging-port=9222");
			  options.addArguments("--start-maximized");
			  options.addArguments("--window-position=0,0");
			  options.addArguments("--window-size=1920x1080");
			  options.addArguments("--disable-dev-shm-usage");
			  options.addArguments("--disable-extensions");
			  options.addArguments("--disable-gpu");
			  options.addArguments("--no-sandbox");
			  options.addArguments("--disable-setuid-sandbox");
	          driver = new ChromeDriver(options);
	          
	          
	
	}
	
	}
	


