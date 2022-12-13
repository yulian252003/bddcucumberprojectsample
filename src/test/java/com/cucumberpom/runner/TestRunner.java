package com.cucumberpom.runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "src/test/java/com/cucumber/features",
                 glue= {"com/cucumber/stepdefinitions"},
                 plugin = {"pretty", "html:target/cucumber.html"},
		         dryRun = false,
		         monochrome = true,
		         strict = true
		  
                )

public class TestRunner {

}

