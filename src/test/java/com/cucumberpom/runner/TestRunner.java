package com.cucumberpom.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "src/test/java/com/cucumber/features/Application.feature",
                 glue= {"com/cucumber/stepdefinitions"},
                 plugin = {"pretty", "html:target/cucumber.html"},
		         dryRun = false,
		         monochrome = true,
		         strict = true
		        // tags = {"@SmokeTest", "@Ent2End"} AND
		        // tags = {"@SmokeTest, @Ent2End"} //OR
                )

public class TestRunner {

}

