package com.cucumberpom.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



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
			  options.addArguments("--headless");
			  options.addArguments("--start-maximized");
			  options.addArguments("--window-size=1920x1080");
			  options.addArguments("--disable-dev-shm-usage");
			  options.addArguments("--disable-extensions");
			  options.addArguments("--disable-gpu");
			  options.addArguments("--no-sandbox");
	          driver = new ChromeDriver(options);
	          
	          
	
	}
	
	}
	


