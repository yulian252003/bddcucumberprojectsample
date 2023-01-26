package com.cucumber.stepdefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumberpom.base.BaseTest;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest
{
	
	@AfterStep
	public void addScreenshot(Scenario scenario){
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}


}
