package com.cucumberpom.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

//import com.cucumberpom.utils.Constants;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	
	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() 
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/java/com/cucumberpom/config/config.properties");
			prop.load(fis);
		     } 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initBrowser()
	{
		String browser = prop.getProperty("browser");
		//browser="chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
			/*
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--window-size=1366,768");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-gpu");
			options.addArguments("--ignore-certificate-errors");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--enable-automation");
		    options.addArguments("--disable-extensions");
		    options.addArguments("--dns-prefetch-disable");
		    options.addArguments("--incognito");
		    options.addArguments("--disable-web-security");
		    options.addArguments("--allow-running-insecure-content");
		    options.addArguments("--allow-insecure-localhost");
		    options.addArguments("--disable-popup-blocking");
			
*/
			// Se cambia obtenga driver automatico
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 

		}
		else 
		{
			System.out.println("Chrome was not defined in Configuration");
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	
	}
	
}
