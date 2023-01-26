package com.cucumberpom.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "src/test/java/com/cucumber/features",
                 glue= {"com/cucumber/stepdefinitions"},
                 tags = "@search",
                 plugin = { "pretty", "html:test-output","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},	  
		         dryRun = false,
		         monochrome = true,
		         strict = true
		 
                )

public class TestRunner {

}
