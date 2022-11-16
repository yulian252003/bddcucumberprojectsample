package com.cucumberpom.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import com.cucumberpom.utils.Constants;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() 
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\cucumberpom\\config\\config.properties");
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
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
	        options.addArguments("disable-gpu");
	        driver = new ChromeDriver(options);
				//    System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
			//driver = new ChromeDriver();
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
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
